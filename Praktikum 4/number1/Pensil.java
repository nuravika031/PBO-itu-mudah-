package number1;

public class Pensil {

    private String merek;
    private String warna;
    private int panjang;

    public Pensil(String merek, String warna, int panjang) {
        this.merek = merek;
        this.warna = warna;
        this.panjang = panjang;
    }

    public void tulis() {
        System.out.println("Pensil " + merek + " sedang digunakan untuk menulis");
    }

    public void asah() {
        System.out.println("Pensil " + merek + " sedang diasah");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Panjang: " + panjang + " cm");
    }
}
