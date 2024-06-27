package number1;

public class BuatOverloadingMethod {
    public void method1(int a) {
        System.out.println("Method 1 (Penjumlahan) dengan parameter int: " + (a + 2));
    }
    public void method1(double a) {
        System.out.println("Method 1 (Penjumlahan) dengan parameter double: " + (a + 5.5));
    }

    public void method2(int a) {
        System.out.println("Method 2 (Pengurangan) dengan parameter int: " + (a - 2));
    }
    public void method2(double a) {
        System.out.println("Method 2 (Pengurangan) dengan parameter double: " + (a - 5.5));
    }

    public void method3(String a) {
        System.out.println("Method 3 (Perkalian) dengan parameter String: " + a.length());
    }
    public void method3(int a) {
        System.out.println("Method 3 (Perkalian) dengan parameter int: " + (a * 10));
    }

    public void method4(int a, int b) {
        System.out.println("Method 4 (Pembagian) dengan dua parameter int: " + (a / b));
    }
    public void method4(double a, double b) {
        if (b != 0) {
            System.out.println("Method 4 (Pembagian) dengan dua parameter double: " + (a / b));
        } else {
            System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan.");
        }
    }

    public void method5(boolean a) {
        System.out.println("Method 5 (Logika NOT) dengan parameter boolean: " + !a);
    }
    public void method5(int a) {
        System.out.println("Method 5 (Logika NOT) dengan parameter int: " + ~a);
    }
    
    public void method6(String a, String b) {
        System.out.println("Method 6 (Penggabungan String) dengan dua parameter String: " + a.concat(b));
    }
    public void method6(char a, char b) {
        System.out.println("Method 6 (Penggabungan String) dengan dua parameter char: " + a + b);
    }
    
    public void method7(int a, int b) {
        System.out.println("Method 7 (Bitwise AND) dengan dua parameter int: " + (a & b));
    }
    public void method7(long a, long b) {
        System.out.println("Method 7 (Bitwise AND) dengan dua parameter long: " + (a & b));
    }

    public void method8(int a, int b) {
        System.out.println("Method 8 (Bitwise OR) dengan dua parameter int: " + (a | b));
    }
    public void method8(long a, long b) {
        System.out.println("Method 8 (Bitwise OR) dengan dua parameter long: " + (a | b));
    }
    
    public void method9(int a, int b) {
        System.out.println("Method 9 (Bitwise XOR) dengan dua parameter int: " + (a ^ b));
    }
    public void method9(long a, long b) {
        System.out.println("Method 9 (Bitwise XOR) dengan dua parameter long: " + (a ^ b));
    }

    public void method10(int a, int b) {
        System.out.println("Method 10 (Modulus) dengan dua parameter int: " + (a % b));
    }
    public void method10(double a, double b) {
        System.out.println("Method 10 (Modulus) dengan dua parameter double: " + (a % b));
    }

    public static void main(String[] args) {
        BuatOverloadingMethod objct = new BuatOverloadingMethod();
        objct.method1(10);
        objct.method1(10.5);
        objct.method2(20);
        objct.method2(15.5);
        objct.method3("Haii");
        objct.method3(5);
        objct.method4(20, 4);
        objct.method4(10.5, 2.5);
        objct.method5(true);
        objct.method5(5);
        objct.method6("Haii", "Ika");
        objct.method6('H', 'i');
        objct.method7(5, 3);
        objct.method7(10l, 5l);
        objct.method8(5, 3);
        objct.method8(10l, 5l);
        objct.method9(5, 3);
        objct.method9(10l, 5l);
        objct.method10(10, 3);
        objct.method10(10.5, 3.5);
    }
}
