package number1;

public class Tas {

    private String merek;
    private String warna;
    private int jumlahSaku;

    public Tas(String merek, String warna, int jumlahSaku) {
        this.merek = merek;
        this.warna = warna;
        this.jumlahSaku = jumlahSaku;
    }

    public void bawaBarang(String barang) {
        System.out.println("Barang " + barang + " dibawa dalam tas " + merek + " berwarna " + warna + " dengan " + jumlahSaku + " saku");
    }

    public void bukaTas() {
        System.out.println("Tas " + merek + " dibuka");
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Saku: " + jumlahSaku);
    }
}
