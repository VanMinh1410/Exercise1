
package javaapplication18;
import java.util.Scanner;
public class Bai2 {
     public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap mot chuoi:");
        String chuoi = scanner.nextLine();
        String[] tu = chuoi.trim().split("\\s+");
        int kytu=tu.length;
        System.out.println("so tu trong chuoi: "+kytu);
        scanner.close();
    } 
}
