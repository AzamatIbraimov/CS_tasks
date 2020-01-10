package exercises;

import java.util.Scanner;
import java.util.Arrays;
public class Week7_2
{
//your method here...


    public static void main(String[] args)
    {
//your statements to test method here
        Scanner input = new Scanner(System.in);
        String numberString = input.nextLine();
        int length = numberString.length();
        int lengthUse = length -1;
        int answerLength = 0;
        int[] array = new int[length];
        int a = 0;
        if (Character.isLetter(numberString.charAt(1)))
            System.out.println("Input error");
        else {
            for (int i = 0; i < length; i++) {
                char sym = numberString.charAt(i);
                if (sym == 32)
                    continue;
                else if (sym == 48) {
                    array[lengthUse] = Character.digit(sym, 10);
                    lengthUse -= 1;
                    answerLength += 1;
                } else {
                    array[a] = Character.digit(sym, 10);
                    a += 1;
                    answerLength += 1;
                }
            }
            int[] newArray = Arrays.copyOfRange(array, 0, answerLength);
            for (int v : newArray)
                System.out.print(v + " ");
        }
    }
}