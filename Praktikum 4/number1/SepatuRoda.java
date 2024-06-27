package number1;

public class SepatuRoda {

    private String merek;
    private int ukuran;
    private String warna;

    public SepatuRoda(String merek, int ukuran, String warna) {
        this.merek = merek;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public void pakai() {
        System.out.println("Sepatu roda " + merek + " ukuran " + ukuran + " warna " + warna + " dipakai");
    }

    public void lepas() {
        System.out.println("Sepatu roda " + merek + " ukuran " + ukuran + " warna " + warna + " dilepas");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
    }
}
