package TP03.TP03_Repeat;

import java.util.Scanner;

public class Riels2Dollar {
      public static void main(String[] args) {
            System.out.print("Program for converting money in Riels to Dollars.\n");
            System.out.print("Conversion rate is: 1 USD = 4000 RIELS\n");
            Scanner sc = new Scanner(System.in);
            int riel;
            // double dollar;

            System.out.print("Please input money in Riels: ");
            riel = sc.nextInt();
            System.out.printf("\n%d RIELS = %f USD", riel, riel/4000.0);
      }
}
