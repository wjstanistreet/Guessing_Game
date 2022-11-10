import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // welcome message and request for user to input their range from 0 to the number they choose.
        System.out.println("###############################################################################" + "\n" +
                            "----------------------Welcome to the guessing game!----------------------------" + "\n" +
                            "Pick a number and a secret number will be generated between 0 and your num!" + "\n" +
                            "You've got 3 guesses!" + "\n" +
                            "###############################################################################");

        // gets the user to input their range and creates an array from 1 to their max
        Scanner reader = new Scanner(System.in);
        int userRange = reader.nextInt();

        System.out.println("You've selected a range between 0 and " + userRange + "\n" +
                "A random number will now be generated! What's your first guess of the secret number!");

        // Generates the secret number from 0 to their input
        Random rand = new Random();
        int numRand = rand.nextInt(userRange);

        // loops through and gives the user a number of guesses;
        // future additions could include a varying number of guesses/difficulties
        for (int i = 0; i < 3; i++) {
            Scanner guess = new Scanner(System.in);
            int userGuess = guess.nextInt();

            // checks the users number, if its correct it breaks the loop
            if (userGuess == numRand) {
                System.out.println("You got it!");
                break;
            } else if (userGuess > numRand) {
                System.out.println("Too high!");
            } else if (userGuess < numRand) {
                System.out.println("Too low!");
            }

            // checks how many guesses the user has left
            if (i == 2){
                System.out.println("Sorry, all out of guesses!");
            } else {
                System.out.println("Try again!");
            }
        }

    }
}
