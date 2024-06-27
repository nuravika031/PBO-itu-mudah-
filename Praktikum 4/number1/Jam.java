package number1;

public class Jam {

    private int jam;
    private int menit;
    private int detik;

    public Jam(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public void tampilkanWaktu() {
        System.out.println("Jam: " + jam + ", Menit: " + menit + ", Detik: " + detik);
    }

    public void printStates() {
        System.out.println("Jam: " + jam);
        System.out.println("Menit: " + menit);
        System.out.println("Detik: " + detik);
    }
}
