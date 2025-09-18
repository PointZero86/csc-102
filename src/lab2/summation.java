package lab2;
/**
 * Class that sums all numbers from 1 to a positive integer.
 * @author Jorge Luis Pabon
 * @version 1.0
 */
public class summation {
    private int totalN;

    /*
     * Method that sums all numbers from 1 to the given positive integer.
     */
    public int Summation(int num) {
        for (int i = 1; i <= num; i++){
            totalN += i;
        }
        return totalN;
    }

    // Example Of Usage
    public static void main(String[] args) {
        int sentinel = 1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (sentinel == 1) {
            System.out.println("Enter a positive number, we'll count everything towards it.");
            int num = input.nextInt();
            if (num < 0) {
                System.out.println("Positive POSITIVE IT HAS TO BE POSITIVE!!!!!");
            } 
            else {
                summation sum = new summation();
                System.out.println("Your summation for " + num + " my dear guest: " + sum.Summation(num));
            }
            System.out.println("Enter [0] To Exit Or [1] To Do A New Number: ");
            sentinel = input.nextInt();
        }
    }
}
