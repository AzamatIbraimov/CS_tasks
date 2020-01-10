package exercises;

import java.util.Scanner;
public class Week6_3
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }
            int leftCounter = 0;
            int sumLeft = 0;
            while (true) {
                int sumRight = 0;
                int rightCounter = leftCounter+1;
                sumLeft = sumLeft + numbers[leftCounter];
                leftCounter++;
                while (rightCounter < numbers.length) {
                    sumRight = sumRight + numbers[rightCounter];
                    rightCounter++;
                }
                if (sumLeft == sumRight) {
                    System.out.println("Can be balanced");
                    break;
                } else if (leftCounter == 10) {
                    System.out.println("Can not be balanced");
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }

    }
}
