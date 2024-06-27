package number1;

public class Laptop {

    private String merek;
    private double ukuranLayar;
    private int ram;

    public Laptop(String merek, double ukuranLayar, int ram) {
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.ram = ram;
    }

    public void hidupkan() {
        System.out.println("Laptop " + merek + " dinyalakan");
    }

    public void matikan() {
        System.out.println("Laptop " + merek + " dimatikan");
    }

    public void instalAplikasi(String aplikasi) {
        System.out.println("Aplikasi " + aplikasi + " berhasil diinstal di laptop " + merek);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("RAM: " + ram + " GB");
    }
}
