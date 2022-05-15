// Program BufferedReader dan InputStreamReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        // utk menciptakn objek berkelas bufferedreader yg dihubungkan ke System.in
        String nama = "";
        String umur = "";
        // sbg tempat untuk menyimpan inputan user
        System.out.print("Inputkan Nama Anda: ");
        try{
        nama = dataIn.readLine();
        } catch (IOException e) {
        System.out.println("Error");
        }
        System.out.print("Inputkan Umur Anda: ");
        try{
        umur = dataIn.readLine();
        //mengambil inputan dari user dgn memanggil fungsi readLine
        } catch (IOException e) {
        System.out.println("Error");
        }
        System.out.println("Hello " + nama +"!" + " Umur Anda " +umur + " tahun");
    }
}
