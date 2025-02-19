
package javaapplication18;
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao chuoi: ");
        String xau = scanner.nextLine();
        StringBuilder so = new StringBuilder();
        for (int i = 0; i < xau.length(); i++) {
            char kyTu = xau.charAt(i);
            if (Character.isDigit(kyTu)) {
                so.append(kyTu); 
            } else {
                if (so.length() > 0) {
                    System.out.println(so.toString()); 
                    so.setLength(0); 
                }
            }
        }
    }
}