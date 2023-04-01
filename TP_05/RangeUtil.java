package TP_05;

public class RangeUtil {
      private int start, end, step;

      public RangeUtil(int start, int end, int step){
            this.start = start;
            this.end = end;
            this.step = step;
      }
      public String ToString(String n){
            String string ="";
            EvenNum ev;
            if(n == "Odd"){
                  
                  if(start<end){
                        for (int i=start; i<=end; i+=step){
                              ev = new EvenNum(i);
                              if(ev.isOdd()){
                                    string = string + " " + Integer.toString(i);
                              }
                        }
                  }else{
                        for(int i=end; i<=start; i+=step){
                              ev = new EvenNum(i);
                              if(ev.isOdd()){
                                    string = string+" "+ Integer.toString(i);
                              }
                        }
                  }
            }
            if(n == "Even"){
                  if(start<end){
                        for (int i=start; i<=end; i+=step){
                              ev = new EvenNum(i);
                              if(!ev.isOdd()){
                                    string = string + " " + Integer.toString(i);
                              }
                        }
                  }else{
                        for(int i=end; i<=start; i+=step){
                              ev = new EvenNum(i);
                              if(!ev.isOdd()){
                                    string = string+" "+ Integer.toString(i);
                              }
                        }
                  }
            }
            return string;
      }
}
