package exercises;

import java.util.Scanner;
public class Problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                sentence = sentence.substring(i);
                break;
            }
        }
        String[] sentenceArray = sentence.split(" ");
        for (String i : sentenceArray) {
            i = i.substring(0, 1).toUpperCase() + i.substring(1);
            System.out.print(i + " ");
        }

    }
}
