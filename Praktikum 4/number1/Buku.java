package number1;

public class Buku {

    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void baca() {
        System.out.println("Buku " + judul + " sedang dibaca");
    }

    public void tulis() {
        System.out.println("Buku " + judul + " sedang ditulis");
    }

    public void terbitkan() {
        System.out.println("Buku " + judul + " telah diterbitkan");
    }

    public void printStates() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}
