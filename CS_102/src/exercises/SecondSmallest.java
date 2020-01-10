package exercises;

import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[1]);


    }
}