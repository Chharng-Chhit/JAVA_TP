package TP05_1;

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input word
        System.out.print("Please enter a word: ");
        String word = input.nextLine();

        // Create a palindrome and print it
        String palindrome = makePalindrome(word);
        System.out.println(palindrome);
    }

    /**
     * Creates a palindrome by reversing a given string and joining it with the original.
     */
    public static String makePalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word + reversed;
    }
}

