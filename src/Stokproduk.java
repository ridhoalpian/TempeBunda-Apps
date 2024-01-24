
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Stokproduk extends javax.swing.JFrame {
    
    public Stokproduk() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Stok Produk");
        cmbsat.setSelectedItem(null);
        tampil_table();
        kosong();
        warnatabel();
        txtid.requestFocus();
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabelproduk.getTableHeader().setDefaultRenderer(headRender);
        tabelproduk.setRowHeight(30);
    }
    private void cari(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Harga");
            model.addColumn("Stok");
            model.addColumn("Satuan");
            
        try{
            Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            String sql = "SELECT * FROM produk WHERE id_produk LIKE '%"+txtcari.getText()
                    +"%' OR nama_produk LIKE '%"+txtcari.getText()+"%' OR harga_produk LIKE '%"
                    +txtcari.getText()+"%' OR jumlah_produk LIKE '%"+txtcari.getText()+"%' OR satuan LIKE '%"+txtcari.getText()+"%'";

            ResultSet res=stm.executeQuery(sql);  
            while(res.next()){
                model.addRow(new Object[]{
                   res.getString(1),
                   res.getString(2),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),                   
               }); 
            }
            tabelproduk.setModel(model);
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }
    }
    public void kosong(){
        txtcari.setText("");
        txtharga.setText("");
        txtid.setText("");
        txtjumlah.setText("");
        txtnama.setText("");
        cmbsat.setSelectedItem(null);
        tabelproduk.clearSelection();
        
    }

    public void tampil_table(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Stok");
        model.addColumn("Satuan");
        
        try {
            int no=1;
            String sql = "SELECT * FROM produk";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5)
                        });
        }
            tabelproduk.setModel(model);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkosong = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        cmbsat = new javax.swing.JComboBox<>();
        txtjumlah = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelproduk = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Produk");
        setMinimumSize(new java.awt.Dimension(1152, 695));
        setPreferredSize(new java.awt.Dimension(1152, 695));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkosong.setBackground(new java.awt.Color(255, 246, 223));
        btnkosong.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnkosong.setForeground(new java.awt.Color(59, 61, 73));
        btnkosong.setText("Kosong");
        btnkosong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnkosong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkosong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkosongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkosongMouseExited(evt);
            }
        });
        btnkosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkosongActionPerformed(evt);
            }
        });
        getContentPane().add(btnkosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 180, 50));

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
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 370, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 180, 50));

        btnedit.setBackground(new java.awt.Color(255, 246, 223));
        btnedit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnedit.setForeground(new java.awt.Color(59, 61, 73));
        btnedit.setText("Edit");
        btnedit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditMouseExited(evt);
            }
        });
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 50));

        cmbsat.setBackground(new java.awt.Color(251, 223, 130));
        cmbsat.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbsat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bungkus" }));
        cmbsat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Satuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbsat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsatActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 370, 70));

        txtjumlah.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtjumlah.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Stok ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahKeyTyped(evt);
            }
        });
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 370, -1));

        txtharga.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Harga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 60));

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
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 660, 60));

        txtnama.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, 60));

        txtid.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kode Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 60));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Data Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        tabelproduk.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabelproduk.setForeground(new java.awt.Color(59, 61, 73));
        tabelproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga", "Stok", "Satuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelproduk.setToolTipText("");
        tabelproduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelproduk.setGridColor(new java.awt.Color(0, 0, 0));
        tabelproduk.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelproduk.setName(""); // NOI18N
        tabelproduk.setRowHeight(35);
        tabelproduk.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabelproduk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelproduk.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabelproduk.setShowHorizontalLines(false);
        tabelproduk.setShowVerticalLines(false);
        tabelproduk.getTableHeader().setResizingAllowed(false);
        tabelproduk.getTableHeader().setReorderingAllowed(false);
        tabelproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelproduk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 660, 520));

        btnhapus.setBackground(new java.awt.Color(255, 246, 223));
        btnhapus.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(59, 61, 73));
        btnhapus.setText("Hapus");
        btnhapus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhapusMouseExited(evt);
            }
        });
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 180, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 0));
        jLabel3.setText("Tambahkan produk barumu disini!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 360, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Cek Stok Produkmu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new PilihDP().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
        int baris = tabelproduk.getSelectedRow();
        int p = JOptionPane.showConfirmDialog(this, "Yakin ingin diubah ?", "Pesan", JOptionPane.YES_NO_OPTION);
        if(p==JOptionPane.YES_OPTION){
            String sql = "UPDATE produk SET nama_produk = '"+txtnama.getText()+"', harga_produk = '"+txtharga.getText()+"', jumlah_produk = '"+txtjumlah.getText()+"', satuan = '"+cmbsat.getSelectedItem()+"' WHERE id_produk = '"+txtid.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diubah", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tampil_table();
            kosong();
        }
        } catch (Exception e) {
            System.out.println("gagal diubah "+e.getMessage());
            JOptionPane.showMessageDialog(this, "Gagal diubah "+e.getMessage());
        }
        kosong();
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnkosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkosongActionPerformed
        kosong();
        txtjumlah.setEnabled(true);
    }//GEN-LAST:event_btnkosongActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            String sql = "INSERT INTO produk (id_produk, nama_produk, harga_produk, jumlah_produk, satuan) VALUES ('"+txtid.getText()+"', '"+txtnama.getText()+"', '"+txtharga.getText()+"','"+txtjumlah.getText()+"', '"+cmbsat.getSelectedItem()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Berhasil Menambahkan Produk Baru", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan"+ e.getMessage());
        }
        tampil_table();
        kosong();
    }//GEN-LAST:event_btntambahActionPerformed

    private void tabelprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelprodukMouseClicked
        int baris = tabelproduk.rowAtPoint(evt.getPoint());
        String id = tabelproduk.getValueAt(baris, 0).toString();
        txtid.setText(id);
        String nama =  tabelproduk.getValueAt(baris, 1).toString();
        txtnama.setText(nama);
        String harga = tabelproduk.getValueAt(baris, 2).toString();
        txtharga.setText(harga);
        String jumlah = tabelproduk.getValueAt(baris, 3).toString();
        txtjumlah.setText(jumlah);
        String satuan = tabelproduk.getValueAt(baris, 4).toString();
        cmbsat.setSelectedItem(satuan);
        txtjumlah.setEnabled(false);
        
    }//GEN-LAST:event_tabelprodukMouseClicked

    private void cmbsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsatActionPerformed

    }//GEN-LAST:event_cmbsatActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed

    }//GEN-LAST:event_txthargaActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased

    }//GEN-LAST:event_txtcariKeyReleased

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        cari();
    }//GEN-LAST:event_txtcariActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
        String sql ="DELETE FROM produk WHERE id_produk='"+txtid.getText()+"'";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_table();
        kosong();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txthargaKeyTyped

    private void txtjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtjumlahKeyTyped

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtidActionPerformed

    private void btntambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseEntered
        // TODO add your handling code here:
        btntambah.setBackground(new Color(185,147,54));
        btntambah.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btntambahMouseEntered

    private void btntambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseExited
        // TODO add your handling code here:
        btntambah.setBackground(new Color(254,211,107));
        btntambah.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntambahMouseExited

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
        // TODO add your handling code here:
        btnedit.setBackground(new Color(225,225,225));
        btnedit.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btneditMouseExited

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
        // TODO add your handling code here:
        btnedit.setBackground(new Color(174,176,168));
        btnedit.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btneditMouseEntered

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered

        btnhapus.setBackground(new Color(174,176,168));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
        btnhapus.setBackground(new Color(225,225,225));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(174,176,168));
        jButton2.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(225,225,225));
        jButton2.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton2MouseExited

    private void btnkosongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkosongMouseEntered
        btnkosong.setBackground(new Color(174,176,168));
        btnkosong.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkosongMouseEntered

    private void btnkosongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkosongMouseExited
        btnkosong.setBackground(new Color(225,225,225));
        btnkosong.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkosongMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stokproduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkosong;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmbsat;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelproduk;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
