package assignment14;

import java.util.Scanner;
import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher ID: ");
        setId(scanner.nextLine());

        System.out.println("Enter Full Name: ");
        setFullName(scanner.nextLine());

        System.out.println("Enter Department: ");
        setDepartment(scanner.nextLine());

        System.out.println("Enter Teaching Subject: ");
        setTeachingSubject(scanner.nextLine());

        System.out.println("Teacher added successfully!");
    }

    @Override
    public void updatePerson(String id) {
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
