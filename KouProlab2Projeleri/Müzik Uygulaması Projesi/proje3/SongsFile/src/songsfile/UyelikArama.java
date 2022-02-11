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
public class UyelikArama {
    private int uyelikId;
    private int uyelikTipi;
    private String uyelikAdi;

    public UyelikArama(int uyelikId, int uyelikTipi, String uyelikAdi) {
        this.uyelikId = uyelikId;
        this.uyelikTipi = uyelikTipi;
        this.uyelikAdi = uyelikAdi;
    }

    public UyelikArama(int uyelikTipi, String uyelikAdi) {
        this.uyelikTipi = uyelikTipi;
        this.uyelikAdi = uyelikAdi;
    }

    public int getUyelikId() {
        return uyelikId;
    }

    public int getUyelikTipi() {
        return uyelikTipi;
    }

    public String getUyelikAdi() {
        return uyelikAdi;
    }
    
}
