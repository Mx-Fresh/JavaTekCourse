package homework.june20.task1;

public class CurrentAccount extends Account{

    private double overdraftLimit;

    public CurrentAccount(int num) {
        super(num);
    }

    public CurrentAccount(int num, double overdraftLimit) {
        super(num);
        this.overdraftLimit = overdraftLimit;
    }

    public void isLimitExceeded() {
        if(getBalance() <= -overdraftLimit) {
            System.out.println("Account - " + getAccountNumber() + ": Overdraft limit has exceeded. Sending a notification letter....");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Overdraft limit is " + overdraftLimit;
    }
}
