//
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
		}
		System.out.print("Masukkan Waktu: ");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.now();
		System.out.println(dateTimeFormatter.format(localTime));
    }
}
