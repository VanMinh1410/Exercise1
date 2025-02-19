package javaapplication18;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao chuoi: ");
        String xau = scanner.nextLine();

        System.out.print("Nhap ly tu can dem: ");
        char kyTu = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < xau.length(); i++) {
            if (xau.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("ky tu '" + kyTu + "' xuat hien " + dem + " lan trong chuoi.");
    }
}
