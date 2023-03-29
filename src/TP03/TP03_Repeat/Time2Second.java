package src.TP03.TP03_Repeat;
import java.util.Scanner;
public class Time2Second {
      public static void main(String[] args) {
            System.out.print("Program for converting time to seconds.\n");
            Scanner sc = new Scanner(System.in);
            int hour, min, sec, result;
            System.out.print("Please input hours: "); 
            hour = sc.nextInt();
            System.out.print("Please input minutes: ");
            min = sc.nextInt();
            System.out.print("Please input seconds: ");
            sec = sc.nextInt();
            result = hour*3600 + min*60 + sec;
            System.out.printf("\nNumber of seconds = %dx3600 + %dx60 + %d = %d\n\n", hour, min, sec, result);

      }
}
