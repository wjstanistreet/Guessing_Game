import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {
        // welcome message and asks the user what's the weather like outside
        System.out.println("oOoOoOoOoOoOoOoOoOoOo -- What Should I Wear? -- oOoOoOoOoOoOoOoOoOoOo" + "\n" +
                "What's the weather like outside?");

        // User inputs the weather, followed by asking what the temperature is
        Scanner inpWeather = new Scanner(System.in);
        String weather = inpWeather.nextLine().toLowerCase();

        System.out.println("What's the outside temperature in Celcius at the moment?");
        Scanner inpTemp = new Scanner(System.in);
        int temp = inpTemp.nextInt();

        System.out.println("You've said it's currently " + temp + " Degrees C and " + weather + ".");

        // weather and temperature descriptions
        String[] weatherDesc = {"sunny", "rainy", "cloudy", "snowing", "windy"};

        // clothing types
        String[] clothType = {"coat", "trousers", "shorts", "t-shirt"};
        String[] coatType = {"light", "heavy", "waterproof", "windbreaker"};

        if (weather.equals(weatherDesc[0]) && temp > 20){ // sunny and warm
            System.out.println("It's lovely outside, you should wear a " + clothType[3] + " and " + clothType[2]);

        } else if (weather.equals(weatherDesc[1]) || weather.equals(weatherDesc[3])) { // snowing or raining
            if (temp < 10){ // precipitation and cold
                System.out.println("Ooh it's chilly and there's some precipitation, you should probably wear a " + coatType[1] + "," + coatType[2] +
                        " " + clothType[0] + " and some " + clothType[1]);
            } else { // precipitation and warm
                System.out.println("It's raining, wear a " + coatType[0] + ", " + coatType[2] + " " + clothType[0]);
            }

        } else if (weather.equals(weatherDesc[4])) { // windy
            System.out.println("Probably pack a " + coatType[3]);

        } else if (weather.equals(weatherDesc[2])) { // cloudy for different temps
            if (temp < 10){
                System.out.println("I'd wear a " + coatType[1] + " " + clothType[0]);

            } else if (11 < temp && temp < 20) {
                System.out.println("It's moderate, wear a " + coatType[0] + " " + clothType[0]);

            } else {
                System.out.println("Maybe wear some " + clothType[1] + " and a " + clothType[3]);
            }
        }
    }
}
