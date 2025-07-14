import java.util.Scanner; // IMPORT STATEMENT 
import java.util.Random;

public class NumberGuessingGame { // CLASS DECLARATION
    public static void main(String[] args) { // METHOD DECLARATION
        Scanner scanner = new Scanner(System.in); // OBJECT INSTANTIATION
        playGame(scanner); // METHOD CALL
        String playAgain; // VARIABLE DECLARATION
        do {
            System.out.println("Play again? Yes or No");
            playAgain = scanner.next().toLowerCase(); // METHOD CHAIN
            if (playAgain.equals("Yes")) {
                playGame(scanner);
            }
        } while (playAgain.equals("Yes"));
        scanner.close();
    }

    public static void playGame(Scanner scanner) { // METHOD DECLARATION
        Random random = new Random(); // OBJECT INSTANTIATION
        int secretNumber = random.nextInt(100) + 1; // VARAIBLE DECLARATION
        int guess = 0; // VARAIBLE DECLARATION
        int attempts = 0; // VARAIBLE DECLARATION

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I am thinking of a number between 1 and 100 ... ");

        while (guess != secretNumber) {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt(); // VARIABLE ASSIGNMENT WITH METHOD CALL
            attempts++; // INCREMENT STATEMENT
            if (guess < secretNumber) {
                System.out.println("Too low! ");
            } else if (guess > secretNumber) {
                System.out.println("Too high! ");
            } else {
                System.out.println("Correct !! It took you " + attempts + " tries");
            }
        }
        scanner.close();
    } // END OF PLAYGAME() METHOD
} // END OF CLASS
