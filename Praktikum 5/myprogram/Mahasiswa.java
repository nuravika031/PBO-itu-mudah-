package myprogram;
public class Mahasiswa extends Manusia {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat); 
    }

    @Override
    public String getAlamat() {
        return super.getAlamat(); 
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); 
    }

    @Override
    public String getNama() {
        return super.getNama(); 
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + 
                " nama=" + nama +
                " alamat=" + alamat +
                '}';
    }  
}
