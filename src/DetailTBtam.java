
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

public class DetailTBtam extends javax.swing.JFrame {

    public DetailTBtam() {
        initComponents();
        setLocationRelativeTo(this);
        tabeldetailbeli();
        cmbsatuan.setSelectedItem(null);
        warnatabel();
    }
    
    public void tabeldetailbeli(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID Beli");
        model.addColumn("ID Supplier");
        model.addColumn("ID Bahan");
        model.addColumn("Nama Bahan");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Subtotal");
        model.addColumn("Bayar");
        model.addColumn("Kembali");
        
        try {
            String sql = "SELECT * FROM detail_transbeli WHERE id_transbeli = '"+txtidbeli.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5),res.getString(6),res.getString(7),
                        res.getString(8),res.getString(9),res.getString(10)
                        });
        }
            tabeldetailbeli.setModel(model);
        } catch (Exception e) {
            System.out.println("gagal tampil "+ e.getMessage());
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeldetailbeli.getTableHeader().setDefaultRenderer(headRender);
        tabeldetailbeli.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldetailbeli = new javax.swing.JTable();
        btnkemb = new javax.swing.JButton();
        txtkemb = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        cmbsatuan = new javax.swing.JComboBox<>();
        txtidbahan = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        txtidsup = new javax.swing.JTextField();
        txtgrndtot = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        btntmbjml = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        txtnamaprdk = new javax.swing.JTextField();
        txtidbeli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detail Transaksi Pembelian");
        setMaximumSize(new java.awt.Dimension(1152, 654));
        setMinimumSize(new java.awt.Dimension(1152, 654));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Detail Transaksi Beli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabeldetailbeli.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        tabeldetailbeli.setForeground(new java.awt.Color(59, 61, 73));
        tabeldetailbeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Beli", "ID Supplier", "ID Bahan", "Nama Bahan", "Harga", "Jumlah", "Satuan", "Subtotal", "Bayar", "Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeldetailbeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeldetailbeli.setGridColor(new java.awt.Color(0, 0, 0));
        tabeldetailbeli.setRowHeight(26);
        tabeldetailbeli.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeldetailbeli.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeldetailbeli.setShowHorizontalLines(false);
        tabeldetailbeli.setShowVerticalLines(false);
        tabeldetailbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldetailbeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldetailbeli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 660, 440));

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
        getContentPane().add(btnkemb, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, 200, 50));

        txtkemb.setEditable(false);
        txtkemb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtkemb.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kembalian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtkemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembActionPerformed(evt);
            }
        });
        getContentPane().add(txtkemb, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 200, 60));

        txtharga.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtharga.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Harga Bahan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
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
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 350, 60));

        cmbsatuan.setBackground(new java.awt.Color(254, 211, 107));
        cmbsatuan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbsatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "ikat", "Pack", "Bungkus" }));
        cmbsatuan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Satuan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbsatuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbsatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsatuanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 190, 70));

        txtidbahan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidbahan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Bahan"));
        txtidbahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbahanActionPerformed(evt);
            }
        });
        getContentPane().add(txtidbahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 60));

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtsubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Subtotal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 350, 60));

        txtidsup.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidsup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidsupActionPerformed(evt);
            }
        });
        getContentPane().add(txtidsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 60));

        txtgrndtot.setEditable(false);
        txtgrndtot.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtgrndtot.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Grandtotal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtgrndtot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrndtotActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrndtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 210, 60));

        txtbayar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtbayar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Bayar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbayarKeyTyped(evt);
            }
        });
        getContentPane().add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 230, 60));

        btntmbjml.setBackground(new java.awt.Color(254, 211, 107));
        btntmbjml.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btntmbjml.setForeground(new java.awt.Color(59, 61, 73));
        btntmbjml.setText("Tambah");
        btntmbjml.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btntmbjml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntmbjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntmbjmlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntmbjmlMouseExited(evt);
            }
        });
        btntmbjml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbjmlActionPerformed(evt);
            }
        });
        getContentPane().add(btntmbjml, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 350, 50));

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
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 450, 50));

        txtjumlah.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtjumlah.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Jumlah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });
        txtjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahKeyTyped(evt);
            }
        });
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 60));

        txtnamaprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnamaprdk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama Bahan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnamaprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 350, 60));

        txtidbeli.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidbeli.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Beli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbeliActionPerformed(evt);
            }
        });
        getContentPane().add(txtidbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 60));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Catat bahan baku yang dibeli disini!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembActionPerformed
        dispose();
        new TBadmintam().setVisible(true);
    }//GEN-LAST:event_btnkembActionPerformed

    private void cmbsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsatuanActionPerformed
        
    }//GEN-LAST:event_cmbsatuanActionPerformed

    private void btntmbjmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbjmlActionPerformed
        try {
            String sql  = "INSERT INTO `detail_transbeli`(`id_transbeli`, `id_supplier`, `id_bahan`, `nama_bahan`, `harga`, `jumlah`, `satuan`, `subtotal`) VALUES ('"+txtidbeli.getText()+"','"+txtidsup.getText()+"','"+txtidbahan.getText()+"','"+txtnamaprdk.getText()+"','"+txtharga.getText()+"','"+txtjumlah.getText()+"','"+cmbsatuan.getSelectedItem()+"','"+txtsubtotal.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Telah Ditambahkan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tabeldetailbeli();
            txtjumlah.setText("");
            txtsubtotal.setText("");
        } catch (Exception e) {
            System.out.println("gagal ditambahkan"+e.getMessage());
        }
    }//GEN-LAST:event_btntmbjmlActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        try {
            int baris = tabeldetailbeli.getSelectedRow();
            int p = JOptionPane.showConfirmDialog(this, "Hitung ?","Pesan",JOptionPane.YES_OPTION );
            String sql  = "select sum(subtotal) from detail_transbeli where id_transbeli = '"+tabeldetailbeli.getValueAt(baris, p)+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            if(res.next()){
                String sum = res.getString("sum(subtotal)");
                txtgrndtot.setText(sum);
            }
            String sql2 = "update trans_beli set total = '"+txtgrndtot.getText()+"' where id_transbeli = '"+tabeldetailbeli.getValueAt(baris, p)+"'";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql2);
        } catch (Exception e) {
            System.out.println("gagal terhitung "+e.getMessage());
        }
        txtbayar.requestFocus();
    }//GEN-LAST:event_btnhitungActionPerformed

    private void txtgrndtotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrndtotActionPerformed
        
    }//GEN-LAST:event_txtgrndtotActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        try {
        int totalbayar =  Integer.parseInt(txtgrndtot.getText());
        int bayar = Integer.parseInt(txtbayar.getText());
        if(bayar < totalbayar){
            JOptionPane.showMessageDialog(rootPane, "Maaf, uang Anda tidak mencukupi","Pesan", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            txtbayar.setText("");
        }else{
            int kembali = bayar - totalbayar ;
            txtkemb.setText(String.valueOf(kembali));
            int i = kembali; 
        }
        }catch (Exception e){
            
        }
        try {
            String sql  = "UPDATE `detail_transbeli` SET `bayar`='"+txtbayar.getText()+"',`kembalian`='"+txtkemb.getText()+"' WHERE id_transbeli = '"+txtidbeli.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            tabeldetailbeli();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtidsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidsupActionPerformed
        try {
            Connection conn= config.koneksi.configDB();
            Statement stcost = (Statement) conn.createStatement();
            String sql = "select * from supplier where id_supplier = '"+txtidsup.getText()+"'";
            ResultSet rscost = stcost.executeQuery(sql);
            while(rscost.next()){
                txtidbahan.setText(rscost.getString(5));
            }
        } catch (Exception e) {
        }
        txtidbahan.requestFocus();
    }//GEN-LAST:event_txtidsupActionPerformed

    private void txtkembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembActionPerformed
    
    }//GEN-LAST:event_txtkembActionPerformed

    private void tabeldetailbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldetailbeliMouseClicked
        int baris = tabeldetailbeli.rowAtPoint(evt.getPoint());
        String idtb = tabeldetailbeli.getValueAt(baris, 0).toString();
        txtidbeli.setText(idtb);
        String idsup =  tabeldetailbeli.getValueAt(baris, 1).toString();
        txtidsup.setText(idsup);
    }//GEN-LAST:event_tabeldetailbeliMouseClicked

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        double jumlah = Integer.parseInt(txtjumlah.getText());
        double harga =  Integer.parseInt(txtharga.getText());
        double hasil = jumlah * harga;
        txtsubtotal.setText(String.valueOf(hasil));
        
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtidbahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbahanActionPerformed
        try {
            Connection conn= config.koneksi.configDB();
            Statement stcost = (Statement) conn.createStatement();
            String sql = "select * from bahan_baku where id_bahan = '"+txtidbahan.getText()+"'";
            ResultSet rscost = stcost.executeQuery(sql);
            while(rscost.next()){
                txtnamaprdk.setText(rscost.getString(2));
                txtharga.setText(rscost.getString(3));
                cmbsatuan.setSelectedItem(rscost.getString(5));
            }
        } catch (Exception e) {
        }
        txtjumlah.requestFocus();
    }//GEN-LAST:event_txtidbahanActionPerformed

    private void txtidbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbeliActionPerformed
        
    }//GEN-LAST:event_txtidbeliActionPerformed

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
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtjumlahKeyTyped

    private void txtbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtbayarKeyTyped

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed

    }//GEN-LAST:event_txthargaActionPerformed

    private void btntmbjmlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbjmlMouseEntered
        btntmbjml.setBackground(new Color(185,147,54));
        btntmbjml.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btntmbjmlMouseEntered

    private void btntmbjmlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbjmlMouseExited
        btntmbjml.setBackground(new Color(254,211,107));
        btntmbjml.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntmbjmlMouseExited

    private void btnhitungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseEntered
        btnhitung.setBackground(new Color(185,147,54));
        btnhitung.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnhitungMouseEntered

    private void btnhitungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseExited
        btnhitung.setBackground(new Color(254,211,107));
        btnhitung.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhitungMouseExited

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
            java.util.logging.Logger.getLogger(DetailTJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailTJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailTJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailTJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailTBtam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkemb;
    private javax.swing.JButton btntmbjml;
    private javax.swing.JComboBox<String> cmbsatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldetailbeli;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtgrndtot;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidbahan;
    public javax.swing.JTextField txtidbeli;
    public javax.swing.JTextField txtidsup;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkemb;
    private javax.swing.JTextField txtnamaprdk;
    private javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables
}
