
package Exercise;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class StudentList {
    ArrayList<Student> studentList = new ArrayList<>();
    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + (i + 1) + ":");
            Student student = new Student("", "", null, "", 0);
            student.enterStudentInfonFo();
            studentList.add(student);
        }
    }
    public void displayStudent() {  
        if (studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien rong.");
            return;
        }

        for (Student student : studentList) {
            student.displayStudentInfo();
            System.out.println();
        }
    }
    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.student.equals(idToFind)) {
                return student;
            }
        }
        return null;
    }
    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }
    public void editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Chinh sua thong tin sinh vien: ");
            student.enterStudentInfo();
        } else {
            System.out.println("Khong tim thay sinh vien co ma: " + idToEdit);
        }
    }
}

