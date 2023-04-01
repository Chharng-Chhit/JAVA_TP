// package TP05;

// import java.util.Scanner;

// class primeNumber{
//     int number;
//     int prime;
//     boolean isPrime(int number){
//         if(number<2) return false;
//         for (int i=2; i<number; i++){
//               if(number%i == 0){
//                     // divisible = i;
//                     return false;
//               }
//         }
//         return true; 
//     }
    
//     static void DisplayPrime(){
//         int n;
//         int prime;
//         primeNumber P = new primeNumber();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("This program for display Prime Number from 2 - : n");
//         System.out.print("Input Number: ");
//         n = sc.nextInt();

//         System.out.print("Prime Number are: ");
//         for (int i=0; i<=n; i++){
//             if(P.isPrime(i)){
//                 System.out.print(i+ ", ");
//             }
//         }
        
//     }
// }

// public class PrimeNumbers {
//     public static void main(String[] args) {
//         primeNumber p = new primeNumber();
//         // p.DisplayPrime();
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input number to list prime numbers from 2 to it: ");
//         int num = scanner.nextInt();
//         System.out.print("2 ");
//         for(int i=3; i<=num; i+=2) {
//             boolean isPrime = true;
//             for(int j=3; j*j<=i; j+=2) {
//                 if(i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.print("is prime number.");
//     }
// }
