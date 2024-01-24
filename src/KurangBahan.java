
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class KurangBahan extends javax.swing.JFrame {

    public KurangBahan() {
        initComponents();
        setTitle("Detail Pengurangan Bahan");
        setLocationRelativeTo(this);
        warnatabel();
        tampil_table();
    }

    public void kosong(){
        txtnamabahan.setText("");
        txthargabahan.setText("");
        txtjumlahbahan.setText("");
        txtqty.setText("");
        cmbbahan.setSelectedItem(null);
        tabelkurangproduk.clearSelection();
    }

    public void tampil_table(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID Bahan Baku");
        model.addColumn("ID Pengurangan");
        model.addColumn("Stok");
        model.addColumn("Harga Bahan");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
        
        try {
            int no=1;
            String sql = "SELECT * FROM detail_kurangbahan WHERE id_kubah = '"+txtidkurangbahan.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5),res.getString(6)
                        });
        }
            tabelkurangproduk.setModel(model);
        } catch (Exception e) {
            System.out.println("Tampil data gagal "+e.getMessage());
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabelkurangproduk.getTableHeader().setDefaultRenderer(headRender);
        tabelkurangproduk.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkemb = new javax.swing.JButton();
        txthargabahan = new javax.swing.JTextField();
        cmbbahan = new javax.swing.JComboBox<>();
        txtjumlahbahan = new javax.swing.JTextField();
        txtsatuan = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtnamabahan = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtidkurangbahan = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        txtgrndtot = new javax.swing.JTextField();
        btnedit1 = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelkurangproduk = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1152, 654));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkemb.setBackground(new java.awt.Color(255, 246, 223));
        btnkemb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnkemb.setForeground(new java.awt.Color(59, 61, 73));
        btnkemb.setText("Kembali");
        btnkemb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnkemb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkemb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkembMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkembMouseExited(evt);
            }
        });
        btnkemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembActionPerformed(evt);
            }
        });
        getContentPane().add(btnkemb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 370, 50));

        txthargabahan.setEditable(false);
        txthargabahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txthargabahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Harga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txthargabahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 176, -1));

        cmbbahan.setBackground(new java.awt.Color(254, 211, 107));
        cmbbahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbbahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KD001", "KY001", "LN001", "PS001", "RG001", "RG002" }));
        cmbbahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kode Bahan Baku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbbahan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbbahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbahanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 370, 60));

        txtjumlahbahan.setEditable(false);
        txtjumlahbahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtjumlahbahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Stok", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtjumlahbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 180, -1));

        txtsatuan.setEditable(false);
        txtsatuan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtsatuan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Satuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtsatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsatuanActionPerformed(evt);
            }
        });
        txtsatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsatuanKeyTyped(evt);
            }
        });
        getContentPane().add(txtsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, -1));

        txtqty.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtqty.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Jumlah Pengurangan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        txtqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtqtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 176, -1));

        txtnamabahan.setEditable(false);
        txtnamabahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnamabahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnamabahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, -1));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txttotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 370, 60));

        txtidkurangbahan.setEditable(false);
        txtidkurangbahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidkurangbahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Pengurangan Bahan Baku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidkurangbahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidkurangbahanActionPerformed(evt);
            }
        });
        getContentPane().add(txtidkurangbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, -1));

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtsubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Subtotal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 370, 60));

        txtgrndtot.setEditable(false);
        txtgrndtot.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtgrndtot.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Grandtotal"));
        txtgrndtot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrndtotActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrndtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 500, 60));

        btnedit1.setBackground(new java.awt.Color(254, 211, 107));
        btnedit1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnedit1.setForeground(new java.awt.Color(59, 61, 73));
        btnedit1.setText("Tambah");
        btnedit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnedit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnedit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnedit1MouseExited(evt);
            }
        });
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 370, 50));

        btnhitung.setBackground(new java.awt.Color(254, 211, 107));
        btnhitung.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnhitung.setForeground(new java.awt.Color(59, 61, 73));
        btnhitung.setText("Hitung");
        btnhitung.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnhitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhitungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhitungMouseExited(evt);
            }
        });
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 160, 50));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Detail Pengurangan Bahan Baku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabelkurangproduk.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        tabelkurangproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelkurangproduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelkurangproduk.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabelkurangproduk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabelkurangproduk);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 20, 680, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembActionPerformed
        dispose();
        new AwalKurangBahan().setVisible(true);
    }//GEN-LAST:event_btnkembActionPerformed

    private void cmbbahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbahanActionPerformed
        try {
            String sql = "select * from bahan_baku where id_bahan = '"+cmbbahan.getSelectedItem()+"'";
            Connection con = config.koneksi.configDB();
            Statement statementcmbproduk = (Statement) con.createStatement();
            ResultSet resultcmbproduk = statementcmbproduk.executeQuery(sql);
            while (resultcmbproduk.next()){
                txtnamabahan.setText(resultcmbproduk.getString(2));
                txthargabahan.setText(resultcmbproduk.getString(3));
                txtjumlahbahan.setText(resultcmbproduk.getString(4));
                txtsatuan.setText(resultcmbproduk.getString(5));
            }
            txtqty.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbbahanActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        int qty = Integer.parseInt(txtqty.getText());
        int harga = Integer.parseInt(txthargabahan.getText());
        int jumlah = Integer.parseInt(txtjumlahbahan.getText());
        if(qty > jumlah){
            JOptionPane.showMessageDialog(rootPane, "Stok tidak mencukupi");
            txtqty.setText("");
        }else{
            int total = qty * harga;
            txttotal.setText(String.valueOf(total));
            txtsubtotal.setText(String.valueOf(total));
            txtsubtotal.requestFocus();
        }
        
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtqtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9')
            || (karakter == KeyEvent.VK_BACK_SPACE)
            || (karakter == KeyEvent.VK_DELETE)))){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtqtyKeyTyped

    private void txtidkurangbahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidkurangbahanActionPerformed
        
    }//GEN-LAST:event_txtidkurangbahanActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtgrndtotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrndtotActionPerformed
        
    }//GEN-LAST:event_txtgrndtotActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        try {
            int baris = tabelkurangproduk.getSelectedRow();
            int p = JOptionPane.showConfirmDialog(this, "Hitung ?","Pesan",JOptionPane.YES_OPTION );
            String sql  = "select sum(total_harga) from detail_kurangbahan where id_kubah = '"+tabelkurangproduk.getValueAt(baris, p)+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            if(res.next()){
                String sum = res.getString("sum(total_harga)");
                txtgrndtot.setText(sum);
                JOptionPane.showMessageDialog(rootPane, "Terhitung");
            }
        } catch (Exception e) {
            System.out.println("gagal terhitung "+e.getMessage());
        }
        try {
            String sql  = "UPDATE `kurangbahan` SET `total_pengeluaran`='"+txtgrndtot.getText()+"' WHERE id_kubah = '"+txtidkurangbahan.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            tampil_table();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsatuanActionPerformed
        
    }//GEN-LAST:event_txtsatuanActionPerformed

    private void txtsatuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsatuanKeyTyped
        
    }//GEN-LAST:event_txtsatuanKeyTyped

    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed
        try {
            String sql  = "insert into detail_kurangbahan (id_kubah,id_bahan,nama_bahan,harga_bahan,jumlah,total_harga)values('"+txtidkurangbahan.getText()+"','"+cmbbahan.getSelectedItem()+"','"+txtnamabahan.getText()+"','"+txthargabahan.getText()+"','"+txtqty.getText()+"','"+txtsubtotal.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Telah Ditambahkan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tampil_table();
            txtqty.setText("");
            txttotal.setText("");
            txtsubtotal.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnedit1ActionPerformed

    private void btnedit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnedit1MouseEntered
        btnedit1.setBackground(new Color(185,147,54));
        btnedit1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnedit1MouseEntered

    private void btnedit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnedit1MouseExited
        btnedit1.setBackground(new Color(254,211,107));
        btnedit1.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnedit1MouseExited

    private void btnhitungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseExited
        btnhitung.setBackground(new Color(254,211,107));
        btnhitung.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhitungMouseExited

    private void btnhitungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseEntered
        btnhitung.setBackground(new Color(185,147,54));
        btnhitung.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnhitungMouseEntered

    private void btnkembMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembMouseEntered
        btnkemb.setBackground(new Color(174,176,168));
        btnkemb.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkembMouseEntered

    private void btnkembMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembMouseExited
        btnkemb.setBackground(new Color(225,225,225));
        btnkemb.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkembMouseExited

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
            java.util.logging.Logger.getLogger(KurangBahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KurangBahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KurangBahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KurangBahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KurangBahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkemb;
    public javax.swing.JComboBox<String> cmbbahan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelkurangproduk;
    private javax.swing.JTextField txtgrndtot;
    private javax.swing.JTextField txthargabahan;
    public javax.swing.JTextField txtidkurangbahan;
    private javax.swing.JTextField txtjumlahbahan;
    private javax.swing.JTextField txtnamabahan;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsatuan;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
