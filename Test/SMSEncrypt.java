package Test;
import java.util.Scanner;

import TP07_1.SMSList;

public class SMSEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        SMSList s = new SMSList();
        while(a!=5){
            System.out.println("\t\tMenu\n1.Send new SMS\n2.View SMS detail\n3.List SMSes\n4.Remove SMSes\n5.Quit");
            System.out.print("\nChoose: ");a = sc.nextInt();
            switch(a){
                case 1:
                    s.add();  
                    break;
                case 2:
                    System.out.print("Enter the index: ");
                    s.listDetail(sc.nextInt());
                    break;
                case 3:
                    s.listSms();
                    break;
                case 4:
                    System.out.print("Enter the index: ");
                    s.delete(sc.nextInt());
                    break;
                case 5:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("invalid! please enter the correct index.");
                    break;
            }
        }
        sc.close();
    }
}
