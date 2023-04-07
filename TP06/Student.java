package TP06;

public class Student {
      String id;
      String name;

      public Student (){
            this.id = "";
            this.name = "";
      }
      
      public Student (String id, String name){
            this.id = id;
            this.name = name;
      }

      @Override
      public String toString(){
            return String.format("%-15s%20s", id, name);
      }
}
