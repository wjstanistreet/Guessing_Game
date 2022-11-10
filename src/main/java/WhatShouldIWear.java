import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {
        // welcome message and asks the user what's the weather like outside
        System.out.println("oOoOoOoOoOoOoOoOoOoOo -- What Should I Wear? -- oOoOoOoOoOoOoOoOoOoOo" + "\n" +
                "What's the weather like outside?");

        // User inputs the weather, followed by asking what the temperature is
        Scanner inpWeather = new Scanner(System.in);
        String weather = inpWeather.nextLine();

        System.out.println("What's the outside temperature in Celcius at the moment?");
        Scanner inpTemp = new Scanner(System.in);
        int temp = inpTemp.nextInt();

        System.out.println("You've said it's currently " + temp + " Degrees C and " + weather);

    }
}
