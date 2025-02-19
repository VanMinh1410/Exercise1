
package javaapplication18;
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String xau = scanner.nextLine();

        System.out.print("Nhap tu can thay the: ");
        String tuCanThay = scanner.nextLine();

        System.out.print("Nhap tu thay the: ");
        String tuThay = scanner.nextLine();
        String xauMoi = xau.replace(tuCanThay, tuThay);

        System.out.println("Chuoi sau khi thay the: " + xauMoi);
    }
}

