package lab2;
import java.util.Scanner;

public class temperatureConverter {
    /**
     * Converts Fahrenheit to Celsius.
     * @param fahrenheit temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

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

    /** User input, using an array to determine allowed values.
     * @param menuArray array of menu options
     * @return Scanner object with the user input
     */
    public int menuInput(String[] menuArray, Scanner userInput) {
        int allowedNumMax = menuArray.length;
        int choice = -1;
        while (choice > allowedNumMax || choice <= -1) {
            System.out.print("\n[>] ");
            choice = userInput.nextInt();
            if (choice > allowedNumMax || choice <= -1) {
                System.out.println("\n[!] Please Choose A Valid Option! [!]");
            }
        }
        // Don't close the passed Scanner because it wraps System.in. Closing it would close System.in
        // and make further reads (in main) fail with NoSuchElementException.
        return choice;
    }

    // Example Of Usage
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double temperature;
        System.out.println("Make A Selection: ");
        String[] menuOptions = {"Convert Fahrenheit to Celsius", "Convert Celsius to Fahrenheit"};
        temperatureConverter converter = new temperatureConverter();
        converter.menu(menuOptions);
        int choice = converter.menuInput(menuOptions, userInput);
        if (choice == 1) {
            System.out.println("Enter A Temperature In Fahrenheit: ");
            temperature = userInput.nextDouble();
            double celsius = converter.toCelsius(temperature);
            System.out.println(temperature + "F is " + celsius + "C");
        } 
        else  if (choice == 2) {
            System.out.println("Enter A Temperature In Celsius: ");
            temperature = userInput.nextDouble();
            double fahrenheit = converter.toFahrenheit(temperature);
            System.out.println(temperature + "C is " + fahrenheit + "F");
        }
        else {
            System.out.println("okay? bye..");
        }
        userInput.close();
    }
}