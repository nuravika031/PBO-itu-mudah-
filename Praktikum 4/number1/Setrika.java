package number1;

public class Setrika {

    private String merek;
    private int suhu;

    public Setrika(String merek, int suhu) {
        this.merek = merek;
        this.suhu = suhu;
    }

    public void hidupkan() {
        System.out.println("Setrika " + merek + " dinyalakan");
    }

    public void matikan() {
        System.out.println("Setrika " + merek + " dimatikan");
    }

    public void aturSuhu(int suhuBaru) {
        this.suhu = suhuBaru;
        System.out.println("Suhu setrika " + merek + " diatur menjadi " + suhuBaru);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Suhu: " + suhu + " derajat Celsius");
    }
}
