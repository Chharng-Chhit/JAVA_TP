package TP09.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class MyException extends Exception{ }
class BirthDateExcetion extends RuntimeException{
    public BirthDateExcetion(){
        super("Age is minimum 13 years old.");
    }
}
class Candidate {
    private Date birthDate;

    public void setBirthdate(Date date){
        Calendar cal = Calendar.getInstance(); // current date
        cal.set(cal.get(Calendar.YEAR)-13, Calendar.SEPTEMBER,20, 0, 0,0);
        Date thirteenYearAge = cal.getTime();

        if(date.before(thirteenYearAge)){
            this.birthDate = date;
        }else{
            throw new BirthDateExcetion();
        }
    }
    @Override 
    public String toString(){
        return birthDate.toString();
    }
}

class TestCandiate{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");
        Scanner sc = new Scanner(System.in);
        Candidate can = new Candidate();
        System.out.print("Input birth date: ");
        can.setBirthdate(format.parse(sc.nextLine()));

    }
}