package number1;

public class Pintu {

    private String jenis;
    private String warna;
    private boolean terbuka;

    public Pintu(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
        this.terbuka = false;
    }

    public void buka() {
        this.terbuka = true;
        System.out.println("Pintu " + jenis + " berwarna " + warna + " terbuka");
    }

    public void tutup() {
        this.terbuka = false;
        System.out.println("Pintu " + jenis + " berwarna " + warna + " tertutup");
    }

    public void printStates() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("Terbuka: " + terbuka);
    }
}
