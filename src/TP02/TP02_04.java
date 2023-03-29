package src.TP02;
import java.util.Scanner;
public class TP02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, hundred;
        System.out.println("Program for counting the number of hundred.");
        System.out.printf("Input a interger number: ");
        number = sc.nextInt();
        hundred = number / 100;
        System.out.printf("\nThere are %d hundred in number %d.\n\n\n", hundred, number);
        sc.close();
    }
}
