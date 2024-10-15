package java4ftc;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        int guessedNumber = generateRandomNumber();
        System.out.println("Guess the number I guessed (between 1 and 100):");

        try (Scanner scanner = new Scanner(System.in)) {
            playGame(scanner, guessedNumber);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private static void playGame(Scanner scanner, int guessedNumber) {
        int userGuess = -1; // Initialize with an invalid guess
        int guessCount = 0; // Initialize the guess counter

        while (userGuess != guessedNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            guessCount++; // Increment the guess counter

            if (userGuess < guessedNumber) {
                System.out.println("Try higher.");
            } else if (userGuess > guessedNumber) {
                System.out.println("Try lower.");
            }
        }

        System.out.println("Yes, you guessed it right! It is: " + guessedNumber);
        System.out.println("You guessed it in " + guessCount + " attempts.");
    }
}
