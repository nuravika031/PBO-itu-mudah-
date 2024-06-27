package number2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AplikasiGUI {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi GUI JSOUP");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.decode("#d35400"));
        contentPane.setLayout(new BorderLayout());

        JPanel jpanelnorth = new JPanel(new FlowLayout());
        jpanelnorth.setBackground(Color.white);
        contentPane.add(jpanelnorth, BorderLayout.NORTH);
        JLabel jlabelURL = new JLabel("URL");
        JTextField jtextfield = new JTextField();
        jpanelnorth.add(jlabelURL);
        jpanelnorth.add(jtextfield);

        jtextfield.setPreferredSize(new Dimension(200, 30));
        JButton jbutton = new JButton("PARSE");
        jpanelnorth.add(jbutton);

        JPanel jpanelcenter = new JPanel(new BorderLayout());
        jpanelcenter.setBackground(Color.BLUE);
        contentPane.add(jpanelcenter, BorderLayout.CENTER);
        JScrollPane jscroolpane = new JScrollPane();
        JTextPane jtextpane = new JTextPane();
        jscroolpane.setViewportView(jtextpane);
        jpanelcenter.add(jscroolpane, BorderLayout.CENTER);

        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sURL = jtextfield.getText();
                    Document document = Jsoup.connect(sURL).get();
                    String text = document.text();
                    jtextpane.setText(text);
                } catch (Exception ex) {
                    jtextpane.setText("URL KOSONG");
                }
            }
        });

        ImageIcon imageIcon = new ImageIcon("heart.png");
        frame.setIconImage(imageIcon.getImage());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
