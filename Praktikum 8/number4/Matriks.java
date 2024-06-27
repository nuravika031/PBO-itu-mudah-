package number4;
import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Mengambil input integer pertama
        int b = sc.nextInt(); // Mengambil input integer kedua
        int c = 1;

        // Loop untuk membuat matriks
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print((c++) + "\t"); // Menampilkan elemen matriks
            }
            System.out.println(); // Pindah baris setelah setiap baris matriks tercetak
        }
    }
}
