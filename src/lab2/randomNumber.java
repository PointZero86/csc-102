package lab2;
import java.util.Random;
import java.util.Scanner;
/**
 * Class to implement a guessing game where the user has to guess a number between 1 and 100.
 * @author Jorge Luis Pabon
*  @version 1.0 ...
 */
public class randomNumber {
    /*
     * Method that checks if the guess is too high, too low or correct.
     */
    public int checkGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {
            return 1; // Too High!
        }
        else if (guess < numberToGuess) {
            return -1; // Too Low!
        }
        else {
            return 0; // Spot On!
        }

    }

    // Example Of Usage
    public static void main(String[] args) {
        Random random = new Random();
        int sentinel = 1;
        Scanner input = new Scanner(System.in);
        randomNumber game = new randomNumber();
        while (sentinel == 1) {
            int guess = 0;
            int numberToGuess = random.nextInt(100) + 1; // 0 - 99, +1 Makes It 1 - 100
            int tries = 0;
            System.out.println("If you don't guess this number (Between 1 and 100) the world explodes.");
            while (guess != numberToGuess) {
                System.out.print("Enter Your Guess.. ");
                guess = input.nextInt();
                int result = game.checkGuess(guess, numberToGuess);
                switch (result) { // Its like a switch case but with arrows
                    case 1 -> System.out.println("Too High...");
                    case -1 -> System.out.println("Too Low...");
                    default -> System.out.println("Congratulations, you didn't annihilate the world!");
                }
                tries++;
            }
            if (tries == 1) {
            System.out.println("You got it in a single try, are you some kind of genius?");
            } 
            else {    
                System.out.println("It took you " + tries + " tries though..");
            }
            System.err.println("Enter [1] To Play Again Or [0] To Exit: ");
            sentinel = input.nextInt();
        }
        input.close();
    }
}
