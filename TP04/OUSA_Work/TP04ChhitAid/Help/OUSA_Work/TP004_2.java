package OUSA_Work;
import java.util.Scanner;
public class TP004_2 {
      public static void main(String[] args) {
            TP004_2 t;
            Scanner sc = new Scanner(System.in);
            System.out.println("Program for testing for lucky number.");
            System.out.print("Please input 6 digits number: ");
            t = new TP004_2(sc.nextInt());
            t.isValid();
      }

      Integer number;
      int ousa, first3, last3;

      TP004_2 (int number){
            this.number = number;
            this.ousa = String.valueOf(number).length();
      }

      void isLucky(){
            Integer sum1=0, sum2=0;
            first3 = this.number/1000;
            last3 = this.number%1000;
            while(first3 != 0){
                  sum1 = sum1 + first3%10;
                  first3 /= 10;
            }
            while(last3 !=0){
                  sum2 = sum2 + last3%10;
                  last3 /= 10;
            }

            if(sum1 == sum2){
                  System.out.println("\n"+number +" is lucky number.");
            }
            else{
                  System.out.println("\n"+number + " is not lucky number.");
            }
      }
      
      void isValid(){
            if (this.ousa == 6){
                 this.isLucky();
            }
            else {
                  System.err.println("\nInvalid input number, please input only 6 digits number.");
            }
      }
      
}
