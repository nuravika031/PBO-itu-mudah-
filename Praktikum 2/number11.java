
public class number11 {

    public static void main(String[] args) {
        int[][] channel_R = {{2, 7, 243, 28},
        {6, 8, 9, 68},
        {92, 126, 211, 255},
        {0, 4, 83, 38}};
        
        int [][] channel_G = {{8, 3, 254, 4},
            {1, 9, 21, 32},
            {92, 42, 12, 6},
            {5, 2, 7, 58}};  
        
        int [][] channel_B = {{6, 5, 253, 3},
            {2, 1, 3, 5},
            {7, 9, 11, 13},
            {15, 17, 19, 21}};
        
        int [][][] arrayRGB = {channel_R,channel_G,channel_B};
        
        System.out.println("Data Array RGB");
        char [] namaChannel = {'R','G','B'};
        System.out.println(arrayRGB.length);
        for (int i = 0; i < arrayRGB.length; i++) {
            System.out.println("Channel "+namaChannel[i] + " :");
            for (int j = 0; j < arrayRGB[i].length; j++) { 
                for (int k = 0; k < arrayRGB[i][j].length; k++) {
                    System.out.print(arrayRGB[i][j][k] + " ");                   
                }
                System.out.println("");   
            }
        System.out.println("");  
        }
    }
}
