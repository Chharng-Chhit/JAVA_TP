package TP03.TP03_Repeat;

import java.util.Scanner;

public class Second2Time {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tsecs;
            int h, mm, s;
            System.out.print("Input total seconds: ");
            tsecs = Integer.valueOf(sc.nextLine()); //tsecs = 10000
            mm = tsecs/60; // m = 166
            s = tsecs%60;  // s = 40

            h = mm/60;  // h = 2
            mm = mm%60; // m = 46

            System.out.printf("\n %d seconds = %02d:%02d:%02d\n", tsecs, h, mm, s);
      }
}
