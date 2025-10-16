/**
 * Generic account interface for banking applications.
 * Contains methods for depositing, withdrawing, and checking balance.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public interface genericAccount {
    // You should use BigDecimal for money in an actual application instead of double
    // Deposit Money Into An Account
    public void deposit(double amount);
    // Withdraw Money From An Account
    public void withdraw(double amount);
    // Get Current Balance Of An Account
    public double getBalance();
}
