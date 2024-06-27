package number1;

public class Mobil {

    private int kecepatan;
    private String warna;
    private String model;

    public Mobil(int kecepatan, String warna, String model) {
        this.kecepatan = kecepatan;
        this.warna = warna;
        this.model = model;
    }
    public void gas() {
        System.out.println("Mobil berjalan");
    }

    public void rem() {
        System.out.println("Mobil berhenti");
    }
    public void printStates() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Warna: " + warna);
        System.out.println("Model: " + model);
    }
}
