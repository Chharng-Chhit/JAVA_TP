package TP09;

import java.util.Scanner;

class Student {
    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String group;

    public Student() {
        this.name = "";
        this.dateOfBirth = "";
        this.phoneNumber = "";
        this.city = "";
        this.country = "";
        this.group = "";
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        this.name = input.nextLine();
        System.out.print("Enter the student's date of birth: ");
        this.dateOfBirth = input.nextLine();
        System.out.print("Enter the student's telephone number: ");
        this.phoneNumber = input.nextLine();
        System.out.print("Enter the student's city: ");
        this.city = input.nextLine();
        System.out.print("Enter the student's country: ");
        this.country = input.nextLine();
        System.out.print("Enter the student's group: ");
        this.group = input.nextLine();
    }

    public void outputData() {
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Telephone Number: " + this.phoneNumber);
        System.out.println("City: " + this.city);
        System.out.println("Country: " + this.country);
        System.out.println("Group: " + this.group);
    }

    public String getName() {
        return this.name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGroup() {
        return this.group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
