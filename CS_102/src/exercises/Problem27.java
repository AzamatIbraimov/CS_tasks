package exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Problem27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int p = 0; p < array[i].length; p++) {
                array[i][p] = input.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
        System.out.println(isMagicSquare(array));
    }
    public static boolean isMagicSquare(int[][] array) {
        //checking if the amount of columns is equal
        for (int i = 1; i < array.length; i++) {
            if (array[0].length != array[i].length){
                return false;
            }
        }
        //checking if the amount of rows and columns is equal
        if (array.length != array[0].length) {
            return false;
        }
        //checking horizontal sums
        int firstSum = 0;
        for (int i = 0; i < array[0].length; i++) {
            firstSum += array[0][i];
        }
        int nextSum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int p = 0; p < array[i].length; p++) {
                nextSum += array[i][p];
            }
            if (firstSum != nextSum) {
                return false;
            }
            nextSum = 0;
        }
        //checking vertical sums
        firstSum = 0;
        for (int i = 0; i < array.length; i++) {
            firstSum += array[i][0];
        }
        nextSum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int p = 0; p < array.length; p++) {
                nextSum += array[p][i];
            }
            if (firstSum != nextSum) {
                return false;
            }
            nextSum = 0;
        }
        //checking diagonal sums
        firstSum = 0;
        int i = 0;
        for (int p = 0; p < array.length; p++) {
            firstSum += array[p][i];
            i++;
        }
        nextSum = 0;
        i = array.length - 1;
        for (int p = 0; p < array.length; p++) {
            nextSum += array[p][i];
            i--;
        }
        if (firstSum != nextSum) {
            return false;
        }
        return true;
    }
}
