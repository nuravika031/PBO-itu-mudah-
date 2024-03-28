
import java.util.LinkedList;
import java.util.Queue;

public class number2 {

    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();
        double[] data = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13,
            83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};

        for (int i = 0; i < data.length; i++) {
            queue.offer(data[i]);
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int j = 0; j < queue.size(); j++) {
            double nilai = queue.poll();
            if (nilai < min) {
                min = nilai;
            }
            if (nilai > max) {
                max = nilai;
            }
            sum += nilai;

        }

        double avg = sum / queue.size();
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
        System.out.println("SUM: " + sum);
        System.out.println("AVARAGE: " + avg);

    }

}
