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
public class TakipArama {
    private int kullanıcıid;
    private String kullanıcıadi;
    private String kullanıcıtakip;

   

    public TakipArama(int kullanıcıid, String kullanıcıadi, String kullanıcıtakip) {
        this.kullanıcıid = kullanıcıid;
        this.kullanıcıadi = kullanıcıadi;
        this.kullanıcıtakip = kullanıcıtakip;
    }

    public int getKullanıcıid() {
        return kullanıcıid;
    }

    public String getKullanıcıadi() {
        return kullanıcıadi;
    }

    public String getKullanıcıtakip() {
        return kullanıcıtakip;
    }
    
    
}
