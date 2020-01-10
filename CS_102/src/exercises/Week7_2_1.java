package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Week7_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        String answer = number.replaceAll(" ", "");
        int[] result = new int[answer.length()];
        Character myChar = null;
        int countOfZero = 0;
        for (int i = 1; i < answer.length(); i++) {
            if (answer.charAt(i) == '0') {
                answer = answer.replace(answer.charAt(i), myChar);
                answer = answer.substring(0, i) + answer.substring(i + 1);
                answer = '0' + answer;
            }
        }
        //ZeroFront(result);
    }

    public static int[] ZeroFront(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
                count ++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}