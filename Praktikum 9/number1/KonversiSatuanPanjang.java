package number1;

public class KonversiSatuanPanjang extends javax.swing.JFrame {

    public KonversiSatuanPanjang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Inputan = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();
        TipeOutput = new javax.swing.JComboBox<>();
        TipeInputan = new javax.swing.JComboBox<>();
        TombolKonversi = new javax.swing.JButton();
        SatuanDari = new javax.swing.JLabel();
        SatuanKe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 204, 255));

        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });

        TipeOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km", "hm", "dam", "m", "dm", "cm", "mm", " " }));

        TipeInputan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km", "hm", "dam", "m", "dm", "cm", "mm" }));
        TipeInputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipeInputanActionPerformed(evt);
            }
        });

        TombolKonversi.setText("Konversi");
        TombolKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolKonversiActionPerformed(evt);
            }
        });

        SatuanDari.setText("Satuan dari :");

        SatuanKe.setText("Satuan ke :");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SatuanDari, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SatuanKe))
                .addGap(12, 12, 12)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(TipeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(TipeInputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inputan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TombolKonversi)
                .addGap(162, 162, 162))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(SatuanDari))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipeInputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SatuanKe)
                    .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(TombolKonversi)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void TombolKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolKonversiActionPerformed
        // TODO add your handling code here:
        int pilihanInputan;
        int pilihanOutput;
        double panjang;
        double hasilx= 0;
        double output =0;

        panjang = Double.parseDouble(Inputan.getText());
        pilihanInputan = TipeInputan.getSelectedIndex();
        pilihanOutput = TipeOutput.getSelectedIndex();

        switch (pilihanInputan) {
            case 0:
            hasilx = panjang / 1;
            break;
            case 1:
            hasilx = panjang / 10;
            break;
            case 2:
            hasilx = panjang / 100;
            break;
            case 3:
            hasilx = panjang / 1000;
            break;
            case 4:
            hasilx = panjang / 10000;
            break;
            case 5:
            hasilx = panjang / 100000;
            break;
            case 6:
            hasilx = panjang / 1000000;
            break;
        }

        switch (pilihanOutput) {
            case 0:
            output = hasilx * 1;
            break;
            case 1:
            output = hasilx * 10;
            break;
            case 2:
            output = hasilx * 100;
            break;
            case 3:
            output = hasilx * 1000;
            break;
            case 4:
            output = hasilx * 10000;
            break;
            case 5:
            output = hasilx * 100000;
            break;
            case 6:
            output = hasilx * 1000000;
            break;
        }

        Hasil.setText(String.valueOf(output));
    }//GEN-LAST:event_TombolKonversiActionPerformed

    private void TipeInputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipeInputanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipeInputanActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KonversiSatuanPanjang frame = new KonversiSatuanPanjang();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hasil;
    private javax.swing.JTextField Inputan;
    private javax.swing.JLabel SatuanDari;
    private javax.swing.JLabel SatuanKe;
    private javax.swing.JComboBox<String> TipeInputan;
    private javax.swing.JComboBox<String> TipeOutput;
    private javax.swing.JButton TombolKonversi;
    private javax.swing.JPanel background;
    // End of variables declaration//GEN-END:variables
}
