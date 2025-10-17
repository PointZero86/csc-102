
import java.math.BigDecimal;

/**
 * Allows the creation of a checking account with a balance and certain limits.
 * Implements the genericAccount interface.
 * @author Jorge Luis Pabon
 * @version 1.0
 */

public class checkingAccount implements genericAccount {
    private BigDecimal balance; // Account Balance
    private BigDecimal overdraftLimit; // Limit That A User Can Withdraw To  

    /**
     * Constructor for checkingAccount
     * @param balance initial balance
     */
    public checkingAccount(BigDecimal balance, BigDecimal overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Perform updates to the account monthly.
     */
    @Override
    public void monthlyProcessing() {
        // Nothing Here..
    }

    /**
     * Allows the user to deposit an amount into a checking account.
     * @param amount amount to deposit
     * @throws InvalidAmountException 
     */
    @Override
    public void deposit(BigDecimal amount) throws InvalidAmountException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("[InvalidAmountException]: Not A Valid Amount");
        }
        else {
            balance = balance.add(amount);
        }
    }

    /**
     * Allows the user to withdraw an amount from a checking account.
     * @param amount amount to withdraw
     */
    @Override
    public void withdraw(BigDecimal amount) throws InvalidAmountException {
        if ((balance.subtract(amount)).compareTo(overdraftLimit) <= 0) {
            throw new InvalidAmountException("[InvalidAmountException]: Not A Valid Amount");
        }
        else {
            balance = balance.subtract(amount);
        }
    }

    /**
     * Allows the user to check the balance of a checking account.
     * @return current balance
     */
    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
