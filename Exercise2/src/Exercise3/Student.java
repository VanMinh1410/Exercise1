
package Exercise3;
import java.util.Date;
import java.util.Scanner;
public class Student extends Person {
    Scanner scanner = new Scanner (System.in);
    String major;

    Student(String s001, String new_York, Date date, String computer_Science) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }

    @Override
    void addPerson() {
        System.out.print("Enter major:");
        this.major= scanner.nextLine();
    }

    @Override
    boolean editPerson() {
        return true;
    }
}

