package test;

import java.util.ArrayList;
import myprogram.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Nur Avika");
        mhs1.setNim("D0223013");
        mhs1.setAlamat("Polewali");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Greis");
        mhs2.setNim("D0223013");
        mhs2.setAlamat("Polewali");
        mahasiswaList.add(mhs2);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Ria");
        mhs3.setNim("D0223014");
        mhs3.setAlamat("Tobadak");
        mahasiswaList.add(mhs3);

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNama("Nurul Imaniar");
        mhs4.setNim("D0223010");
        mhs4.setAlamat("Tapango");
        mahasiswaList.add(mhs4);

        Mahasiswa mhs5 = new Mahasiswa();
        mhs5.setNama("Suardi");
        mhs5.setNim("D0223011");
        mhs5.setAlamat("Renggeang");
        mahasiswaList.add(mhs5);

        Mahasiswa mhs6 = new Mahasiswa();
        mhs6.setNama("Febri");
        mhs6.setNim("D0223012");
        mhs6.setAlamat("Tinambung");
        mahasiswaList.add(mhs6);

        Mahasiswa mhs7 = new Mahasiswa();
        mhs7.setNama("Faril");
        mhs7.setNim("D0223015");
        mhs7.setAlamat("Mamasa");
        mahasiswaList.add(mhs7);

        Mahasiswa mhs8 = new Mahasiswa();
        mhs8.setNama("Silfi");
        mhs8.setNim("D0223016");
        mhs8.setAlamat("Pasangkayu");
        mahasiswaList.add(mhs8);

        Mahasiswa mhs9 = new Mahasiswa();
        mhs9.setNama("Habib");
        mhs9.setNim("D0223017");
        mhs9.setAlamat("Majene");
        mahasiswaList.add(mhs9);

        Mahasiswa mhs10 = new Mahasiswa();
        mhs10.setNama("Livia");
        mhs10.setNim("D0223018");
        mhs10.setAlamat("Palatta");
        mahasiswaList.add(mhs10);

        Mahasiswa mhs11 = new Mahasiswa();
        mhs11.setNama("Cinta");
        mhs11.setNim("D0223019");
        mhs11.setAlamat("Donggala");
        mahasiswaList.add(mhs11);

        Mahasiswa mhs12 = new Mahasiswa();
        mhs12.setNama("Ihksan");
        mhs12.setNim("D0223049");
        mhs12.setAlamat("Majene");
        mahasiswaList.add(mhs12);

        Mahasiswa mhs13 = new Mahasiswa();
        mhs13.setNama("Rifqah");
        mhs13.setNim("D0223314");
        mhs13.setAlamat("Polewali");
        mahasiswaList.add(mhs13);

        Mahasiswa mhs14 = new Mahasiswa();
        mhs14.setNama("Gandi");
        mhs14.setNim("D0223315");
        mhs14.setAlamat("Polewali");
        mahasiswaList.add(mhs14);

        Mahasiswa mhs15 = new Mahasiswa();
        mhs15.setNama("Hikma");
        mhs15.setNim("D0223316");
        mhs15.setAlamat("Mamuju");
        mahasiswaList.add(mhs15);

        Mahasiswa mhs16 = new Mahasiswa();
        mhs16.setNama("Hayat");
        mhs16.setNim("D0223317");
        mhs16.setAlamat("Majene");
        mahasiswaList.add(mhs16);

        Mahasiswa mhs17 = new Mahasiswa();
        mhs17.setNama("Indah");
        mhs17.setNim("D0223319");
        mhs17.setAlamat("Enrekang");
        mahasiswaList.add(mhs17);

        Mahasiswa mhs18 = new Mahasiswa();
        mhs18.setNama("Zuhdi");
        mhs18.setNim("D0223320");
        mhs18.setAlamat("Majene");
        mahasiswaList.add(mhs18);

        Mahasiswa mhs19 = new Mahasiswa();
        mhs19.setNama("Ratri");
        mhs19.setNim("D0223321");
        mhs19.setAlamat("Mamuju");
        mahasiswaList.add(mhs19);

        Mahasiswa mhs20 = new Mahasiswa();
        mhs20.setNama("Mawaddah");
        mhs20.setNim("D0223324");
        mhs20.setAlamat("Mamasa");
        mahasiswaList.add(mhs20);
        
        Mahasiswa mhs21 = new Mahasiswa();
        mhs21.setNama("Baso Muchtar Fajar Alghifari");
        mhs21.setNim("D0222311");
        mhs21.setAlamat("Surga");
        mahasiswaList.add(mhs21);
        
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println(mhs);
        }
    }  
}
