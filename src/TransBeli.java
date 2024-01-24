
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
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

public class TransBeli extends javax.swing.JFrame {
public DetailTB f71 = null;

    public TransBeli() {
        initComponents();
        setLocationRelativeTo(this);
        tampil_tabel();
        warnatabel();   
    }
    public void tampil_tabel(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Tanggal");
        model.addColumn("ID Beli");
        model.addColumn("ID Supplier");
        model.addColumn("Nama Supplier");
        model.addColumn("No Hp");
        model.addColumn("Total");
        
        try {
            String sql = "SELECT * FROM trans_beli";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),
                        res.getString(4),res.getString(5),
                        res.getString(6)
                        });
        }
            tabeltransbeli.setModel(model);
        } catch (Exception e) {
            System.out.println("gagal tampil "+ e.getMessage());
        }
    }
    
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeltransbeli.getTableHeader().setDefaultRenderer(headRender);
        tabeltransbeli.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidbeli = new javax.swing.JTextField();
        btnhapus = new javax.swing.JButton();
        pilihtgl = new com.toedter.calendar.JDateChooser();
        btntambah = new javax.swing.JButton();
        btntmbhprdk = new javax.swing.JButton();
        btnkembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltransbeli = new javax.swing.JTable();
        btncetak = new javax.swing.JButton();
        cmbidsup = new javax.swing.JComboBox<>();
        txtnohp = new javax.swing.JTextField();
        txtnamasup = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaksi Pembelian");
        setMaximumSize(new java.awt.Dimension(1152, 654));
        setMinimumSize(new java.awt.Dimension(1152, 654));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtidbeli.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtidbeli.setText("TB00");
        txtidbeli.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Transaksi Beli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtidbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidbeliKeyTyped(evt);
            }
        });
        getContentPane().add(txtidbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 350, 60));

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
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 180, 50));

        pilihtgl.setBackground(new java.awt.Color(255, 246, 223));
        pilihtgl.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tanggal"));
        pilihtgl.setDateFormatString("yyyy-M-dd");
        pilihtgl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        getContentPane().add(pilihtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 350, 70));

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
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, 50));

        btntmbhprdk.setBackground(new java.awt.Color(255, 246, 223));
        btntmbhprdk.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btntmbhprdk.setForeground(new java.awt.Color(59, 61, 73));
        btntmbhprdk.setText("Tambah Bahan");
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
        getContentPane().add(btntmbhprdk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 350, 50));

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
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 180, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Transaksi Beli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabeltransbeli.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabeltransbeli.setForeground(new java.awt.Color(59, 61, 73));
        tabeltransbeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "ID Beli", "ID Supplier", "Nama", "No Hp", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeltransbeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeltransbeli.setGridColor(new java.awt.Color(0, 0, 0));
        tabeltransbeli.setRowHeight(26);
        tabeltransbeli.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeltransbeli.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeltransbeli.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabeltransbeli.setShowHorizontalLines(false);
        tabeltransbeli.setShowVerticalLines(false);
        tabeltransbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransbeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltransbeli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 680, 580));

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
        getContentPane().add(btncetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 160, 50));

        cmbidsup.setBackground(new java.awt.Color(254, 211, 107));
        cmbidsup.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmbidsup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUP01", "SUP02", "SUP03", "SUP04", "SUP05", "SUP06", "UMUM" }));
        cmbidsup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        cmbidsup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbidsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbidsupActionPerformed(evt);
            }
        });
        getContentPane().add(cmbidsup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 350, 60));

        txtnohp.setEditable(false);
        txtnohp.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnohp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "No Hp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpActionPerformed(evt);
            }
        });
        getContentPane().add(txtnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 350, 60));

        txtnamasup.setEditable(false);
        txtnamasup.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtnamasup.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtnamasup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamasupActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamasup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 350, 60));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Catat pembelian bahan bakumu disini!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(pilihtgl.getDate()));
        try {
            String sql  = "insert into trans_beli (tgl_beli, id_transbeli, id_supplier, nama_supplier, no_telp) values ('"
                    +tanggal+"','"+txtidbeli.getText()+"','"+cmbidsup.getSelectedItem()+"','"+txtnamasup.getText()
                    +"','"+txtnohp.getText()+"')";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Telah Ditambahkan", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
            tampil_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        dispose();
        new Menuadmin().setVisible(true);
    }//GEN-LAST:event_btnkembaliActionPerformed

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        try {
            File namafile = new File("src/cetak/transaksi_beli.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.configDB());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (SQLException ex) {
        Logger.getLogger(TransBeli.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btncetakActionPerformed

    private void tabeltransbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransbeliMouseClicked
        int baris = tabeltransbeli.rowAtPoint(evt.getPoint());
        String idtb = tabeltransbeli.getValueAt(baris, 1).toString();
        txtidbeli.setText(idtb);
        
    }//GEN-LAST:event_tabeltransbeliMouseClicked

    private void btntmbhprdkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhprdkActionPerformed
        DetailTB f71 = new DetailTB();
        int baris = tabeltransbeli.getSelectedRow();
        TableModel tm = tabeltransbeli.getModel();

        String idtb = tm.getValueAt(baris, 1).toString();
        String idsup = tm.getValueAt(baris, 2).toString();
       
        f71.txtidbeli.setText(idtb);
        f71.txtidsup.setText(idsup);

        f71.setVisible(true);
        dispose();
        f71.txtidsup.requestFocus();
    }//GEN-LAST:event_btntmbhprdkActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            String sql ="DELETE FROM trans_beli WHERE id_transbeli='"+txtidbeli.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Data Telah Dihapus", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_tabel();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void cmbidsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbidsupActionPerformed
        try {
            Connection conn= config.koneksi.configDB();
            Statement stcost = (Statement) conn.createStatement();
            String sql = "select * from supplier where id_supplier = '"+cmbidsup.getSelectedItem()+"'";
            ResultSet rscost = stcost.executeQuery(sql);
            while(rscost.next()){
                txtnamasup.setText(rscost.getString(2));
                txtnohp.setText(rscost.getString(4));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbidsupActionPerformed

    private void txtnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpActionPerformed

    }//GEN-LAST:event_txtnohpActionPerformed

    private void txtnamasupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamasupActionPerformed

    }//GEN-LAST:event_txtnamasupActionPerformed

    private void txtidbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidbeliKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') 
                || (karakter == KeyEvent.VK_BACK_SPACE) 
                || (karakter == KeyEvent.VK_DELETE)))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtidbeliKeyTyped

    private void btntambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseEntered
        btntambah.setBackground(new Color(185,147,54));
        btntambah.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btntambahMouseEntered

    private void btntambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseExited
        btntambah.setBackground(new Color(254,211,107));
        btntambah.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntambahMouseExited

    private void btnhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseEntered
        btnhapus.setBackground(new Color(174,176,168));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseEntered

    private void btnhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseExited
        btnhapus.setBackground(new Color(225,225,225));
        btnhapus.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnhapusMouseExited

    private void btntmbhprdkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbhprdkMouseEntered
        btntmbhprdk.setBackground(new Color(174,176,168));
        btntmbhprdk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntmbhprdkMouseEntered

    private void btntmbhprdkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntmbhprdkMouseExited
        btntmbhprdk.setBackground(new Color(225,225,225));
        btntmbhprdk.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btntmbhprdkMouseExited

    private void btncetakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseEntered
        btncetak.setBackground(new Color(174,176,168));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseEntered

    private void btncetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncetakMouseExited
        btncetak.setBackground(new Color(225,225,225));
        btncetak.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btncetakMouseExited

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
                new TransBeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntmbhprdk;
    public javax.swing.JComboBox<String> cmbidsup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser pilihtgl;
    private javax.swing.JTable tabeltransbeli;
    private javax.swing.JTextField txtidbeli;
    private javax.swing.JTextField txtnamasup;
    private javax.swing.JTextField txtnohp;
    // End of variables declaration//GEN-END:variables
}
