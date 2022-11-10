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

        // weather and temperature descriptions
        String[] weatherDesc = {"sunny", "rainy", "cloudy", "snowing", "foggy", "windy"};
        String[] tempDesc = {"freezing", "cold", "chilly", "warm", "boiling"};

        // clothing types
        String[] clothType = {"coat", "trousers", "shorts", "a t-shirt"};
        String[] coatType = {"light", "heavy", "waterproof", "windbreaker"};

        // indices for sorting
        int weatherInd;
        int clothInd;

        if (temp < 0){
            weatherInd = 0;
        } else if (0 < temp && temp < 9) {
            weatherInd = 1;
        } else if (10 < temp && temp < 19) {
            weatherInd = 2;
        } else if (20 < temp && temp < 29) {
            weatherInd = 3;
        } else if (temp > 30) {
            weatherInd = 4;
        }

    }
}
