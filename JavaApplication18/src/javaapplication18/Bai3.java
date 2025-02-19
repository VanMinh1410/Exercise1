
package javaapplication18;
import java.util.Scanner;
public class Bai3 {
     public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String chuoi = scanner.nextLine();
        String daoNguoc=new StringBuilder(chuoi).reverse().toString();
        System.out.println("chuoi duoc dao nguoc la: "+daoNguoc);
        scanner.close();
}
}
