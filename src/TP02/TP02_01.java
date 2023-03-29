package src.TP02;

import java.util.Scanner;

public class TP02_01 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        String name;
        System.out.print("Input your name: ");
        name = sc2.nextLine();
        System.out.println("Hello "+name);

        System.out.println("\n\n");
        sc2.close();
    }
}
