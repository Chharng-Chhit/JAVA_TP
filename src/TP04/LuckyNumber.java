import java.util.Scanner;
public class LuckyNumber {
      Integer number;
      int len, fir3, last3;
      LuckyNumber (int number){
            this.number = number;
            this.len = String.valueOf(number).length();
      }

      void isLucky(){
            Integer sum1=0, sum2=0;
            fir3 = this.number/1000;
            last3 = this.number%1000;
            while(fir3 != 0){
                  sum1 = sum1 + fir3%10;
                  fir3 /= 10;
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
            if (this.len == 6){
                 this.isLucky();
            }
            else {
                  System.err.println("\nInvalid input number, please input only 6 digits number.");
            }
      }
      
      public static void main(String[] args) {
            LuckyNumber l;
            Scanner sc = new Scanner(System.in);
            System.out.println("Program for testing for lucky number.");
            System.out.print("Please input 6 digits number: ");
            l = new LuckyNumber(sc.nextInt());
            l.isValid();
      }
}
