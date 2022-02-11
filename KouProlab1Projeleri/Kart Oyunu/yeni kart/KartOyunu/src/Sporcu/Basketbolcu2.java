/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sporcu;

import Oyuncu.Sporcu;

import Main.Test;
import javax.swing.ImageIcon;

/**
 *
 * @author distu
 */
public class Basketbolcu2 extends Sporcu {

    private boolean kartKullanildiMi;
    private int sporcuPuaniknm1;//ikilik
    private int sporcuPuaniknm2;//ucluk
    private int sporcuPuaniknm3;//serbest atis
    private ImageIcon image;
    
    public Basketbolcu2() {
   
    }

    public Basketbolcu2(int sporcuID,int sporcuPuaniknm1,int sporcuPuaniknm2,int sporcuPuaniknm3,String sporcuIsim,String sporcuTakim) {
        
          super(sporcuID,sporcuIsim,sporcuTakim);
          this.sporcuPuaniknm1=sporcuPuaniknm1;
          this.sporcuPuaniknm2=sporcuPuaniknm2;
          this.sporcuPuaniknm3=sporcuPuaniknm3;
          this.kartKullanildiMi=false;
          this.image=Test.convertIcon(sporcuID);
           //ımage eklenicek
    }



    @Override
    public int sporcuPuaniGoster(int konum) {
        switch (konum) {
            case 1:
                return getSporcuPuaniknm1();
            case 2:
                return getSporcuPuaniknm2();
            default:
                return getSporcuPuaniknm3();
        }
        
    }

    /**
     * @return the kartKullanildiMi
     */
    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    /**
     * @param kartKullanildiMi the kartKullanildiMi to set
     */
    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    /**
     * @return the image
     */
    public ImageIcon getImage() {
        return image;
    }

    /**
     * @return the sporcuPuaniknm1
     */
    public int getSporcuPuaniknm1() {
        return sporcuPuaniknm1;
    }

    /**
     * @param sporcuPuaniknm1 the sporcuPuaniknm1 to set
     */
    public void setSporcuPuaniknm1(int sporcuPuaniknm1) {
        this.sporcuPuaniknm1 = sporcuPuaniknm1;
    }

    /**
     * @return the sporcuPuaniknm2
     */
    public int getSporcuPuaniknm2() {
        return sporcuPuaniknm2;
    }

    /**
     * @param sporcuPuaniknm2 the sporcuPuaniknm2 to set
     */
    public void setSporcuPuaniknm2(int sporcuPuaniknm2) {
        this.sporcuPuaniknm2 = sporcuPuaniknm2;
    }

    /**
     * @return the sporcuPuaniknm3
     */
    public int getSporcuPuaniknm3() {
        return sporcuPuaniknm3;
    }

    /**
     * @param sporcuPuaniknm3 the sporcuPuaniknm3 to set
     */
    public void setSporcuPuaniknm3(int sporcuPuaniknm3) {
        this.sporcuPuaniknm3 = sporcuPuaniknm3;
    }
}
