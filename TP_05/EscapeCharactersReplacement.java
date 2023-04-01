package TP_05;

import java.util.Scanner;

public class EscapeCharactersReplacement {
      private String word;
      public EscapeCharactersReplacement(String word){
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
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a sentence: ");
            String sentence = scanner.nextLine();

            String encodedSentence = MessageCoder.encode(sentence);
            System.out.println("Encoded sentence: " + encodedSentence);

            System.out.print("Do you want to decode the message? (Y/N): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                  String decodedSentence = MessageCoder.decode(encodedSentence);
                  System.out.println("Decoded sentence: " + decodedSentence);
            }
      }
}
