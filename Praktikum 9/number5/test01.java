package number5;

import number5.Canvas;
import javax.swing.JFrame;

public class test01 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        Canvas canvas = new Canvas();
        fr.getContentPane().add(canvas);
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
    }
}