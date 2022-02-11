/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncu;

import java.util.List;

/**
 *
 * @author distu
 */
public abstract class oyuncu {
    
    private int oyuncuID;
    private String oyuncuIsim;
    private int Skor;
    private List<Sporcu> kartListesiFutbolcu;
    private List<Sporcu> kartListesiBasketbolcu;
        public oyuncu()
        {
            
        }
        public oyuncu(int oyuncuID,String oyuncuIsim,int Skor)
        {
            this.oyuncuID=oyuncuID;
            this.oyuncuIsim=oyuncuIsim;
            this.Skor=Skor;
        }

    /**
     * @return the oyuncuID
     */
    public int getOyuncuID() {
        return oyuncuID;
    }

    /**
     * @param oyuncuID the oyuncuID to set
     */
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    /**
     * @return the oyuncuIsim
     */
    public String getOyuncuIsim() {
        return oyuncuIsim;
    }

    /**
     * @param oyuncuIsim the oyuncuIsim to set
     */
    public void setOyuncuIsim(String oyuncuIsim) {
        this.oyuncuIsim = oyuncuIsim;
    }


    public abstract void kartSecFutbolcu(List<Sporcu>kartlarimFutbolcu,List<Sporcu> kartListesiFutbolcu);
    public abstract void kartSecBasketbolcu(List<Sporcu>kartlarimBasketbolcu,List<Sporcu> kartListesiBasketbolcu);

    /**
     * @return the Skor
     */
    public int getSkor() {
        return Skor;
    }

    /**
     * @param Skor the Skor to set
     */
    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
}
