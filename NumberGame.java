import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int totalScore = 0;
        boolean playAgain = true;
        
        System.out.println("✨ Welcome to the Number Guessing Game! ✨");
        
        while (playAgain) {
            // Generating random number between 1 and 100
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 5; // Limiting the number of attempts
            int attemptsTaken = 0;
            boolean wonRound = false;
            
            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("Can you guess it? You have " + maxAttempts + " attempts!");
            
            // Loop for attempts
            while (attemptsTaken < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsTaken++;
                
                if (userGuess == targetNumber) {
                    System.out.println("🎉 Correct! You guessed the number in " + attemptsTaken + " attempts.");
                    // Score calculation: more remaining attempts = higher score
                    totalScore += (maxAttempts - attemptsTaken + 1) * 10;
                    wonRound = true;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("📈 Too high! Try again.");
                } else {
                    System.out.println("📉 Too low! Try again.");
                }
                
                int remaining = maxAttempts - attemptsTaken;
                if (remaining > 0) {
                    System.out.println("Attempts remaining: " + remaining);
                }
            }
            
            if (!wonRound) {
                System.out.println("\n😢 Game Over for this round! The correct number was: " + targetNumber);
            }
            
            // Displaying current score
            System.out.println("🏆 Your Current Score: " + totalScore);
            
            // Asking for multiple rounds
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
            }
        }
        
        System.out.println("\n✨ Thank you for playing! Your Final Score: " + totalScore + " ✨");
        scanner.close();
    }
}