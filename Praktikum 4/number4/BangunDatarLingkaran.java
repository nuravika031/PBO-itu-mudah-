package number4;

public class BangunDatarLingkaran {

    static double luas;
    static double keliling;

    static double hitungLuas(double radius) {
        luas = Math.PI * radius * radius;
        return luas;
    }

    static double hitungKeliling(double radius) {
        keliling = 2.0 * Math.PI * radius;
        return keliling;
    }
}
