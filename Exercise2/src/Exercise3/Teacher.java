
package Exercise3;
import java.util.Date;
import java.util.Scanner;
public class Teacher extends Person {
    Scanner scanner = new Scanner (System.in);
    String department;

    Teacher(String t001, String california, Date date, String mathematics) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
    @Override
    void addPerson(){
          System.out.print("Enter department: ");
        this.department = scanner.nextLine();
    }
    @Override
    boolean editPerson(){
        return true;
    }

    }
