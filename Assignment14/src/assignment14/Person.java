package assignment14;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Person implements IPerson {
    String id;
    String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            setId(scanner.nextLine());
            System.out.println("Enter fullName: ");
            setFullName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter dateOfBirth (dd/MM/yyyy): ");
            String dateOfBirthString = scanner.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirthString));
            System.out.print("Enter bookBorrowDate (dd/MM/yyyy): ");
            String bookBorrowDateString = scanner.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDateString));
            System.out.print("Enter bookReturnDate (dd/MM/yyyy): ");
            String bookReturnDateString = scanner.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDateString));
        } catch (ParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }

    public void updatePerson(String id) {
        if (this.id.equals(id)) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter ID: ");
                setId(scanner.nextLine());
                System.out.println("Enter fullName: ");
                setFullName(scanner.nextLine());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Enter dateOfBirth (dd/MM/yyyy): ");
                String dateOfBirthString = scanner.nextLine();
                setDateOfBirth(sdf.parse(dateOfBirthString));
                System.out.print("Enter bookBorrowDate (dd/MM/yyyy): ");
                String bookBorrowDateString = scanner.nextLine();
                setBookBorrowDate(sdf.parse(bookBorrowDateString));
                System.out.print("Enter bookReturnDate (dd/MM/yyyy): ");
                String bookReturnDateString = scanner.nextLine();
                setBookReturnDate(sdf.parse(bookReturnDateString));
            } catch (ParseException e) {
                System.out.println("Invalid date format: " + e.getMessage());
            }
        }
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id: " + id + ", fullName: " + fullName + ", dateOfBirth: " + (dateOfBirth != null ? sdf.format(dateOfBirth) : "null") + ", bookBorrowDate: " + (bookBorrowDate != null ? sdf.format(bookBorrowDate) : "null") + ", bookReturnDate: " + (bookReturnDate != null ? sdf.format(bookReturnDate) : "null"));
    }
    
}