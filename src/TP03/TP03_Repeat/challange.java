package src.TP03.TP03_Repeat;

import java.util.Scanner;

public class challange {
      public static void main(String[] args) {
            int ch;
            Scanner sc = new Scanner(System.in);
            do{
                  System.out.print("--------------- Menu ---------------\n");
                  System.out.println("  1. Seconds to Time");
                  System.out.println("  2. Time to Seconds");
                  System.out.println("  3. Calling Cost");
                  System.out.println("  4. Riels to Dollar");
                  System.out.println("  5. Travelling Duration");
                  System.out.println("  0: Exit");
                  System.out.print("Choose an option: ");
                  ch = sc.nextInt();
                  System.out.println("----------------------------------");

                  if(ch == 1){
                        Second2Time.main(null);
                        System.out.print("\n\n");
                  }else if(ch ==2){
                        Time2Second.main(null);
                        System.out.print("\n\n");
                  }else if(ch == 3){
                        CallingCost.main(null);
                        System.out.print("\n\n");
                  }else if(ch == 4){
                        Riels2Dollar.main(null);
                        System.out.print("\n\n");
                  }else if(ch == 5){
                        TravellingDuration.main(null);
                        System.out.print("\n\n");
                  }else if(ch == 0){

                  }else{
                        System.out.print("Default Choice.....\n\n");
                  }

            } while(ch != 0 );
      }
}
