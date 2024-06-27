package number1;

public class Topi {

    private String merek;
    private String warna;
    private String ukuran;

    public Topi(String merek, String warna, String ukuran) {
        this.merek = merek;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    public void pakai() {
        System.out.println("Topi " + merek + " berwarna " + warna + " dengan ukuran " + ukuran + " dipakai");
    }

    public void lepas() {
        System.out.println("Topi " + merek + " berwarna " + warna + " dengan ukuran " + ukuran + " dilepas");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
    }
}
