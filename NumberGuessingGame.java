import java.util.Scanner; //scanner lets me read user input
import java.util.Random; //lets me generate random numbers like math.random etc

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I am thinking of a number between 1 and 100 ... ");

        // while statement next
        // system print, enter your guess and then add attempt ++
        // if statement after, too low or too high ... else statement to congratulate
        // them with + attempts + tries
        // scanner. close !!
    }
}
