
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class number06{
    public static void main(String[] args) {
        String namaFile = "src/transkrip.csv";
        ArrayList<String> dataMatkul =new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File (namaFile));
            sc.nextLine();
            while(sc.hasNextLine()){
            dataMatkul.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Data MataKuliah dan Nilai Mahasiswa :");
        for (String data : dataMatkul) {
            System.out.println(data);
        }
    }
}