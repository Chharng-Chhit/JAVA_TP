package OUSA_Work;
import java.util.Scanner;
public class TP04_1 {
    static int divi;
    int number;

    public TP04_1(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        TP04_1 p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number to check whether it is prime number: ");
        p = new TP04_1(sc.nextInt());
        if(isPrime(p.number)) {
            System.out.println(p.number + " is prime number");
        }
        else{
            System.out.println(p.number + " is not prime number");

            System.out.println("Because it is divisible by "+divi);
        }
    }
    static  boolean isPrime(int num)
    {
        
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<num;i++)
       {
           if((num%i)==0){
                divi = i;
               return  false;
           }   
       }
       return true;
    }
}


