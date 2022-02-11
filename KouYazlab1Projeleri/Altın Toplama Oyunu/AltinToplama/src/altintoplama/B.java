/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altintoplama;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author distu
 */
public class B {

    int[][] hedefKonumB = new int[1][2];
    private int altin_miktari;
    private int hedefB_maliyet;
    private int hamle_maliyet;
    private int konumsatir = 0, konumsutun = 19;
    private int hedefnokta;

    public B(int altin_miktari, int hedefB_maliyet,int hamle_maliyet) {
        this.altin_miktari = altin_miktari;
        this.hedefB_maliyet = hedefB_maliyet;
        this.hamle_maliyet=hamle_maliyet;
    }

    public void hedefBelirle(int tut[],int tut2[], int altinM[], int uzunluk, int baslangicSatir, int baslangicSutun) {
        double mesafe=0;
        double minMesafe=Math.sqrt(Math.pow(tut[0]- baslangicSatir,2)+ Math.pow(tut2[0]-baslangicSutun,2));
        int hedefsatir=0;
        int hedefsutun=0;
        
        double minOran=((double)altinM[0])/minMesafe;
        double oran;
        for(int i=0;i<uzunluk;i++)
        {
            if(tut[i]>=0&&tut2[i]>=0){
                            mesafe=Math.sqrt(Math.pow(tut[i]-baslangicSatir,2)+ Math.pow(tut2[i]-baslangicSutun,2));
            
            oran=((double)altinM[i])/mesafe;
            if(oran>minOran)
            {
                minOran=oran;
                hedefsatir=tut[i];
                hedefsutun=tut2[i];
                    setHedefnokta(i);
                
            }
            }
            else
                i++;

        }
         hedefKonumB[0][0]=hedefsatir;
         hedefKonumB[0][1]=hedefsutun; 
         tut[getHedefnokta()]=(-90-getHedefnokta());
         tut2[getHedefnokta()]=(-90-getHedefnokta());
         
        }
        
        /**
         * @return the altin_miktari
         */
    public int getAltin_miktari() {
        return altin_miktari;
    }

    /**
     * @param altin_miktari the altin_miktari to set
     */
    public void setAltin_miktari(int altin_miktari) {
        this.altin_miktari = altin_miktari;
    }

    /**
     * @return the hedefB_maliyet
     */
    public int getHedefB_maliyet() {
        return hedefB_maliyet;
    }

    /**
     * @param hedefB_maliyet the hedefB_maliyet to set
     */
    public void setHedefB_maliyet(int hedefB_maliyet) {
        this.hedefB_maliyet = hedefB_maliyet;
    }

    /**
     * @return the hamle_maliyet
     */
    public int getHamle_maliyet() {
        return hamle_maliyet;
    }

    /**
     * @param hamle_maliyet the hamle_maliyet to set
     */
    public void setHamle_maliyet(int hamle_maliyet) {
        this.hamle_maliyet = hamle_maliyet;
    }

    /**
     * @return the konumsatir
     */
    public int getKonumsatir() {
        return konumsatir;
    }

    /**
     * @param konumsatir the konumsatir to set
     */
    public void setKonumsatir(int konumsatir) {
        this.konumsatir = konumsatir;
    }

    /**
     * @return the konumsutun
     */
    public int getKonumsutun() {
        return konumsutun;
    }

    /**
     * @param konumsutun the konumsutun to set
     */
    public void setKonumsutun(int konumsutun) {
        this.konumsutun = konumsutun;
    }

    /**
     * @return the hedefnokta
     */
    public int getHedefnokta() {
        return hedefnokta;
    }

    /**
     * @param hedefnokta the hedefnokta to set
     */
    public void setHedefnokta(int hedefnokta) {
        this.hedefnokta = hedefnokta;
    }

}
