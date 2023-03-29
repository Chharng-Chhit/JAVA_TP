package src.TP05;

import java.util.Scanner;

public class Exercise4 {
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input word
        System.out.print("Please enter a word to check: ");
        String word = input.nextLine();

        // Read the check method
        System.out.print("Choose method (REV, LOOP): ");
        String method = input.nextLine().toUpperCase();

        // Check if the word is a palindrome using the chosen method
        boolean isPalindrome = false;
        if (method.equals("REV")) {
            isPalindrome = checkPalindromeByReversing(word);
        } else if (method.equals("LOOP")) {
            isPalindrome = checkPalindromeByLooping(word);
        }

        // Print the result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    /**
     * Checks if a word is a palindrome by reversing it and comparing with the original.
     */
    public static boolean checkPalindromeByReversing(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    /**
     * Checks if a word is a palindrome by looping through its characters from both ends and comparing them.
     */
    public static boolean checkPalindromeByLooping(String word) {
        int length = word.length();
        for (int i = 0; i < length/2; i++) {
            if (word.charAt(i) != word.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }
}

