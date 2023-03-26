package TP03;

import java.util.Scanner;

public class TP03_04 {
      public static void exercise4() {
            System.out.print("Program for converting money in Riels to Dollars.\n");
            System.out.print("Conversion rate is: 1 USD = 4000 RIELS\n");
            Scanner sc4 = new Scanner(System.in);
            int riel;
            // double dollar;

            System.out.print("Please input money in Riels: ");
            riel = sc4.nextInt();
            System.out.printf("\n%d RIELS = %f USD", riel, riel/4000.0);
      }

      public static void main(String[] args) {
            exercise4();
      }
}
