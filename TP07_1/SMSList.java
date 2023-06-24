package TP07_1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SMSList {
    public static ArrayDeque<SMS> smsList;
    public static String password;
    public static final int MAX_CHARACTERS_PER_SMS = 160;
    SMSdecryp d = new SMSdecryp();

    public SMSList() {
        smsList = new ArrayDeque<>();
    }

    public void add(SMS sms) {
        smsList.add(sms);
    }

    public void add(String msg) {
        add(new SMS("","", "", msg));
    }

    public void add(String msg, String title) {
        add(new SMS(title, "", "", "", msg, ""));
    }

    public String Encrytext(String txt) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            int characterASCII = txt.charAt(i);
            buf.append(" ");
            buf.append(Integer.toBinaryString(characterASCII));
        }
        // String encry
        String h = buf.toString();
        h = h.replace("0", "-").replace("1", "?");
        return h;
    }


    void CreatePassword(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Create Password: ");
        SMSList.password = sc.nextLine();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Send new SMS with Encrypted content using password method");
        System.out.println("2. View SMS detail");
        System.out.println("3. List SMSes");
        System.out.println("4. Remove SMSes by index");
        System.out.println("5. Quit");
    }

    public void sendEncryptedSMS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter the sender's phone number: ");
        String fromPhoneNumber = scanner.nextLine();
        System.out.print("Enter the receiver's phone number: ");
        String receiverNumber = scanner.nextLine();
        System.out.print("Enter the content of the SMS: ");
        String content = scanner.nextLine();
        
        // Add your code here to handle sending encrypted SMS using the provided

        String encryptedContent = Encrytext(content);
        SMS sms = new SMS(subject, fromPhoneNumber, receiverNumber, encryptedContent);
        add(sms);
        System.out.println("Encrypted SMS sent successfully!");
    }

    public void viewSMSDetail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the SMS to view: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n\n------------------<< SMS List >>--------------");

        if (index >= 0 && index < smsList.size()) {
            SMS sms = smsList.stream().skip(index).findFirst().orElse(null);
            if (sms != null) {
                System.out.println("Subject: " + sms.subject);
                System.out.println("From: " + sms.fromPhoneNumber);
                System.out.println("Receiver: " + sms.receiverNumber);
                System.out.println("Type: " + sms.type);
                System.out.println("Content: " + sms.content);
                System.out.println("Status: " + sms.status);
            } else {
                System.out.println("SMS not found.");
            }
        } else {
            System.out.println("Invalid SMS index.");
        }
        System.out.println("----------------------------------------------\n");
    }

    public void listSMSes() {
        if (smsList.isEmpty()) {
            System.out.println("No SMSes found.");
        } else {
            System.out.println("\n\n------------------<< SMS List >>--------------");
            
            int index = 0;
            for (SMS sms : smsList) {
                System.out.println("Index: " + index);
                System.out.println("From: " + sms.fromPhoneNumber);
                System.out.println("Receiver: " + sms.receiverNumber);
                System.out.println("Content: " + sms.content);
                index++;
            }
            System.out.println("----------------------------------------------\n");
        }
    }

    public void removeSMSByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the SMS to remove: ");
        int i = scanner.nextInt();

        SMS[] array = smsList.toArray(new SMS[smsList.size()]);
        SMS[] newsmslist = new SMS[array.length - 1];
        System.arraycopy(array, 0, newsmslist, 0, i);
        System.arraycopy(array, i + 1, newsmslist, i, newsmslist.length - i);
        smsList.clear();
        for (SMS element : newsmslist) {
            smsList.add(element);
        }

        if (smsList.size() - 1 <= i && i >= 0) {
            System.out.println("Remove sucessful! ");
        } else {
            System.out.println("Index it find..");
        }
    }


    // Rest of the code

    public static void main(String[] args) {

        SMSList smsList = new SMSList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        smsList.CreatePassword();
        do {
            smsList.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    smsList.sendEncryptedSMS();
                    break;
                case 2:
                    smsList.viewSMSDetail();
                    break;
                case 3:
                    smsList.listSMSes();
                    break;
                case 4:
                    smsList.removeSMSByIndex();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        // scanner.close();
    }
}
