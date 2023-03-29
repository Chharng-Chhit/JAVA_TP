package src.TP03;

import java.util.Scanner;

public class TP03_01 {
      public static void exercise1() {
            System.out.printf("\tConvert number of seconds to time format Hours:Minutes:Seconds\n");
            Scanner sc1 = new Scanner(System.in);
            int input, sec, min, hour;
            System.out.print("Input number of seconds: ");
            input = sc1.nextInt();
            sec = input;

            min = sec/60;
            sec = sec%60;

            hour = min/60;
            min = min%60;

            System.out.printf("Time corresponding to %d seconds is %02d:%02d:%02d.\n\n", input, hour, min, sec);

            // sc1.close();
      }
      public static void main(String[] args) {
            exercise1();
      }
}
