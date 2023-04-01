package TP04;
public class BitwiseOps {
      public static String pad8(int a){
            return String.format("%8s", Integer.toString(a,2)).replace(' ', '0');
      }
      public static void main(String[] args) {
            int a = 0b00111100;
            int b = 0b00001101;
            //-----------------
            System.out.printf("a = %s = %d,\nb = %s = %d\n",pad8(a),a,pad8(b),b);
            int c = a^b;
            System.out.println("c = "+pad8(c)+" = "+c);

            a = 20; b = 25;
            System.out.println(a<b?"Less than":(a>b)?"More than":"Equal");

            int d = a>b?a:b; // max num
            if(a>b) d = a;
            else d = b;
            
            Integer e = 5;
            System.out.println(e instanceof Integer);
            System.out.println(e instanceof Number);
            System.out.println(e instanceof Object);
            
            String str = "Mon";
            switch(str){
                  case "Mon":
                  break;
                  case "Tue":
                  break;
            }
      }
}
