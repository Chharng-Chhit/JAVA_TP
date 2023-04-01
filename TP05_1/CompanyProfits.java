package TP05_1;

import java.util.Scanner;

public class CompanyProfits {
      public static void main(String[] args) {
            double sum=0; double in;
            Scanner sc = new Scanner(System.in);

            System.out.println("Program for Calculate company profits for 12 months.");
            for (int i=0; i<12; i++){
                  System.out.printf("Profit for month %d : ", i+1);
                  in = sc.nextDouble();

                  sum += in;
            }

            System.out.printf("\nTotal profits for 12 months : %.2f\n\n", sum);
      }
}
