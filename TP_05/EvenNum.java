package TP_05;

public class EvenNum {
      private int number;

      public EvenNum(int number){
            this.number = number;
      }

      public boolean isOdd(){
            if(number%2 == 0){
                  return true;
            }
            return false;
      }
      
      public static void main(String[] args) {
            EvenNum en;
            System.out.print("Even number: ");
            for(int i=1; i<500; i++){
                  en = new EvenNum(i);
                  if(en.isOdd()){
                        System.out.print(i+" ");
                  }
            }
      }
}
