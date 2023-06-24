package Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import TP07_1.SMSList;

public class SMStool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //account auth
        Map<String, String> credentials = new HashMap<>();
        credentials.put("sasa", "123");
        credentials.put("vanny", "123456");
        credentials.put("bopha", "7273");
        while(true){
            System.out.print("Please enter username: ");String username = sc.nextLine();
            System.out.print("Password: ");String password = sc.nextLine();
            if (credentials.containsKey(username)) {
                String storedPassword = credentials.get(username);
                if (password.equals(storedPassword)) {
                    System.out.println("Authentication successful!");
                    break;
                } else {
                    System.out.println("Incorrect password!");
                }
            } else {
                System.out.println("Username not found!");
            }
        }
        //program
        int a = 0;
        SMSList s = new SMSList();
        while(true){
            System.out.println("------------------ Welcome to private SMS app ------------------------");
            System.out.println("""
                    1. List all SMS
                    2. View SMS Detail
                    3. Send SMS
                    4. Remove SMS by index
                    5. Quit
                    """);
            System.out.print("\nChoose an optiossn: ");a = sc.nextInt();
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
            break;
        }
        sc.close();
    }
}
