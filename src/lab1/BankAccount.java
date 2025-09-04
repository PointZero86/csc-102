package lab1;

/**
 * Class that allows the creation of bank accounts and changing their data accordingly with withdrawals and deposits.
 * @author Jorge Pabon
 * @version 1.0
 */
public class BankAccount {

    private double balance;

    /**
     * Adds a specified amount to a users bank account.
     * @param amount amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Removes a specified amount from a users bank account.
     * @param amount amount to withdraw
     */
    public void withdrawal(double amount) {
        balance = balance - amount;
    }

    /**
     * Returns the balance of a users bank account.
     * @return balance of a bank account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adjusts a users bank account balance based on interest.
     */
    private void calculateInterest() {
        balance = balance * 1.05;
    }

    // Does this need to be in javadocs?
    /**
     * main method for running
     * @param args command line arguments
     */
    public static void main(String args[]) {
        // New Accounts for Bob and Jane
        BankAccount bobsAccount = new BankAccount();
        BankAccount janesAccount = new BankAccount();
        // Depositing an amount into their accounts
        bobsAccount.deposit(450.50);
        janesAccount.deposit(1230.75);
        // Withdrawing an amount
        bobsAccount.withdrawal(230.00);
        janesAccount.withdrawal(452.43);
        // Deposit into bobs, withdraw from Janes
        bobsAccount.deposit(412.23);
        janesAccount.withdrawal(142.56);
        // Printing out their bank accounts
        System.out.println("Bob's Account is currently: " + bobsAccount.getBalance());
        System.out.println("Jane's Account is currently: " + janesAccount.getBalance());
    }
}

