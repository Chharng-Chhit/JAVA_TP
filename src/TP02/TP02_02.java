package src.TP02;
import java.util.Scanner;
public class TP02_02 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram for calculating perimeter and surface of Rectangle.");
        System.out.print("Please Input width (in meter): ");
        a = sc.nextInt();
        System.out.print("Please Input high (int meter): ");
        b = sc.nextInt();
        System.out.printf("\tThe Perimeter of Rectangle is : %d m",(a+b)*2);
        System.out.printf("\n\tThe surface of Rectangle is : %d m^2\n\n\n",a*b);
        sc.close();
    }
}
