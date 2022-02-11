/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab.Oyuncupackage;
import prolab.Karakter;

/**
 *
 * @author UMUT
 */
public class Oyuncu extends Karakter {

    private String OyuncuID;
    private String OyuncuAdi;
    private String OyuncuTur;
    private int adimS;
    private int Skor;

    
    public Oyuncu() {

    }

    public Oyuncu(String KarakterID, String KarakterAdi, String KarakterTur,int KonumX,int KonumY) {
        super(KarakterID, KarakterAdi, KarakterTur,KonumX,KonumY);
        
    }

    public String getOyuncuID() {
        return OyuncuID;
    }

    public void setOyuncuID(String OyuncuID) {
        this.OyuncuID = OyuncuID;
    }

    public String getOyuncuAdi() {
        return OyuncuAdi;
    }

    public void setOyuncuAdi(String OyuncuAdi) {
        this.OyuncuAdi = OyuncuAdi;
    }

    public String getOyuncuTur() {
        return OyuncuTur;
    }

    public void setOyuncuTur(String OyuncuTur) {
        this.OyuncuTur = OyuncuTur;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
     public int getAdimS() {
        return adimS;
    }

    public void setAdimS(int adimS) {
        this.adimS = adimS;
    }

    /**
     *
     * @param DusmanAdi
     * @return
     */
    public int PuaniGoster(String DusmanAdi) {
        return getSkor();
    }
}


