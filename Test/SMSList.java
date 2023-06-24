package Test;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

import TP07_1.SMS;

public class SMSList {
    ArrayDeque<SMS> smslist;
    Scanner sc = new Scanner(System.in);
    public SMSList(){
        smslist = new ArrayDeque<>();
    }
    public void add(){
        SMS sms = new SMS();
        String input = "";
        System.out.print("To username: ");
        sms.recievenumber = sc.nextLine();
        System.out.print("Title: ");
        sms.subject = sc.nextLine();
        System.out.print("Content (Enter END to end the content): ");
        while(true){
            input = input + sc.nextLine() + "\n"; 
            if(input.length()>160){
                System.out.println("Content exceeded the maximum characters(160) limit!\n");
                continue;
            }
            if (input.contains("END")){
                sms.content = input;
                System.out.println(":) Your message has been sent to "+sms.recievenumber);
                break;
            }
        }
        sms.content = sms.Encrypt(sms.content, "password");
        smslist.add(sms);
    }
    public void delete(int i){
        SMS[] array = smslist.toArray(new SMS[smslist.size()]);
        SMS[] newsmslist = new SMS[array.length-1];
        System.arraycopy(array, 0, newsmslist, 0, i);
        System.arraycopy(array, i + 1, newsmslist, i, newsmslist.length - i);
        smslist.clear();
            for (SMS element : newsmslist) {
                smslist.add(element);
            }

    }
    public void listDetail(int i){
        System.out.println("========================================");
        SMS[] newsmslist = smslist.toArray(new SMS[smslist.size()]);
        System.out.println("To: "+newsmslist[i].recievenumber);
        System.out.println("Title: "+newsmslist[i].subject);
        System.out.println("Content: "+ newsmslist[i].content);
    }
    public void listDetailDecrypt(int i){
        System.out.println("========================================");
        SMS[] newsmslist = smslist.toArray(new SMS[smslist.size()]);
        System.out.println("To: "+newsmslist[i].recievenumber);
        System.out.println("Title: "+newsmslist[i].subject);
        System.out.println("Content: "+ new SMS().Decrypt(newsmslist[i].content, "password"));
    }
    public void listSms(){
        if(smslist.isEmpty()){
            System.out.println("Empty Message box!");
            return;
        }
        Iterator<SMS> i = smslist.iterator();
        System.out.println("===================List SMS=======================");
        int count = 0;
        while(i.hasNext()){
            SMS newsms = i.next();
            try{    
                System.out.println(" ---- "+(count+1)+" ---- ");
                System.out.println("To: "+newsms.recievenumber);
                System.out.println("Title: "+newsms.subject);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
