package OUSA_Work;
import java.util.Scanner;

public class TP04_5 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int maxNum = 0; 
            int num;
            for(int i = 0; i<8; i++){
                  System.out.printf("Input Integer Number #%d: ", i+1);
                  num = sc.nextInt();
                  if(num > maxNum) maxNum = num;
            }
            System.out.printf("\nThe maximum number is : %d\n\n\n\n", maxNum);
      }
}
