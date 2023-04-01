package TP_05;

import java.util.Scanner;

public class EvenNum {
      private int number;

      public EvenNum(int number){
            this.number = number;
      }

      public boolean isOdd(){
            if(number%2 == 0){
                  return true;
            }
            return false;
      }
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            RangeUtil ce1;
            System.out.print("Input Start number: "); 
            int start = sc.nextInt();
            System.out.print("Input End number: ");
            int end = sc.nextInt();
            System.out.print("Input Step: ");
            int step = sc.nextInt();

            ce1 = new RangeUtil(start, end, step);
            System.out.print("Odd number: ");
            System.out.print(ce1.ToString("Even"));
      }
}
