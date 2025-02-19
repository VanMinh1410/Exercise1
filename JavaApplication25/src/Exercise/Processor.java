
package Exercise;
import java.util.Scanner;
public class Processor {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. nhap ten sinh vien");
            System.out.println("2. nhap day du ho ten");
            System.out.println("3. ma so sinh vien");
            System.out.println("4. xoa sinh vien theo ma");
            System.out.println("5. Chinh sua thong tin sinh vien");
            System.out.println("6. thoat");
            System.out.print("Chon mot tuy chon ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    studentList.enterStudentInfo();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String idToFind = sc.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Khong tim thay sinh vien co ma: " + idToFind);
                    }
                    break;
                case 4:
                    System.out.print("nhap ma sinh vien can xoa: ");
                    String idToDelete = sc.nextLine();
                    boolean deleted = studentList.deleteStudentById(idToDelete);
                    if (deleted) {
                        System.out.println("Sinh vien da duoc xoa.");
                    } else {
                        System.out.println("Không tìm thấy sinh viên có mã: " + idToDelete);
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can chinh sua: ");
                    String idToEdit = sc.nextLine();
                    studentList.editStudentById(idToEdit);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le vui long thu lai.");
            }
        }
    }

