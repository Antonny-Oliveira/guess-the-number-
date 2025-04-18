import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random  rng   = new Random();

        int secretNumber = rng.nextInt(100)+1;
        int attempts = 0;
        int guesses = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the correct number.You can choose from 1 to 100.");

        while (guesses != secretNumber){
            System.out.println("Type you guess: ");
            guesses = input.nextInt();
            attempts++;

            if (guesses<secretNumber) {
                System.out.println("Your guess is to low.");
            } else if (guesses > secretNumber) {
                System.out.println("Your guess is to high");
            }else{
                System.out.println("Congratulations! You guessed it in "+attempts+" attempts.");
            }
        }
        input.close();
    }
}
