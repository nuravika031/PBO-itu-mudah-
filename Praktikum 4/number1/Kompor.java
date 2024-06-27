package number1;

public class Kompor {

    private String merek;
    private int jumlahTungku;

    public Kompor(String merek, int jumlahTungku) {
        this.merek = merek;
        this.jumlahTungku = jumlahTungku;
    }

    public void hidupkan() {
        System.out.println("Kompor " + merek + " dengan " + jumlahTungku + " tungku dinyalakan");
    }

    public void matikan() {
        System.out.println("Kompor " + merek + " dimatikan");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Jumlah Tungku: " + jumlahTungku);
    }
}
