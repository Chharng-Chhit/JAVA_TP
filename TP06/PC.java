package TP06;

import java.util.ArrayList;
import java.util.Scanner;

public class PC {

      private int number;
      private boolean isDamaged;

      public PC(int number) {
            this.number = number;
            this.isDamaged = false;
      }

      public int getNumber() {
            return number;
      }

      public boolean isDamaged() {
            return isDamaged;
      }

      public void markAsDamaged() {
            isDamaged = true;
      }

      public void markAsNotDamaged() {
            isDamaged = false;
      }
}

class Room306F {
      private static final int NUM_PCS = 10;

      private PC[] pcs;

      public Room306F() {
            pcs = new PC[NUM_PCS];
            for (int i = 0; i < NUM_PCS; i++) {
                  pcs[i] = new PC(i + 1);
            }
      }

      public PC[] getPCs() {
            return pcs;
      }

      public PC getPC(int number) {
            for (PC pc : pcs) {
                  if (pc.getNumber() == number) {
                        return pc;
                  }
            }
            return null;
      }

      public PC[] getDamagedPCs() {
            ArrayList<PC> damaged = new ArrayList<PC>();
            for (PC pc : pcs) {
                  if (pc.isDamaged()) {
                        damaged.add(pc);
                  }
            }
            return damaged.toArray(new PC[0]);
      }

      public PC[] getGoodPCs() {
            ArrayList<PC> good = new ArrayList<>();
            for (PC pc : pcs) {
                  if (!pc.isDamaged()) {
                        good.add(pc);
                  }
            }
            return good.toArray(new PC[0]);
      }
}

class PCProgram {
      public static void main(String[] args) {
            Room306F room = new Room306F();
            
            Scanner scanner = new Scanner(System.in);

            while (true) {
                  System.out.println("Menu:");
                  System.out.println("1. List all PCs");
                  System.out.println("2. List all damaged PCs");
                  System.out.println("3. List all good PCs");
                  System.out.println("4. Mark a PC as damaged");
                  System.out.println("5. Mark a PC as not damaged");
                  System.out.println("6. Quit");
                  System.out.print("Input Choice: ");
                  int choice = scanner.nextInt();
                  switch (choice) {
                        case 1:
                              for (PC pc : room.getPCs()) {
                                    System.out.println("PC " + pc.getNumber() + " is "
                                                + (pc.isDamaged() ? "damaged" : "good"));
                              }
                              break;
                        case 2:
                              for (PC pc : room.getDamagedPCs()) {
                                    System.out.println("PC " + pc.getNumber() + " is damaged");
                              }
                              break;
                        case 3:
                              for (PC pc : room.getGoodPCs()) {
                                    System.out.println("PC " + pc.getNumber() + " is good");
                              }
                              break;
                        case 4:
                              System.out.println("Enter PC number to mark as damaged:");
                              int number = scanner.nextInt();
                              PC pc = room.getPC(number);
                              if (pc != null) {
                                    pc.markAsDamaged();
                                    System.out.println("PC " + pc.getNumber() + " marked as damaged");
                              } else {
                                    System.out.println("PC not found");
                              }
                              break;
                        case 5:
                              System.out.println("Enter PC number to mark as not damaged:");
                              number = scanner.nextInt();
                              pc = room.getPC(number);
                              if (pc != null) {
                                    pc.markAsNotDamaged();
                                    System.out.println("PC " + pc.getNumber() + " marked as not damaged");
                              } else {
                                    System.out.println("PC not found");
                              }
                              break;
                        case 6:
                              System.out.println("Exiting program...");
                              System.exit(0);
                              break;
                        default:
                              System.out.println("Invalid choice");
                  }
                  System.out.println();
            }
      }
}