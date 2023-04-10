package TP06;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
      private String name;
      private String code;
      private int credits;

      Course(String name, String code, int credits) {
            this.name = name;
            this.code = code;
            this.credits = credits;
      }

      public String toString() {
            return code + " - " + name + " (" + credits + " credits)";
      }

      public String getName() {
            return name;
      }

      public String getCode() {
            return code;
      }

      public int getCredits() {
            return credits;
      }
}

class CourseManagement {
      private static ArrayList<Course> courses = new ArrayList<Course>();

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                  System.out.println("\nMenu:");
                  System.out.println("1. List all courses");
                  System.out.println("2. Find courses by name");
                  System.out.println("3. Add new course");
                  System.out.println("4. Quit");

                  System.out.print("Enter choice (1-4): ");
                  int choice = input.nextInt();
                  input.nextLine(); // consume the newline character

                  switch (choice) {
                        case 1:
                              System.out.println("\nAll courses:");
                              for (Course course : courses) {
                                    System.out.println(course);
                              }
                              break;
                        case 2:
                              System.out.print("\nEnter course name: ");
                              String name = input.nextLine();
                              ArrayList<Course> matchingCourses = new ArrayList<Course>();
                              for (Course course : courses) {
                                    if (course.getName().equals(name)) {
                                          matchingCourses.add(course);
                                    }
                              }
                              if (matchingCourses.size() == 0) {
                                    System.out.println("No courses found.");
                              } else {
                                    System.out.println("\nMatching courses:");
                                    for (Course course : matchingCourses) {
                                          System.out.println(course);
                                    }
                              }
                              break;
                        case 3:
                              System.out.print("\nEnter course name: ");
                              name = input.nextLine();
                              System.out.print("Enter course code: ");
                              String code = input.nextLine();
                              System.out.print("Enter course credits: ");
                              int credits = input.nextInt();
                              input.nextLine(); // consume the newline character
                              Course newCourse = new Course(name, code, credits);
                              courses.add(newCourse);
                              System.out.println("\nAdded new course: " + newCourse);
                              break;
                        case 4:
                              System.out.println("\nGoodbye!");
                              System.exit(0);
                              break;
                        default:
                              System.out.println("\nInvalid choice. Please enter 1-4.");
                              break;
                  }
            }
      }
}
