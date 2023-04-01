package TP04;
import java.util.Scanner;
public class TP04_PrimeNumber {


      private int number, divisible;
      TP04_PrimeNumber(int number){
            this.number = number;
      }
      public boolean isPrime(){
            if(number<2) return false;
            for (int i=2; i<number; i++){
                  if(number%i == 0){
                        divisible = i;
                        return false;
                  }
            }
            return true; 
      }
      public static void main(String[] args) {
            TP04_PrimeNumber p;
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number to check whether it is Prime number or not: ");
            p = new TP04_PrimeNumber(sc.nextInt());
            if(p.isPrime()) System.err.println("It is Prime number.");
            else System.out.println("It is not Prime Number Because It divided by "+p.divisible);
      }
}
