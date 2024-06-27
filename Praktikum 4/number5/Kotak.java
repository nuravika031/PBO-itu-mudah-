package number5;
public class Kotak {

    private String warna;
    private double panjang;
    private double lebar;
    private double keliling;
    private double luas;

    public Kotak() {
    }

    public Kotak(String warna) {
        this.warna = warna;
    }

    public Kotak(String warna, double panjang, double lebar) {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Kotak(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getKeliling() {
        keliling = panjang + lebar + panjang + lebar;
        return keliling;
    }

    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public String toString() {
        String info = "KOTAK: warna= " + warna
                + ", panjang= " + panjang
                + ", lebar= " + lebar
                + ", luas= " + luas
                + ", keliling= " + keliling;
        return info;
    }
}
