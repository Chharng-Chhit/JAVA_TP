package TP09.Test;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[1]);

        while(true){
            try{
                System.out.print("Input an index from 0-2: ");
                int i = Integer.parseInt(sc.nextLine());
                System.out.println(myNumbers[i]);
                
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Wrong index. It should be 0-2 only.");
                continue;
            }catch(NumberFormatException e){
                System.out.println("Input number only.");
                continue;
            }
            catch(Exception e){
                System.out.println("Unknown error.");
            }


            break;
        }
    }
}
