
package javaapplication18;
import java.util.Scanner;
public class Bai4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");
        String chuoi = scanner.nextLine();
        String chuoiMoi = chuoi.trim().replaceAll("\\s+","");
        System.out.print("chuoi moi: " + chuoiMoi);
        scanner.close();
    }
}
