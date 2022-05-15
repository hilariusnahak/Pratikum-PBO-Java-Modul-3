// Program Java memanfaatkan class Scanner untuk membaca inputan

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) throws Exception {
        String X = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka ");
        X = input.next();
        System.out.println("Angka yang Anda Masukkan " + X);
    }
}
