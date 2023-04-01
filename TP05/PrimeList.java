package TP05;

import java.util.Scanner;
import TP_04.*;
public class PrimeList {
      private int start = 2;
      private int end;
      public PrimeList(int end){
            this.end = end;
      }

      public void ListAll(){
            PrimeNumber pn;
            int count = 0;
            for(int n = start; n<=end; n++){
                  pn = new PrimeNumber(n);
                  if(pn.isPrime()){
                        System.out.print(n+" ");
                        count++;
                  }

            }
            if(count==1){
                  System.out.print("is prime number.\n");
            }else if(count >1){
                  System.out.print("are prime number.\n");
            }

            
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("input end number: ");
            PrimeList Pl;
            Pl = new PrimeList(sc.nextInt());
            Pl.ListAll();
      }
}
