package exercises;

import java.util.Scanner;

public class week3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int[] powers = new int[binary.length()];
        int decimal = 0;
        // creating an array with powers of 2
        for (int i = 0; i < binary.length(); i++) {
            powers[i] = (int) Math.pow(2, i);
        }
        // reversing the array
        for (int i=0; i<powers.length/2; i++) {
            int temp = powers[i];
            powers[i] = powers[powers.length - i - 1];
            powers[powers.length -i -1] = temp;
        }
        // looping through the binary number elements
        char one = '1';
        for (int i = 0; i < binary.length(); i++){
            char c = binary.charAt(i);
            if (c == one) {
                decimal += powers[i];
            }
        }
        System.out.printf("Decimal of %s is %d", binary, decimal);
    } // end method main
} // end class week3_1