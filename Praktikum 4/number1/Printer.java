package number1;

public class Printer {

    private String merek;
    private String jenis;

    public Printer(String merek, String jenis) {
        this.merek = merek;
        this.jenis = jenis;
    }

    public void cetak(String dokumen) {
        System.out.println("Dokumen " + dokumen + " dicetak dengan printer " + merek + " jenis " + jenis);
    }

    public void scan() {
        System.out.println("Printer " + merek + " jenis " + jenis + " sedang melakukan scan");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenis);
    }
}
