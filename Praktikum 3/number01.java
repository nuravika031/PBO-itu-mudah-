
import java.util.Stack;

public class number1{
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        double[]data = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 27, 9.53, 549, 2.23, 17.31, 4.25, 2.13,
            83, 7, 102.4, 53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};
        
        for (int i = 0; i < data.length; i++) {
            stack.push(data[i]);           
        }
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        
        for (int i = 0; i < stack.size(); i++) {
            double nilai = stack.pop();
            if (nilai < min) {
                min = nilai;               
            }
            if (nilai > max) {
                max = nilai;
            }
            sum +=nilai;
        }
        double avg= sum/data.length;
        
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(avg);
        
        
        
    }
}