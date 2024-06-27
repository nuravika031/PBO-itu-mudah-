package number1;

public class Sepeda {

    private String merek;
    private String warna;
    private int ukuranBan;

    public Sepeda(String merek, String warna, int ukuranBan) {
        this.merek = merek;
        this.warna = warna;
        this.ukuranBan = ukuranBan;
    }

    public void berjalan() {
        System.out.println("Sepeda " + merek + " berwarna " + warna + " dengan ukuran ban " + ukuranBan + " sedang berjalan");
    }

    public void berhenti() {
        System.out.println("Sepeda " + merek + " berwarna " + warna + " dengan ukuran ban " + ukuranBan + " berhenti");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran Ban: " + ukuranBan + " inci");
    }
}
