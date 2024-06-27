package number3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tulisFile {

    public static void main(String[] args) {
        String namaFile = "src/number3/file.txt";
        String stringYgDibaca = "Terserah";
        try {
            Files.writeString(Paths.get(namaFile), stringYgDibaca);
            System.out.println("String berhasil ditulis ke dalam file.");
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file: " + e.getMessage());
        }
    }
}
