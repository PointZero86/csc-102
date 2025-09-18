package lab0;
import java.util.Scanner;
/**
 * Class that allows a text-based menu system.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class gooeyMenu {
    /**
     * Displays a menu based on the passed array.
     * @param menuArray array of menu options
     */
    public void menu(String[] menuArray) {
        System.out.println("[0] Exit");
        for (int i = 0; i < menuArray.length; i++) {
            System.out.printf("[%d] %s%n", i+1, menuArray[i]);
        }
    }

    /**
     * User input, with min and max values.
     * @param min minimum integer allowed
     * @param max maximum integer allowed
     * @return the integer input by the user
     */
    public int intInput(int min, int max) {
        int choice = -1;
        Scanner userInput = new Scanner(System.in);
        while (choice < min || choice > max) {
            System.out.print("\n[>] ");
            choice = userInput.nextInt();
            if (choice > max || choice < min) {
                System.out.println("\n[!] Please Choose A Valid Option! [!]");
            }
        }
        return choice;
    }


    /** User input, using an array to determine allowed values.
     * @param menuArray array of menu options
     * @return Scanner object with the user input
     */
    public int menuInput(String[] menuArray) {
        Scanner userInput = new Scanner(System.in);
        int allowedNumMax = menuArray.length;
        int choice = -1;
        while (choice > allowedNumMax || choice <= -1) {
            System.out.print("\n[>] ");
            choice = userInput.nextInt();
            if (choice > allowedNumMax || choice <= -1) {
                System.out.println("\n[!] Please Choose A Valid Option! [!]\n");
            }
        }
        return choice;
    }
}
