package prolab;

import prolab.Oyuncupackage.Oyuncu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UMUT
 */
public class Karakter {

    private String KarakterID;
    private String KarakterAdi;
    private String KarakterTur;
    private int KonumX;//
    private int KonumY;
   
    

    public Karakter() {
        //Bos constructor
    }

    

    public Karakter(String KarakterID, String KarakterAdi, String KarakterTur) {
        this.KarakterID = KarakterID;
        this.KarakterAdi = KarakterAdi;
        this.KarakterTur = KarakterTur;
    }
    public Karakter(String KarakterID, String KarakterAdi, String KarakterTur,int Konumx,int KonumY) {
        this.KarakterID = KarakterID;
        this.KarakterAdi = KarakterAdi;
        this.KarakterTur = KarakterTur;
        this.KonumX=Konumx;
        this.KonumY=KonumY;
    }

    public String getKarakterID() {
        return KarakterID;
    }

    public void setKarakterID(String KarakterID) {
        this.KarakterID = KarakterID;
    }

    public String getKarakterAdi() {
        return KarakterAdi;
    }

    public void setKarakterAdi(String KarakterAdi) {
        this.KarakterAdi = KarakterAdi;
    }

    public String getKarakterTur() {
        return KarakterTur;
    }

    public void setKarakterTur(String KarakterTur) {
        this.KarakterTur = KarakterTur;
    }

    void PuaniGoster1() {
        System.out.println(this.getKarakterID());
        System.out.println(this.getKarakterAdi());
        System.out.println(this.getKarakterTur());

    }

    /**
     * @return the KarakterX
     */
    public int getKonumX() {
        return KonumX;
    }

    /**
     * @param KonumX the KarakterX to set
     */
    public void setKonumX(int KonumX) {
        this.KonumX = KonumX;
    }

    /**
     * @return the KarakterY
     */
    public int getKonumY() {
        return KonumY;
    }

    /**
     * @param KonumY the KarakterY to set
     */
    public void setKonumY(int KonumY) {
        this.KonumY = KonumY;
    }
   
    /**
     * @return the KarakterBaslangic
     */
    
}
