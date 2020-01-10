package exercises;

import java.util.Scanner;

public class Addition_of_3_el {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, sum;
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        number3 = input.nextInt();
        sum = number1 + number2 + number3;
        System.out.printf("%d is the sum of your numbers", sum);
    }
}
