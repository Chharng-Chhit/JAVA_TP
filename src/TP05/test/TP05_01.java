package src.TP05.test;
import TP;

public class TP05_01 {
      private int start = 2;
      int end;
      public TP05_01(int end){
            this.end = end;
      }

      public void ListAll(){
            TP05_01 pn;
            int count = 0;
            for (int n = start; n <= end; n++){
                  pn = new TP05_01(n);
                  if(pn.isPrime()){

                  }
            }
      }
}
