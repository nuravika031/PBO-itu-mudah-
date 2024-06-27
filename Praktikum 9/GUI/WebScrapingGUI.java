package GUI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebScrapingGUI extends JFrame {

    private JTextArea textArea;
    private JButton scrapeButton;
    private JTextArea resultArea;

    public WebScrapingGUI() {
        setTitle("Web Scraping & Word Frequency");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        scrapeButton = new JButton("Scrape Website");
        scrapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scrapeWebsite();
            }
        });

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane resultScrollPane = new JScrollPane(resultArea);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(scrollPane, BorderLayout.CENTER);
        topPanel.add(scrapeButton, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.CENTER);
        add(resultScrollPane, BorderLayout.SOUTH);
    }

    private void scrapeWebsite() {
        String url = textArea.getText();
        if (!url.isEmpty()) {
            try {
                Document doc = Jsoup.connect(url).get();
                String text = doc.body().text();
                Map<String, Integer> wordFreq = calculateWordFrequency(text);
                displayWordFrequency(wordFreq);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a URL", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Map<String, Integer> calculateWordFrequency(String text) {
        Map<String, Integer> wordFreq = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }
        return wordFreq;
    }

    private void displayWordFrequency(Map<String, Integer> wordFreq) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        resultArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WebScrapingGUI().setVisible(true);
            }
        });
    }
}
