/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Oyuncu.Sporcu;
import Sporcu.Basketbolcu1;
import Sporcu.Basketbolcu2;
import Sporcu.Basketbolcu3;
import Sporcu.Basketbolcu4;
import Sporcu.Basketbolcu5;
import Sporcu.Basketbolcu6;
import Sporcu.Basketbolcu7;
import Sporcu.Basketbolcu8;
import Sporcu.Futbolcu1;
import Sporcu.Futbolcu2;
import Sporcu.Futbolcu3;
import Sporcu.Futbolcu4;
import Sporcu.Futbolcu5;
import Sporcu.Futbolcu6;
import Sporcu.Futbolcu7;
import Sporcu.Futbolcu8;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author distu
 */
public class Test {

    Random random = new Random();
    int konum;

    public Test() {

    }
    //Sporcuların pozisyon bilgisini oluşturuyor.

    public int konumBilgisi() {
        konum = 1 + random.nextInt(3);
        return konum;
    }

    public void kartTanimlaFutbolcu(List<Sporcu> kartlarimFutbolcu) {
        Futbolcu1 futbolcu1 = new Futbolcu1(1, 40, 40, 40, "Cristiano Ronaldo", "Real Madrid");
        kartlarimFutbolcu.add(futbolcu1);
        Futbolcu2 futbolcu2 = new Futbolcu2(2, 40, 40, 50, "Lieonel Messi", "Barcelona");
        kartlarimFutbolcu.add(futbolcu2);
        Futbolcu3 futbolcu3 = new Futbolcu3(3, 30, 40, 40, "Antoine Griezmann", "Barcelona");
        kartlarimFutbolcu.add(futbolcu3);
        Futbolcu4 futbolcu4 = new Futbolcu4(4, 20, 50, 70, "Philippe Coutinho", "Barcelona");
        kartlarimFutbolcu.add(futbolcu4);
        Futbolcu5 futbolcu5 = new Futbolcu5(5, 50, 70, 70, "Pedri", "Barcelona");
        kartlarimFutbolcu.add(futbolcu5);
        Futbolcu6 futbolcu6 = new Futbolcu6(6, 60, 30, 80, "Fernando Muslera", "Galatasaray");
        kartlarimFutbolcu.add(futbolcu6);
        Futbolcu7 futbolcu7 = new Futbolcu7(7, 80, 20, 50, "Radamel Falcao", "Galatasaray");
        kartlarimFutbolcu.add(futbolcu7);
        Futbolcu8 futbolcu8 = new Futbolcu8(8, 40, 60, 60, "Gökhan Töre", "Besiktas");
        kartlarimFutbolcu.add(futbolcu8);
    }

    public void kartTanimlaBasketbolcu(List<Sporcu> kartlarimBasketbolcu) {
        Basketbolcu1 basketbolcu1 = new Basketbolcu1(1, 50, 30, 80, "Stephen Curry", "Golden State Warriors");
        kartlarimBasketbolcu.add(basketbolcu1);
        Basketbolcu2 basketbolcu2 = new Basketbolcu2(2, 60, 60, 40, "Anthony Davis", "LAKERS");
        kartlarimBasketbolcu.add(basketbolcu2);
        Basketbolcu3 basketbolcu3 = new Basketbolcu3(3, 70, 90, 90, "LeBron James", "LAKERS");
        kartlarimBasketbolcu.add(basketbolcu3);
        Basketbolcu4 basketbolcu4 = new Basketbolcu4(4, 30, 60, 70, "Alex Caruso", "LAKERS");
        kartlarimBasketbolcu.add(basketbolcu4);
        Basketbolcu5 basketbolcu5 = new Basketbolcu5(5, 50, 80, 70, "Zach LaVine", "Chicago Bulls");
        kartlarimBasketbolcu.add(basketbolcu5);
        Basketbolcu6 basketbolcu6 = new Basketbolcu6(6, 40, 30, 70, "Daniel gafford", "Chicago Bulls");
        kartlarimBasketbolcu.add(basketbolcu6);
        Basketbolcu7 basketbolcu7 = new Basketbolcu7(7, 40, 70, 60, "Cedi Osman", "Cleveland Cavaliers");
        kartlarimBasketbolcu.add(basketbolcu7);
        Basketbolcu8 basketbolcu8 = new Basketbolcu8(8, 50, 80, 60, "Kevin Love", "Cleveland Cavaliers");
        kartlarimBasketbolcu.add(basketbolcu8);
    }

    //Bu aralıkta pngler icona dönüştürülüyor ve kartlara iconları atılıyor
    //Dosya içinde resimler ,kart idleri ile uygun sıralanmıştır.
    public static ImageIcon convertIcon(int id) {
        BufferedImage img;
        try {
            img = ImageIO.read(new File("pokemonlar/" + id + ".png"));
            Image convert = img.getScaledInstance(89, 125, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(convert);
            return imageIcon;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void getImages(List<ImageIcon> imgs) {
        BufferedImage img = null;
        String fileName;
        try {
            for (int i = 0; i < 11; i++) {
                fileName = String.valueOf(i);
                img = ImageIO.read(new File("pokemonlar/" + fileName + ".png"));
                Image convert = img.getScaledInstance(89, 125, Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(convert);
                imgs.add(imageIcon);
            }
        } catch (IOException e) {
            System.err.println("resim bulunamadı");
        }
    }

    //Futbolcu kartlarına iconları atılıyor,Buttonlara isim verilip atanıyor.
    public void kartAtamaFutbolcu(JButton kart, Sporcu sporcu) {
        if (sporcu instanceof Futbolcu1) {
            Futbolcu1 kartlarimFutbolcu = (Futbolcu1) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("1");
        } else if (sporcu instanceof Futbolcu2) {
            Futbolcu2 kartlarimFutbolcu = (Futbolcu2) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("2");
        } else if (sporcu instanceof Futbolcu3) {
            Futbolcu3 kartlarimFutbolcu = (Futbolcu3) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("3");
        } else if (sporcu instanceof Futbolcu4) {
            Futbolcu4 kartlarimFutbolcu = (Futbolcu4) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("4");
        } else if (sporcu instanceof Futbolcu5) {
            Futbolcu5 kartlarimFutbolcu = (Futbolcu5) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("5");
        } else if (sporcu instanceof Futbolcu6) {
            Futbolcu6 kartlarimFutbolcu = (Futbolcu6) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("6");
        } else if (sporcu instanceof Futbolcu7) {
            Futbolcu7 kartlarimFutbolcu = (Futbolcu7) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("7");
        } else if (sporcu instanceof Futbolcu8) {
            Futbolcu8 kartlarimFutbolcu = (Futbolcu8) sporcu;
            kart.setIcon(kartlarimFutbolcu.getImage());
            kart.setName("8");
        }
    }

    //Basketbolcu kartlarına iconları atılıyor,Buttonlara isim verilip atanıyor.
    public void kartAtamaBasketbolcu(JButton kart, Sporcu sporcu) {
        if (sporcu instanceof Basketbolcu1) {
            Basketbolcu1 kartlarimBasketbolcu = (Basketbolcu1) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("1");
        } else if (sporcu instanceof Basketbolcu2) {
            Basketbolcu2 kartlarimBasketbolcu = (Basketbolcu2) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("2");
        } else if (sporcu instanceof Basketbolcu3) {
            Basketbolcu3 kartlarimBasketbolcu = (Basketbolcu3) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("3");
        } else if (sporcu instanceof Basketbolcu4) {
            Basketbolcu4 kartlarimBasketbolcu = (Basketbolcu4) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("4");
        } else if (sporcu instanceof Basketbolcu5) {
            Basketbolcu5 kartlarimBasketbolcu = (Basketbolcu5) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("5");
        } else if (sporcu instanceof Basketbolcu6) {
            Basketbolcu6 kartlarimBasketbolcu = (Basketbolcu6) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("6");
        } else if (sporcu instanceof Basketbolcu7) {
            Basketbolcu7 kartlarimBasketbolcu = (Basketbolcu7) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("7");
        } else if (sporcu instanceof Basketbolcu8) {
            Basketbolcu8 kartlarimBasketbolcu = (Basketbolcu8) sporcu;
            kart.setIcon(kartlarimBasketbolcu.getImage());
            kart.setName("8");
        }
    }
    
    public void kartKonumYenileFutbolcu(List<JButton>kartlarFutbolcu,List<JButton>kartlarBasketbolcu,List<Sporcu>pcKartFutbolcu,List<Sporcu>pcKartBasketbolcu,List<Sporcu>kullaniciKartFutbolcu,List<Sporcu>kullaniciKartBasketbolcu)
    {
        //Kullanicinin sahip olduğu futbol kartları konumlandiriliyor.
        for (int i = 0; i < kullaniciKartFutbolcu.size(); i++) {
            for (JButton kart : kartlarFutbolcu) {
                if (kullaniciKartFutbolcu.get(i).getKartID() == Integer.valueOf(kart.getName())) {
                    kart.setBounds(40 + (i * 139), 495, 89, 125);
                }
            }
        }
        for (int i = 0; i < pcKartFutbolcu.size(); i++) {
            for (JButton kart : kartlarFutbolcu) {
                if (pcKartFutbolcu.get(i).getKartID() == Integer.valueOf(kart.getName())) {
                    kart.setBounds(40 + (i * 139), 80, 89, 125);
                }
            }
        }
        
        //Kullanicinin sahip olduğu basketbol kartları konumlandiriliyor.
        for (int i = 0; i < kullaniciKartBasketbolcu.size(); i++) {
            for (JButton kart : kartlarBasketbolcu) {
                if (kullaniciKartBasketbolcu.get(i).getKartID() == Integer.valueOf(kart.getName())) {
                    kart.setBounds(40 + (i * 139), 495, 89, 125);
                }
            }
        }
        for (int i = 0; i < pcKartBasketbolcu.size(); i++) {
            for (JButton kart : kartlarBasketbolcu) {
                if (pcKartBasketbolcu.get(i).getKartID() == Integer.valueOf(kart.getName())) {
                    kart.setBounds(40 + (i * 139), 80, 89, 125);
                }
            }
        }
    }
}