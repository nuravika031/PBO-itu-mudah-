
public class number9 {

    public static void main(String[] args) {
        int[][] data = {
            {0, 0, 0, 0, 0, 16, 0},
            {12, 0, 0, 3, 6, 0, 0},
            {0, 16, 0, 0, 0, 0, 0},
            {8, 0, 0, 0, 0, 0, 0},
            {0, 0, 4, 0, 0, 0, 0},
            {0, 5, 0, 0, 2, 0, 7},
            {5, 0, 0, 0, 0, 0, 0}
        };
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(" " + data[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
