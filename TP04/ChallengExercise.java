// package OUSA_Work;
import OUSA_Work.*;
import java.util.Scanner;

public class ChallengExercise {
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
            ChallengExercise C = new ChallengExercise();
            do{
                  n = C.Display(C.ch);
              
                  switch(n){
      
                        case 1: .TP04_1.main(null); break;
                        case 2: TP004_2.main(null); break;
                        case 3: TP04_3.main(null); break;
                        case 4: TP04_4.main(null); break;
                        case 5: TP04_5.main(null); break;
                        case 6: TP04_6.main(null); break;
                        case 7: TP04_7.main(null); break;
                  }

            }while(n != 0);
      }
}
