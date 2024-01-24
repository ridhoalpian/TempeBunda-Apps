
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tambahproduk extends javax.swing.JFrame {

    public Tambahproduk() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Tambah Produk");
        cmb_kdproduk.setSelectedItem(null);
        tampil_table();
        warnatabel();
        kosong();
    }

    private void cari(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Sisa Stok");
            model.addColumn("Penambahan");
            model.addColumn("Satuan");
            model.addColumn("Tanggal");
            
        try{
            Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            String sql = "SELECT * FROM tambah_produk WHERE kd_produk LIKE '%"+txtcari.getText()+"%' OR nama_produk LIKE '%"+txtcari.getText()+"%' OR sisa_stok LIKE '%"+txtcari.getText()+"%' OR tambah_stok LIKE '%"+txtcari.getText()+"%' OR satuan LIKE '%"+txtcari.getText()+"%' OR tanggal LIKE'%"+txtcari.getText()+"%'" ;
            ResultSet res=stm.executeQuery(sql);  
            while(res.next()){
                model.addRow(new Object[]{
                   res.getString(1),
                   res.getString(2),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6)
               }); 
            }
            tabeltambahproduk.setModel(model);
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }
    }
    public void kosong(){
        txtcari.setText("");
        txtharga_barang.setText("");
        txtsisastok.setText("");
        pilihtgl.setDateFormatString(null);
        cmb_kdproduk.setSelectedItem(null);
        cmbsatuan.setSelectedItem(null);
        txtjumlahbarang.setText("");
        txtnama_barang.setText("");
        cmb_kdproduk.setSelectedItem(null);
        tabeltambahproduk.clearSelection();
        
    }

    public void tampil_table(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Sisa Stok");
        model.addColumn("Penambahan");
        model.addColumn("Satuan");
        model.addColumn("Tanggal");
        
        try {
            int no=1;
            String sql = "SELECT * FROM tambah_produk";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5),res.getString(6)
                        });
        }
            tabeltambahproduk.setModel(model);
        } catch (Exception e) {
            System.out.println("Tampil data gagal "+e.getMessage());
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeltambahproduk.getTableHeader().setDefaultRenderer(headRender);
        tabeltambahproduk.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihtgl = new com.toedter.calendar.JDateChooser();
        btntambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmb_kdproduk = new javax.swing.JComboBox<>();
        cmbsatuan = new javax.swing.JComboBox<>();
        txtjumlahbarang = new javax.swing.JTextField();
        txtsisastok = new javax.swing.JTextField();
        txtharga_barang = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        txtnama_barang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltambahproduk = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Produk");
        setMinimumSize(new java.awt.Dimension(1120, 640));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pilihtgl.setBackground(new java.awt.Color(255, 246, 223));
        pilihtgl.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tanggal"));
        pilihtgl.setDateFormatString("yyyy-M-dd");
        pilihtgl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        getContentPane().add(pilihtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 370, 70));

        btntambah.setBackground(new java.awt.Color(254, 211, 107));
        btntambah.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btntambah.setForeground(new java.awt.Color(59, 61, 73));
        btntambah.setText("Tambah");
        btntambah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btntambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntambahMouseExited(evt);
            }
        });
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 180, 50));

        jButton2.setBackground(new java.awt.Color(255, 246, 223));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(59, 61, 73));
        jButton2.setText("Kembali");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 180, 50));

        cmb_kdproduk.setBackground(new java.awt.Color(254, 211, 107));
        cmb_kdproduk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmb_kdproduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TME15", "TME30", "TMA15", "TMA25", "TMA30", "TMA50", "TMA150" }));
        cmb_kdproduk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kode Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmb_kdproduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_kdproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kdprodukActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_kdproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 70));

        cmbsatuan.setBackground(new java.awt.Color(254, 211, 107));
        cmbsatuan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbsatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bungkus" }));
        cmbsatuan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Satuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbsatuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbsatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsatuanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 370, 70));

        txtjumlahbarang.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtjumlahbarang.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Jumlah Penambahan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtjumlahbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtjumlahbarangMouseEntered(evt);
            }
        });
        txtjumlahbarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahbarangKeyTyped(evt);
            }
        });
        getContentPane().add(txtjumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 180, -1));

        txtsisastok.setEditable(false);
        txtsisastok.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtsisastok.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Sisa Stok", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtsisastok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsisastokActionPerformed(evt);
            }
        });
        getContentPane().add(txtsisastok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, -1));

        txtharga_barang.setEditable(false);
        txtharga_barang.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtharga_barang.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Harga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtharga_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtharga_barangActionPerformed(evt);
            }
        });
        getContentPane().add(txtharga_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 370, 60));

        txtcari.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtcari.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Cari Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 690, 60));

        txtnama_barang.setEditable(false);
        txtnama_barang.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnama_barang.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 370, 60));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Penambahan Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        tabeltambahproduk.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabeltambahproduk.setForeground(new java.awt.Color(59, 61, 73));
        tabeltambahproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Sisa Stok", "Penambahan", "Satuan", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeltambahproduk.setToolTipText("");
        tabeltambahproduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeltambahproduk.setGridColor(new java.awt.Color(0, 0, 0));
        tabeltambahproduk.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabeltambahproduk.setName(""); // NOI18N
        tabeltambahproduk.setRowHeight(25);
        tabeltambahproduk.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeltambahproduk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeltambahproduk.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabeltambahproduk.setShowHorizontalLines(false);
        tabeltambahproduk.setShowVerticalLines(false);
        tabeltambahproduk.getTableHeader().setReorderingAllowed(false);
        tabeltambahproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltambahprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltambahproduk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 690, 490));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Tambahkan Stok Produkmu Hari ini !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1148, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        
        try {
            int p = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menambahkan?", "Pesan",JOptionPane.YES_NO_OPTION );
            if(p==JOptionPane.YES_OPTION){
            String tampilan ="yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fm.format(pilihtgl.getDate()));
            String sql = "INSERT INTO tambah_produk (kd_produk, nama_produk, sisa_stok, tambah_stok, satuan, tanggal) VALUES ('"+cmb_kdproduk.getSelectedItem()+"', '"+txtnama_barang.getText()+"', '"+txtsisastok.getText()+"','"+txtjumlahbarang.getText()+"', '"+cmbsatuan.getSelectedItem()+"','"+tanggal+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Stok Berhasil Ditambah", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));   
            kosong();
            }else{
                txtjumlahbarang.requestFocus();
                txtjumlahbarang.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan"+ e.getMessage());
        }
        tampil_table();
    }//GEN-LAST:event_btntambahActionPerformed

    private void tabeltambahprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltambahprodukMouseClicked
        // TODO add your handling code here:
        int baris = tabeltambahproduk.rowAtPoint(evt.getPoint());
        String id = tabeltambahproduk.getValueAt(baris, 0).toString();
        cmb_kdproduk.setSelectedItem(id);
        String nama =  tabeltambahproduk.getValueAt(baris, 1).toString();
        txtnama_barang.setText(nama);
        String harga = tabeltambahproduk.getValueAt(baris, 2).toString();
        txtharga_barang.setText(harga);
        String jumlah = tabeltambahproduk.getValueAt(baris, 3).toString();
        txtjumlahbarang.setText(jumlah);
        String satuan = tabeltambahproduk.getValueAt(baris, 4).toString();
        cmbsatuan.setSelectedItem(satuan);
        String tanggal = tabeltambahproduk.getValueAt(baris, 5).toString();
        pilihtgl.setDateFormatString(tanggal);
        
    }//GEN-LAST:event_tabeltambahprodukMouseClicked

    private void cmb_kdprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kdprodukActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = config.koneksi.configDB();
            Statement stkdpro = (Statement) con.createStatement();
            String sql  = "SELECT * FROM produk WHERE id_produk  = '"+cmb_kdproduk.getSelectedItem()+"'";
            ResultSet rskdpro = stkdpro.executeQuery(sql);
            
            while(rskdpro.next()){
                txtnama_barang.setText(rskdpro.getString(2));
                txtharga_barang.setText(rskdpro.getString(3));
                txtsisastok.setText(rskdpro.getString(4));
                cmbsatuan.setSelectedItem(rskdpro.getString(5));
            }
            txtjumlahbarang.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_kdprodukActionPerformed

    private void txtharga_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtharga_barangActionPerformed

    }//GEN-LAST:event_txtharga_barangActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased

    }//GEN-LAST:event_txtcariKeyReleased

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        cari();
    }//GEN-LAST:event_txtcariActionPerformed

    private void cmbsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsatuanActionPerformed
        
    }//GEN-LAST:event_cmbsatuanActionPerformed

    private void txtsisastokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsisastokActionPerformed
        
    }//GEN-LAST:event_txtsisastokActionPerformed

    private void txtjumlahbarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtjumlahbarangMouseEntered
        
    }//GEN-LAST:event_txtjumlahbarangMouseEntered

    private void txtjumlahbarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahbarangKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtjumlahbarangKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new PilihDP().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btntambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseEntered
        btntambah.setBackground(new Color(185,147,54));
        btntambah.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btntambahMouseEntered

    private void btntambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseExited
        btntambah.setBackground(new Color(254,211,107));
        btntambah.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntambahMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(174,176,168));
        jButton2.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(225,225,225));
        jButton2.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton2MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tambahproduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmb_kdproduk;
    private javax.swing.JComboBox<String> cmbsatuan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser pilihtgl;
    private javax.swing.JTable tabeltambahproduk;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtharga_barang;
    private javax.swing.JTextField txtjumlahbarang;
    private javax.swing.JTextField txtnama_barang;
    private javax.swing.JTextField txtsisastok;
    // End of variables declaration//GEN-END:variables
}
