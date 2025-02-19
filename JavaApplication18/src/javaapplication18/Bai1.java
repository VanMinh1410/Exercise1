
package javaapplication18;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap mot chuoi:");
         String chuoi = scanner.nextLine();
         int kytu = chuoi.length();
         System.out.print("So ky tu cua chuoi la:"+kytu);
         scanner.close();
    }
    }
    

