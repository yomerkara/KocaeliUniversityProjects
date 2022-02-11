/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songsfile;

/**
 *
 * @author UMUT
 */
public class PlaylistArama {

     private int PlaylistId;
    private String PlaylistSahibi;
    private String PlaylistAlbumAdi;
    private String PlaylistSarkici;
    private String PlaylistAdi;
    private String PlaylistTuru;
    private String PlaylistCıkıs;
    private int Playlistdinleme;

    public PlaylistArama(int PlaylistId,String PlaylistSahibi, String PlaylistAlbumAdi, String PlaylistSarkici, String PlaylistAdi, String PlaylistTuru, String PlaylistCıkıs, int Playlistdinleme) {
        this.PlaylistId=PlaylistId;
        this.PlaylistSahibi = PlaylistSahibi;
        this.PlaylistAlbumAdi = PlaylistAlbumAdi;
        this.PlaylistSarkici = PlaylistSarkici;
        this.PlaylistAdi = PlaylistAdi;
        this.PlaylistTuru = PlaylistTuru;
        this.PlaylistCıkıs = PlaylistCıkıs;
        this.Playlistdinleme = Playlistdinleme;
    }

    public int getPlaylistId() {
        return PlaylistId;
    }

   
    

    public String getPlaylistSahibi() {
        return PlaylistSahibi;
    }

    public String getPlaylistAlbumAdi() {
        return PlaylistAlbumAdi;
    }

    public String getPlaylistSarkici() {
        return PlaylistSarkici;
    }

    public String getPlaylistAdi() {
        return PlaylistAdi;
    }

    public String getPlaylistTuru() {
        return PlaylistTuru;
    }

    public String getPlaylistCıkıs() {
        return PlaylistCıkıs;
    }

    public int getPlaylistdinleme() {
        return Playlistdinleme;
    }

   
    

}
