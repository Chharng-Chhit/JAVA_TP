package TP05_1;

import java.util.Scanner;

public class EvenNumber {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Program to display even number located between A and 500");
            System.out.print("Input number A: ");
            int a = sc.nextInt();

            System.out.print("Even Number: ");
            for (int i = a; i<=500; i++){
                  if(i%2 == 0) System.out.print(i + " ");
            }
      }
}
