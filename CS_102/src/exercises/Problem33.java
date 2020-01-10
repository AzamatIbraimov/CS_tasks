package exercises;

import java.util.Scanner;
public class Problem33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().substring(1);
        wordLengths(sentence);
    }
    public static void wordLengths(String sentence) {
        String[] wordsArray = sentence.split(" ");
        String asterisks = "";
        int actualwordLength = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            for (int p = 0; p < wordsArray[i].length(); p++) {
                if (Character.isLetter(wordsArray[i].charAt(p))) {
                    asterisks += "*";
                    actualwordLength++;
                }
            }
            System.out.printf("%d: %-6d%s%n", i+1, actualwordLength, asterisks);
            asterisks = "";
            actualwordLength = 0;
        }
    }
}
