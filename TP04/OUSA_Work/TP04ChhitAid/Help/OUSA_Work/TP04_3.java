package OUSA_Work;
import java.util.Scanner;

public class TP04_3 {
      int number;
      int len;


      TP04_3 (int number){
            this.number = number;
            this.len = String.valueOf(number).length();
      }
      public static void main(String[] args) {
            TP04_3 v;
            Scanner sc = new Scanner(System.in);
            System.out.print("Program for reversing a 4 digits number.\n");
            System.out.print("Please input 4 digits number: ");
            v = new TP04_3(sc.nextInt());
            v.isValid();
      }

      void Reverse(){
            int rev = this.number;
            int result = 0;
            while (rev > 0){
                  result = result*10 + rev%10;
                  rev = rev/10;
            }
            System.out.println("\nAfter reverse: " + result + "\n");
      }

      void isValid(){
            if(len == 4){
                  this.Reverse();
            }
            else{
                  System.err.print("\nError: Invalid input number, please input only 4 digits number.\n\n");
            }
      }

      
}
