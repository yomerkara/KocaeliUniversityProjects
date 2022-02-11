/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncu;

/**
 *
 * @author distu
 */
//abstract class yapısıyla sporcuların methodlarını ve değerlerini almasını sağlıyoruz
public abstract class Sporcu {

    private int kartID;
    private String sporcuIsim;
    private String sporcuTakim;

    public Sporcu() {
        this.setSporcuIsim("Adsiz Sporcu");
        this.setSporcuTakim("Adsiz Takim");

    }

    public Sporcu(int kartID, String sporcuIsim, String sporcuTakim) {

        this.kartID = kartID;
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;

    }

    //3 konum bilgisinden birini geri döndürmesi için , knm parametresi alıyor.
    public abstract int sporcuPuaniGoster(int knm);

    
    //private değişken tanımlarından kaynaklı getter ve setterlar
    /**
     * @return the sporcuIsim
     */
    public String getSporcuIsim() {
        return sporcuIsim;
    }

    /**
     * @param sporcuIsim the sporcuIsim to set
     */
    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    /**
     * @return the sporcuTakim
     */
    public String getSporcuTakim() {
        return sporcuTakim;
    }

    /**
     * @param sporcuTakim the sporcuTakim to set
     */
    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    /**
     * @return the kartID
     */
    public int getKartID() {
        return kartID;
    }

    /**
     * @param kartID the kartID to set
     */
    public void setKartID(int kartID) {
        this.kartID = kartID;
    }

}
