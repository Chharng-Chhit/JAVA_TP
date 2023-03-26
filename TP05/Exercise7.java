package TP05;

import java.util.Scanner;
public class Exercise7 {
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input sentence
        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine();

        // Replace escape characters
        sentence = sentence.replaceAll("\\\\n", "(new_line)")
                           .replaceAll("\\\\t", "(tab)")
                           .replaceAll("\\\\\\\\", "(slash)")
                           .replaceAll("//", "(comment_line)")
                           .replaceAll(":\\)", "(smile)");

        // Print the result
        System.out.println(sentence);
    }
}
