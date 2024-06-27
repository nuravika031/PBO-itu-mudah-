package number3;

public class Main {

    public static void main(String[] args) {
        Universitas univ = new Universitas("Sulawesi Barat");
        univ.sambutan();
        
        Universitas.Mahasiswa mhs = univ.new Mahasiswa("Baso Muchtar Fajar Alghifari",293027);
        mhs.info();
        mhs.belajar();
        
        Universitas.Dosen dosen = univ.new Dosen("Nurhikmah Arifin", "Matematika");
        dosen.info();
        dosen.mengajar();
    }
}
