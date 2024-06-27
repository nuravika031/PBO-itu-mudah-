package number6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print ("Masukkan n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nilai fibonacci ke-n " + " adalah " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
