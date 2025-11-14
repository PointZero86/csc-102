import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class mazeBank { // Like That One Game
    public static int idNumber;
    public static String password;
    public static String verification;
    public static String[] MENU_THING = {"Checking Account Balance", "Deposit To Checking",
                                  "Withdraw From Checking", "Savings Account Balance", 
                                  "Deposit To Savings", "Withdraw From Savings", 
                                  "Processing"};

    // Very Very Cohesive Menu Display
    public static void menu(String[] menuArray) {
        System.out.println("[0] Exit");
        for (int i = 0; i < menuArray.length; i++) {
            System.out.printf("[%d] %s%n", i+1, menuArray[i]);
        }
    }

    // Main Class
    public static void main(String[] args){
        checkingAccount C_UserAccount = new checkingAccount(new BigDecimal("0.00"), new BigDecimal("-500.00"));
        savingsAccount S_UserAccount = new savingsAccount(new BigDecimal("0.00"), 0.015);
        String fileName = "credentials.txt"; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        File bankFile = new File(fileName);
        int userChoice = -1;
        System.out.println("Thank You For Choosing Maze Bank!");
        System.out.println("We'll Handle The Processing For You..");
        try (Scanner fileReader = new Scanner(bankFile)) {
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                if (currentLine.contains("ID:")) {
                    idNumber = Integer.parseInt(currentLine.substring(3));
                    if (idNumber <= 0) { // Check If There Is No User ID
                        idNumber = 87000001;
                        System.out.println("There Is No ID On Your File..");
                        System.out.println("Your ID Has Been Set To [87000001]");
                    }
                }
                else if (currentLine.contains("PW:")) {
                    password = currentLine.substring(3);
                    if (password.isBlank()) { // Check If There Is No Password Written
                        password = "admin";
                        System.out.println("There Is No Password On Your File..");
                        System.out.println("Your Password Has Been Set To [admin]");
                    }
                }
                else if (currentLine.contains("CHECKING::")) {
                    BigDecimal checkingBal = new BigDecimal(currentLine.substring(10));
                    try {
                        C_UserAccount.deposit(checkingBal);   
                    } 
                    catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if (currentLine.contains("SAVINGS::")) {
                    BigDecimal savingBal = new BigDecimal(currentLine.substring(9));
                    try {
                        S_UserAccount.deposit(savingBal);
                    } 
                    catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            fileReader.close();
            System.out.println("Processing Complete, Loading..");
            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome To Maze Bank [UID:" + idNumber + "]");
            while (!password.equals(verification)) {
                System.out.print("Please Enter Your Password: ");
                verification = userInput.nextLine();
                if (password.equals(verification)) {
                    System.out.println("Welcome!");
                }
                else {
                    System.out.println("Incorrect Password.");
                }
            }
            double amount;
            while (userChoice != 0) {
                menu(MENU_THING);
                System.out.println("How Can We Help You Today?");
                userChoice = userInput.nextInt();
                switch (userChoice) {
                    case 1: // Checking Balance
                        System.out.println(C_UserAccount.getBalance());
                        break;
                    case 2: // Deposit To Checking
                        System.out.println("How Much Would You Like To Deposit?");
                        amount = userInput.nextDouble();
                        try {
                            C_UserAccount.deposit(BigDecimal.valueOf(amount));   
                        } 
                        catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3: // Withdraw From Checking
                        System.out.println("How Much Would You Like To Withdraw?");
                        amount = userInput.nextDouble();
                        try {
                            C_UserAccount.withdraw(BigDecimal.valueOf(amount));   
                        } 
                        catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4: // Savings Balance
                        System.err.println(S_UserAccount.getBalance());
                        break;
                    case 5: // Deposit To Savings
                        System.out.println("How Much Would You Like To Deposit?");
                        amount = userInput.nextDouble();
                        try {
                            S_UserAccount.deposit(BigDecimal.valueOf(amount));   
                        } 
                        catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6: // Withdraw From Savings
                        System.out.println("How Much Would You Like To Withdraw?");
                        amount = userInput.nextDouble();
                        try {
                            S_UserAccount.withdraw(BigDecimal.valueOf(amount));   
                        } 
                        catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 7: // Reciept
                        S_UserAccount.monthlyProcessing();
                        C_UserAccount.monthlyProcessing(); // Doesn't Do Anything
                        PrintWriter writer = new PrintWriter("bankReciept.txt");
                        writer.println("=====================================================");
                        writer.println("# Maze Bank Account Reciept");
                        writer.println("ID: " + idNumber);
                        writer.println("Checking Balance: " + C_UserAccount.getBalance());
                        writer.println("Savings Balance: " + S_UserAccount.getBalance());
                        writer.println("=====================================================");
                        writer.close();
                        break;
                    default:
                        System.out.println("Please Choose A Valid Option!");
                }
            }
            userInput.close();
            System.out.println("Thank You For Your Patronage!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could Not Find [" + fileName + "], Terminating..");
        }
    }
}
