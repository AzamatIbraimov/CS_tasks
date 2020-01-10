package exercises;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        // greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        // timeDifference();

        // Part 4: Country Area
        countryArea();
    }

    public static void greeting(){
        // write your code here

    }

    private static void travelTimeBudget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int days = Integer.parseInt(input.nextLine());
        System.out.print("\nHow much money, in USD, are you planning to spend on your trip: ");
        int money = Integer.parseInt(input.nextLine());
        System.out.print("\nWhat is the three letter currency symbol for your travel destination? ");
        String symbol = input.nextLine();
        System.out.printf("\nHow many %s are there is 1 USD? ", symbol);
        double course = Double.parseDouble(input.nextLine());
        System.out.println();
        int moneyPerDay = (int) (money/days*100);
        double mpd = moneyPerDay/100.0;
        System.out.printf("%nIf you are traveling for %s days that is same as %d hours or %d minutes or %d seconds.%n", days, days*24, days*24*60, days*24*60*60);
        System.out.printf("If you are going to spend $%d USD that means per day you can spend up to $%s USD%n", money, mpd);
        // euro
        double euro = money*course;
        int euroPerDay = (int)(euro/days*10);
        double epd = euroPerDay/10.0;
        System.out.printf("Your total budget in %s is %s, which per day is %s %s%n", symbol, euro, symbol, epd, symbol);
        System.out.println("***********");
        System.out.println();
        System.out.print("'");

    }




    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 'What is the time difference, in hours, between your home and your destination? ");
        int differenceInt = Integer.parseInt(input.nextLine());
        if (differenceInt<0) {
            System.out.printf(
                    "That means that when it is midnight at home it will be %d:00 in your travel destination and when it's noon at home it will be %d:00",
                    24+differenceInt, 12+differenceInt
            );
        } else {
            System.out.printf(
                    "That means that when it is midnight at home it will be %d:00 in your travel destination and when it's noon at home it will be %d:00",
                    0+differenceInt, 12+differenceInt
            );
        }


    }

    public static void countryArea(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 'What is square area of your destination country in km2? ");
        int areaInKm = input.nextInt();
        double milesCoef = 0.6213709999494635;
        double areaInMiles = areaInKm * milesCoef;
        double round = Math.round(areaInMiles*100.0) / 100.0;
        System.out.printf("In miles2 that is %f", round);
    }
}
