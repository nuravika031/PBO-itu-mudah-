import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class bacaTulis {

    public static void main(String[] args) {
        try {
            try {
                String tulis = "TESTTTTTTTTT";
                Files.writeString(Paths.get("src/filee.txt"),tulis);
                System.out.println("Berhasil");
            } catch (IOException ex) {
                System.out.println("salah");
            }
            
            String baca = Files.readString(Paths.get("src/filee.txt"));
            System.out.println("Isi teks : ");
            System.out.println(baca);
            
        } catch (IOException ex) {
            Logger.getLogger(bacaTulis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}