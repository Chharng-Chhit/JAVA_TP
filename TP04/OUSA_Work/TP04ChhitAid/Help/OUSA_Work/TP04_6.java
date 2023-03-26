package OUSA_Work;
import java.util.Scanner;

public class TP04_6 {
      int far1, far2;
      int letreForKm1, letreForKm2;
      int weigth;

      boolean isShipping(){
            this.letreForKm1 = (this.weigth<=5000)?10*far1:((this.weigth<=10000)?20*far1:((this.weigth<=20000)?25*far1:35*far1));
            this.letreForKm2 = (this.weigth<=5000)?10*far2:((this.weigth<=10000)?20*far2:((this.weigth<=20000)?25*far2:35*far2));
            if(this.letreForKm1 <= 5000 && this.letreForKm2 <= 5000){
                  return true;
            }
            return false;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            TP04_6 S = new TP04_6();
            System.out.println("A shipping ship need to transport goods from Point A to point C.");
            System.out.print("Input Weight of shipping (Kg): "); 
            S.weigth = sc.nextInt();
            System.out.print("Input the distance from A to B (Km): "); 
            S.far1 = sc.nextInt();
            System.out.print("Input the distance from B to C (Km): "); 
            S.far2 = sc.nextInt();
            if(S.weigth <= 30000){
                  if(S.isShipping()) System.err.printf("\nAgree to Shipping: %dL for A to B and %dL for B to C are less than 5000L\n", S.letreForKm1, S.letreForKm2);
                  else System.err.printf("\nNot Agree to Shipping: Becuase %dL for A to B or %dL for B to C is more than 5000L\n", S.letreForKm1, S.letreForKm2);
            }
            else{
                  System.err.print("\n The weight more than 30000kg, The ship cannot be loaded..\n");
            }
            System.out.println("\n");
      }
}
