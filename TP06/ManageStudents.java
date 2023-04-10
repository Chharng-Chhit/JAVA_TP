package TP06;


import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudents {
      ArrayList<Student> student = new ArrayList<Student>();
      Scanner sc = new Scanner(System.in);

      public void addStudent(){
            var stu = new Student();
            System.out.print("Input ID: ");
            stu.id = sc.nextLine();
            System.out.print("Input Name: ");
            stu.name = sc.nextLine();

            student.add(stu);
      }

      public void removeByName(){
            System.out.print("Input name to remove student: ");
            var name = sc.nextLine();
            boolean found = false;
            for(int i=0; i<student.size(); i++){
                  if(name.equals(student.get(i).name)){
                        student.remove(i);
                        found = true;
                        break;
                  }
            }
            System.out.println(found?"Successfully removed.":"Not found to remove.");
      }

      public void updateById(){
            System.out.print("Input student ID: ");
            var id =sc.nextLine();
            var found = false;
            for(Student stu : student){
                  if(id.equalsIgnoreCase(stu.id)){
                        var name = sc.nextLine();
                        if(!name.isBlank()){
                              stu.name = name;
                        }
                        found = true;
                        break;
                  }
            }
            if(!found) System.out.println("NOT Found!");
            else System.out.println("Successfully updated.");    
      }
      public void listStudents(){
            for(Student s:student){
                  System.out.println(s);
            }
      }

      public static void main(String[] args) {
            ManageStudents ms = new ManageStudents();
            int opt;
            do{
                  System.out.print("""
                        ------------- Menu -------------
                              1. Add new student
                              2. List student by name
                              3. Remove student by name
                              4. Update student information by id
                              5. Quit
                              Choose an option: """);
                  opt = ms.sc.nextInt(); ms.sc.nextLine();
                  switch(opt){
                        case 1: ms.addStudent();break;
                        case 2: ms.listStudents();break;
                        case 3: ms.removeByName();break;
                        case 4: ms.updateById();break;
                        case 5: System.out.println("Bye!!");break;
                  }
            }while(opt!=5);
      }
      
}
