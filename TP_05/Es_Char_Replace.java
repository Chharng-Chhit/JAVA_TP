package TP_05;

import java.util.Scanner;

public class Es_Char_Replace {
      private String word;
      public Es_Char_Replace(String word){
            this.word = word;
      }

      public String SymbolToChar(){
            String replace;
            replace=word.replaceAll("\\\\n", "(new_line)")
                        .replaceAll("\\\\t", "(tab)")
                        .replaceAll("\\\\\\\\", "(slash)")
                        .replaceAll("//", "(comment_line)")
                        .replaceAll(":\\)", "(smile)");
            return replace;
      }

      public String CharToSymbol(){
            String replace;
            replace=word.replaceAll("(new_line)","\\\\n")
                        .replaceAll("(tab)", "\\\\t")
                        .replaceAll("(slash)", "\\\\\\\\")
                        .replaceAll("(comment_line)", "//")
                        .replaceAll( "(smile)", ":\\)");
            return replace;
      }

      public static void main(String[] args) {
            Es_Char_Replace ecr;
            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter a sentence: ");
            ecr = new Es_Char_Replace(sc.nextLine());
            System.out.println("\n"+ecr.SymbolToChar());
      }
}
