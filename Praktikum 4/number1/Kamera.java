package number1;

public class Kamera {

    private String merek;
    private int resolusi;
    private String modePengambilanGambar;

    public Kamera(String merek, int resolusi, String modePengambilanGambar) {
        this.merek = merek;
        this.resolusi = resolusi;
        this.modePengambilanGambar = modePengambilanGambar;
    }

    public void ambilFoto() {
        System.out.println("Foto diambil dengan kamera " + merek);
    }

    public void rekamVideo() {
        System.out.println("Video direkam dengan kamera " + merek);
    }

    public void ubahMode(String modeBaru) {
        this.modePengambilanGambar = modeBaru;
        System.out.println("Mode kamera " + merek + " diubah menjadi " + modeBaru);
    }

    public void printStates() {
        System.out.println("Merek: " + merek);
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Mode Pengambilan Gambar: " + modePengambilanGambar);
    }
}
