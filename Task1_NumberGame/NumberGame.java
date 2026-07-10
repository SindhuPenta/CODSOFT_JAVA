import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int roundsWon = 0;
        char playAgain;

        System.out.println("=================================");
        System.out.println("      WELCOME TO NUMBER GAME");
        System.out.println("=================================");

        do {
            int number = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("Attempts taken: " + attempts);
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Too High!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou have used all your attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("\nScore (Rounds Won): " + roundsWon);

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n=================================");
        System.out.println("Thank you for playing!");
        System.out.println("Final Score: " + roundsWon);
        System.out.println("=================================");

        sc.close();
    }
}
