
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class DetailTJ extends javax.swing.JFrame {

    public DetailTJ() {
        initComponents();
        setLocationRelativeTo(this);
        tabeldetailtrans();
        warnatabel();
        
    }
    
    public void tabeldetailtrans(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID Jual");
        model.addColumn("ID Customers");
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Subtotal");
        model.addColumn("Bayar");
        model.addColumn("Kembali");
        
        try {
            String sql = "SELECT * FROM detail_transjual WHERE id_transjual = '"+txtidtrans.getText()+"'";
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
            tabeldetail.setModel(model);
        } catch (Exception e) {
            System.out.println("gagal tampil "+ e.getMessage());
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeldetail.getTableHeader().setDefaultRenderer(headRender);
        tabeldetail.setRowHeight(30);
    }
    public void kosong(){
        txtbayar.setText("");
        txtgrndtot.setText("");
        txthrgprdk.setText("");
        cmbprdk.setSelectedItem(null);
        tabeldetail.clearSelection();
        cmbsatuan.setSelectedItem(null);
        txtjmlprdk.setText("");
        txtkemb.setText("");
        txtkey.setText("");
        txtqty.setText("");
        txtsubtotal.setText("");
        txttotal.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        cmbsatuan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldetail = new javax.swing.JTable();
        btnkemb = new javax.swing.JButton();
        txtkemb = new javax.swing.JTextField();
        txthrgprdk = new javax.swing.JTextField();
        cmbprdk = new javax.swing.JComboBox<>();
        txtjmlprdk = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtnamaprdk = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtidcus = new javax.swing.JTextField();
        txtidtrans = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        txtgrndtot = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        btnkemb1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btncetak = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detail Transaksi Penjualan");
        setMinimumSize(new java.awt.Dimension(1120, 630));
        setPreferredSize(new java.awt.Dimension(1152, 695));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtkey.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtkey.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Pilih ID Jual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeyActionPerformed(evt);
            }
        });
        getContentPane().add(txtkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 340, 60));

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
        getContentPane().add(cmbsatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 200, 70));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Detail Transaksi Jual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabeldetail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabeldetail.setForeground(new java.awt.Color(59, 61, 73));
        tabeldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Jual", "ID Customers", "ID Produk", "Nama Produk", "Harga", "Jumlah", "Satuan", "Subtotal", "Grandtotal", "Bayar", "Kembalian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeldetail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeldetail.setGridColor(new java.awt.Color(0, 0, 0));
        tabeldetail.setRowHeight(26);
        tabeldetail.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeldetail.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeldetail.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabeldetail.setShowHorizontalLines(false);
        tabeldetail.setShowVerticalLines(false);
        tabeldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldetail);
        if (tabeldetail.getColumnModel().getColumnCount() > 0) {
            tabeldetail.getColumnModel().getColumn(0).setResizable(false);
            tabeldetail.getColumnModel().getColumn(1).setResizable(false);
            tabeldetail.getColumnModel().getColumn(2).setResizable(false);
            tabeldetail.getColumnModel().getColumn(3).setResizable(false);
            tabeldetail.getColumnModel().getColumn(4).setResizable(false);
            tabeldetail.getColumnModel().getColumn(5).setResizable(false);
            tabeldetail.getColumnModel().getColumn(6).setResizable(false);
            tabeldetail.getColumnModel().getColumn(7).setResizable(false);
            tabeldetail.getColumnModel().getColumn(8).setResizable(false);
            tabeldetail.getColumnModel().getColumn(9).setResizable(false);
            tabeldetail.getColumnModel().getColumn(10).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 680, 410));

        btnkemb.setBackground(new java.awt.Color(254, 211, 107));
        btnkemb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnkemb.setForeground(new java.awt.Color(59, 61, 73));
        btnkemb.setText("Tambah");
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
        getContentPane().add(btnkemb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 350, 50));

        txtkemb.setEditable(false);
        txtkemb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtkemb.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kembalian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtkemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembActionPerformed(evt);
            }
        });
        getContentPane().add(txtkemb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 220, 60));

        txthrgprdk.setEditable(false);
        txthrgprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txthrgprdk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Harga Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txthrgprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 60));

        cmbprdk.setBackground(new java.awt.Color(254, 211, 107));
        cmbprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbprdk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TME15", "TME30", "TMA15", "TMA25", "TMA30", "TMA50", "TMA150" }));
        cmbprdk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kode Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbprdk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbprdk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprdkActionPerformed(evt);
            }
        });
        getContentPane().add(cmbprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 350, 60));

        txtjmlprdk.setEditable(false);
        txtjmlprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtjmlprdk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Jumlah Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtjmlprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 140, 60));

        txtqty.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtqty.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Jumlah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
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
        getContentPane().add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 60));

        txtnamaprdk.setEditable(false);
        txtnamaprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnamaprdk.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama Produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnamaprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 350, 60));

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txttotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 350, 60));

        txtidcus.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidcus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcusActionPerformed(evt);
            }
        });
        getContentPane().add(txtidcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, 60));

        txtidtrans.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidtrans.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Jual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtransActionPerformed(evt);
            }
        });
        getContentPane().add(txtidtrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, 60));

        txtsubtotal.setEditable(false);
        txtsubtotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtsubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Subtotal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 350, 60));

        txtgrndtot.setEditable(false);
        txtgrndtot.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtgrndtot.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Grandtotal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtgrndtot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrndtotActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrndtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 220, 60));

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
        getContentPane().add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 220, 60));

        btnkemb1.setBackground(new java.awt.Color(255, 246, 223));
        btnkemb1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnkemb1.setForeground(new java.awt.Color(59, 61, 73));
        btnkemb1.setText("Kembali");
        btnkemb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnkemb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkemb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkemb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkemb1MouseExited(evt);
            }
        });
        btnkemb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkemb1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnkemb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, 160, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Catat produk yang terjual disini!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, -1));

        btncetak.setBackground(new java.awt.Color(255, 246, 223));
        btncetak.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btncetak.setForeground(new java.awt.Color(59, 61, 73));
        btncetak.setText("Cetak");
        btncetak.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btncetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncetakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncetakMouseExited(evt);
            }
        });
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });
        getContentPane().add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 160, 50));

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
        getContentPane().add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 340, 50));

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
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 330, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgdataadmin+.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel2.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel2.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembActionPerformed
           try {
            String sql  = "insert into detail_transjual (id_transjual,id_customer,id_produk,nama_produk,harga,jumlah,satuan,subtotal)values('"+txtidtrans.getText()+"','"+txtidcus.getText()+"','"+cmbprdk.getSelectedItem()+"','"+txtnamaprdk.getText()+"','"+txthrgprdk.getText()+"','"+txtqty.getText()+"','"+cmbsatuan.getSelectedItem()+"','"+txtsubtotal.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Telah Ditambahkan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tabeldetailtrans();
            txtqty.setText("");
            txttotal.setText("");
            txtsubtotal.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnkembActionPerformed

    private void cmbprdkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprdkActionPerformed
           try {
            String sql = "select * from produk where id_produk = '"+cmbprdk.getSelectedItem()+"'";
            Connection con = config.koneksi.configDB();
            Statement statementcmbproduk = (Statement) con.createStatement();
            ResultSet resultcmbproduk = statementcmbproduk.executeQuery(sql);
            while (resultcmbproduk.next()){
                txtnamaprdk.setText(resultcmbproduk.getString(2));
                txthrgprdk.setText(resultcmbproduk.getString(3));
                txtjmlprdk.setText(resultcmbproduk.getString(4));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbprdkActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
            try{
            String NamaFile = ("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\JavaApplication48\\src\\cetak\\notapenjualan.jrxml");
            HashMap param = new HashMap();
            param.put("id_transjual",txtkey.getText());
            JasperReport JRpt = JasperCompileManager.compileReport(NamaFile);
            JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param, koneksi.configDB());
            JasperViewer.viewReport(JPrint, false);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btncetakActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
           try {
            int baris = tabeldetail.getSelectedRow();
            int p = JOptionPane.showConfirmDialog(this, "Hitung ?","Pesan",JOptionPane.YES_OPTION );
            String sql  = "select sum(subtotal) from detail_transjual where id_transjual = '"+tabeldetail.getValueAt(baris, p)+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            if(res.next()){
                String sum = res.getString("sum(subtotal)");
                txtgrndtot.setText(sum);
                txtbayar.requestFocus();
            }
            String sql2 = "update trans_jual set total = '"+txtgrndtot.getText()+"' where id_transjual = '"+tabeldetail.getValueAt(baris, p)+"'";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql2);
        } catch (Exception e) {
            System.out.println("gagal terhitung "+e.getMessage());
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        int qty = Integer.parseInt(txtqty.getText());
        int harga = Integer.parseInt(txthrgprdk.getText());
        int jumlah = Integer.parseInt(txtjmlprdk.getText());
        if(qty > jumlah){
            JOptionPane.showMessageDialog(rootPane, "Stok tidak mencukupi");
            txtqty.setText("");
        }else{
            double total = qty * harga;
            txttotal.setText(String.valueOf(total));
            txtsubtotal.setText(String.valueOf(total));
            txtsubtotal.requestFocus();
        }
        
    }//GEN-LAST:event_txtqtyActionPerformed

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
            txtkemb.requestFocus();
        }
        }catch (Exception e){
            
        }
        try {
            String sql  = "UPDATE `detail_transjual` SET `bayar`='"+txtbayar.getText()+"',`kembalian`='"+txtkemb.getText()+"' WHERE id_transjual = '"+txtidtrans.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            tabeldetailtrans();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtidtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtransActionPerformed
 
    }//GEN-LAST:event_txtidtransActionPerformed

    private void txtkembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembActionPerformed
        

    }//GEN-LAST:event_txtkembActionPerformed

    private void tabeldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldetailMouseClicked
        int baris = tabeldetail.rowAtPoint(evt.getPoint());
        String idprdk = tabeldetail.getValueAt(baris, 2).toString();
        cmbprdk.setSelectedItem(idprdk);
        String jml = tabeldetail.getValueAt(baris, 5).toString();
        txtqty.setText(jml);
    }//GEN-LAST:event_tabeldetailMouseClicked

    private void cmbsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsatuanActionPerformed

    }//GEN-LAST:event_cmbsatuanActionPerformed

    private void txtkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeyActionPerformed

    }//GEN-LAST:event_txtkeyActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
           try {
            String sql  = "insert into detail_transjual (id_transjual,id_customer,id_produk,nama_produk,harga,jumlah,satuan,subtotal)values('"+txtidtrans.getText()+"','"+txtidcus.getText()+"','"+cmbprdk.getSelectedItem()+"','"+txtnamaprdk.getText()+"','"+txthrgprdk.getText()+"','"+txtqty.getText()+"','"+cmbsatuan.getSelectedItem()+"','"+txtsubtotal.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "barang telah ditambahkan");
            tabeldetailtrans();
            txtqty.setText("");
            txttotal.setText("");
            txtsubtotal.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
           try {
            int baris = tabeldetail.getSelectedRow();
            String sql ="DELETE FROM detail_transjual WHERE id_produk='"+tabeldetail.getValueAt(baris, 2)+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tabeldetailtrans();
        kosong();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtqtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtqtyKeyTyped

    private void txtbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtbayarKeyTyped

    private void txtidcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcusActionPerformed

    }//GEN-LAST:event_txtidcusActionPerformed

    private void btnkemb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkemb1ActionPerformed
        dispose();
        new TransaksiJual().setVisible(true);
    }//GEN-LAST:event_btnkemb1ActionPerformed

    private void btnkemb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkemb1MouseEntered
        btnkemb1.setBackground(new Color(174,176,168));
        btnkemb1.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkemb1MouseEntered

    private void btnkemb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkemb1MouseExited
        btnkemb1.setBackground(new Color(225,225,225));
        btnkemb1.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkemb1MouseExited

    private void btncetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseEntered
        btncetak.setBackground(new Color(174,176,168));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseEntered

    private void btncetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseExited
        btncetak.setBackground(new Color(225,225,225));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseExited

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered
        btnhapus.setBackground(new Color(174,176,168));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
        btnhapus.setBackground(new Color(225,225,225));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseExited

    private void btnhitungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseEntered
        btnhitung.setBackground(new Color(185,147,54));
        btnhitung.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnhitungMouseEntered

    private void btnhitungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseExited
        btnhitung.setBackground(new Color(254,211,107));
        btnhitung.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhitungMouseExited

    private void btnkembMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembMouseEntered
        btnkemb.setBackground(new Color(185,147,54));
        btnkemb.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnkembMouseEntered

    private void btnkembMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembMouseExited
        btnkemb.setBackground(new Color(254,211,107));
        btnkemb.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkembMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailTJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkemb;
    private javax.swing.JButton btnkemb1;
    public javax.swing.JComboBox<String> cmbprdk;
    private javax.swing.JComboBox<String> cmbsatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldetail;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtgrndtot;
    private javax.swing.JTextField txthrgprdk;
    public javax.swing.JTextField txtidcus;
    public javax.swing.JTextField txtidtrans;
    private javax.swing.JTextField txtjmlprdk;
    private javax.swing.JTextField txtkemb;
    private javax.swing.JTextField txtkey;
    private javax.swing.JTextField txtnamaprdk;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
