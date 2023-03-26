package TP03;

import java.util.Scanner;

public class TP03_03 {
      public static void exercise3() {
            System.out.print("Program for calculating cost of a call.\n");
            int result, hour, min, sec, hour1, min1, sec1, hour2, min2,sec2, result1_sec, result2_sec;
            double result_cost;
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Please input start hours: ");
            hour1 = sc3.nextInt();
            System.out.print("Please input start minutes: ");
            min1 = sc3.nextInt();
            System.out.print("Please input start seconds: ");
            sec1 = sc3.nextInt();
            
            System.out.print("\nPlease input end hours: ");
            hour2 = sc3.nextInt();
            System.out.print("Please input end minutes: ");
            min2 = sc3.nextInt();
            System.out.print("Please input end seconds: ");
            sec2 = sc3.nextInt();
            
            result1_sec = hour1*3600+min1*60+sec1;
            result2_sec = hour2*3600+min2*60+sec2;

            result = result2_sec-result1_sec;
            result_cost = result;
            hour = result/3600;
            result = result%3600;
            min = result/60;
            result = result%60;
            sec = result;
            System.out.printf("\nTotal call duration: %dh %dmn %2ds\n", hour, min, sec);
            System.out.printf("Total cost of this call: %f $\n\n", result_cost/60*0.05);

      }
      
      public static void main(String[] args) {
            exercise3();
      }
}
