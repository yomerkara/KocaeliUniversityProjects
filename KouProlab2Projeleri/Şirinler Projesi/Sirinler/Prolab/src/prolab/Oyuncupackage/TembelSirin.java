/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab.Oyuncupackage;

/**
 *
 * @author Arthas
 */
public class TembelSirin extends Oyuncu {

      private int adimS=1;

    @Override
    public int PuaniGoster(String DusmanAdi) {
        if ("Azman".equals(DusmanAdi)) {
            setSkor(getSkor() - 5);
        }
        if ("Gargamel".equals(DusmanAdi)) {
            setSkor(getSkor() - 15);
        }
        return getSkor();
    }

    /**
     * @return the adimS
     */
    @Override
    public int getAdimS() {
        return adimS;
    }

    /**
     * @param adimS the adimS to set
     */
    @Override
    public void setAdimS(int adimS) {
        this.adimS = adimS;
    }


}
