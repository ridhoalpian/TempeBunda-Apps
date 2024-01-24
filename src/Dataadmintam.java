
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Dataadmintam extends javax.swing.JFrame {

    public Dataadmintam() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Data Admin Tambahan");
        tampil_table();
        kosong();
        warnatabel();
    }
    private void cari(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            model.addColumn("No Hp");
            model.addColumn("Username");
            model.addColumn("Password");
            
        try{
            Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            String sql = "SELECT * FROM admintam WHERE nama LIKE '%"+txtcari.getText()
                    +"%' OR alamat LIKE '%"+txtcari.getText()+"%' OR no_hp LIKE '%"
                    +txtcari.getText()+"%' OR username LIKE '%"+txtcari.getText()
                    +"%' OR password LIKE '%"+txtcari.getText()+"%' OR id_admintam LIKE '%"+txtcari.getText()+"%'";

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
            tabeladmintam.setModel(model);
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }
    }
    public void kosong(){
        txtcari.setText("");
        txturnsm.setText("");
        txtpass.setText("");
        txtid.setText("");
        tabeladmintam.clearSelection();
        
    }

    public void tampil_table(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("No Hp");
        model.addColumn("Username");
        model.addColumn("Password");
        
        try {
            int no=1;
            String sql = "SELECT * FROM admintam";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),
                        res.getString(3),res.getString(4),res.getString(5),
                        res.getString(6)
                        });
        }
            tabeladmintam.setModel(model);
        } catch (Exception e) {
            System.err.println("gagal"+ e.getMessage());
        }
    }
    private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabeladmintam.getTableHeader().setDefaultRenderer(headRender);
        tabeladmintam.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        txturnsm = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnkosong = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeladmintam = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "ID ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 370, -1));

        txturnsm.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txturnsm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Nama Pengguna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        txturnsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturnsmActionPerformed(evt);
            }
        });
        getContentPane().add(txturnsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 370, -1));

        txtpass.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Kata Sandi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 370, -1));

        btnedit.setBackground(new java.awt.Color(254, 211, 107));
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
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 170, 45));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 180, 45));

        jButton6.setBackground(new java.awt.Color(255, 246, 223));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(59, 61, 73));
        jButton6.setText("Delete");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 180, 45));

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
        getContentPane().add(btnkosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 170, 45));

        txtcari.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtcari.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Cari", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)));
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
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 610, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Data Admin Tambahan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabeladmintam.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabeladmintam.setForeground(new java.awt.Color(59, 61, 73));
        tabeladmintam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "No Hp", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabeladmintam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabeladmintam.setGridColor(new java.awt.Color(0, 0, 0));
        tabeladmintam.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabeladmintam.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabeladmintam.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabeladmintam.setShowHorizontalLines(false);
        tabeladmintam.setShowVerticalLines(false);
        tabeladmintam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeladmintamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeladmintam);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 604, 500));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Edit atau Hapus");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 380, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Data Admin Tambahan disini");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 380, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setMinimumSize(new java.awt.Dimension(1152, 654));
        jLabel1.setPreferredSize(new java.awt.Dimension(1152, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txturnsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txturnsmActionPerformed
        
    }//GEN-LAST:event_txturnsmActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        
        try {
            int baris = tabeladmintam.getSelectedRow();
            int p = JOptionPane.showConfirmDialog(this, "Yakin ingin diubah ?", "Pesan", JOptionPane.YES_NO_OPTION);
            if(p==JOptionPane.YES_OPTION){
                String sql = "UPDATE admintam SET username = '"+txturnsm.getText()+"', password = '"
                        +txtpass.getText()+"' WHERE id_admintam = '"+txtid.getText()+"'";
                java.sql.Connection conn=(Connection)koneksi.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(rootPane, "Data Telah Diubah", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
                tampil_table();
                kosong();
            }
        } catch (Exception e) {
            System.out.println("gagal diubah "+e.getMessage());
            JOptionPane.showMessageDialog(this, "Gagal diubah "+e.getMessage());
        }
        kosong();

    }//GEN-LAST:event_btneditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Menuadmin f4 = new Menuadmin();
        f4.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        try {
        String sql ="DELETE FROM admintam WHERE username='"+txturnsm.getText()+"'";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(rootPane, "Data Telah Dihapus", "Pesan",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/tmp.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_table();
        kosong();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnkosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkosongActionPerformed
        
        kosong();
    }//GEN-LAST:event_btnkosongActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        
        cari();
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        
    }//GEN-LAST:event_txtcariKeyReleased

    private void tabeladmintamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeladmintamMouseClicked
        
        int baris = tabeladmintam.rowAtPoint(evt.getPoint());
        String id =  tabeladmintam.getValueAt(baris, 0).toString();
        txtid.setText(id);
        String username = tabeladmintam.getValueAt(baris, 4).toString();
        txturnsm.setText(username);
        String password =  tabeladmintam.getValueAt(baris, 5).toString();
        txtpass.setText(password);
    }//GEN-LAST:event_tabeladmintamMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        
    }//GEN-LAST:event_txtidActionPerformed

    private void btneditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseEntered
        
        btnedit.setBackground(new Color(185,147,54));
        btnedit.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btneditMouseEntered

    private void btneditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseExited
        
        btnedit.setBackground(new Color(254,211,107));
        btnedit.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btneditMouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        
        jButton6.setBackground(new Color(174,176,168));
        jButton6.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        
        jButton6.setBackground(new Color(225,225,225));
        jButton6.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_jButton6MouseExited

    private void btnkosongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkosongMouseEntered
        
        btnkosong.setBackground(new Color(174,176,168));
        btnkosong.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkosongMouseEntered

    private void btnkosongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkosongMouseExited
        
        btnkosong.setBackground(new Color(225,225,225));
        btnkosong.setForeground(new Color(59,61,73));
    }//GEN-LAST:event_btnkosongMouseExited

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
                new Dataadmintam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnkosong;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabeladmintam;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txturnsm;
    // End of variables declaration//GEN-END:variables
}
