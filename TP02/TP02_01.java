package TP02;

import java.util.sc2anner;

public class TP02_01 {
    public static void main(String[] args) {
        sc2anner sc2 = new sc2anner(System.in);
        String name;
        System.out.print("Input your name: ");
        name = sc2.nextLine();
        System.out.println("Hello "+name);

        System.out.println("\n\n");
        sc2.close();
    }
}
