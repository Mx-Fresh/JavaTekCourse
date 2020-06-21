package homework.june20.task1;

public class Account {
    private double balance; //The current balance
    private int acctNum; // The account number

    public Account(int num) {
        balance = 0.0;
        acctNum = num;

    }

    public void deposit(double amt) {
        if (amt > 0) {
            // add the amount to the balance only if positive
            balance += amt;
        }else
            System.out.println("Can not deposit negative amount!");
    }

    public void withdraw(double amt) {
        if (amt > 0) {
            balance -= amt;
        } else
            System.out.println("Can not withdraw negative amount!");
        // subtract the amount from the balance only if poisitve
    }

    public double getBalance() {
        return balance; //returns the balance
    }

    public int getAccountNumber() {
        return acctNum; //returns the account number
    }

    @Override
    public String toString() {
        return "Account number is " + acctNum + " the balance is " + balance + ".";
    }

    public final void print() {
        //Don't override this, override the toString method above
        System.out.println(toString());
    }
}


