package TP04;

import java.util.Scanner;

public class ChallengExercise1 {
      int ch;
      int Display(int n){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n[-------------------- MENU ---------------]");
            System.out.println("\t1. Prime number");
            System.out.println("\t2. Lucky number");
            System.out.println("\t3. Reversing number");
            System.out.println("\t4. Money exchange");
            System.out.println("\t 5. Max among 8 numbers");
            System.out.println("\t 6. Shipping");
            System.out.println("\t 7. Leap year");
            System.out.print("Choose an option: "); n = sc.nextInt();
            System.out.println("------------------------------------------");
            return this.ch = n;
      }
      public static void main(String[] args) {
            int n;
            ChallengExercise1 C = new ChallengExercise1();
            do{
                  n = C.Display(C.ch);
                  switch(n){
                        case 1: PrimeNumber.main(null); break;
                        case 2: LuckyNumber.main(null); break;
                        case 3: ReversingNumber.main(null); break;
                        case 4: MoneyExchange.main(null); break;
                        case 5: MaxNumber.main(null); break;
                        case 6: Shipping.main(null); break;
                        case 7: LeapYear.main(null); break;
                  }

            }while(n != 0);
      }
}
