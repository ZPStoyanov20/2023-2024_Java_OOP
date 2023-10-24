package ex_1;

public class BankAccount
{
    private int id = 1;
    private double balance;
    private static double INTEREST_RATE = 0.02;
    private static int COUNT = 1;

    public BankAccount()
    {
        COUNT++;
        this.id = COUNT;
    }

    public static void setInterestRate(double interest)
    {
        INTEREST_RATE = interest;
    }

    public double getInterest(int years)
    {
        return this.balance * INTEREST_RATE * years;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}
