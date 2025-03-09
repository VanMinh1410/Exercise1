
package o_exercise2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Book implements IBook {
    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    
    public Book(String bookId,String publisher,Date entryDate,double unitPrice,double quantity){
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        
    }
    public String getbookId(){
        return bookId;
    }
    public void setbookId(String bookId){
        this.bookId = bookId;
    }
    public String getpublisher(){
        return publisher;
    } 
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    public Date entryDate (){
        return entryDate;
    }
    
    public void setentryDate (Date entryDate){
        this.entryDate = entryDate;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void getunitPrice(double unirPrice){
        this.unitPrice = unitPrice;
    }
    public double quantity(){
        return quantity;
    }
     public void setquanTity(double quanTity) {
        this.quantity = quanTity;
    }

    public void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter publisher: ");
            setpublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setunitPrice (scanner.nextDouble());
            System.out.print("Enter quanTity: ");
            setquanTity (scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm//yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setentryDate(sdf.parse(entryDateString));
        }
        catch (ParseException e){
            System.out.println(e);
        }
    }
    public void updateBook(String id){
        if (this.bookId.equals(id)){
            try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter publisher: ");
            setpublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setunitPrice (scanner.nextDouble());
            System.out.print("Enter quanTity: ");
            setquanTity (scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm//yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setentryDate(sdf.parse(entryDateString));
        }
        catch (ParseException e){
            System.out.println(e);  
            }
        }
    }
    public void displayBook(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy.");
        System.out.println("ID:"+getbookId()+",publisher: "+ getpublisher()+",entryDate: "+sdf.format(entryDate)+",unitPrice:"+getunitPrice()+",quanTity: "+quantity);
    }

    private void setunitPrice(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
