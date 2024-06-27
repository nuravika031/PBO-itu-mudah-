package number1;

public class Kacamata {

    private String merek;
    private String warna;
    private double tingkatKecerahan;

    public Kacamata(String merek, String warna, double tingkatKecerahan) {
        this.merek = merek;
        this.warna = warna;
        this.tingkatKecerahan = tingkatKecerahan;
    }

    public void gunakan() {
        System.out.println("Kacamata " + merek + " berwarna " + warna + " digunakan");
    }

    public void ubahKecerahan(double kecerahanBaru) {
        this.tingkatKecerahan = kecerahanBaru;
        System.out.println("Tingkat kecerahan kacamata " + merek + " diubah menjadi " + kecerahanBaru);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tingkat Kecerahan: " + tingkatKecerahan);
    }
}
