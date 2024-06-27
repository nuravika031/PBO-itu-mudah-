package number1;

public class Dompet {

    private String merek;
    private String warna;
    private double saldo;

    public Dompet(String merek, String warna, double saldo) {
        this.merek = merek;
        this.warna = warna;
        this.saldo = saldo;
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Saldo dompet " + merek + " bertambah menjadi " + saldo);
    }

    public void ambilSaldo(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Saldo dompet " + merek + " berkurang menjadi " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Saldo: " + saldo);
    }
}
