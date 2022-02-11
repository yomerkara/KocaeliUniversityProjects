/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncu;

import java.util.List;
import java.util.Random;

/**
 *
 * @author distu
 */
public class kullanici extends oyuncu {

    private List<Sporcu> kartListesiFutbolcu;
    private List<Sporcu> kartListesiBasketbolcu;
    

    public kullanici() {

    }

    public kullanici(List<Sporcu> kartListesiFutbolcu,List<Sporcu> kartListesiBasketbolcu, int oyuncuID, String oyuncuIsim, int Skor) {
        super(oyuncuID, oyuncuIsim, Skor);
        this.kartListesiFutbolcu = kartListesiFutbolcu;
        this.kartListesiBasketbolcu= kartListesiBasketbolcu;
    }

    public void removeSporcuFutbolcu(Sporcu sporcu) {
        this.getKartListesiFutbolcu().remove(sporcu);
    }
        public void removeSporcuBasketbolcu(Sporcu sporcu) {
        this.getKartListesiBasketbolcu().remove(sporcu);
    }
    

    //kart seçilme işlemi oyuncu sınıfından override edilerek yapılıyor
    @Override
    public void kartSecFutbolcu(List<Sporcu> kartlarimFutbolcu, List<Sporcu>kartListesiFutbolcu) {
        Random random = new Random();
        int x = random.nextInt(kartListesiFutbolcu.size());
        kartlarimFutbolcu.add(kartListesiFutbolcu.get(x));
        kartListesiFutbolcu.remove(x); 
    }

    @Override
    public void kartSecBasketbolcu(List<Sporcu> kartlarimBasketbolcu, List<Sporcu> kartListesiBasketbolcu) {
        Random random = new Random();
        int x = random.nextInt(kartListesiBasketbolcu.size());
        kartlarimBasketbolcu.add(kartListesiBasketbolcu.get(x));
        kartListesiBasketbolcu.remove(x);  
    }

    /**
     * @return the kartListesiFutbolcu
     */
    public List<Sporcu> getKartListesiFutbolcu() {
        return kartListesiFutbolcu;
    }

    /**
     * @param kartListesiFutbolcu the kartListesiFutbolcu to set
     */
    public void setKartListesiFutbolcu(List<Sporcu> kartListesiFutbolcu) {
        this.kartListesiFutbolcu = kartListesiFutbolcu;
    }

    /**
     * @return the kartListesiBasketbolcu
     */
    public List<Sporcu> getKartListesiBasketbolcu() {
        return kartListesiBasketbolcu;
    }

    /**
     * @param kartListesiBasketbolcu the kartListesiBasketbolcu to set
     */
    public void setKartListesiBasketbolcu(List<Sporcu> kartListesiBasketbolcu) {
        this.kartListesiBasketbolcu = kartListesiBasketbolcu;
    }



}
