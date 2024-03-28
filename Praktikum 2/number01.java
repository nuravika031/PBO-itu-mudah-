
public class number01 {

    public static void main(String[] args) {
        double[][] data = {
            {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };
        System.out.println("Data :");
        for (double[] baris : data) {
            for (double nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int count = 0;

        for (double[] baris : data) {
            for (double nilai : baris) {
                min = Math.min(min, nilai);
                max = Math.max(max, nilai);
                sum +=nilai;
                count++;
            }
        }
        double average = sum/count;
        
        System.out.println("\nSTATISTIK :");
        System.out.println("MIN :" + min);
        System.out.println("MAX :" + max);
        System.out.println("SUM :" + sum);
        System.out.println("AVERAGE :" + average);
    }
}
