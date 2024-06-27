package number1;

public class Ponsel {

    private String merek;
    private String warna;
    private int kapasitasBaterai;

    public Ponsel(String merek, String warna, int kapasitasBaterai) {
        this.merek = merek;
        this.warna = warna;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void panggil(String nomor) {
        System.out.println("Ponsel " + merek + " melakukan panggilan ke nomor " + nomor);
    }

    public void kirimPesan(String pesan) {
        System.out.println("Pesan '" + pesan + "' dikirim dari ponsel " + merek);
    }

    public void cekEmail() {
        System.out.println("Email dicek di ponsel " + merek);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}
