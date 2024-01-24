
import config.koneksi;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Registrasi extends javax.swing.JFrame {

    public Registrasi() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkembali = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        txtusrnm = new javax.swing.JTextField();
        txtpswrd = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        btndaftar = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkembali.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnkembali.setText("Kembali");
        btnkembali.setBorder(null);
        btnkembali.setBorderPainted(false);
        btnkembali.setContentAreaFilled(false);
        btnkembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 80, 30));

        txtnama.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 550, 60));

        txtnohp.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnohp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "No Handphone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpActionPerformed(evt);
            }
        });
        txtnohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnohpKeyTyped(evt);
            }
        });
        getContentPane().add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 550, 60));

        txtusrnm.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtusrnm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Nama Pengguna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtusrnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusrnmActionPerformed(evt);
            }
        });
        getContentPane().add(txtusrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 550, 60));

        txtpswrd.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtpswrd.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Kata Sandi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtpswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 550, 60));

        txtalamat.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtalamat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Alamat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 550, 60));

        btndaftar.setBackground(new java.awt.Color(251, 223, 130));
        btndaftar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btndaftar.setForeground(new java.awt.Color(59, 61, 73));
        btndaftar.setText("Daftar");
        btndaftar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btndaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndaftarMouseExited(evt);
            }
        });
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 530, 420, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fiksin12.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 727, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        try {
        if(txtusrnm.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Silahkan isi dulu");
        }
            String sql1 = "INSERT INTO admintam(nama, alamat, no_hp, username, password) VALUES ('"+txtnama.getText()+"','"
                    +txtalamat.getText()+"','"+txtnohp.getText()+"','"+txtusrnm.getText()+"','"+txtpswrd.getText()+"')";    
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
            pst1.execute();
             
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            this.setVisible(false);
            new Loginadmintam().setVisible(true);
             
        } catch (Exception e) {
            System.out.println("data gagal disimpan "+e.getMessage());
        }
    }//GEN-LAST:event_btndaftarActionPerformed

    private void txtusrnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusrnmActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnohpActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        dispose();
        new Awal().setVisible(true);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void txtnohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnohpKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtnohpKeyTyped

    private void btndaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseEntered
        btndaftar.setBackground(new Color(185,147,54));
        btndaftar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btndaftarMouseEntered

    private void btndaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndaftarMouseExited
        btndaftar.setBackground(new Color(254,211,107));
        btndaftar.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btndaftarMouseExited

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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnkembali;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JTextField txtpswrd;
    private javax.swing.JTextField txtusrnm;
    // End of variables declaration//GEN-END:variables
}
