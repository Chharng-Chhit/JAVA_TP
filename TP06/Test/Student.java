package TP06.Test;

public class Student {
    String id;
    String name;

    // overloading constructors
    public Student (){}
    public Student (String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override //annotation (marked as override of a method)
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: " + id + "\tName: "+name;
    }
}

class StudentTest {
    public static void main(String[] args) {
        var stu = new Student("e20200008", "Chharng Chhit");
        var stu1 = new Student("e202000001", "Hai Tongmeng");
        System.out.println(stu);
        System.out.println(stu1);
    }
}