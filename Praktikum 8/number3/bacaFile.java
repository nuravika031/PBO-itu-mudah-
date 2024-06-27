package number3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class bacaFile {

    public static void main(String[] args) {
        String fileName = "src/number3/file.txt";

        try {
            String fileku = Files.readString(Paths.get(fileName));
            System.out.println("isiFile");
            System.out.println(fileku);
        } catch (Exception e) {
            System.out.println("Gagal membaca");
        }
    }
}
