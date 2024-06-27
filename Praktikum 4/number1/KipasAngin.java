package number1;

public class KipasAngin {

    private String merek;
    private int kecepatan;
    private boolean menyala;

    public KipasAngin(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
        this.menyala = false;
    }

    public void hidupkan() {
        this.menyala = true;
        System.out.println("Kipas angin " + merek + " dinyalakan");
    }

    public void matikan() {
        this.menyala = false;
        System.out.println("Kipas angin " + merek + " dimatikan");
    }

    public void ubahKecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
        System.out.println("Kecepatan kipas angin " + merek + " diubah menjadi " + kecepatanBaru);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Menyala: " + menyala);
    }
}
