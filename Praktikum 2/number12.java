
public class number12 {

    public static void main(String[] args) {
        int[][] channel_R = {
            {2, 7, 243, 28},
            {6, 8, 9, 68},
            {92, 126, 211, 255},
            {0, 4, 83, 38}
        };
        int[][] channel_G = {
            {8, 3, 254, 4},
            {1, 9, 21, 32},
            {92, 42, 12, 6},
            {5, 2, 7, 58}
        };
        int[][] channel_B = {
            {6, 5, 253, 3},
            {2, 1, 3, 5},
            {7, 9, 11, 13},
            {15, 17, 19, 21}
        };
        int[][][] arrayRGB = {channel_R, channel_G, channel_B};
        int[][] arrayGrayscale = new int[channel_R.length][channel_R[0].length];
        for (int i = 0; i < channel_R.length; i++) {
            for (int j = 0; j < channel_R[i].length; j++) {
                int r = arrayRGB[0][i][j];
                int g = arrayRGB[1][i][j];
                int b = arrayRGB[2][i][j];
                arrayGrayscale[i][j] = Math.round((r + g + b) / 3);
            }
        }
        System.out.println("Data arrayGrayscale:");
        for (int i = 0; i < arrayGrayscale.length; i++) {
            for (int j = 0; j < arrayGrayscale[i].length; j++) {
                System.out.print(arrayGrayscale[i][j] + " ");
            }
            System.out.println();
        }
    }
}
