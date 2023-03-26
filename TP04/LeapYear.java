import java.util.Scanner;

public class LeapYear {
      int year;
      LeapYear(int year){
            this.year = year;
      }
      boolean isLeapYear(){
            if(this.year % 4 == 0){
                  if(this.year % 100 == 0){
                        if(this.year % 400 == 0) return true;
                        return false;
                  }
                  return true;
            }
            return false;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LeapYear y;
            System.out.print("Input a year: ");
            y = new LeapYear(sc.nextInt());
            if(y.year < 1){
                  System.err.print("Error: Invalid input! Number should be bigger than 1\n");
            }
            else{
                  if(y.isLeapYear()){
                        System.out.printf("\n%d is a leap year.\n\n", y.year);
                  }
                  else{
                        System.out.printf("\n%d is not a leap year.\n\n", y.year);
                  }
            }
      }
}
