/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altintoplama;

import static java.lang.Math.abs;
import java.lang.reflect.Array;

/**
 *
 * @author distu
 */
public class C {

    int[][] hedefKonumC = new int[1][2];
    private int gizli_satir=0;
    private int gizli_sutun=0;
    private int gizli_satir2 = 0;
    private int gizli_sutun2 = 0;
    private int gizli_altin_miktari = 0;
    private int gizli_altin_miktari2 = 0;
    private int altin_miktari;
    private int hedefB_maliyet;
    private int hamle_maliyet;
    private int konumsatir = 19, konumsutun = 19;
    private int nokta;
    int gizli_nokta;

    public C(int altin_miktari, int hedefB_maliyet,int hamle_maliyet) {
        this.altin_miktari = altin_miktari;
        this.hedefB_maliyet = hedefB_maliyet;
        this.hamle_maliyet=hamle_maliyet;
    }

    public void hedefBelirle(int tut[], int tut2[], int gizli_tut[], int gizli_tut2[], int gizliA, int gizliAltinM[], int altinM[], int uzunluk, int baslangicSatir, int baslangicSutun) {
        
        double mesafe=0;
        double minMesafe=Math.sqrt(Math.pow(tut[0]- baslangicSatir,2)+ Math.pow(tut2[0]-baslangicSutun,2));
        int hedefsatir=0;
        int hedefsutun=0;
        int hedefnokta=0;
        double minOran=((double)altinM[0])/minMesafe;
        double oran;
        int gizli_kontrol=0;
        double gizli_min_mesafe=Math.sqrt(Math.pow(gizli_tut[0]- baslangicSatir,2)+ Math.pow(gizli_tut2[0]-baslangicSutun,2));
        double gizli_mesafe=0;
        double gizli_oran;
        double min_gizli_oran = ((double)gizliAltinM[0])/gizli_min_mesafe;
        int gizli_satir=0;
        int gizli_sutun=0;
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
                hedefnokta=i; 
            }
            }
            else
                i++;
        }
        for(int i=0;i<gizliA;i++){
            if(gizli_tut[i]>=0 && gizli_tut2[i]>=0){
            gizli_mesafe=Math.sqrt(Math.pow(gizli_tut[i]-baslangicSatir,2)+ Math.pow(gizli_tut2[i]-baslangicSutun,2));
            gizli_oran=((double)gizliAltinM[i])/gizli_mesafe;
            
            if(gizli_oran>min_gizli_oran){
                min_gizli_oran=gizli_oran;
                gizli_satir=gizli_tut[i];
                gizli_sutun=gizli_tut2[i];
                gizli_nokta=i;        
        }}
           else
                i++;
        }
        if(min_gizli_oran>minOran){
            getHedefKonumC()[0][0]=gizli_satir;
            getHedefKonumC()[0][1]=gizli_sutun; 
            setNokta(gizli_nokta);
            gizli_tut[getGizli_nokta()]=(-90);
            gizli_tut2[getGizli_nokta()]=(-90);
        }
        else{
            getHedefKonumC()[0][0]=hedefsatir;
            getHedefKonumC()[0][1]=hedefsutun; 
            setNokta(hedefnokta);
            tut[hedefnokta]=(-90-hedefnokta);
            tut2[hedefnokta]=(-90-hedefnokta);
        }          
         
        
    }

    /**
     * @return the hedefKonumC
     */
    public int[][] getHedefKonumC() {
        return hedefKonumC;
    }

    /**
     * @param hedefKonumC the hedefKonumC to set
     */
    public void setHedefKonumC(int[][] hedefKonumC) {
        this.hedefKonumC = hedefKonumC;
    }

    /**
     * @return the gizli_satir
     */
    public int getGizli_satir() {
        return gizli_satir;
    }

    /**
     * @param gizli_satir the gizli_satir to set
     */
    public void setGizli_satir(int gizli_satir) {
        this.gizli_satir = gizli_satir;
    }

    /**
     * @return the gizli_sutun
     */
    public int getGizli_sutun() {
        return gizli_sutun;
    }

    /**
     * @param gizli_sutun the gizli_sutun to set
     */
    public void setGizli_sutun(int gizli_sutun) {
        this.gizli_sutun = gizli_sutun;
    }

    /**
     * @return the gizli_satir2
     */
    public int getGizli_satir2() {
        return gizli_satir2;
    }

    /**
     * @param gizli_satir2 the gizli_satir2 to set
     */
    public void setGizli_satir2(int gizli_satir2) {
        this.gizli_satir2 = gizli_satir2;
    }

    /**
     * @return the gizli_sutun2
     */
    public int getGizli_sutun2() {
        return gizli_sutun2;
    }

    /**
     * @param gizli_sutun2 the gizli_sutun2 to set
     */
    public void setGizli_sutun2(int gizli_sutun2) {
        this.gizli_sutun2 = gizli_sutun2;
    }

    /**
     * @return the gizli_altin_miktari
     */
    public int getGizli_altin_miktari() {
        return gizli_altin_miktari;
    }

    /**
     * @param gizli_altin_miktari the gizli_altin_miktari to set
     */
    public void setGizli_altin_miktari(int gizli_altin_miktari) {
        this.gizli_altin_miktari = gizli_altin_miktari;
    }

    /**
     * @return the gizli_altin_miktari2
     */
    public int getGizli_altin_miktari2() {
        return gizli_altin_miktari2;
    }

    /**
     * @param gizli_altin_miktari2 the gizli_altin_miktari2 to set
     */
    public void setGizli_altin_miktari2(int gizli_altin_miktari2) {
        this.gizli_altin_miktari2 = gizli_altin_miktari2;
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
     * @return the gizli_nokta
     */
    public int getGizli_nokta() {
        return gizli_nokta;
    }

    /**
     * @param gizli_nokta the gizli_nokta to set
     */
    public void setGizli_nokta(int gizli_nokta) {
        this.gizli_nokta = gizli_nokta;
    }

    /**
     * @return the nokta
     */
    public int getNokta() {
        return nokta;
    }

    /**
     * @param nokta the nokta to set
     */
    public void setNokta(int nokta) {
        this.nokta = nokta;
    }
}
