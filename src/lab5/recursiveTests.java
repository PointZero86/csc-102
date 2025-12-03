package lab5;
/**
 * Class for testing recursive math functions
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class recursiveTests {
    // Very Very Very Very Very Cohesive Menu Display
    public static void menu(String[] menuArray) {
        System.out.println("[0] Exit");
        for (int i = 0; i < menuArray.length; i++) {
            System.out.printf("[%d] %s%n", i+1, menuArray[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                <-> Jorge Luis Pabon <->
                <-> CSC 102 <->
                <-> 10/30/2025 <->""");
        int usableNum;
        RecursiveMath RMath = new RecursiveMath();
        String[] menuOptions = {"Factorial", "Power", "Summation", "GCD", "Fibonacci"};
        int userChoice = -1;
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        while (userChoice != 0) {
            System.out.println("Recursive Math Functions Menu:");
            menu(menuOptions);
            System.out.print("[>] ");
            userChoice = userInput.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter A Number: ");
                    usableNum = userInput.nextInt();
                    System.out.printf("Result: %d%n", RMath.factorial(usableNum));
                    break;
                case 2:
                    System.out.print("Enter Base Number: ");
                    int base = userInput.nextInt();
                    System.out.print("Enter Exponent: ");
                    int exponent = userInput.nextInt();
                    System.out.printf("Result: %d%n", RMath.pow(base, exponent));
                    break;
                case 3:
                    System.out.print("Enter A Number: ");
                    usableNum = userInput.nextInt();
                    System.out.printf("Result: %d%n", RMath.summation(usableNum));
                    break;
                case 4:
                    System.out.print("Enter First Number: ");
                    int a = userInput.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b = userInput.nextInt();
                    System.out.printf("GCD Result: %d%n", RMath.GCD(a, b));
                    break;
                case 5:
                    System.out.print("Enter A Number: ");
                    usableNum = userInput.nextInt();
                    System.out.printf("Result: %d%n", RMath.fibonacci(usableNum));
                    break;
                case 0:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}