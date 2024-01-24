
import config.koneksi;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class StokBahan extends javax.swing.JFrame {

    public StokBahan() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Stok Bahan Baku");
        tampil_table();
        warnatabel();
    }
    
        private void warnatabel(){
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setBackground(new Color(254,211,107));
        headRender.setForeground(new Color(255, 255, 255));
        headRender.setFont(new Font("Century Gothic", Font.BOLD, 18));
        tabelbahan.getTableHeader().setDefaultRenderer(headRender);
        tabelbahan.setRowHeight(30);
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
            String sql = "SELECT * FROM bahan_baku";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5)
                        });
        }
            tabelbahan.setModel(model);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbahan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 170, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 129), 3, true), "Tabel Stok Bahan Baku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        tabelbahan.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tabelbahan.setForeground(new java.awt.Color(59, 61, 73));
        tabelbahan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelbahan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelbahan.setGridColor(new java.awt.Color(0, 0, 0));
        tabelbahan.setSelectionBackground(new java.awt.Color(254, 242, 204));
        tabelbahan.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabelbahan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, 1090, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg panjang.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new PilihDB().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new StokBahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelbahan;
    // End of variables declaration//GEN-END:variables
}
