package exercises;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 2) {
            System.out.print("2");
        } else {
            isPrime(number);
        }
    } // end method main

    // The method that determines whether a number is a prime or not a prime.
    public static void isPrime(int number) {
        for (int i = 2; i <= number; i++) {
            boolean flag = true;
            for (int p = 2; p <= i/2; p++) {
                if (i % p == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(i + " ");
        }
    } // end method isPrime
}