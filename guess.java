import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound);
            } else if (userGuess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfAttempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
