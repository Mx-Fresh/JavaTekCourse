package homework.june20.task1;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int num) {
        super(num);
    }

    public SavingsAccount(int num, double interestRate) {
            super(num);
            setInterestRate(interestRate);
        }

    public double getInterestRate() {
        return  interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate > 0.0 && interestRate <= 1.0) {
            this.interestRate = interestRate;
        } else
            System.out.println("Interest rate is not valid");
    }

    public void addInterest() {
        deposit(getBalance() * interestRate);
    }

    @Override
    public String toString() {
        return super.toString() + " Interest is " + interestRate;
    }

}
