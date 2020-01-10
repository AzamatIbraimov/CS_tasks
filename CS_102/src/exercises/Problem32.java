package exercises;

import java.util.Scanner;
public class Problem32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int number1 = Integer.parseInt(input.nextLine().substring(1), 2);
        System.out.println();
        System.out.print("Input second binary number: ");
        int number2 = Integer.parseInt(input.nextLine(), 2);
        int sum = number1 + number2;
        System.out.print("Sum of two binary numbers: " + Integer.toBinaryString(sum));
    }
}
