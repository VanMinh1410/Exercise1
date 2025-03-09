package assignment14;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float gpa, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        setId(scanner.nextLine());

        System.out.println("Enter Full Name: ");
        setFullName(scanner.nextLine());

        System.out.println("Enter Major: ");
        setMajor(scanner.nextLine());

        System.out.println("Enter GPA: ");
        setGpa(scanner.nextFloat());

        System.out.println("Student added successfully!");
    }

    @Override
    public void updatePerson(String id) {
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
