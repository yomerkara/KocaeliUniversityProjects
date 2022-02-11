
package Oyuncu;

import Oyuncu.Sporcu;
import Oyuncu.oyuncu;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author distu
 */
public class Bilgisayar extends oyuncu {

    private List<Sporcu>kartListesi;
    public int[] bilgisayarb = new int[4];
    public int[] bilgisayarf = new int[4];
    public Bilgisayar(){
    
    }

    public Bilgisayar(List<Sporcu> kartListesi, int oyuncuID, String oyuncuIsim, int Skor) {
        super(oyuncuID, oyuncuIsim, Skor);
        this.kartListesi = kartListesi;
    }

    //kart seçilme işlemi oyuncu sınıfından override edilerek yapılıyor
    @Override
    public void kartSecFutbolcu(List<Sporcu> kartlarimFutbolcu, List<Sporcu>kartListesi ){
        Random random = new Random();
        int x = random.nextInt(kartListesi.size());
        kartlarimFutbolcu.add(kartListesi.get(x));
        kartListesi.remove(x); 
    }

    @Override
    public void kartSecBasketbolcu(List<Sporcu> kartlarimBasketbolcu, List<Sporcu> kartListesi) {
        Random random = new Random();
        int x = random.nextInt(kartListesi.size());
        kartlarimBasketbolcu.add(kartListesi.get(x));
        kartListesi.remove(x);  
    }

    /**
     * @return the kartListesi
     */
    public List<Sporcu> getKartListesi() {
        return kartListesi;
    }

    /**
     * @param kartListesi the kartListesi to set
     */
    public void setKartListesi(List<Sporcu> kartListesi) {
        this.kartListesi = kartListesi;
    }



}
