package TP_05;

public class OddNum {
      private int number;

      public OddNum(int number){
            this.number = number;
      }

      public boolean isOdd(){
            if(number%2 != 0){
                  return true;
            }
            return false;
      }
      
      public static void main(String[] args) {
            OddNum on;
            System.out.print("Odd number: ");
            for(int i=1; i<500; i++){
                  on = new OddNum(i);
                  if(on.isOdd()){
                        System.out.print(i+" ");
                  }
            }
      }
}
