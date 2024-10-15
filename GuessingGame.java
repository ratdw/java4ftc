package java4ftc;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(100) + 1;
        System.out.println("find the Number i guessed");
        try (Scanner scanner = new Scanner(System.in) // Ensure the scanner is closed
                ) {
                    float userGuess = scanner.nextInt();
                    while(userGuess!=guessedNumber){
                        if (userGuess<guessedNumber){
                            System.out.println("try higher");
                        }else{
                            System.out.println("try lower");
                        }
                        userGuess = scanner.nextInt();
                    }
                    System.out.println("Yes you gussed it right, it is : "+ guessedNumber);
                 } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
