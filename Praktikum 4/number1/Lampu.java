package number1;

public class Lampu {

    private String merek;
    private String warna;
    private boolean menyala;

    public Lampu(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
        this.menyala = false;
    }

    public void hidupkan() {
        this.menyala = true;
        System.out.println("Lampu " + merek + " berwarna " + warna + " dinyalakan");
    }

    public void matikan() {
        this.menyala = false;
        System.out.println("Lampu " + merek + " berwarna " + warna + " dimatikan");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Menyala: " + menyala);
    }
}
