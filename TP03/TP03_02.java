package TP03;

import java.util.Scanner;

public class TP03_02 {
      public static void exercise2() {
            System.out.print("Program for converting time to seconds.\n");
            Scanner sc2 = new Scanner(System.in);
            int hour, min, sec, result;
            System.out.print("Please input hours: "); 
            hour = sc2.nextInt();
            System.out.print("Please input minutes: ");
            min = sc2.nextInt();
            System.out.print("Please input seconds: ");
            sec = sc2.nextInt();
            result = hour*3600 + min*60 + sec;
            System.out.printf("\nNumber of seconds = %dx3600 + %dx60 + %d = %d\n\n", hour, min, sec, result);

      }
      public static void main(String[] args) {
            exercise2();
      }
}
