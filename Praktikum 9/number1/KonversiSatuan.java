package number1;

import java.util.Scanner;

public class KonversiSatuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.km");
        System.out.println("2.hm");
        System.out.println("3.dam");
        System.out.println("4.m");
        System.out.println("5.dm");
        System.out.println("6.cm");
        System.out.println("7.mm");
        System.out.print("Masukkan Jenis Inputan : ");
        int tipeMasukan = sc.nextInt();
        System.out.print("Masukkan Panjang : ");
        double panjang = sc.nextDouble();
        switch (tipeMasukan) {
            case 1:
                panjang /= 1;
                break;
            case 2:
                panjang /= 10;
                break;
            case 3:
                panjang /= 100;
                break;
            case 4:
                panjang /= 1000;
                break;
            case 5:
                panjang /= 10000;
                break;
            case 6:
                panjang /= 100000;
                break;
            case 7:
                panjang /= 1000000; // Changed to 1000000 for millimeters to meters
                break;
        }
        System.out.println("1.km");
        System.out.println("2.hm");
        System.out.println("3.dam");
        System.out.println("4.m");
        System.out.println("5.dm");
        System.out.println("6.cm");
        System.out.println("7.mm");
        System.out.print("Masukkan Jenis Keluaran : ");
        int tipekeluaran = sc.nextInt();
        switch (tipekeluaran) {
            case 1:
                panjang *= 1;
                break;
            case 2:
                panjang *= 10;
                break;
            case 3:
                panjang *= 100;
                break;
            case 4:
                panjang *= 1000;
                break;
            case 5:
                panjang *= 10000;
                break;
            case 6:
                panjang *= 100000;
                break;
            case 7:
                panjang *= 1000000;
                break;
        }
        
        System.out.printf("%.4f%n", panjang);
    }
}
