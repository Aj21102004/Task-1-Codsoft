import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MAX_ATTEMPTS = 6; // maximum number of attempts
    private static final int MAX_ROUNDS = 5; // maximum number of rounds
    private static final int MIN_NUMBER = 1; // minimum number in the range
    private static final int MAX_NUMBER = 100; // maximum number in the range

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int roundsWon = 0;
        int totalAttempts = 0;

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            int numberToGuess = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int attempts = 0;

            System.out.println("Round " + round + ": Guess a number between " + MIN_NUMBER + " and " + MAX_NUMBER);

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println(" Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                }
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Sorry, you didn't guess the number correctly. The number was " + numberToGuess);
            }

            totalAttempts += attempts;
        }

        System.out.println("Game over! You won " + roundsWon + " out of " + MAX_ROUNDS + " rounds.");
        System.out.println("Your average number of attempts per round was " + (totalAttempts / MAX_ROUNDS));
    }
}
