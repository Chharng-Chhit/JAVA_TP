package src.TP02;
import java.util.Scanner;
public class TP02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y, z;
        System.out.print("Input y: ");
        if(sc.hasNextFloat()){
            y = sc.nextFloat();
            System.out.print("Input z: ");
            z = sc.nextFloat();
            x = 1/(1/y+1/z);
            System.out.printf("\tThe result of x = %.4f\n\n\n",x);
        }
        else{
            System.err.println("ERROR: Input float only.");
        }
        sc.close();
    }
}
