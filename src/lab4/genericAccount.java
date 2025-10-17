
import java.math.BigDecimal;

/**
 * Generic account interface for banking applications.
 * Contains methods for depositing, withdrawing, and checking balance.
 * @author Jorge Luis Pabon
 * @version 1.0
 */

public interface genericAccount {
    public void deposit(BigDecimal amount) throws InvalidAmountException; // Deposit Money Into An Account
    public void withdraw(BigDecimal amount) throws InvalidAmountException; // Withdraw Money From An Account
    public BigDecimal getBalance(); // Get Current Balance Of An Account
    public void monthlyProcessing(); // Perform Monthly Necessities (Fees, Interest, ...)
}

// Custom Invalid Amount Exception
// Use When An Inapproriate Number Is Entered With deposit/withdraw Methods
class InvalidAmountException extends Exception {
    public InvalidAmountException(String errorMessage) {
        super(errorMessage);
    }
}