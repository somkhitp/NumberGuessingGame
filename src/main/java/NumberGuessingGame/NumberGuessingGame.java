package NumberGuessingGame;
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1; //Minimum Number
        int maxNumber = 100; // Maximum Number
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int maxAttempts = 10;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guessing Number Game!");
        System.out.println("You have 10 tries to guess the correct number; Good Luck!!");
        System.out.println("I'm thinking of a number between " + minNumber + " and " + maxNumber);

        while (attempts < maxAttempts) {
            System.out.print("Guess #" + (attempts + 1) + ": ");

            // Validates guess is a number or not
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please select a number between 1 - 100");
                System.out.println("Guess #" + (attempts + 1) + ": ");
                scanner.next();
            }
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                break;
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number: " + targetNumber + " in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber + ".");
        }

        scanner.close();
    }
}
