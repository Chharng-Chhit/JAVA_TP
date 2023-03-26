package OUSA_Work;
import java.util.Scanner;

public class TP04_4 {
      Double riel, dollar, baht;

      void RielsToDollar(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input money in RIELS: ");
            this.riel = sc.nextDouble();
            this.dollar = this.riel/4000;
            System.out.printf("\n%.0f RIELS = %.2f USD\n", this.riel, this.dollar);
      }
      void RielToBaht(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input money in RIELS: ");
            this.riel = sc.nextDouble();
            this.baht = this.riel/4000*30;
            System.out.printf("\n%.0f RIELS = %.2f Baht\n", this.riel, this.baht);
      }
      void DollarToRiel(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input money in Dollar: ");
            this.dollar= sc.nextDouble();
            this.riel = this.dollar*4000;
            System.out.printf("\n%.2f USD = %.0f RIEL\n", this.dollar, this.riel);
      }
      void DollarToBaht(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input money in Dollar: ");
            this.dollar = sc.nextDouble();
            this.baht = this.dollar*30;
            System.out.printf("\n%.2f USD = %.2f Baht\n", this.dollar, this.baht);
      }
      void BahtToRiel(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input money in Baht: ");
            this.baht = sc.nextDouble();
            this.riel = this.baht*4000/30;
            System.out.printf("\n%.2f Baht = %.0f RIEL\n", this.baht, this.riel);
      }

      void Display(){
            System.out.println("===============================================");
            System.out.println("Welcome to program Money Exchanges!");
            System.out.println("\t1. Riels to Dollar");
            System.out.println("\t2. Riels to Thai Baht");
            System.out.println("\t3. Dollar to Riels");
            System.out.println("\t.4. Dollar to Thai Baht");
            System.out.println("\t5. Thai Baht to Riels");
            System.out.println("\t6. Exit");
      }
      public static void main(String[] args) {
            TP04_4 m = new TP04_4();
            int ch;
            Scanner sc = new Scanner(System.in);
            do{
                  m.Display();
                  System.out.print("Choose an option: ");
                  ch = sc.nextInt();

                  switch(ch){
                        case 1: m.RielsToDollar(); break;
                        case 2: m.RielToBaht(); break;
                        case 3: m.DollarToRiel(); break;
                        case 4: m.DollarToBaht(); break;
                        case 5: m.BahtToRiel(); break;
                        default: System.out.println("Option Invaled!!");
                  }
            }while(ch != 6);
      }
}
