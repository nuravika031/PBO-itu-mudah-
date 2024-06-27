package number4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import number4.MataKuliah;
public class Mahasiswa {
        public ArrayList<MataKuliah> transkrip = null;
    
     public ArrayList<MataKuliah> getTranskrip() {
        return transkrip;
    }
     
    public ArrayList<MataKuliah> open(File file) {
        try {
            transkrip = new ArrayList<>();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] isi = line.split(";");
                String kode = isi[0];
                String nama = isi[1];
                int sks = Integer.parseInt(isi[2]);
                String nilai = isi[3];
                transkrip.add(new MataKuliah(kode, nama, nilai, sks));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transkrip;
    }
}
