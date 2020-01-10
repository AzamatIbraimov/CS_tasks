package exercises;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String args[]) {
        // declaration
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = input.nextLine();

        // processing
        splitSentence2Words(sentence);
    } // end method main

    // TODO: implement the below method
    private static void splitSentence2Words(String sentence) {
        // empty char
        Character myChar = null;
        String[] sentenceSplitted = sentence.split(" ");
        // looping through elements in the array
        for (int i = 0; i < sentenceSplitted.length; i++) {
            String word = sentenceSplitted[i];
            // looping through letters in the word
            for (int p = 0; p < word.length(); p++) {
                if (Character.isLetter(word.charAt(p))) {
                    System.out.print(word.charAt(p));
                } // end if
            } // end inside for
            System.out.println();
        } // end outside for


    } // end method splitSentence2Words
} // end class SplitSentence