/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songsfile;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static songsfile.userMainPage.isim;
import static songsfile.userPlaylist.isim;

/**
 *
 * @author UMUT
 */
public class userOthersSec extends javax.swing.JFrame implements TableModelListener {

    static userOthers isim = new userOthers();
    static userPanel isim2 = new userPanel();

    /**
     * Creates new form userOthersSec
     */
    public userOthersSec() {

        initComponents();
    }

    public ArrayList<PlaylistArama> playList() {
        ArrayList<PlaylistArama> playList = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.connect().createStatement();
            String searchQuery = "SELECT * FROM 'playlist'";
            rs = st.executeQuery(searchQuery);
            PlaylistArama arama;
            while (rs.next()) {
                arama = new PlaylistArama(
                        rs.getInt("playlistid"),
                        rs.getString("playlistsahibi"),
                        rs.getString("playlistalbumadi"),
                        rs.getString("playlistsarkici"),
                        rs.getString("playlistadi"),
                        rs.getString("playlistturu"),
                        rs.getString("playlistçıkıs"),
                        rs.getInt("playlistdinleme")
                );
                playList.add(arama);
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

        return playList;
    }

    private void showPlaylists() {

        ArrayList<PlaylistArama> sonuc = playList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < sonuc.size(); i++) {
            if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıadi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıadi())) {
                row[0] = sonuc.get(i).getPlaylistId();
                row[1] = sonuc.get(i).getPlaylistAlbumAdi();
                row[2] = sonuc.get(i).getPlaylistSarkici();
                row[3] = sonuc.get(i).getPlaylistAdi();
                row[4] = sonuc.get(i).getPlaylistTuru();
                row[5] = sonuc.get(i).getPlaylistCıkıs();
                row[6] = sonuc.get(i).getPlaylistdinleme();
                model.addRow(row);

            }

        }
    }

    private void showJazzlists() {

        ArrayList<PlaylistArama> sonuc = playList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if ("Jazz".equals(sonuc.get(i).getPlaylistTuru())) {
                if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıadi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıadi())) {
                    row[0] = sonuc.get(i).getPlaylistId();
                    row[1] = sonuc.get(i).getPlaylistAlbumAdi();
                    row[2] = sonuc.get(i).getPlaylistSarkici();
                    row[3] = sonuc.get(i).getPlaylistAdi();
                    row[4] = sonuc.get(i).getPlaylistTuru();
                    row[5] = sonuc.get(i).getPlaylistCıkıs();
                    row[6] = sonuc.get(i).getPlaylistdinleme();
                    model.addRow(row);
                }
            }

        }
    }

    private void showPoplists() {

        ArrayList<PlaylistArama> sonuc = playList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if ("Pop".equals(sonuc.get(i).getPlaylistTuru())) {
                if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıadi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıadi())) {
                    row[0] = sonuc.get(i).getPlaylistId();
                    row[1] = sonuc.get(i).getPlaylistAlbumAdi();
                    row[2] = sonuc.get(i).getPlaylistSarkici();
                    row[3] = sonuc.get(i).getPlaylistAdi();
                    row[4] = sonuc.get(i).getPlaylistTuru();
                    row[5] = sonuc.get(i).getPlaylistCıkıs();
                    row[6] = sonuc.get(i).getPlaylistdinleme();
                    model.addRow(row);
                }
            }

        }
    }

    private void showKlasiklists() {

        ArrayList<PlaylistArama> sonuc = playList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < sonuc.size(); i++) {
            if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıadi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıadi())) {
                if ("Klasik".equals(sonuc.get(i).getPlaylistTuru())) {

                    row[0] = sonuc.get(i).getPlaylistId();
                    row[1] = sonuc.get(i).getPlaylistAlbumAdi();
                    row[2] = sonuc.get(i).getPlaylistSarkici();
                    row[3] = sonuc.get(i).getPlaylistAdi();
                    row[4] = sonuc.get(i).getPlaylistTuru();
                    row[5] = sonuc.get(i).getPlaylistCıkıs();
                    row[6] = sonuc.get(i).getPlaylistdinleme();
                    model.addRow(row);
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
        ekle = new javax.swing.JButton();
        othersbutton = new javax.swing.JButton();
        Hepsi = new javax.swing.JRadioButton();
        Jazz = new javax.swing.JRadioButton();
        Klasik = new javax.swing.JRadioButton();
        Pop = new javax.swing.JRadioButton();
        görüntüle = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
                "Albüm ID", "Albüm Adı", "Şarkıcı", "Şarkı","Çıkış Tarihi", "Tür","Dinlenme Sayısı"
            }
        ));
        jScrollPane1.setViewportView(table);

        ekle.setText("Çalma Listene ekle");
        ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekleMouseClicked(evt);
            }
        });

        othersbutton.setText("Kullanıcıları Görüntüle");
        othersbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                othersbuttonMouseClicked(evt);
            }
        });
        othersbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Hepsi);
        Hepsi.setText("hepsi");
        Hepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HepsiActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jazz);
        Jazz.setText("Jazz");
        Jazz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JazzActionPerformed(evt);
            }
        });

        buttonGroup1.add(Klasik);
        Klasik.setText("Klasik");
        Klasik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlasikActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pop);
        Pop.setText("Pop");

        görüntüle.setText("görüntüle");
        görüntüle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                görüntüleMouseClicked(evt);
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

        top10.setText("Top 10");
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(othersbutton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(görüntüle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jazz)
                                    .addComponent(Hepsi)
                                    .addComponent(Klasik)
                                    .addComponent(Pop))
                                .addGap(106, 106, 106))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Hepsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jazz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Klasik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pop)
                .addGap(26, 26, 26)
                .addComponent(görüntüle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(othersbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekleMouseClicked
        PreparedStatement ps = null;
        try {
            String Query = "INSERT INTO 'playlist'('playlistsahibi','playlistalbumadi','playlistsarkici','playlistadi','playlistturu','playlistçıkıs','playlistdinleme')VALUES(?,?,?,?,?,?,?)";
            ps = connection.connect().prepareStatement(Query);
            int i = table.getSelectedRow();
            TableModel model = table.getModel();
            ps.setString(1, isim2.getKullanıcıAdi());
            ps.setString(2, model.getValueAt(i, 1).toString());
            ps.setString(3, model.getValueAt(i, 2).toString());
            ps.setString(4, model.getValueAt(i, 3).toString());
            ps.setString(5, model.getValueAt(i, 4).toString());
            ps.setString(6, model.getValueAt(i, 5).toString());
            ps.setString(7, model.getValueAt(i, 6).toString());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "ALBUM EKLENDİ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ps.close();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_ekleMouseClicked

    private void othersbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersbuttonMouseClicked
        new userOthers().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_othersbuttonMouseClicked

    private void othersbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othersbuttonActionPerformed

    private void KlasikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlasikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KlasikActionPerformed

    private void HepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HepsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HepsiActionPerformed

    private void JazzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JazzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JazzActionPerformed

    private void görüntüleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_görüntüleMouseClicked
        if (Hepsi.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showPlaylists();

        } else if (Jazz.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showJazzlists();
        } else if (Klasik.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showKlasiklists();
        } else if (Pop.isSelected()) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            showPoplists();
        }
    }//GEN-LAST:event_görüntüleMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new userPanel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(userOthers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userOthers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userOthers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userOthers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userOthersSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Hepsi;
    private javax.swing.JRadioButton Jazz;
    private javax.swing.JRadioButton Klasik;
    private javax.swing.JRadioButton Pop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton ekle;
    private javax.swing.JButton görüntüle;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu others;
    private javax.swing.JButton othersbutton;
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
