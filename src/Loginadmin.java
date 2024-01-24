
import config.koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Loginadmin extends javax.swing.JFrame {

    public Loginadmin() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        txtpassword = new javax.swing.JPasswordField();
        masuklogin = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(727, 654));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttpmata.png"))); // NOI18N
        jCheckBox1.setRolloverEnabled(false);
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/mata.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 322, -1, 40));

        txtpassword.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Kata Sandi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 510, 60));

        masuklogin.setBackground(new java.awt.Color(251, 223, 130));
        masuklogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        masuklogin.setForeground(new java.awt.Color(59, 61, 73));
        masuklogin.setText("Masuk");
        masuklogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        masuklogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masuklogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masukloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masukloginMouseExited(evt);
            }
        });
        masuklogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukloginActionPerformed(evt);
            }
        });
        getContentPane().add(masuklogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 405, 424, 50));

        txtusername.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 5, true), "Nama Pengguna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 228, 510, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fiksin14.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 727, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        masukloginActionPerformed(evt);
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void masukloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukloginActionPerformed
        try {
            String sql = "SELECT * FROM akun WHERE username = '"+txtusername.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                if(txtpassword.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(rootPane, "Anda Berhasil Login", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
                    dispose();
                    new Menuadmin().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Password Salah", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
                    txtpassword.setText("");
                    txtpassword.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Username Tidak Ditemukan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
                txtusername.requestFocus();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_masukloginActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed

    }//GEN-LAST:event_txtusernameActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            txtpassword.setEchoChar((char)0);
        }else{
            txtpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void masukloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukloginMouseEntered
        masuklogin.setBackground(new Color(185,147,54));
        masuklogin.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_masukloginMouseEntered

    private void masukloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukloginMouseExited
        masuklogin.setBackground(new Color(254,211,107));
        masuklogin.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_masukloginMouseExited

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
            java.util.logging.Logger.getLogger(Loginadmintam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginadmintam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginadmintam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginadmintam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton masuklogin;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
