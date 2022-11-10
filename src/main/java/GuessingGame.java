import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // welcome message and request for user to input their range from 0 to the number they choose.
        System.out.println("###############################################################################" + "\n" +
                            "Welcome to the guessing game! Your first input will choose your guessing range!" + "\n" +
                            "###############################################################################");

        // gets the user to input their range and creates an array from 1 to their max
        Scanner reader = new Scanner(System.in);
        int userRange = reader.nextInt();
        int[] guessRange = IntStream.range(0, userRange).toArray();

        System.out.println("You've selected a range between 0 and " + userRange + "\n" +
                "A random number will now be generated! Take your first guess!");



        Scanner guess = new Scanner(System.in);
        int userGuess = guess.nextInt();



    }
}
