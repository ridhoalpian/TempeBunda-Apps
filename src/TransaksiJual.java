
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TransaksiJual extends javax.swing.JFrame {
public DetailTJ f61 = null;

    public TransaksiJual() {
        initComponents();
        setLocationRelativeTo(this);
        tampil_tabel();
        warnatabel();   
    }
    private void cari(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Tanggal");
            model.addColumn("ID Jual");
            model.addColumn("ID Customers");
            model.addColumn("Total");
            
        try{
            Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            String sql = "SELECT * FROM trans_jual WHERE tgl_jual LIKE '%"+txtcari.getText()+"%' OR id_transjual LIKE '%"+txtcari.getText()+"%' OR id_customer LIKE '%"+txtcari.getText()+"%' OR total LIKE '%"+txtcari.getText()+"%'";

            ResultSet res=stm.executeQuery(sql);  
            while(res.next()){
                model.addRow(new Object[]{
                   res.getString(2),
                   res.getString(1),
                   res.getString(3),
                   res.getString(4)                   
               }); 
            }
            tabeltransjual.setModel(model);
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }
    }
    
    public void tampil_tabel(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Tanggal");
        model.addColumn("ID Jual");
        model.addColumn("ID Customers");
        model.addColumn("Total");
        
        try {
            String sql = "SELECT tgl_jual, id_transjual, id_customer, total FROM trans_jual";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4)
                        });
        }
            tabeltransjual.setModel(model);
        } catch (Exception e) {
            System.out.println("gagal tampil "+ e.getMessage());
        }
    }
    private void kosong(){
        cmbcus.setSelectedItem(null);
        txtnamacus.setText("");
        txtalmtcus.setText("");
    }
    public void tampilcost() {
        try {
            Connection conn=config.koneksi.configDB();
            Statement stcost = (Statement) conn.createStatement();
            String sql = "SELECT * FROM costumer ";
            ResultSet rscost = stcost.executeQuery(sql);
            
            while(rscost.next()){
                cmbcus.addItem(rscost.getString(1));
            }
            rscost.close();
            stcost.close();
        } catch (Exception e) {
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeltransjual.getTableHeader().setDefaultRenderer(headRender);
        tabeltransjual.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcari = new javax.swing.JTextField();
        txtidtrans = new javax.swing.JTextField();
        pilihtgl = new com.toedter.calendar.JDateChooser();
        cmbcus = new javax.swing.JComboBox<>();
        btntambah = new javax.swing.JButton();
        txtalmtcus = new javax.swing.JTextField();
        txtnamacus = new javax.swing.JTextField();
        btntmbhprdk = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransjual = new javax.swing.JTable();
        btncetak = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaksi Penjualan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 710, 60));

        txtidtrans.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidtrans.setText("TJ00");
        txtidtrans.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Transaksi Jual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtidtrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 350, 60));

        pilihtgl.setBackground(new java.awt.Color(255, 246, 223));
        pilihtgl.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tanggal"));
        pilihtgl.setDateFormatString("yyyy-M-dd");
        pilihtgl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        getContentPane().add(pilihtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 70));

        cmbcus.setBackground(new java.awt.Color(254, 211, 107));
        cmbcus.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbcus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UMUM" }));
        cmbcus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbcus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcusActionPerformed(evt);
            }
        });
        getContentPane().add(cmbcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 350, 60));

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
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 180, 50));

        txtalmtcus.setEditable(false);
        txtalmtcus.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtalmtcus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Alamat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtalmtcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 350, 60));

        txtnamacus.setEditable(false);
        txtnamacus.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnamacus.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtnamacus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 350, 60));

        btntmbhprdk.setBackground(new java.awt.Color(255, 246, 223));
        btntmbhprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btntmbhprdk.setForeground(new java.awt.Color(59, 61, 73));
        btntmbhprdk.setText("Tambah Produk");
        btntmbhprdk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btntmbhprdk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntmbhprdk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntmbhprdkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntmbhprdkMouseExited(evt);
            }
        });
        btntmbhprdk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhprdkActionPerformed(evt);
            }
        });
        getContentPane().add(btntmbhprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 350, 50));

        btnkembali.setBackground(new java.awt.Color(255, 246, 223));
        btnkembali.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnkembali.setForeground(new java.awt.Color(59, 61, 73));
        btnkembali.setText("Kembali");
        btnkembali.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        btnkembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkembaliMouseExited(evt);
            }
        });
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 350, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Transaksi Jual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tabeltransjual.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabeltransjual.setForeground(new java.awt.Color(59, 61, 73));
        tabeltransjual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "ID Jual", "ID Customers", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeltransjual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeltransjual.setGridColor(new java.awt.Color(0, 0, 0));
        tabeltransjual.setRowHeight(26);
        tabeltransjual.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeltransjual.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeltransjual.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabeltransjual.setShowHorizontalLines(false);
        tabeltransjual.setShowVerticalLines(false);
        tabeltransjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransjualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltransjual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 710, 520));

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
        getContentPane().add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 160, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Catat transaksi penjualan disini!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 330, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(pilihtgl.getDate()));
        try {
            String sql  = "insert into trans_jual (tgl_jual, id_transjual, id_customer) values ('"+tanggal+"','"+txtidtrans.getText()+"','"+cmbcus.getSelectedItem()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Telah Ditambahkan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tampil_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void cmbcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcusActionPerformed
        try {
            Connection conn= config.koneksi.configDB();
            Statement stcost = (Statement) conn.createStatement();
            String sql = "select * from costumer where id_costumer = '"+cmbcus.getSelectedItem()+"'";
            ResultSet rscost = stcost.executeQuery(sql);
            
            while(rscost.next()){
                txtnamacus.setText(rscost.getString(2));
                txtalmtcus.setText(rscost.getString(3));
            }
        } catch (Exception e) {
        }
    
    }//GEN-LAST:event_cmbcusActionPerformed

    private void btntmbhprdkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhprdkActionPerformed
        DetailTJ f61 = new DetailTJ();
        int baris = tabeltransjual.getSelectedRow();
        TableModel tm = tabeltransjual.getModel();
        
        String idtj = tm.getValueAt(baris, 1).toString();
        String idcs = tm.getValueAt(baris, 2).toString();
        
        f61.txtidtrans.setText(idtj);
        f61.txtidcus.setText(idcs);
        
        f61.setVisible(true);
        dispose();
    }//GEN-LAST:event_btntmbhprdkActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        dispose();
        new Menuadmin().setVisible(true);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try {
            File namafile = new File("src/cetak/transaksi_jual.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.configDB());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (SQLException ex) {
        Logger.getLogger(TransaksiJual.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btncetakActionPerformed

    private void tabeltransjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransjualMouseClicked
        int baris = tabeltransjual.rowAtPoint(evt.getPoint());
        String id = tabeltransjual.getValueAt(baris, 1).toString();
        txtidtrans.setText(id);
    }//GEN-LAST:event_tabeltransjualMouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        cari();
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased

    }//GEN-LAST:event_txtcariKeyReleased

    private void btntambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseEntered
        btntambah.setBackground(new Color(185,147,54));
        btntambah.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btntambahMouseEntered

    private void btntambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseExited
        btntambah.setBackground(new Color(254,211,107));
        btntambah.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntambahMouseExited

    private void btncetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseEntered
        btncetak.setBackground(new Color(174,176,168));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseEntered

    private void btncetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseExited
        btncetak.setBackground(new Color(225,225,225));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseExited

    private void btntmbhprdkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbhprdkMouseEntered
        btntmbhprdk.setBackground(new Color(174,176,168));
        btntmbhprdk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntmbhprdkMouseEntered

    private void btntmbhprdkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbhprdkMouseExited
        btntmbhprdk.setBackground(new Color(225,225,225));
        btntmbhprdk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntmbhprdkMouseExited

    private void btnkembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseEntered
        btnkembali.setBackground(new Color(174,176,168));
        btnkembali.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkembaliMouseEntered

    private void btnkembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseExited
        btnkembali.setBackground(new Color(225,225,225));
        btnkembali.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkembaliMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiJual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntmbhprdk;
    private javax.swing.JComboBox<String> cmbcus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser pilihtgl;
    private javax.swing.JTable tabeltransjual;
    private javax.swing.JTextField txtalmtcus;
    private javax.swing.JTextField txtcari;
    public javax.swing.JTextField txtidtrans;
    private javax.swing.JTextField txtnamacus;
    // End of variables declaration//GEN-END:variables
}
