package src.TP02;
import java.util.Scanner;
public class TP02_05 {
      public static void main(String[] args) {
            System.out.println("Program for guessing your luckiness.");
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("Please input a positive number: ");
            n = sc.nextInt();
            System.out.printf("I got %d. I am luckier.\n\n\n", n+1);
            sc.close();
      }
}
