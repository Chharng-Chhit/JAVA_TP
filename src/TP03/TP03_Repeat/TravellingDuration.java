package src.TP03.TP03_Repeat;

import java.util.Scanner;

public class TravellingDuration {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  to_second,h, min, sec;
            double percentage, result;
            System.out.print("""
                  (The distance is 7 km and the average speed is 30 km/h)
                  Program for calculating duration of travel from ITC to Airport:
            """);
            System.out.print("Please input traffic jam factor (in percentage [0-100]): ");
            percentage = sc.nextInt();
            result = (7*3600/30)/((100-percentage)/100);
            to_second = (int) result;
            h = to_second/3600;
            to_second = to_second%3600;

            min = to_second/60;
            to_second = to_second%60;

            sec = to_second;
            if(percentage >= 100){
                  System.out.print("Travelling Duration : Infinite..\n\n");
            }else{
                  System.out.printf("\nTravelling Duration = %02d:%02d:%02d\n\n", h, min, sec);
            }
      }
}
