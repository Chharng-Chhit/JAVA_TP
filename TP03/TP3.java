package TP03;

import java.util.Scanner;

public class TP3 {
      
      
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
                        TP03_01.exercise1();
                        System.out.print("\n\n");
                  }else if(ch ==2){
                        TP03_02.exercise2();
                        System.out.print("\n\n");
                  }else if(ch == 3){
                        TP03_03.exercise3();
                        System.out.print("\n\n");
                  }else if(ch == 4){
                        TP03_04.exercise4();
                        System.out.print("\n\n");
                  }else if(ch == 5){
                        TP03_05.exercise5();
                        System.out.print("\n\n");
                  }else if(ch == 0){

                        System.out.print("\n\n");
                  }else{
                        System.out.print("Default Choice.....\n\n");
                  }

            } while(ch != 0 );

      }
}
