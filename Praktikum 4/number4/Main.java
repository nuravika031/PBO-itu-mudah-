package number4;

public class Main {

    public static void main(String[] args) {
        double luasLingkaran = BangunDatarLingkaran.hitungLuas(5);
        System.out.println("Luas :" + luasLingkaran);
        double keliling = BangunDatarLingkaran.hitungKeliling(1);
        System.out.println("keliling : " + keliling);
    }
}

//Modifier static akan memungkinkan kita untuk menggunakan sebuah method atau 
//field tanpa terlebih dahulu harus menginstan class tempat dimana method dan 
//field itu berada. Pada saat membuat method static, kita tidak dapat menggunakan 
//keyword this di dalam method-nya.