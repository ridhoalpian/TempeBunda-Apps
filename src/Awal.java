
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Awal extends javax.swing.JFrame {

    /**
     * Creates new form FrameAwal
     */
    public Awal() {
        initComponents();
        setLocationRelativeTo(this);
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnregis = new javax.swing.JButton();
        btnmasuk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(790, 711));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregis.setBackground(new java.awt.Color(254, 211, 107));
        btnregis.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnregis.setForeground(new java.awt.Color(59, 61, 73));
        btnregis.setText("Registrasi");
        btnregis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 42, 51), 3, true));
        btnregis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregis.setMultiClickThreshhold(2L);
        btnregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnregisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnregisMouseExited(evt);
            }
        });
        btnregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisActionPerformed(evt);
            }
        });
        getContentPane().add(btnregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 395, 424, 50));

        btnmasuk.setBackground(new java.awt.Color(225, 225, 225));
        btnmasuk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnmasuk.setForeground(new java.awt.Color(59, 61, 73));
        btnmasuk.setText("Masuk");
        btnmasuk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 42, 51), 3, true));
        btnmasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmasukMouseExited(evt);
            }
        });
        btnmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 424, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 340, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgawal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukActionPerformed
        new MasukSebagai().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmasukActionPerformed

    private void btnregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisActionPerformed
        Registrasi f2 = new Registrasi();
        f2.show();
        dispose();
    }//GEN-LAST:event_btnregisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new TentangKita().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnregisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisMouseEntered
        // TODO add your handling code here:
        btnregis.setBackground(new Color(185,147,54));
        btnregis.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnregisMouseEntered

    private void btnregisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisMouseExited
        // TODO add your handling code here:
        btnregis.setBackground(new Color(254,211,107));
        btnregis.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnregisMouseExited

    private void btnmasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmasukMouseEntered
        // TODO add your handling code here:
        btnmasuk.setBackground(new Color(174,176,168));
        btnmasuk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnmasukMouseEntered

    private void btnmasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmasukMouseExited
        // TODO add your handling code here:
        btnmasuk.setBackground(new Color(225,225,225));
        btnmasuk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnmasukMouseExited

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
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmasuk;
    private javax.swing.JButton btnregis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
