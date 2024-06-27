package number5;
import java.util.ArrayList;
import number5.Kotak;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kotak> arrayList = new ArrayList<>();

        // Menambahkan objek Kotak ke dalam ArrayList
        Kotak kotak1 = new Kotak("Merah", 5.0, 3.0);
        Kotak kotak2 = new Kotak("Biru", 4.0, 4.0);
        Kotak kotak3 = new Kotak("Hijau", 6.0, 2.0);

        arrayList.add(kotak1);
        arrayList.add(kotak2);
        arrayList.add(kotak3);

        // Memanggil method pada objek Kotak melalui ArrayList
        arrayList.get(0).setPanjang(12.0);
        arrayList.get(1).setLebar(5.0);
        arrayList.get(2).setWarna("Kuning");
        System.out.println("Keliling index ke-1 : "+arrayList.get(1).getKeliling());

        // Menampilkan informasi objek Kotak dalam ArrayList
        for (Kotak kotak : arrayList) {
            System.out.println(kotak.toString());
        }
    }
}