package TP05;

import java.util.Scanner;

public class Mirroring {
      private String word;
      public Mirroring(String word){
            this.word = word;
      }

      public String makePalindrome(){
            String wordRev = "";
                  for(int i = word.length()-1; i>=0; i--){
                        wordRev = wordRev + word.charAt(i);
                  }
                  wordRev = word + wordRev;
            return wordRev;
      }
      public static void main(String[] args) {
            Mirroring mi;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a word: ");
            mi = new Mirroring(sc.nextLine());
            System.out.println(mi.makePalindrome());
      }
}
