/**
 * Allows the creation of a savings account with a balance and interest rate.
 * Implements the genericAccount interface.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class savingsAccount implements genericAccount {
    private double balance; // Account Balance
    private double interestRate; // Account Interest Rate

    /**
     * Constructor for savingsAccount
     * @param balance initial balance
     * @param interestRate interest rate
     */
    public savingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    /**
     * Allows the user to deposit an amount into a savings account.
     * @param amount amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }
    /**
     * Allows the user to withdraw an amount from a savings account.
     * @param amount amount to withdraw
     */
    public void withdraw(double amount) {
        balance -= amount;
    }
}
