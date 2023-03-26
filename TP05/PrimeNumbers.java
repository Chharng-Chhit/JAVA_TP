package TP05;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to list prime numbers from 2 to it: ");
        int num = scanner.nextInt();
        System.out.print("2 ");
        for(int i=3; i<=num; i+=2) {
            boolean isPrime = true;
            for(int j=3; j*j<=i; j+=2) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.print("is prime number.");
    }
}
