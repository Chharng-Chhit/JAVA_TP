package src.TP05;

import java.util.Scanner;
public class Exercise7 {
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input sentence
        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine();

        // Replace escape characters
        sentence = sentence.replace("\\n", "(new_line)")
                           .replace("\\t", "(tab)")
                           .replace("\\\\", "(slash)")
                           .replace("//", "(comment_line)")
                           .replace(":)", "(smile)");

        // Print the result
        System.out.println(sentence);
    }
}
