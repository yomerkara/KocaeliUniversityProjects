/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songsfile;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UMUT
 */
public class userTop10 extends javax.swing.JFrame implements TableModelListener {

    /**
     * Creates new form userTop10
     */
    public userTop10() {
        initComponents();
    }

    public ArrayList<Arama> albumList() {
        ArrayList<Arama> albumList = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.connect().createStatement();
            String searchQuery = "SELECT * FROM 'album' ORDER BY 'albumcount' DESC";
            rs = st.executeQuery(searchQuery);
            Arama arama;
            while (rs.next()) {
                arama = new Arama(
                        rs.getInt("albumid"),
                        rs.getString("albumName"),
                        rs.getString("albumAuthor"),
                        rs.getString("albumSong"),
                        rs.getString("albumType"),
                        rs.getString("albumDate"),
                        rs.getInt("albumcount")
                );
                albumList.add(arama);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                st.close();
            } catch (Exception e) {

            }
        }

        return albumList;
    }

    private void showAlbums() {
        int a = 0;
        ArrayList<Arama> sonuc = albumList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if (a < 10) {
                row[0] = sonuc.get(i).getAlbumid();
                row[1] = sonuc.get(i).getAlbumName();
                row[2] = sonuc.get(i).getAlbumAuthor();
                row[3] = sonuc.get(i).getAlbumSong();
                row[4] = sonuc.get(i).getAlbumDate();
                row[5] = sonuc.get(i).getAlbumType();
                row[6] = sonuc.get(i).getAlbumCount();
                model.addRow(row);
                a++;
            }

        }
    }

    private void showJazz() {
        int a = 0;
        ArrayList<Arama> sonuc = albumList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if ("Jazz".equals(sonuc.get(i).getAlbumType())) {
                if (a < 10) {
                    row[0] = sonuc.get(i).getAlbumid();
                    row[1] = sonuc.get(i).getAlbumName();
                    row[2] = sonuc.get(i).getAlbumAuthor();
                    row[3] = sonuc.get(i).getAlbumSong();
                    row[4] = sonuc.get(i).getAlbumDate();
                    row[5] = sonuc.get(i).getAlbumType();
                    row[6] = sonuc.get(i).getAlbumCount();
                    model.addRow(row);
                    a++;
                }
            }

        }
    }

    private void showPop() {
        int a = 0;
        ArrayList<Arama> sonuc = albumList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if ("Pop".equals(sonuc.get(i).getAlbumType())) {
                if (a < 10) {
                    row[0] = sonuc.get(i).getAlbumid();
                    row[1] = sonuc.get(i).getAlbumName();
                    row[2] = sonuc.get(i).getAlbumAuthor();
                    row[3] = sonuc.get(i).getAlbumSong();
                    row[4] = sonuc.get(i).getAlbumDate();
                    row[5] = sonuc.get(i).getAlbumType();
                    row[6] = sonuc.get(i).getAlbumCount();
                    model.addRow(row);
                    a++;
                }
            }

        }
    }

    private void showKlasik() {
        int a = 0;
        ArrayList<Arama> sonuc = albumList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if ("Klasik".equals(sonuc.get(i).getAlbumType())) {
                if (a < 10) {
                    row[0] = sonuc.get(i).getAlbumid();
                    row[1] = sonuc.get(i).getAlbumName();
                    row[2] = sonuc.get(i).getAlbumAuthor();
                    row[3] = sonuc.get(i).getAlbumSong();
                    row[4] = sonuc.get(i).getAlbumDate();
                    row[5] = sonuc.get(i).getAlbumType();
                    row[6] = sonuc.get(i).getAlbumCount();
                    model.addRow(row);
                    a++;
                }
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Jazz = new javax.swing.JRadioButton();
        Klasik = new javax.swing.JRadioButton();
        Pop = new javax.swing.JRadioButton();
        görüntüle = new javax.swing.JButton();
        hepsi = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        tüm = new javax.swing.JMenu();
        playlist = new javax.swing.JMenu();
        others = new javax.swing.JMenu();
        top10 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 525));
        setPreferredSize(new java.awt.Dimension(800, 525));
        setSize(new java.awt.Dimension(800, 525));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Albüm ID", "Albüm Adı", "Şarkıcı", "Şarkı", "Albüm Tarihi", "Albüm Türü", "Din. Sayısı"
            }
        ));
        jScrollPane1.setViewportView(table);

        buttonGroup1.add(Jazz);
        Jazz.setText("Jazz");

        buttonGroup1.add(Klasik);
        Klasik.setText("Klasik");

        buttonGroup1.add(Pop);
        Pop.setText("Pop");

        görüntüle.setText("Görüntüle");
        görüntüle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                görüntüleMouseClicked(evt);
            }
        });
        görüntüle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                görüntüleActionPerformed(evt);
            }
        });

        buttonGroup1.add(hepsi);
        hepsi.setText("Tüm Şarkılar");
        hepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepsiActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<---");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/indiryeni.png"))); // NOI18N

        tüm.setText("Tüm Şarkılar");
        tüm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tümMouseClicked(evt);
            }
        });
        jMenuBar1.add(tüm);

        playlist.setText("Çalma Listelerim");
        playlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlistMouseClicked(evt);
            }
        });
        jMenuBar1.add(playlist);

        others.setText("Diğer Kullanıcılar");
        others.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersMouseClicked(evt);
            }
        });
        jMenuBar1.add(others);

        top10.setText("Top10");
        top10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10MouseClicked(evt);
            }
        });
        jMenuBar1.add(top10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hepsi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jazz)
                            .addComponent(Klasik)
                            .addComponent(Pop))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(görüntüle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hepsi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jazz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Klasik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pop)
                        .addGap(18, 18, 18)
                        .addComponent(görüntüle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tümMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tümMouseClicked
        new userMainPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tümMouseClicked

    private void playlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistMouseClicked
        new userPlaylist().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playlistMouseClicked

    private void othersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersMouseClicked
        new userOthers().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_othersMouseClicked

    private void top10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10MouseClicked
        new userTop10().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_top10MouseClicked

    private void hepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepsiActionPerformed

    private void görüntüleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_görüntüleMouseClicked
        if (hepsi.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showAlbums();
        } else if (Jazz.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showJazz();
        } else if (Pop.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showPop();
        } else if (Klasik.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showKlasik();
        }
    }//GEN-LAST:event_görüntüleMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new userPanel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void görüntüleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_görüntüleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_görüntüleActionPerformed

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
            java.util.logging.Logger.getLogger(userTop10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userTop10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userTop10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userTop10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userTop10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Jazz;
    private javax.swing.JRadioButton Klasik;
    private javax.swing.JRadioButton Pop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton görüntüle;
    private javax.swing.JRadioButton hepsi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu others;
    private javax.swing.JMenu playlist;
    private javax.swing.JTable table;
    private javax.swing.JMenu top10;
    private javax.swing.JMenu tüm;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent tme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
