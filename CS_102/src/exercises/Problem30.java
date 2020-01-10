package exercises;

import java.util.Scanner;
public class Problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int letter = 0, space = 0, number = 0, other = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letter++;
            }
            else if (Character.isDigit(sentence.charAt(i))) {
                number++;
            }
            else if (sentence.charAt(i) == ' ') {
                space++;
            }
            else {
                other++;
            }
        }
        System.out.printf("letter: %d%nspace:  %d%nnumber: %d%nother: %d", letter, space, number, other);
    }
}
