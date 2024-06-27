package number1;

public class Kulkas {

    private String merek;
    private int kapasitas;
    private int suhu;

    public Kulkas(String merek, int kapasitas, int suhu) {
        this.merek = merek;
        this.kapasitas = kapasitas;
        this.suhu = suhu;
    }

    public void hidupkan() {
        System.out.println("Kulkas " + merek + " dinyalakan");
    }

    public void matikan() {
        System.out.println("Kulkas " + merek + " dimatikan");
    }

    public void ubahSuhu(int suhuBaru) {
        this.suhu = suhuBaru;
        System.out.println("Suhu kulkas " + merek + " diubah menjadi " + suhuBaru);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Kapasitas: " + kapasitas + " liter");
        System.out.println("Suhu: " + suhu + " derajat Celsius");
    }
}
