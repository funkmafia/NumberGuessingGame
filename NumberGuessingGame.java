import java.util.Scanner; //scanner lets me read user input, standard tool in java 
import java.util.Random; //lets me generate random numbers like math.random etc, again, another tool 

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // system.in is an input stream(keyboard)
        Random random = new Random(); // random number generator

        int secretNumber = random.nextInt(100) + 1; // random number from 0-99 BUT the +1 allows to 100. efficient
                                                    // memory allocations
        int guess = 0; // default value against secret number
        int attempts = 0; // simple counter

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I am thinking of a number between 1 and 100 ... ");

        while (guess != secretNumber) {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! ");
            } else if (guess > secretNumber) {
                System.out.println("Too high! ");
            } else {
                System.out.println("Correct !! It took you " + attempts + " tries");
            }
        }
        scanner.close();
    }
}
