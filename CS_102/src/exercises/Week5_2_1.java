package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Week5_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbersString = "";
        System.out.println("Enter your numbers, press return to end.");
        // getting the inputs and checking if they are legal
        while (true) {
            String number = input.nextLine();
            if (number.isEmpty()) {
                break;
            } else if (Character.isLetter(number.charAt(0))) {
                System.out.println("Not a legal number. Try again!");
            } else {
                numbersString = numbersString + " " + number;
            }
        }
        // initializing an array and adding the numbers to it
        System.out.println("Enter N: ");
        int n = input.nextInt();
        if (numbersString.isEmpty()) {

        } else {
            String[] initialArray = numbersString.substring(1).split(" ");
            if (n > initialArray.length) {
                n = n % initialArray.length;
            }
            String[] finalArray = new String[initialArray.length];
            for (int i = 0; i < finalArray.length; i++) {
                finalArray[i] = initialArray[n];
                n++;
                if (n == finalArray.length) {
                    n = 0;
                }
            }
            System.out.println(Arrays.toString(finalArray));
        }
    }
}
