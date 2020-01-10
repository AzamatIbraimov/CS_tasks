package exercises;

import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(showTwos(number));
    }

    public static String showTwos(int number){
        String toReturn = number + " = ";
        while (number % 2 == 0) {
            toReturn += "2 * ";
            number /= 2;
        }
        toReturn += number;
        return toReturn;
    }
}