package number1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class no1 extends JFrame{
    private JComboBox<String> satuanDari;
    private JComboBox<String> satuanKe;
    private JTextField input;
    private JTextField output;
    private JButton konversi;
    
    public no1(){
        setTitle("Konversi Satuan");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setForeground(Color.BLACK);
        
        JPanel jp = new JPanel(new BorderLayout());
        jp.setBackground(Color.MAGENTA);
        jp.setBounds(0,0,400, 200);
        
        String[] satuan = {"km","hm","dam","m","dm","cm","mm"};
        
        JLabel label = new JLabel("Satuan dari:");
        label.setLocation(50,30);
        label.setSize(70,25);
        label.setForeground(Color.WHITE);
        add(label);
        
        satuanDari = new JComboBox<>(satuan);
        satuanDari.setLocation(120, 30);
        satuanDari.setSize(50,25);
        satuanDari.setBackground(Color.black);
        satuanDari.setForeground(Color.white);
        add(satuanDari);
        
        input = new JTextField();
        input.setLocation(180, 30);
        input.setSize(120,25);
        input.setBackground(Color.black);
        input.setForeground(Color.white);
        input.setCaretColor(Color.white);
        add(input);
        
        JLabel label2 = new JLabel("Satuan ke:");
        label2.setLocation(50,70);
        label2.setSize(70,25);
        label2.setForeground(Color.white);
        add(label2);
        
        satuanKe = new JComboBox<>(satuan);
        satuanKe.setLocation(120, 70);
        satuanKe.setSize(50,25);
        satuanKe.setBackground(Color.black);
        satuanKe.setForeground(Color.white);
        add(satuanKe);
        
        output = new JTextField();
        output.setLocation(180, 70);
        output.setSize(120,25);
        output.setEditable(false);
        output.setBackground(Color.black);
        output.setForeground(Color.white);
        output.setCaretColor(Color.white);
        add(output);
        
        konversi = new JButton("Konversi");
        konversi.setLocation(140, 110);
        konversi.setSize(100,25);
        konversi.setBackground(Color.BLACK);
        konversi.setForeground(Color.WHITE);
        add(konversi);
        add(jp);
        
        konversi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                konversiSatuan();
            }
        });
        
        setLocationRelativeTo(null);
    }
    
    private void konversiSatuan(){
                String dari = (String) satuanDari.getSelectedItem();
                String ke = (String) satuanKe.getSelectedItem();
                double nilai = Double.parseDouble(input.getText());
                
                double nilaiDasar = konversiKe(dari,nilai);
                double nilaiDiKonversi = konversiDari(ke,nilaiDasar);
                
                output.setText(String.valueOf(nilaiDiKonversi));
    }
    
    private double konversiKe(String satuan,double nilai){
        switch(satuan){
            case "km" : return nilai * 1000;
            case "hm" : return nilai * 100;
            case "dam": return nilai * 10;
            case "m"  : return nilai ;
            case "dm" : return nilai / 10;
            case "cm" : return nilai / 100;
            case "mm" : return nilai / 1000;
            default : throw new IllegalArgumentException("Invalid unit: " + satuan);
        }
    }
        
    private double konversiDari(String satuan ,double nilai){
        switch(satuan){
            case "km" : return nilai / 1000;
            case "hm" : return nilai / 100;
            case "dam": return nilai / 10;
            case "m"  : return nilai ;
            case "dm" : return nilai * 10;
            case "cm" : return nilai * 100;
            case "mm" : return nilai * 1000;
            default : throw new IllegalArgumentException("Invalid unit: " + satuan);
        }
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new no1().setVisible(true);
            }});
        
}
}
