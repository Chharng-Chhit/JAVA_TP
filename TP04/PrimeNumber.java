import java.util.Scanner;
public class PrimeNumber{
      int number, divisible;
      PrimeNumber(int number){
            this.number = number;
      }
      boolean isPrime(){
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
            PrimeNumber p;
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number to check whether it is Prime number or not: ");
            p = new PrimeNumber(sc.nextInt());
            if(p.isPrime()) System.err.println("It is Prime number.");
            else System.out.println("It is not Prime Number Because It divided by "+p.divisible);
      }
}
