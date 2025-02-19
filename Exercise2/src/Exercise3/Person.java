package Exercise3;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    String id;
    String homeTown;
    Date dateOfBirth;

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Home Town: " + homeTown);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    void addPerson() {
    }

    boolean editPerson() {
        return true;
    }

    void addPerson(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
