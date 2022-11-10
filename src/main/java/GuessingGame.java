import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // welcome message and request for user to input their range from 1 to the number they choose.
        System.out.println("###############################################################################" + "\n" +
                            "Welcome to the guessing game! Your first input will choose your guessing range!" + "\n" +
                            "###############################################################################");

        // gets the user to input
        Scanner reader = new Scanner(System.in);
        int guessRange = reader.nextInt();

        System.out.println("You've selected a range between 1 and " + guessRange + "\n" +
                "A random number will now be generated!");


    }
}
