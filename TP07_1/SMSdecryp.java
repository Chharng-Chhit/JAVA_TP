package TP07_1;
import java.util.ArrayDeque;
import java.util.Scanner;

public class SMSdecryp{
    ArrayDeque<SMS> smsList = SMSList.smsList;
    public String decrytext(String text){

        String dycry_bin = text;
        dycry_bin = dycry_bin.trim();
        dycry_bin = dycry_bin.replace("-", "0").replace("?", "1");
 
        String[] parts = dycry_bin.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String part : parts){
            int val = Integer.parseInt(part, 2);
            String c = Character.toString(val);
            sb.append(c);
        }
        return sb.toString();
    }
    
    public void viewSMSDetail_deycry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the SMS to view: ");
        int index = scanner.nextInt();
        scanner.nextLine();
         
        if (index >= 0 && index < smsList.size()) {
            SMS sms = smsList.stream().skip(index).findFirst().orElse(null);
            if (sms != null) {
                System.out.println("\n\n------------------<< SMS detail >>--------------");
                System.out.println("Subject: " + sms.subject);
                System.out.println("From: " + sms.fromPhoneNumber);
                System.out.println("Receiver: " + sms.receiverNumber);
                System.out.println("Type: " + sms.type);
                System.out.println("Content: " + decrytext(sms.content));
                System.out.println("Status: " + sms.status);

                System.out.println("----------------------------------------------\n");
            } else {
                System.out.println("SMS not found.");
            }
        } else {
            System.out.println("Invalid SMS index.");
        }
    }

    public void listSMSes_decry() {
        if (smsList.isEmpty()) {
            System.out.println("No SMSes found.");
        }else {
            System.out.println("\n\n------------------<< SMS List >>--------------");
            
            int index = 0;
            for (SMS sms : smsList) {
                System.out.println("Index: " + index);
                System.out.println("From: " + sms.fromPhoneNumber);
                System.out.println("Receiver: " + sms.receiverNumber);
                System.out.println("Content: " + decrytext(sms.content));
                index++;
            }
            System.out.println("----------------------------------------------\n");
        }
    }

    public static void main(String[] args) {
        SMSList smsList = new SMSList();
        SMSdecryp smsListD = new SMSdecryp();
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

                        System.out.println("---------------------------------");
                        System.out.print("Input Password fer Decrypt : ");
                        String pass = scanner.nextLine();
                        boolean comp = pass.equals(SMSList.password);
                        if(comp){
                            smsListD.viewSMSDetail_deycry();
                        }else{
                            System.out.print("Wrong Password, Content is Encrypt..");
                            smsList.viewSMSDetail();
                        }
                    break;
                case 3:
                        System.out.println("---------------------------------");
                        System.out.print("Input Password fer Decrypt : ");
                        String passw = scanner.nextLine();
                        boolean c = passw.equals(SMSList.password);
                        if(c){
                            smsListD.listSMSes_decry();                     
                        }else{
                            System.out.print("Wrong Password, Content is Encrypt..");
                            smsList.listSMSes();
                        }
                    
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
