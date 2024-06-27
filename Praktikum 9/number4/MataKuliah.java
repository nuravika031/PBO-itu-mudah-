package number4;

public class MataKuliah {

    String kode, matakuliah, nilai;
    int sks;

    public MataKuliah(String kode, String matakuliah, String nilai, int sks) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public String getNilai() {
        return nilai;
    }

    public int getSks() {
        return sks;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
