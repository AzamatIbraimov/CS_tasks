package exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Week6_4
{
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String numbersString = input.nextLine().replace(" ", "");
            int[] numbers = new int[10];
            for (int i = 0; i < numbersString.length(); i++) {
                numbers[i] = numbersString.charAt(i) - '0';
            }
            System.out.println(Arrays.toString(numbers));
            int adjacentCounter = 0;
            String addedNumbers = "          ";
            int temp = numbers[0];
            boolean test = false;
            for (int i = 1; i < numbers.length; i++) {
                for (int p = 0; p < 10; p++) {
                    if ((char) (numbers[i] + '0') == addedNumbers.charAt(p)) {
                        test = true;
                        break;
                    }
                }
                if (numbers[i] == temp && test == false) {
                    adjacentCounter++;
                    addedNumbers = addedNumbers.replace(addedNumbers.charAt(i), (char) (numbers[i] + '0'));
                }
                temp = numbers[i];
                test = false;
            }
            System.out.println(adjacentCounter);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
