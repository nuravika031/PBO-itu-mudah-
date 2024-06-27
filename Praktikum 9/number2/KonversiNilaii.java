package number2;

import java.util.Scanner;

public class KonversiNilaii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Nilai : ");
        int nilai = sc.nextInt();
        String huruf;

        if (nilai <= 100 && nilai >= 85) {
            huruf = "A";
        } else if (nilai <= 100 && nilai >= 80) {
            huruf = "A-";
        } else if (nilai <= 100 && nilai >= 75) {
            huruf = "B+";
        } else if (nilai <= 100 && nilai >= 70) {
            huruf = "B";
        } else if (nilai <= 100 && nilai >= 65) {
            huruf = "B-";
        } else if (nilai <= 100 && nilai >= 50) {
            huruf = "C";
        } else if (nilai <= 100 && nilai >= 40) {
            huruf = "D";
        } else if (nilai <= 100 && nilai >= 0) {
            huruf = "E";
        } else {
            huruf = "Nilai Tidak Valid";
        }

        System.out.println(huruf);
    }
}