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

/**
 *
 * @author UMUT
 */
public class userPlaylist extends javax.swing.JFrame implements TableModelListener {

    static String kullanıcıadi;
    static userPanel isim = new userPanel();

    /**
     * Creates new form userPlaylist
     */
    public userPlaylist() {
        kullanıcıadi = isim.getKullanıcıAdi();
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
            if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıAdi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıAdi())) {
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
                if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıAdi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıAdi())) {
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
                if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıAdi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıAdi())) {
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
            if (sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıAdi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıAdi())) {
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
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Silme = new javax.swing.JButton();
        Jazz = new javax.swing.JRadioButton();
        Klasik = new javax.swing.JRadioButton();
        Pop = new javax.swing.JRadioButton();
        goruntule = new javax.swing.JButton();
        Hepsi = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        tüm = new javax.swing.JMenu();
        playlist = new javax.swing.JMenu();
        others = new javax.swing.JMenu();
        top10 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 525));
        setPreferredSize(new java.awt.Dimension(800, 525));
        setSize(new java.awt.Dimension(800, 525));

        Silme.setText("Şarkıyı sil");
        Silme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SilmeMouseClicked(evt);
            }
        });
        Silme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilmeActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jazz);
        Jazz.setText("Jazz");

        buttonGroup1.add(Klasik);
        Klasik.setText("Klasik");

        buttonGroup1.add(Pop);
        Pop.setText("Pop");

        goruntule.setText("görüntüle");
        goruntule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goruntuleMouseClicked(evt);
            }
        });

        buttonGroup1.add(Hepsi);
        Hepsi.setText("Hepsi");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Albüm ID", "Albüm Adı", "Şarkıcı Adı", "Şarkı Adı", "Şarkı Türü","Çıkış Tarihi","Dinlenme Sayısı"
            }
        ));
        jScrollPane2.setViewportView(table);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<---");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hepsi)
                            .addComponent(Jazz)
                            .addComponent(Klasik)
                            .addComponent(Pop)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goruntule, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(Silme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Hepsi)
                .addGap(11, 11, 11)
                .addComponent(Jazz)
                .addGap(18, 18, 18)
                .addComponent(Klasik)
                .addGap(18, 18, 18)
                .addComponent(Pop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goruntule, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Silme, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SilmeActionPerformed

    private void playlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistMouseClicked

    }//GEN-LAST:event_playlistMouseClicked

    private void goruntuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goruntuleMouseClicked

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
    }//GEN-LAST:event_goruntuleMouseClicked

    private void SilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SilmeMouseClicked
        ArrayList<PlaylistArama> sonuc = playList();
        PreparedStatement ps = null;
           
        try {
            
            
           for(int i=0;i<sonuc.size();i++)
           {   
               if(sonuc.get(i).getPlaylistSahibi() == null ? isim.getKullanıcıAdi() == null : sonuc.get(i).getPlaylistSahibi().equals(isim.getKullanıcıAdi())){ 
            //    System.out.println(value);
            int row = table.getSelectedRow();
            String value = (table.getModel().getValueAt(row, 0).toString());
            String Query = "DELETE  FROM playlist WHERE playlistid=" +value;
            ps = connection.connect().prepareStatement(Query);  
            ps.executeUpdate();
            if (ps.executeUpdate() > 1) {
                JOptionPane.showMessageDialog(null, "ALBUM SILINDI");
            }    
            }
            }


            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            if (Hepsi.isSelected()) {
                showPlaylists();
            } else if (Jazz.isSelected()) {
                showJazzlists();
            } else if (Klasik.isSelected()) {
                showKlasiklists();
            } else if (Pop.isSelected()) {
                showPoplists();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                ps.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_SilmeMouseClicked

    private void tümMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tümMouseClicked
        new userMainPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tümMouseClicked

    private void othersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersMouseClicked
         new userOthers().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_othersMouseClicked

    private void top10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10MouseClicked
         new userTop10().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_top10MouseClicked

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
            java.util.logging.Logger.getLogger(userPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userPlaylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Hepsi;
    private javax.swing.JRadioButton Jazz;
    private javax.swing.JRadioButton Klasik;
    private javax.swing.JRadioButton Pop;
    private javax.swing.JButton Silme;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton goruntule;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
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
