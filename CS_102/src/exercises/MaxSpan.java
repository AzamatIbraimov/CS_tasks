package exercises;

import java.util.Scanner;
public class MaxSpan
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String numbers = "";

        while (true) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            } else {
                numbers += line;
            }
        }
        System.out.println(numbers);
    }
}