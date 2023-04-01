package TP05;

import java.util.Objects;
import java.util.Scanner;

import javax.sql.rowset.WebRowSet;

public class Palindrome {
      private String word;

      public Palindrome(String word){
            this.word = word;
      }

      boolean checkPalindromeByREV(){
            StringBuilder wordREV = new StringBuilder(word);
            wordREV.reverse();
            return wordREV.toString().equalsIgnoreCase(word);
            
      }

      boolean checkPalindromeByLOOP(){
            for(int i=0; i <= word.length()/2; i++){
                 if(word.charAt(i) != word.charAt(word.length()-1-i)) return false;
                 return true;
            }

            return true;
      }

      public static void main(String[] args) {
            Palindrome pa;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Please gives a word to Check: ");
            pa = new Palindrome(sc.nextLine());
            System.out.print("Choose method (REV, LOOP): ");
            switch(sc.next()){
                  case "REV": 
                        if(pa.checkPalindromeByREV()){
                              System.out.printf("%s is Palindrome.\n",pa.word);
                        }
                        else{
                              System.out.printf("%s is not Palindrme.\n",pa.word);
                        }
                  break;
                  case "LOOP":
                        if(pa.checkPalindromeByLOOP()){
                              System.out.printf("%s is Palindrome.\n",pa.word);
                        }
                        else{
                              System.out.printf("%s is not Palindrme.\n",pa.word);
                        }
                  break;
            }

            
      }
}
