package lab0;
import java.util.Scanner;

public class gooeyMenu {
    // Print Menu based on Array
    public void menu(String[] menuArray) {
        System.out.println("[0] Exit\n");
        for (int i = 0; i < menuArray.length; i++) {
            System.out.printf("[%d] %s%n", i+1, menuArray[i]);
        }
    }
    // User Input, Uses Menu Array
    public Scanner menuInput(String[] menuArray) {
        boolean notAllowed = true;
        int allowedNumMax = menuArray.length;
        Scanner userInput = new Scanner(System.in);
        while (notAllowed) {
            System.out.println("\n[>] ");
            int choice = userInput.nextInt();
            if (choice < allowedNumMax || choice > 0) {
                notAllowed = false;
            }
            else {
                System.out.println("\n[!] Please Choose A Valid Option! [!]\n");
            }
        }
        return userInput;
    }
    // User Input, Uses Min-Max
    public int intInput(int min, int max) {
        int choice = 0;
        boolean notAllowed = true;
        Scanner userInput = new Scanner(System.in);
        while (notAllowed) {
            System.out.println("\n[>] ");
            choice = userInput.nextInt();
            if (choice < max || choice > min) {
                notAllowed = false;
            }
            else {
                System.out.println("\n[!] Please Choose A Valid Option! [!]\n");
            }
        }
        return choice;
    }
}
