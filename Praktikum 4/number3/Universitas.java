package number3;

public class Universitas {

    private String nama;

    public Universitas(String nama) {
        this.nama = nama;
    }

    public void sambutan() {
        System.out.println("Selamat datang di Universitas " + nama);
    }

    // Inner class
    public class Mahasiswa {

        private String nama;
        private int nim;

        public Mahasiswa(String nama, int nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public void info() {
            System.out.println("Mahasiswa: " + nama);
            System.out.println("NIM: " + nim);
        }

        public void belajar() {
            System.out.println(nama + " sedang belajar");
        }
    }

    // Inner class
    public class Dosen {

        private String nama;
        private String mataKuliah;

        public Dosen(String nama, String mataKuliah) {
            this.nama = nama;
            this.mataKuliah = mataKuliah;
        }

        public void info() {
            System.out.println("Dosen: " + nama);
            System.out.println("Mata Kuliah: " + mataKuliah);
        }

        public void mengajar() {
            System.out.println(nama + " sedang mengajar " + mataKuliah);
        }
    }
}
