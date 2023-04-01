package TP05;
import java.util.Scanner;

public class CompanyProfit {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] month = new double[12];
            double total = 0;

            for (int i=0; i<12; i++){
                  System.out.printf("Profit for month %d : ", i+1);
                  month[i] = sc.nextDouble();
                  total += month[i];
            }

            System.out.printf("\nTotal profits for 12 months : %.2f\n", total);
      }
}
