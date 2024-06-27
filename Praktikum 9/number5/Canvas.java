package number5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JPanel;

public class Canvas extends JPanel implements Runnable {

    int[] data = {20,10,22,30,21,26,43,32,21,22};
    int lebar = 30;
    int besar = 5;
    Thread thread;

    
    @Override
    public void addNotify() {
        super.addNotify();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        

        int posisi = 10;
        for (int i = 0; i < data.length; i++) {
            int tinggi = data[i];
            g2d.setColor(new Color(173, 216, 230));
            g2d.fillRect(posisi, (400 - (tinggi * besar)), lebar, (tinggi * besar));
            g2d.setColor(Color.black);
            g2d.setFont(new Font("Arial", Font.BOLD, 10));
            g2d.drawString(String.valueOf(tinggi), (posisi + 9), (400 - 9));
            g2d.drawString(String.valueOf(i), (posisi + 9), (400 + 15));
            posisi += (lebar + besar);
        }
    }

    public void isiArray() {
        data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Random().nextInt(51) + 10;
        } 
        repaint();
    }

    public void bubbleSort() {
        isiArray();
        int temp;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                repaint();
                delay(500);
            }
        }
    }

    public void selectionSort() {
        isiArray();
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
            repaint();
            delay(500);
        }
    }

    public void insertionSort() {
        isiArray();
        for (int i = 1; i < data.length; ++i) {
            int banding = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > (banding)) {
                data[j + 1] = data[j];
                j -= 1;
            }
            data[j + 1] = banding;
            repaint();
            delay(500);
        }
    }


    private void delay(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            
        }
    }

    @Override
    public void run() {
        bubbleSort();
    }

}
