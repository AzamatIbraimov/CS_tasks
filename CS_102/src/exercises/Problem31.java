package exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arrayOfNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = input.nextInt();
        }
        int[] sortedArray = new int[n];
        int sortedArrayCounter = 0;
        for (int i = 0; i < n; i++) {
            if (arrayOfNumbers[i] % 2 != 0) {
                sortedArray[sortedArrayCounter] = arrayOfNumbers[i];
                sortedArrayCounter++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                sortedArray[sortedArrayCounter] = arrayOfNumbers[i];
                sortedArrayCounter++;
            }
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
