package exercises;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            String numberString = input.nextLine();
            if (numberString.startsWith("-")) {
                numberString = numberString.substring(1);
            }
            long number = Long.parseLong(numberString);
            System.out.println(digitSum(number));
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }


    public static int digitSum(long number){
        String numberString = Long.toString(number);
        long sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        return (int)sum;
    }
}

