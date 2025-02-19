package Exercise3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        System.out.println("Nhap thong tin hoc sinh:");
        Student student = createStudent(scanner);
        personList.addPerson(student);

        System.out.println("Nhap thong tin giang vien :");
        Teacher teacher = createTeacher(scanner);
        personList.addPerson(teacher);

        System.out.println("Danh sach nguoi hien tai:");
        

        System.out.println("Chinh sua thong tin hoc sinh:");
        personList.editPersonById(student.id); 

        System.out.println("Danh sach sau khi chinh sua:");
       

        System.out.println("Xoa hoc sinh voi id" + student.id);
        personList.deletePersonById(student.id);

        System.out.println("Danh sach nguuoisau khi xoa:");
       
    }

    private static Student createStudent(Scanner scanner) {
        System.out.print("Nhap id hoc sinh: ");
        String id = scanner.nextLine();

        System.out.print("Nhap que quan hoc sinh: ");
        String homeTown = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String dateStr = scanner.nextLine();
        Date dateOfBirth = parseDate(dateStr);

        System.out.print("Nhap nganh hoc: ");
        String major = scanner.nextLine();

        return new Student(id, homeTown, dateOfBirth, major);
    }

    private static Teacher createTeacher(Scanner scanner) {
        System.out.print("Nhap id giang vien: ");
        String id = scanner.nextLine();

        System.out.print("Nhap que quan: ");
        String homeTown = scanner.nextLine();

        System.out.print("Nhap ngay sinh: ");
        String dateStr = scanner.nextLine();
        Date dateOfBirth = parseDate(dateStr);

        System.out.print("Nhap khoa: ");
        String department = scanner.nextLine();

        return new Teacher(id, homeTown, dateOfBirth, department);
    }

    private static Date parseDate(String dateStr) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            return sdf.parse(dateStr);
        } catch (Exception e) {
            System.out.println("Loi dinh dang ngay thang, xin vui long nhap lai.");
            return new Date(); 
        }
    }
}
