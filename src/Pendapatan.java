
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Pendapatan extends javax.swing.JFrame {

    public Pendapatan() {
        initComponents();
        setLocationRelativeTo(this);
        warnatabel();
        tabelpendapatan();
    }
    public void tabelpendapatan(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Tanggal");
        model.addColumn("Pemasukan");
        model.addColumn("Pengeluaran");
        model.addColumn("Keuntungan");
        
        try {
            String sql = "SELECT * FROM pendapatan";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),
                        res.getString(4)
                        });
        }
            tabelpendapatan.setModel(model);
        } catch (Exception e) {
            System.out.println("gagal tampil "+ e.getMessage());
        }
    }
    
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabelpendapatan.getTableHeader().setDefaultRenderer(headRender);
        tabelpendapatan.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        txtpendapatan = new javax.swing.JTextField();
        txtpengeluaran = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpendapatan = new javax.swing.JTable();
        pilihtgl = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pendapatan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(254, 211, 107));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(59, 61, 73));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 60, 60));

        jButton3.setBackground(new java.awt.Color(254, 211, 107));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(59, 61, 73));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refres.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 60, 60));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txttotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Total Bersih", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 410, 60));

        txtpendapatan.setEditable(false);
        txtpendapatan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtpendapatan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Total Pendapatan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtpendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpendapatanActionPerformed(evt);
            }
        });
        getContentPane().add(txtpendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 340, 60));

        txtpengeluaran.setEditable(false);
        txtpengeluaran.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtpengeluaran.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Total Pengeluaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtpengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpengeluaranActionPerformed(evt);
            }
        });
        getContentPane().add(txtpengeluaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 340, 60));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 129), 3), "Tabel Pendapatan Harian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabelpendapatan.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabelpendapatan.setForeground(new java.awt.Color(59, 61, 73));
        tabelpendapatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Pendapatan", "Pengeluaran", "Bersih", "Produk terjual", "Sisa Produk"
            }
        ));
        tabelpendapatan.setCellSelectionEnabled(true);
        tabelpendapatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelpendapatan.setGridColor(new java.awt.Color(0, 0, 0));
        tabelpendapatan.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelpendapatan.setRowHeight(25);
        tabelpendapatan.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabelpendapatan.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelpendapatan.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabelpendapatan.setShowHorizontalLines(false);
        tabelpendapatan.setShowVerticalLines(false);
        tabelpendapatan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelpendapatan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 650, 550));

        pilihtgl.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Pilih Tanggal"));
        pilihtgl.setToolTipText("");
        pilihtgl.setDateFormatString("yyyy-M-dd");
        pilihtgl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        pilihtgl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilihtglMouseClicked(evt);
            }
        });
        getContentPane().add(pilihtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 70));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 120, -1));

        jButton2.setBackground(new java.awt.Color(254, 211, 107));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(59, 61, 73));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tambah.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coba.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menuadmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpendapatanActionPerformed
        
    }//GEN-LAST:event_txtpendapatanActionPerformed

    private void txtpengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpengeluaranActionPerformed

    }//GEN-LAST:event_txtpengeluaranActionPerformed

    private void pilihtglMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilihtglMouseClicked

    }//GEN-LAST:event_pilihtglMouseClicked

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        
    }//GEN-LAST:event_txttotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(pilihtgl.getDateFormatString().isEmpty()){
            JOptionPane.showMessageDialog(this, "Silahkan masukkan tanggal \n terlebih dahulu","Pesan",JOptionPane.YES_OPTION);
        }else{
            String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(pilihtgl.getDate()));
        try {
            String sql  = "SELECT sum(total) FROM `trans_jual` WHERE tgl_jual = '"+tanggal+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            if(res.next()){
                String sum = res.getString("sum(total)");
                txtpendapatan.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            String sql  = "SELECT sum(total_pengeluaran) FROM `kurangbahan` WHERE tanggal = '"+tanggal+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            if(res.next()){
                String sum = res.getString("sum(total_pengeluaran)");
                txtpengeluaran.setText(sum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int pend = Integer.parseInt(txtpendapatan.getText());
        int peng = Integer.parseInt(txtpengeluaran.getText());
        int total = pend - peng;
            txttotal.setText(String.valueOf(total));
        try {
            String sql  = "update pendapatan set pemasukan = '"+txtpendapatan.getText()+"', pengeluaran = '"+txtpengeluaran.getText()+"', keuntungan = '"+txttotal.getText()+"' WHERE tanggal = '"+tanggal+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Pendapatanmu telah tersimpan, \n lihat pendapatanmu hari ini","Pesan", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tabelpendapatan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        pilihtgl.setDate(null);
        txtpendapatan.setText("");
        txtpengeluaran.setText("");
        txttotal.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            File namafile = new File("src/cetak/pendapatan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.configDB());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (SQLException ex) {
        Logger.getLogger(Pendapatan.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(185,147,54));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(254,211,107));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(185,147,54));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(254,211,107));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(185,147,54));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(254,211,107));
    }//GEN-LAST:event_jButton4MouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendapatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser pilihtgl;
    private javax.swing.JTable tabelpendapatan;
    private javax.swing.JTextField txtpendapatan;
    private javax.swing.JTextField txtpengeluaran;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
