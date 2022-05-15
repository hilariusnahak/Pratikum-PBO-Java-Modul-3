
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferModif {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String umur;
        // sbg tempat untuk menyimpan inputan user
        System.out.print("Inputkan Nama Anda: ");
        nama = dataIn.readLine();
        System.out.println("Hello " + nama + "!");
        System.out.print("Inputkan Umur Anda: ");
        umur = dataIn.readLine();
        System.out.println("Hello " + nama +"!" + " Umur Anda " +umur + "tahun");
    }
}
