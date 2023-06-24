package TP06.Test;

import java.util.Scanner;
import java.util.Vector;

public class PC {
    PCStatus status = PCStatus.Good; // true - in good condition, otherwise, demage
    String projectName = "ARES-CUD";
    String goodsName = "Computer Lab";
    String room = "206-F";
    String user = "GIC";
    String inventoryNo = "001";
    int year = 2017;

    public PC(String inventoryNo) {
        this.inventoryNo = inventoryNo;
    }

    public PC(String inventoryNo, PCStatus status) {
        this.status = status;
        this.inventoryNo = inventoryNo;
    }

    public PC(PCStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%-15s%-15s%-6s%-5s%-5s%-6s%-8s", projectName, goodsName, room, user, inventoryNo, year,
                status);
    }
}

enum PCStatus {
    Good, // in good condition
    Demage // cannot be used
}

class ManagePCs {
    Vector<PC> pcs = new Vector<>() {
        {
            add(new PC("001"));
            add(new PC("002"));
            add(new PC("003"));
            add(new PC("004", PCStatus.Demage));
            add(new PC("005"));
            add(new PC("006"));
            add(new PC("007", PCStatus.Demage));
            add(new PC("008"));
            add(new PC("009"));
            add(new PC("010"));
            add(new PC("011"));

        }
    };

    public void listAll() {
        for (PC pc : pcs) {
            System.out.println(pc);
        }
    }
    public void listAllDemages(){
        for (PC pc: pcs){
            if(pc.status == PCStatus.Demage){
                System.out.println(pc);
            }
        }
    }
    public void listAllGoods(){
        for(PC pc : pcs){
            if(pc.status == PCStatus.Good){
                System.out.println(pc);
            }
        }
    }
    public static void main(String[] args) {
        int option;
        var mgmt = new ManagePCs();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("""
                ---------------------------
                1.List all PCs
                2.List all damages PCs
                3.List all good PCs
                4.Mark a PC as damaged
                5.Mark a PC as not damaged
                6.Quit
                    """);
            System.out.print("Choose an option: ");
            while(!sc.hasNextInt()){
                System.out.println("ERROR: Input int only.");
                sc.nextLine();
            }
            option = sc.nextInt(); sc.nextLine();
            switch(option){
                case 1: mgmt.listAll();break;
                case 2: mgmt.listAllDemages();break;
                case 3: mgmt.listAllGoods();break;
                case 4: {
                    System.out.print("Input PC No.: ");
                    String pcNo = sc.nextLine();
                    mgmt.markAsDemage(pcNo);
                    break;
                }
                case 5: {
                    System.out.print("Input PC No.: ");
                    String pcNo = sc.nextLine();
                    mgmt.markAsGood(pcNo);
                    break;
                }
                default: break;
            }
        }while(option !=6);
    }
    private void markAsDemage(String pcNo){
        for (PC pc : pcs){
            if(pc.inventoryNo.equals(pcNo));
            pc.status = PCStatus.Demage;
            break;
        }
    }
    private void markAsGood(String pcNo){
        for (PC pc : pcs){
            if(pc.inventoryNo.equals(pcNo)){
                pc.status = PCStatus.Good;
                break;
            }
        }
    }
}