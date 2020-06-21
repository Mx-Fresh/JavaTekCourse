package homework.june20.task1;

import javax.swing.*;

public class Bank {

    public static void main(String[] args) {
        Bank bankOfMoldova = new Bank();

        Account savingsAcc1 = new SavingsAccount(1, 0.05);
        Account currentAcc1 = new CurrentAccount(2,1000);

        Account[] accounts = {savingsAcc1, currentAcc1};

        bankOfMoldova.setAccounts(accounts);

        savingsAcc1.print();
        currentAcc1.print();

        savingsAcc1.deposit(1000);
        currentAcc1.deposit(1000);

        savingsAcc1.print();
        currentAcc1.print();

        bankOfMoldova.update();

        savingsAcc1.print();
        currentAcc1.print();

        currentAcc1.withdraw(2000);
        bankOfMoldova.update();

        savingsAcc1.print();
        currentAcc1.print();

    }

    private Account[] accounts;

    public Bank() {}

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }


    public void update() {
        for(Account account : accounts) {
            if(account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if(account instanceof  CurrentAccount) {
                ((CurrentAccount) account).isLimitExceeded();
            }
        }
    }

    public Account openAccaunt(AccType type, int num) {
        if(type == AccType.CURRENT) {
            return new CurrentAccount(num);
        } else if(type == AccType.SAVINGS) {
            return new SavingsAccount(num);
        }

        return null; //TBU
    }

    public void closeAccount(Account account) {
        System.out.println("Closing the account: " + account.getAccountNumber());
        account = null;
        //The alternative is to have isOpen flag  as instance variable of the Savings and Current accounts
        // and to set it as false, though the further usage of this method is not defined in the tasks
        // so going with null.
    }

    public void payDevidend(Account account, double devidend) {
        account.deposit(devidend);
    }

    enum AccType {
        SAVINGS,
        CURRENT
    }
}


