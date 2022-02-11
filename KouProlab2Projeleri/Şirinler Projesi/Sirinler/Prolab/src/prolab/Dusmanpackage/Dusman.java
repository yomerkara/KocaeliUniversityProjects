package prolab.Dusmanpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import prolab.Karakter;
import prolab.OyuncuPackage.*;

/**
 *
 * @author UMUT
 */
public class Dusman extends Karakter {

    private String DusmanID;
    private String DusmanAdi;
    private String DusmanTur;
    private String KarakterBaslangic;

    private int BaslangicX;
    private int BaslangicY;
    private int AdimS;

    public Dusman() {

    }

    public Dusman(String KarakterID, String KarakterAdi, String KarakterTur, String KarakterBaslangic) {
        super(KarakterID, KarakterAdi, KarakterTur);
        this.KarakterBaslangic = KarakterBaslangic;
        if ("A".equals(KarakterBaslangic)) {
            setKonumX(0);
            this.BaslangicX = 0;
            setKonumY(3);
            this.BaslangicY = 3;
        }
        if ("B".equals(KarakterBaslangic)) {
            setKonumX(0);
            this.BaslangicX = 0;
            setKonumY(10);
            this.BaslangicY = 10;
        }
        if ("C".equals(KarakterBaslangic)) {
            setKonumX(5);
            this.BaslangicX = 5;
            setKonumY(0);
            this.BaslangicY = 0;
        }
        if ("D".equals(KarakterBaslangic)) {
            setKonumX(10);
            this.BaslangicX = 10;
            setKonumY(3);
            this.BaslangicY = 3;
        }
    }

    public String getDusmanID() {
        return DusmanID;
    }

    public void setDusmanID(String DusmanID) {
        this.DusmanID = DusmanID;
    }

    public String getDusmanAdi() {
        return DusmanAdi;
    }

    public void setDusmanAdi(String DusmanAdi) {
        this.DusmanAdi = DusmanAdi;
    }

    public String getDusmanTur() {
        return DusmanTur;
    }

    public void setDusmanTur(String DusmanTur) {
        this.DusmanTur = DusmanTur;
    }

    public String getKarakterBaslangic() {
        return KarakterBaslangic;
    }

    public int getAdimS() {
        return AdimS;
    }

    public void setAdimS(int AdimS) {
        this.AdimS = AdimS;
    }

    public int getBaslangicX() {
        return BaslangicX;
    }

    public void setBaslangicX(int BaslangicX) {
        this.BaslangicX = BaslangicX;
    }

    public int getBaslangicY() {
        return BaslangicY;
    }

    public void setBaslangicY(int BaslangicY) {
        this.BaslangicY = BaslangicY;
    }

    /**
     * @param KarakterBaslangic the KarakterBaslangic to set
     */
    public void setKarakterBaslangic(String KarakterBaslangic) {
        this.KarakterBaslangic = KarakterBaslangic;
    }

    public void BaslangicaDon(String OyuncuAdi) {

    }

}
