/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altintoplama;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.Random;
import javax.swing.JLabel;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;

/**
 *
 * @author distu
 */
public class Masa extends JFrame {

    static int max1 = 20;
    static int max2 = 20;
    static int oran = 20;
    static int oran2 = 10;
    //static int tahtadaki_altin_sayisi = (max1 * max2) * (oran / 100);
    static int tahtadaki_altin_sayisi=200;
    static int baslangic_altin_sayisi ;
    //  static int gizli_altin_sayisi = tahtadaki_altin_sayisi * (oran2 / 100);
    static int gizli_altin_sayisi=8;
    private static int hamle_sayisi = 3;
    int a_hedef_belirleme_maliyeti;
    int a_hamle_maliyeti;
   
    int b_hedef_belirleme_maliyeti;
    int b_hamle_maliyeti;
    
    int c_hedef_belirleme_maliyeti;
    int c_hamle_maliyeti;
    
    int d_hedef_belirleme_maliyeti;
    int d_hamle_maliyeti;
    int a_altin_sayisi;
            int b_altin_sayisi;
        int c_altin_sayisi;
             int d_altin_sayisi;
    private JLabel a_label = new JLabel("A");
    private JLabel b_label = new JLabel("B");
    private JLabel c_label = new JLabel("C");
    private JLabel d_label = new JLabel("D");
    JPanel[][] panels = new JPanel[max1][max2];
    private Color renk2 = Color.DARK_GRAY;
    private Color a = Color.pink;
    private Color b = Color.MAGENTA;
    private Color c = Color.cyan;
    private Color d = Color.BLACK;
    private Color temp;
    private Random rand = new Random();
    private int[] gizli_tut = new int[gizli_altin_sayisi];
    private int[] gizli_tut2 = new int[gizli_altin_sayisi];
    int[] tut = new int[tahtadaki_altin_sayisi];
    int[] tut2 = new int[tahtadaki_altin_sayisi];
    static int[] altinM = new int[tahtadaki_altin_sayisi];
    private static int[] gizliAltinM = new int[gizli_altin_sayisi];
    int kontrolA = 0;
    int kontrolB = 0;
    int kontrolC = 0;
    int kontrolD = 0;
    int toplam_adimA;
    int toplam_adimB;
    int toplam_adimC;
    int toplam_adimD;
    
    int kontrol_altin_mik_a = 0;
    int kontrol_altin_mik_b = 0;
    int kontrol_altin_mik_c = 0;
    int kontrol_altin_mik_d = 0;
    int hkonumtutxA = 0;
    int hkonumtutyA = 0;
    int hkonumtutxB = 0;
    int hkonumtutyB = 0;
    int hkonumtutxC = 0;
    int hkonumtutyC = 0;
    int hkonumtutxD = 0;
    int hkonumtutyD = 0;
    int harcananAltinA = 0;
    int toplananAltinA = 0;
    int harcananAltinB = 0;
    int toplananAltinB = 0;
    int harcananAltinC = 0;
    int toplananAltinC = 0;
    int harcananAltinD = 0;
    int toplananAltinD = 0;
    JLabel gizli = new JLabel();
    int k=0;

    public Masa(int tahtadaki_altin_sayisi, int gizli_altin_sayisi, int baslangic_altin_sayisi, int a_hedef_belirleme_maliyeti, int a_hamle_maliyeti, int b_hedef_belirleme_maliyeti, int b_hamle_maliyeti, int c_hedef_belirleme_maliyeti, int c_hamle_maliyeti, int d_hedef_belirleme_maliyeti, int d_hamle_maliyeti) {
        super("AltinToplamaOyunu");
        this.tahtadaki_altin_sayisi=tahtadaki_altin_sayisi;
        this.gizli_altin_sayisi=gizli_altin_sayisi;
        this.baslangic_altin_sayisi=baslangic_altin_sayisi;
        this.a_hedef_belirleme_maliyeti=a_hedef_belirleme_maliyeti;
        this.a_hamle_maliyeti=a_hamle_maliyeti;
        this.b_hedef_belirleme_maliyeti=b_hedef_belirleme_maliyeti;
        this.b_hamle_maliyeti=b_hamle_maliyeti;
        this.c_hedef_belirleme_maliyeti=c_hedef_belirleme_maliyeti;
        this.c_hamle_maliyeti=c_hamle_maliyeti;
        this.d_hedef_belirleme_maliyeti=d_hedef_belirleme_maliyeti;
        this.d_hamle_maliyeti=d_hamle_maliyeti;
         a_altin_sayisi=baslangic_altin_sayisi;
            b_altin_sayisi=baslangic_altin_sayisi;
         c_altin_sayisi=baslangic_altin_sayisi;
             d_altin_sayisi=baslangic_altin_sayisi;
        setLayout(new GridLayout(max1, max2));//v
        for (int i = 0; i < max1; i++) {
            for (int j = 0; j < max2; j++) {
                panels[i][j] = new JPanel();
                panels[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                panels[i][j].setBackground(renk2);

                add(panels[i][j]);
            }
        }
        a_label.setFont(new Font("Verdana", 1, 20));
        b_label.setFont(new Font("Verdana", 1, 20));
        c_label.setFont(new Font("Verdana", 1, 20));
        d_label.setFont(new Font("Verdana", 1, 20));

        panels[0][0].setBackground(a);
        panels[0][0].add(a_label);

        panels[0][max2 - 1].setBackground(b);
        panels[0][max2 - 1].add(b_label);
        panels[max1 - 1][max2 - 1].setBackground(c);
        panels[max1 - 1][max2 - 1].add(c_label);
        panels[max1 - 1][0].setBackground(d);
        panels[max1 - 1][0].add(d_label);

        int rand_i;
        int rand_j;

        for (int i = 0; i < tahtadaki_altin_sayisi; i++) {

            rand_i = 1 + rand.nextInt(max1 - 2);
            rand_j = 1 + rand.nextInt(max2 - 2);
            for (int j = 0; j <= i; j++) {

                if (tut[j] == rand_i && tut2[j] == rand_j) {

                    rand_i = 1 + rand.nextInt(max1 - 2);
                    j = 0;
                }

            }

            tut[i] = rand_i;
            tut2[i] = rand_j;
            int rand_AltinM = 1 + (int) (Math.random() * 15) % 5;

            rand_AltinM = 5 * rand_AltinM;
            if (rand_AltinM == 25) {
                rand_AltinM = 20;
            }
            altinM[i] = rand_AltinM;
            String AltinM = Integer.toString(rand_AltinM);

            JLabel lb = new JLabel();
            lb.setForeground(Color.WHITE);
            lb.setFont(new Font("Verdana", 1, 20));
            lb.setText(AltinM);
            panels[rand_i][rand_j].add(lb);
        }

        for (int i = 0; i < gizli_altin_sayisi; i++) {

            rand_i = 1 + rand.nextInt((max1 - 2));
            rand_j = 1 + rand.nextInt(max2 - 2);
            for (int j = 0; j <= i; j++) {

                if (gizli_tut[j] == rand_i && gizli_tut2[j] == rand_j) {

                    rand_i = 1 + rand.nextInt(max1 - 2);
                    j = 0;
                }

            }
            for (int k = 0; k < tahtadaki_altin_sayisi; k++) {

                if (tut[k] == rand_i && tut2[k] == rand_j) {
                    rand_i = 1 + rand.nextInt(max1 - 2);
                }

            }

            int rand_gizliAltinM = 1 + (int) (Math.random() * 15) % 5;
            rand_gizliAltinM = 5 * rand_gizliAltinM;
            if (rand_gizliAltinM == 25) {
                rand_gizliAltinM = 20;
            }
            gizliAltinM[i] = rand_gizliAltinM;
            String rand_gizliAltinM1 = Integer.toString(rand_gizliAltinM);
            // System.out.println(rand_gizliAltinM1);
            if (rand_i != tut[i] && rand_j != tut2[i]) {
                panels[rand_i][rand_j].add(new JButton("g" + rand_gizliAltinM1)).setVisible(false);
                gizli_tut[i] = rand_i;
                gizli_tut2[i] = rand_j;

            } else {
                //System.out.println("!!!");
                i = i - 1;
            }
        }
        //System.out.println(gizli_tut);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 300);
    }

    public void CizdirmeA(A a, B b, C c, D d) throws InterruptedException, IOException {

        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter dosyayaz = new FileWriter(file, true);
        BufferedWriter yazdir = new BufferedWriter(dosyayaz);

        int baslangicSatir = 0;
        int baslangicSutun = 0;

        if (a.getAltin_miktari() <= 0) {
            CizdirmeB(a, b, c, d);
        } else {

            while (a.getAltin_miktari() > 0) {

                int artissatir = 1;
                int artissutun = 1;
                int bulunansatir = a.getKonumsatir();
                int bulunansutun = a.getKonumsutun();

                if (kontrolA == 1) {
                    baslangicSatir = bulunansatir;
                    baslangicSutun = bulunansutun;
                    //System.out.println("KONTROLE GİRDİ");
                    //System.out.println("Yeni hedef belirlenmeli");
                    kontrolA = 0;
                }
                //System.out.println("A bulunan konum :" + bulunansatir + " " + bulunansutun);
                //System.out.println("A Giris:Baslangic " + baslangicSatir + " " + baslangicSutun);

                if (hkonumtutxA == 0 && hkonumtutyA == 0) {
                    a.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    //System.out.println("İlk Hedef:BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxA = a.hedefKonumA[0][0];
                    hkonumtutyA = a.hedefKonumA[0][1];
                    //System.out.println("A İLK HEDEF" + a.hedefKonumA[0][0] + " " + a.hedefKonumA[0][1]);
                    CizdirmeA(a, b, c, d);
                } else if (baslangicSatir == a.hedefKonumA[0][0] && baslangicSutun == a.hedefKonumA[0][1]) {
                    //System.out.println("Yeni Hedef Belirleniyor");
                    a.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    // System.out.println("A   " + a.hedefKonumA[0][0] + " " + a.hedefKonumA[0][1]);
                    //System.out.println("Yeni BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxA = a.hedefKonumA[0][0];
                    hkonumtutyA = a.hedefKonumA[0][1];
                    CizdirmeA(a, b, c, d);
                } else {

                    int farkSutun = abs(a.hedefKonumA[0][1] - bulunansutun);
                    int farkSatir = abs(a.hedefKonumA[0][0] - bulunansatir);

                    //System.out.println("Hedef belli,A devam ediyor");
                    if (a.hedefKonumA[0][0] - bulunansatir < 0) {
                        artissatir = -1;
                        //System.out.println("1111111");
                    } else if (a.hedefKonumA[0][1] - bulunansutun < 0) {
                        artissutun = -1;
                        //System.out.println("222222");
                    }
                    if (bulunansatir != a.hedefKonumA[0][0] && (bulunansutun != a.hedefKonumA[0][1] || bulunansutun == a.hedefKonumA[0][1])) {
                        while (bulunansatir != a.hedefKonumA[0][0]) {
                            //System.out.println("A Satirda hareket baslangici");
                            if ((farkSatir - 3) >= 2 || (farkSatir % 3) == 0) {
                                //System.out.println(" A Satirda 3brm hareket");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 3 * artissatir][bulunansutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER     
                                yazdir.write("A Satırda->3 birim\n");

                                a.setKonumsatir(a.getKonumsatir() + 3 * artissatir);
                                bulunansatir = a.getKonumsatir();
                                bulunansutun = a.getKonumsutun();

                                if (bulunansatir == a.hedefKonumA[0][0]) {
                                    //System.out.println("Denk1 a");
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);

                                } else {
                                    yazdir.close();
                                    CizdirmeB(a, b, c, d);
                                }

                            } else if ((farkSatir - 3) >= 1 || (farkSatir % 3) == 2) {
                                //System.out.println("Satirda 2brm hareket");
                                panels[bulunansatir + artissatir][a.getKonumsutun()].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][a.getKonumsutun()].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("A Satırda->2 birim\n");

                                a.setKonumsatir(a.getKonumsatir() + 2 * artissatir);
                                bulunansatir = a.getKonumsatir();
                                bulunansutun = a.getKonumsutun();

                                if (a.hedefKonumA[0][0] == bulunansatir && a.hedefKonumA[0][1] != bulunansutun) {
                                    //System.out.println("2 birim satir sutunda 1brm hareket");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    yazdir.write("A Sutunda->1 birim\n");

                                    a.setKonumsutun(a.getKonumsutun() + artissutun);
                                    bulunansutun = a.getKonumsutun();
                                    bulunansatir = a.getKonumsatir();

                                    if (bulunansutun == a.hedefKonumA[0][1]) {
                                        //System.out.println("Denk2 A");
                                        yazdir.close();
                                        CizdirmeA(a, b, c, d);
                                    } else {
                                        yazdir.close();
                                        CizdirmeB(a, b, c, d);
                                    }

                                } else if (bulunansatir == a.hedefKonumA[0][0] && bulunansutun == a.hedefKonumA[0][1]) {
                                    //System.out.println("DENK3 A");
                                    CizdirmeA(a, b, c, d);
                                }
                            } else if ((farkSatir - 3) >= 0 || (farkSatir % 3) == 1) {
                                //System.out.println("A Satirda 1brm");
                                panels[bulunansatir + artissatir][a.getKonumsutun()].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("A Satırda->1 birim\n");

                                a.setKonumsatir(a.getKonumsatir() + artissatir);
                                bulunansatir = a.getKonumsatir();
                                bulunansutun = a.getKonumsutun();

                                if (bulunansatir == a.hedefKonumA[0][0] && bulunansutun == a.hedefKonumA[0][1]) {
                                    //System.out.println("Denk 4 A");
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);
                                } else if (a.hedefKonumA[0][0] == bulunansatir && a.hedefKonumA[0][1] != bulunansutun) { ///BURADA HATA VAR
                                    //System.out.println("A satirda 1brm 2 brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER 
                                    a.setKonumsutun(a.getKonumsutun() + artissutun);

                                    bulunansutun = a.getKonumsutun();

                                    if (bulunansutun == a.hedefKonumA[0][1]) {
                                        yazdir.write("A Sutunda->1 birim\n");
                                        yazdir.close();
                                        CizdirmeA(a, b, c, d);
                                    } else {
                                        panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                        TimeUnit.SECONDS.sleep(1); ///TIMER
                                        yazdir.write("A Sutunda->2 birim\n");
                                        a.setKonumsutun(a.getKonumsutun() + artissutun);

                                        bulunansutun = a.getKonumsutun();

                                        if (bulunansutun == a.hedefKonumA[0][1]) {
                                            //System.out.println("Denk5 A");
                                            yazdir.close();
                                            CizdirmeA(a, b, c, d);
                                        } else {
                                            yazdir.close();
                                            CizdirmeB(a, b, c, d);
                                        }
                                    }

                                }

                            }

                        }
                    } else if (bulunansatir == a.hedefKonumA[0][0] && bulunansutun != a.hedefKonumA[0][1]) {
                        while (bulunansutun != a.hedefKonumA[0][1]) {
                            //System.out.println("A Sutunda harekt baslangici");
                            if ((farkSutun - 3) >= 2 || (farkSutun % 3) == 0) {
                                //System.out.println("3 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 3 * artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("A Sutunda->3 birim\n");

                                a.setKonumsutun(a.getKonumsutun() + 3 * artissutun);
                                bulunansutun = a.getKonumsutun();

                                if (bulunansutun == a.hedefKonumA[0][1]) {
                                    //System.out.println("DENK 6 A");
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);
                                } else {
                                    yazdir.close();
                                    CizdirmeB(a, b, c, d);
                                }

                            } else if ((farkSutun - 3) >= 1 || (farkSutun % 3) == 2) {
                                //System.out.println("A 2 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("A Sutunda ->2 birim\n");
                                yazdir.close();

                                a.setKonumsutun(a.getKonumsutun() + 2 * artissutun);
                                bulunansutun = a.getKonumsutun();

                                CizdirmeA(a, b, c, d);

                            } else if ((farkSutun - 3) >= 0 || (farkSutun % 3) == 1) {
                                //System.out.println("A 1brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getA());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("A Sutunda->1 birim\n");
                                yazdir.close();

                                a.setKonumsutun(a.getKonumsutun() + artissutun);
                                bulunansutun = a.getKonumsutun();
                                CizdirmeA(a, b, c, d);
                            }
                        }
                    } else {
                        kontrolA = 1;
                        //System.out.println("DENK A");
                        panels[bulunansatir][bulunansutun].setBackground(Color.WHITE);
                        toplam_adimA = abs(baslangicSatir + baslangicSutun - bulunansatir - bulunansutun);
                        
                        kontrol_altin_mik_a++;

                        if (kontrol_altin_mik_a == 1) {
                            AltinMiktariA(a);
                            kontrol_altin_mik_a--;
                        }

                        System.out.println("A altin : " + a_altin_sayisi + " Adım Sayisi :" + toplam_adimA);
                        System.out.println("------------------------------");
                        baslangicSatir = bulunansatir;
                        baslangicSutun = bulunansutun;

                        CizdirmeB(a, b, c, d);
                    }

                }
            }
        }

    }

    public void CizdirmeB(A a, B b, C c, D d) throws InterruptedException, IOException {
        File file = new File("dosya.txt");

        FileWriter dosyayaz = new FileWriter(file, true);
        BufferedWriter yazdir = new BufferedWriter(dosyayaz);

        int baslangicSatir = 0;
        int baslangicSutun = 19;
        if (b.getAltin_miktari() <= 0) {
            CizdirmeC(a, b, c, d);
        } else {
            while (b.getAltin_miktari() > 0) {

                int artissatir = 1;
                int artissutun = 1;
                int bulunansatir = b.getKonumsatir();
                int bulunansutun = b.getKonumsutun();

                if (kontrolB == 1) {
                    baslangicSatir = bulunansatir;
                    baslangicSutun = bulunansutun;
                    //System.out.println("KONTROLE GİRDİ");
                    //System.out.println("Yeni hedef belirlenmeli");
                    kontrolB = 0;
                }
                //System.out.println("B bulunan konum :" + bulunansatir + " " + bulunansutun);
                //System.out.println("Giris:Baslangic" + baslangicSatir + " " + baslangicSutun);
                if (hkonumtutxB == 0 && hkonumtutyB == 0) {
                    b.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    //System.out.println("İlk Hedef:BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxB = b.hedefKonumB[0][0];
                    hkonumtutyB = b.hedefKonumB[0][1];
                    //System.out.println("İlk Hedef belirli   " + b.hedefKonumB[0][0] + " " + b.hedefKonumB[0][1]);//girdi
                    CizdirmeB(a, b, c, d);
                } else if (baslangicSatir == b.hedefKonumB[0][0] && baslangicSutun == b.hedefKonumB[0][1]) {
                    //System.out.println("Yeni Hedef Belirleniyor");
                    b.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    //System.out.println("B   " + b.hedefKonumB[0][0] + " " + b.hedefKonumB[0][1]);
                    //System.out.println("Yeni BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxB = b.hedefKonumB[0][0];
                    hkonumtutyB = b.hedefKonumB[0][1];
                    CizdirmeB(a, b, c, d);
                } else {

                    int farkSutun = abs(b.hedefKonumB[0][1] - bulunansutun);
                    int farkSatir = abs(b.hedefKonumB[0][0] - bulunansatir);

                    //System.out.println("Hedef belli, b devam ediyor");
                    if ((b.hedefKonumB[0][0] - bulunansatir) < 0) { ///HATA VAR 
                        artissatir = -1;
                        //System.out.println("1111111");
                    } else if ((b.hedefKonumB[0][1] - bulunansutun) < 0) {
                        artissutun = -1;
                        //System.out.println("2222222");
                    }

                    //Satırda Hareket
                    if (bulunansatir != b.hedefKonumB[0][0] && (bulunansutun != b.hedefKonumB[0][1] || bulunansutun == b.hedefKonumB[0][1])) {
                        while (bulunansatir != b.hedefKonumB[0][0]) {
                            //System.out.println("Satirda hareket baslangici");
                            if ((farkSatir - 3) >= 2 || (farkSatir % 3) == 0) {
                                //System.out.println("Satirda hareket 3brm");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 3 * artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER          
                                yazdir.write("B Satırda->3 birim\n");
                                b.setKonumsatir(b.getKonumsatir() + 3 * artissatir);
                                bulunansatir = b.getKonumsatir();
                                bulunansutun = b.getKonumsutun();
                                if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                    //System.out.println("Denk1");
                                    yazdir.close();
                                    CizdirmeB(a, b, c, d);
                                } else if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun != b.hedefKonumB[0][1]) {
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);
                                } else {
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);
                                }

                            } else if ((farkSatir - 3) >= 1 || (farkSatir % 3) == 2) {
                                //System.out.println("Satirda 2brm hareket");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("B Satırda->2 birim\n");
                                b.setKonumsatir(b.getKonumsatir() + 2 * artissatir);
                                bulunansatir = b.getKonumsatir();
                                bulunansutun = b.getKonumsutun();
                                if (b.hedefKonumB[0][0] == bulunansatir && b.hedefKonumB[0][1] != bulunansutun) {
                                    //System.out.println("2 brm satir 1brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    yazdir.write("B Sutunda->1 birim\n");
                                    b.setKonumsutun(b.getKonumsutun() + artissutun);
                                    bulunansutun = b.getKonumsutun();
                                    bulunansatir = b.getKonumsatir();
                                    if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                        //System.out.println("Denk2");
                                        yazdir.close();
                                        CizdirmeB(a, b, c, d);
                                    } else {
                                        yazdir.close();
                                        CizdirmeC(a, b, c, d);
                                    }
                                } else if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                    //System.out.println("Denk3");
                                    CizdirmeB(a, b, c, d);
                                }
                            } else if ((farkSatir - 3) >= 0 || (farkSatir % 3) == 1) {
                                //System.out.println("Satirda 1brm");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("B Satırda->1 birim\n");
                                b.setKonumsatir(b.getKonumsatir() + artissatir);
                                bulunansatir = b.getKonumsatir();
                                if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                    //System.out.println("Denk4");
                                    yazdir.close();
                                    CizdirmeB(a, b, c, d);
                                } else if (bulunansatir == b.hedefKonumB[0][0] && b.hedefKonumB[0][1] != bulunansutun) {
                                    //System.out.println("Satirda 1brm 2 brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    b.setKonumsutun(b.getKonumsutun() + artissutun);
                                    bulunansutun = b.getKonumsutun();
                                    if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                        yazdir.write("B sütunda->1 birim\n");
                                        yazdir.close();
                                        CizdirmeB(a, b, c, d);
                                    } else {
                                        panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                        TimeUnit.SECONDS.sleep(1); ///TIMER
                                        yazdir.write("B sutunda->2 birim\n");
                                        b.setKonumsutun(b.getKonumsutun() + artissutun);
                                        bulunansutun = b.getKonumsutun();
                                        if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun == b.hedefKonumB[0][1]) {
                                            //System.out.println("Denk5");
                                            yazdir.close();
                                            CizdirmeB(a, b, c, d);
                                        } else {
                                            yazdir.close();
                                            CizdirmeC(a, b, c, d);
                                        }
                                    }
                                }

                            }
                        }
                    } else if (bulunansatir == b.hedefKonumB[0][0] && bulunansutun != b.hedefKonumB[0][1]) {
                        while (bulunansutun != b.hedefKonumB[0][1]) {
                            //System.out.println("Sutunda harekt baslangici");
                            if ((farkSutun - 3) >= 2 || (farkSutun % 3) == 0) {
                                //System.out.println("3 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 3 * artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("B Sutunda->3 birim\n");
                                b.setKonumsutun(b.getKonumsutun() + 3 * artissutun);
                                bulunansutun = b.getKonumsutun();

                                if (bulunansutun == b.hedefKonumB[0][1]) {
                                    yazdir.close();
                                    //System.out.println("Denk6");
                                    CizdirmeB(a, b, c, d);

                                } else {
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);
                                }

                            } else if ((farkSutun - 3) >= 1 || (farkSutun % 3) == 2) {
                                //System.out.println("2brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("B Sutunda->2 birim\n");
                                yazdir.close();
                                b.setKonumsutun(b.getKonumsutun() + 2 * artissutun);
                                bulunansutun = b.getKonumsutun();
                                CizdirmeB(a, b, c, d);

                            } else if ((farkSutun - 3) >= 0 || (farkSutun % 3) == 1) {
                                //System.out.println("1brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getB());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("B Sutunda->1 birim\n");
                                yazdir.close();
                                b.setKonumsutun(b.getKonumsutun() + artissutun);
                                bulunansutun = b.getKonumsutun();
                                CizdirmeB(a, b, c, d);
                            }

                        }

                    } //Hedefe ulaşıldı mı ?
                    else {
                        kontrolB = 1;
                        //System.out.println("Denk");
                        panels[bulunansatir][bulunansutun].setBackground(Color.WHITE);
                        toplam_adimB = abs(baslangicSatir - baslangicSutun - bulunansatir + bulunansutun);
                        
                        kontrol_altin_mik_b++;

                        if (kontrol_altin_mik_b == 1) {
                            AltinMiktariB(b);
                            kontrol_altin_mik_b--;
                        }

                        System.out.println("B altin : " + b_altin_sayisi + " Adım Sayisi :" + toplam_adimB);
                        System.out.println("------------------------------");
                        baslangicSutun = bulunansutun;
                        baslangicSatir = bulunansatir;
                        
                        CizdirmeC(a,b,c,d);

                    }
                }
            }
        }
    }

    public void CizdirmeC(A a, B b, C c, D d) throws InterruptedException, IOException {
        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter dosyayaz = new FileWriter(file, true);
        BufferedWriter yazdir = new BufferedWriter(dosyayaz);

        int baslangicSatir = 19;
        int baslangicSutun = 19;

        if (c.getAltin_miktari() <= 0) {
            CizdirmeD(a, b, c, d);
        } else {

            while (c.getAltin_miktari() > 0) {

                int artissatir = 1;
                int artissutun = 1;
                int bulunansatir = c.getKonumsatir();
                int bulunansutun = c.getKonumsutun();

                if (kontrolC == 1) {
                    baslangicSatir = bulunansatir;
                    baslangicSutun = bulunansutun;
                    //System.out.println("KONTROLE GİRDİ");
                    //System.out.println("Yeni hedef belirlenmeli");
                    kontrolC = 0;
                }
                // System.out.println("C bulunan konum :" + bulunansatir + " " + bulunansutun);
                //System.out.println("C Giris:Baslangic " + baslangicSatir + " " + baslangicSutun);
                if (hkonumtutxC == 0 && hkonumtutyC == 0) {
                    c.hedefBelirle(tut, tut2, gizli_tut, gizli_tut2, gizli_altin_sayisi, gizliAltinM, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    
                    //System.out.println("Gizli Atın Konum: " + gizli_tut[c.gizli_nokta] + " " + gizli_tut2[c.gizli_nokta]);
                    //System.out.println("İlk Hedef:BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxC = c.hedefKonumC[0][0];
                    hkonumtutyC = c.hedefKonumC[0][1];
                    //System.out.println("İlk Hedef belirli   " + c.hedefKonumC[0][0] + " " + c.hedefKonumC[0][1]);//girdi
                    CizdirmeC(a, b, c, d);
                } else if (baslangicSatir == c.hedefKonumC[0][0] && baslangicSutun == c.hedefKonumC[0][1]) {
                    //System.out.println("Yeni Hedef Belirleniyor");
                    c.hedefBelirle(tut, tut2, gizli_tut, gizli_tut2, gizli_altin_sayisi, gizliAltinM, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    
                 
                    //System.out.println("Gizli Atın Konum: " + gizli_tut[c.gizli_nokta] + " " + gizli_tut2[c.gizli_nokta]);
                    //System.out.println("C   " + c.hedefKonumC[0][0] + " " + c.hedefKonumC[0][1]);
                    //System.out.println("Yeni BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxC = c.hedefKonumC[0][0];
                    hkonumtutyC = c.hedefKonumC[0][1];
                    CizdirmeC(a, b, c, d);
                } else {

                    int farkSutun = abs(c.hedefKonumC[0][1] - bulunansutun);
                    int farkSatir = abs(c.hedefKonumC[0][0] - bulunansatir);

                    //System.out.println("Hedef belli,C devam ediyor");
                    if (c.hedefKonumC[0][0] - bulunansatir < 0) {
                        artissatir = -1;
                        //System.out.println("1111111");
                    }
                    if (c.hedefKonumC[0][1] - bulunansutun < 0) {
                        artissutun = -1;
                        //System.out.println("222222");
                    }
                    if (bulunansatir != c.hedefKonumC[0][0] && (bulunansutun != c.hedefKonumC[0][1] || bulunansutun == c.hedefKonumC[0][1])) {
                        while (bulunansatir != c.hedefKonumC[0][0]) {
                            //System.out.println("C Satirda hareket baslangici");
                            if ((farkSatir - 3) >= 2 || (farkSatir % 3) == 0) {
                                //System.out.println(" C Satirda 3brm hareket");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 3 * artissatir][bulunansutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER     
                                yazdir.write("C Satırda->3 birim\n");

                                c.setKonumsatir(c.getKonumsatir() + 3 * artissatir);
                                bulunansatir = c.getKonumsatir();
                                bulunansutun = c.getKonumsutun();

                                if (bulunansatir == c.hedefKonumC[0][0]) {
                                    //System.out.println("Denk1 a");
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);

                                } else {
                                    yazdir.close();
                                    CizdirmeD(a, b, c, d);
                                }

                            } else if ((farkSatir - 3) >= 1 || (farkSatir % 3) == 2) {
                                //System.out.println("Satirda 2brm hareket");
                                panels[bulunansatir + artissatir][c.getKonumsutun()].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][c.getKonumsutun()].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("C Satırda->2 birim\n");

                                c.setKonumsatir(c.getKonumsatir() + 2 * artissatir);
                                bulunansatir = c.getKonumsatir();
                                bulunansutun = c.getKonumsutun();

                                if (c.hedefKonumC[0][0] == bulunansatir && c.hedefKonumC[0][1] != bulunansutun) {
                                    //System.out.println("2 birim satir sutunda 1brm hareket");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    yazdir.write("C Sutunda->1 birim\n");

                                    c.setKonumsutun(c.getKonumsutun() + artissutun);
                                    bulunansutun = c.getKonumsutun();
                                    bulunansatir = c.getKonumsatir();

                                    if (bulunansutun == c.hedefKonumC[0][1]) {
                                        //System.out.println("Denk2 C");
                                        yazdir.close();
                                        CizdirmeC(a, b, c, d);
                                    } else {
                                        yazdir.close();
                                        CizdirmeD(a, b, c, d);
                                    }

                                } else if (bulunansatir == c.hedefKonumC[0][0] && bulunansutun == c.hedefKonumC[0][1]) {
                                    //System.out.println("DENK3 C");
                                    CizdirmeC(a, b, c, d);
                                }
                            } else if ((farkSatir - 3) >= 0 || (farkSatir % 3) == 1) {
                                //System.out.println("C Satirda 1brm");
                                panels[bulunansatir + artissatir][c.getKonumsutun()].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("C Satırda->1 birim\n");

                                c.setKonumsatir(c.getKonumsatir() + artissatir);
                                bulunansatir = c.getKonumsatir();
                                bulunansutun = c.getKonumsutun();

                                if (bulunansatir == a.hedefKonumA[0][0] && bulunansutun == a.hedefKonumA[0][1]) {
                                    //System.out.println("Denk 4 C");
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);
                                } else if (c.hedefKonumC[0][0] == bulunansatir && c.hedefKonumC[0][1] != bulunansutun) {
                                    //System.out.println("C satirda 1brm 2 brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER 
                                    c.setKonumsutun(c.getKonumsutun() + artissutun);

                                    bulunansutun = c.getKonumsutun();

                                    if (bulunansutun == c.hedefKonumC[0][1]) {
                                        yazdir.write("C Sutunda->1 birim\n");
                                        yazdir.close();
                                        CizdirmeC(a, b, c, d);
                                    } else {
                                        panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                        TimeUnit.SECONDS.sleep(1); ///TIMER
                                        yazdir.write("C Sutunda->2 birim\n");
                                        c.setKonumsutun(c.getKonumsutun() + artissutun);

                                        bulunansutun = c.getKonumsutun();

                                        if (bulunansutun == c.hedefKonumC[0][1]) {
                                            //System.out.println("Denk5 A");
                                            yazdir.close();
                                            CizdirmeC(a, b, c, d);
                                        } else {
                                            yazdir.close();
                                            CizdirmeD(a, b, c, d);
                                        }
                                    }

                                }

                            }

                        }
                    } else if (bulunansatir == c.hedefKonumC[0][0] && bulunansutun != c.hedefKonumC[0][1]) {
                        while (bulunansutun != c.hedefKonumC[0][1]) {
                            //System.out.println("C Sutunda harekt baslangici");
                            if ((farkSutun - 3) >= 2 || (farkSutun % 3) == 0) {
                                //System.out.println("3 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 3 * artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("C Sutunda->3 birim\n");

                                c.setKonumsutun(c.getKonumsutun() + 3 * artissutun);
                                bulunansutun = c.getKonumsutun();

                                if (bulunansutun == c.hedefKonumC[0][1]) {
                                    //System.out.println("DENK 6 C");
                                    yazdir.close();
                                    CizdirmeC(a, b, c, d);
                                } else {
                                    yazdir.close();
                                    CizdirmeD(a, b, c, d);
                                }

                            } else if ((farkSutun - 3) >= 1 || (farkSutun % 3) == 2) {
                                //System.out.println("C 2 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("C Sutunda->2 birim\n");
                                yazdir.close();

                                c.setKonumsutun(c.getKonumsutun() + 2 * artissutun);
                                bulunansutun = c.getKonumsutun();

                                CizdirmeC(a, b, c, d);

                            } else if ((farkSutun - 3) >= 0 || (farkSutun % 3) == 1) {
                                //System.out.println("C 1brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getC());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("C Sutunda->1 birim\n");
                                yazdir.close();

                                c.setKonumsutun(c.getKonumsutun() + artissutun);
                                bulunansutun = c.getKonumsutun();
                                CizdirmeC(a, b, c, d);
                            }
                        }
                    } else {
                        kontrolC = 1;
                        //System.out.println("DENK C");
                        panels[bulunansatir][bulunansutun].setBackground(Color.WHITE);
                        toplam_adimC = abs(baslangicSatir + baslangicSutun - bulunansatir - bulunansutun);
                      
                        kontrol_altin_mik_c++;

                        if (kontrol_altin_mik_c == 1) {
                            AltinMiktariC(c);
                            kontrol_altin_mik_c--;
                        }
                        System.out.println("C altin : " + c_altin_sayisi + " Adım Sayisi :" + toplam_adimC);
                        System.out.println("------------------------------");
                        baslangicSatir = bulunansatir;
                        baslangicSutun = bulunansutun;
                        
                        while(k<gizli_altin_sayisi){
                         String AltinM = Integer.toString(gizliAltinM[k]);
                         gizli.setForeground(Color.ORANGE);
                         gizli.setFont(new Font("Verdana", 1, 20));
                         gizli.setText(AltinM);
                         panels[gizli_tut[k]][gizli_tut2[k]].add(gizli);
                         k++;
                         break;
                        }
                        
                        
                        
                        CizdirmeD(a, b, c, d);
                        
                    }

                }
            }
        }
    }

    public void CizdirmeD(A a, B b, C c, D d) throws InterruptedException, IOException {
        File file = new File("dosya.txt");

        FileWriter dosyayaz = new FileWriter(file, true);
        BufferedWriter yazdir = new BufferedWriter(dosyayaz);

        int baslangicSatir = 19;
        int baslangicSutun = 0;
        if (d.getAltin_miktari() <= 0) {
            CizdirmeA(a, b, c, d);
        } else {
            while (d.getAltin_miktari() > 0) {

                int artissatir = 1;
                int artissutun = 1;
                int bulunansatir = d.getKonumsatir();
                int bulunansutun = d.getKonumsutun();

                if (kontrolD == 1) {
                    baslangicSatir = bulunansatir;
                    baslangicSutun = bulunansutun;
                    //System.out.println("KONTROLE GİRDİ");
                    //System.out.println("Yeni hedef belirlenmeli");
                    kontrolD = 0;
                }
                //System.out.println("D bulunan konum :" + bulunansatir + " " + bulunansutun);
                //System.out.println("Giris:Baslangic" + baslangicSatir + " " + baslangicSutun);
                if (hkonumtutxD == 0 && hkonumtutyD == 0) {
                    d.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    //System.out.println("İlk Hedef:BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxD = d.hedefKonumD[0][0];
                    hkonumtutyD = d.hedefKonumD[0][1];
                    //System.out.println("İlk Hedef belirli   " + d.hedefKonumD[0][0] + " " + d.hedefKonumD[0][1]);//girdi
                    CizdirmeD(a, b, c, d);
                } else if (baslangicSatir == d.hedefKonumD[0][0] && baslangicSutun == d.hedefKonumD[0][1]) {
                    //System.out.println("Yeni Hedef Belirleniyor");
                    d.hedefBelirle(tut, tut2, altinM, tahtadaki_altin_sayisi, baslangicSatir, baslangicSutun);
                    //System.out.println("B   " + d.hedefKonumD[0][0] + " " + d.hedefKonumD[0][1]);
                    //System.out.println("Yeni BASLANGIC" + baslangicSatir + baslangicSutun);
                    hkonumtutxD = d.hedefKonumD[0][0];
                    hkonumtutyD = d.hedefKonumD[0][1];
                    CizdirmeD(a, b, c, d);
                } else {

                    int farkSutun = abs(d.hedefKonumD[0][1] - bulunansutun);
                    int farkSatir = abs(d.hedefKonumD[0][0] - bulunansatir);

                    //System.out.println("Hedef belli, b devam ediyor");
                    if ((d.hedefKonumD[0][0] - bulunansatir) < 0) { ///HATA VAR 
                        artissatir = -1;
                        //System.out.println("1111111");
                    } else if ((d.hedefKonumD[0][1] - bulunansutun) < 0) {
                        artissutun = -1;
                        //System.out.println("2222222");
                    }

                    //Satırda Hareket
                    if (bulunansatir != d.hedefKonumD[0][0] && (bulunansutun != d.hedefKonumD[0][1] || bulunansutun == d.hedefKonumD[0][1])) {
                        while (bulunansatir != d.hedefKonumD[0][0]) {
                            //System.out.println("Satirda hareket baslangici");
                            if ((farkSatir - 3) >= 2 || (farkSatir % 3) == 0) {
                                //System.out.println("Satirda hareket 3brm");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 3 * artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER          
                                yazdir.write("D Satırda->3 birim\n");
                                d.setKonumsatir(d.getKonumsatir() + 3 * artissatir);
                                bulunansatir = d.getKonumsatir();
                                bulunansutun = d.getKonumsutun();
                                if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                    //System.out.println("Denk1 D");
                                    yazdir.close();
                                    CizdirmeD(a, b, c, d);
                                } else if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun != d.hedefKonumD[0][1]) {
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);
                                } else {
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);
                                }

                            } else if ((farkSatir - 3) >= 1 || (farkSatir % 3) == 2) {
                                //System.out.println("Satirda 2brm hareket");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir + 2 * artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("D Satırda->2 birim\n");
                                d.setKonumsatir(d.getKonumsatir() + 2 * artissatir);
                                bulunansatir = d.getKonumsatir();
                                bulunansutun = d.getKonumsutun();
                                if (d.hedefKonumD[0][0] == bulunansatir && d.hedefKonumD[0][1] != bulunansutun) {
                                    //System.out.println("2 brm satir 1brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    yazdir.write("D Sutunda->1 birim\n");
                                    d.setKonumsutun(d.getKonumsutun() + artissutun);
                                    bulunansutun = d.getKonumsutun();
                                    bulunansatir = d.getKonumsatir();
                                    if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                        //System.out.println("Denk2 D");
                                        yazdir.close();
                                        CizdirmeD(a, b, c, d);
                                    } else {
                                        yazdir.close();
                                        CizdirmeA(a, b, c, d);
                                    }
                                } else if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                    //System.out.println("Denk3 D");
                                    CizdirmeD(a, b, c, d);
                                }
                            } else if ((farkSatir - 3) >= 0 || (farkSatir % 3) == 1) {
                                //System.out.println("Satirda 1brm");
                                panels[bulunansatir + artissatir][bulunansutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("D Satırda->1 birim\n");
                                d.setKonumsatir(d.getKonumsatir() + artissatir);
                                bulunansatir = d.getKonumsatir();
                                if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                    //System.out.println("Denk4 D");
                                    yazdir.close();
                                    CizdirmeD(a, b, c, d);
                                } else if (bulunansatir == d.hedefKonumD[0][0] && d.hedefKonumD[0][1] != bulunansutun) {
                                    //System.out.println("Satirda 1brm 2 brm sutun");
                                    panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                    TimeUnit.SECONDS.sleep(1); ///TIMER
                                    d.setKonumsutun(d.getKonumsutun() + artissutun);
                                    bulunansutun = d.getKonumsutun();
                                    if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                        yazdir.write("D Sutunda->1 birim\n");
                                        yazdir.close();
                                        CizdirmeD(a, b, c, d);
                                    } else {
                                        panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                        TimeUnit.SECONDS.sleep(1); ///TIMER
                                        yazdir.write("D Sutunda->2 birim\n");
                                        d.setKonumsutun(d.getKonumsutun() + artissutun);
                                        bulunansutun = d.getKonumsutun();
                                        if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun == d.hedefKonumD[0][1]) {
                                            //System.out.println("Denk5 D");
                                            yazdir.close();
                                            CizdirmeD(a, b, c, d);
                                        } else {
                                            yazdir.close();
                                            CizdirmeA(a, b, c, d);
                                        }
                                    }
                                }

                            }
                        }
                    } else if (bulunansatir == d.hedefKonumD[0][0] && bulunansutun != d.hedefKonumD[0][1]) {
                        while (bulunansutun != d.hedefKonumD[0][1]) {
                            //System.out.println("Sutunda harekt baslangici");
                            if ((farkSutun - 3) >= 2 || (farkSutun % 3) == 0) {
                                //System.out.println("3 brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 3 * artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("D Sutunda->3 birim\n");
                                d.setKonumsutun(d.getKonumsutun() + 3 * artissutun);
                                bulunansutun = d.getKonumsutun();

                                if (bulunansutun == d.hedefKonumD[0][1]) {
                                    yazdir.close();
                                    //System.out.println("Denk6");
                                    CizdirmeD(a, b, c, d);

                                } else {
                                    yazdir.close();
                                    CizdirmeA(a, b, c, d);
                                }

                            } else if ((farkSutun - 3) >= 1 || (farkSutun % 3) == 2) {
                                //System.out.println("2brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                panels[bulunansatir][bulunansutun + 2 * artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("D Sutunda->2 birim\n");
                                yazdir.close();
                                d.setKonumsutun(d.getKonumsutun() + 2 * artissutun);
                                bulunansutun = d.getKonumsutun();
                                CizdirmeD(a, b, c, d);

                            } else if ((farkSutun - 3) >= 0 || (farkSutun % 3) == 1) {
                                //System.out.println("1brm sutun");
                                panels[bulunansatir][bulunansutun + artissutun].setBackground(getD());
                                TimeUnit.SECONDS.sleep(1); ///TIMER
                                yazdir.write("D Sutunda->1 birim\n");
                                yazdir.close();
                                d.setKonumsutun(d.getKonumsutun() + artissutun);
                                bulunansutun = d.getKonumsutun();
                                CizdirmeD(a, b, c, d);
                            }

                        }

                    } //Hedefe ulaşıldı mı ?
                    else {
                        kontrolD = 1;
                        //System.out.println("Denk");
                        panels[bulunansatir][bulunansutun].setBackground(Color.WHITE);
                        toplam_adimD = abs(baslangicSatir - baslangicSutun - bulunansatir + bulunansutun);
                       
                        kontrol_altin_mik_d++;

                        if (kontrol_altin_mik_d == 1) {
                            AltinMiktariD(d);
                            kontrol_altin_mik_d--;
                        }
                        System.out.println("D altin : " + d_altin_sayisi + " Adım Sayisi :" + toplam_adimD);
                        System.out.println("------------------------------");

                        baslangicSatir = bulunansatir;
                        baslangicSutun = bulunansutun;
                        CizdirmeA(a, b, c, d);

                    }

                }
            }
        }
    }

    public int AltinMiktariA(A a) {

        int bolum = toplam_adimA / 3;
        int kalan = toplam_adimA % 3;
        
        if (kalan > 0) {
            kalan = 1;
        } else {
            kalan = 0;
        }
        int toplam = bolum + kalan;
        int toplam_maliyet = toplam * a_hamle_maliyeti;
        toplam_maliyet += a_hedef_belirleme_maliyeti;
        a_altin_sayisi -= toplam_maliyet;

        harcananAltinA += toplam_maliyet;
        System.out.println("A Harcanan altın miktarı : " + harcananAltinA);
        toplananAltinA += altinM[a.getHedefnokta()];
        System.out.println("Toplanan altın sayısı : " + toplananAltinA);
        a_altin_sayisi += altinM[a.getHedefnokta()];

        a.setAltin_miktari(a_altin_sayisi);
        return a_altin_sayisi;
    }

    public int AltinMiktariB(B b) {

        int bolum = toplam_adimB / 3;
        int kalan = toplam_adimB % 3;
        if (kalan > 0) {
            kalan = 1;
        } else {
            kalan = 0;
        }
        int toplam = bolum + kalan;
        int toplam_maliyet = toplam * b_hamle_maliyeti;
        toplam_maliyet += b_hedef_belirleme_maliyeti;
        b_altin_sayisi -= toplam_maliyet;
        harcananAltinB += toplam_maliyet;
        System.out.println("B Harcanan altın miktarı : " + harcananAltinB);
        toplananAltinB += altinM[b.getHedefnokta()];
        System.out.println("Toplanan altın sayısı : " + toplananAltinB);
        b_altin_sayisi += altinM[b.getHedefnokta()];

        b.setAltin_miktari(b_altin_sayisi);
        return b_altin_sayisi;
    }

    public int AltinMiktariC(C c) {
        int bolum = toplam_adimC / 3;
        int kalan = toplam_adimC % 3;
     
        if (kalan > 0) {
            kalan = 1;
        } else {
            kalan = 0;
        }
        int toplam = bolum + kalan;
        int toplam_maliyet = toplam * c_hamle_maliyeti;
        toplam_maliyet += c_hedef_belirleme_maliyeti;
        c_altin_sayisi -= toplam_maliyet;
        harcananAltinC += toplam_maliyet;
        System.out.println("C Harcanan altın miktarı : " + harcananAltinC);
        toplananAltinC += altinM[c.getNokta()];
        System.out.println("Toplanan altın sayısı : " + toplananAltinC);
        c_altin_sayisi += altinM[c.getNokta()];

        c.setAltin_miktari(c_altin_sayisi);
        return c_altin_sayisi;
    }

    public int AltinMiktariD(D d) {

        int bolum = toplam_adimD / 3;
        int kalan = toplam_adimD % 3;
       
 
        if (kalan > 0) {
            kalan = 1;
        } else {
            kalan = 0;
        }
        int toplam = bolum + kalan;
        int toplam_maliyet = toplam * d_hamle_maliyeti;
        toplam_maliyet += d_hedef_belirleme_maliyeti;
        d_altin_sayisi -= toplam_maliyet;
        harcananAltinD += toplam_maliyet;
        System.out.println("D Harcanan altın miktarı : " + harcananAltinD);
        toplananAltinD += altinM[d.getHedefnokta()];
        System.out.println("Toplanan altın sayısı : " + toplananAltinD);
        
        d_altin_sayisi += altinM[d.getHedefnokta()];

        d.setAltin_miktari(d_altin_sayisi);
        return d_altin_sayisi;
    }

    /**
     * @return the max1
     */
    public static int getMax1() {
        return max1;
    }

    /**
     * @param aMax1 the max1 to set
     */
    public static void setMax1(int aMax1) {
        max1 = aMax1;
    }

    /**
     * @return the max2
     */
    public static int getMax2() {
        return max2;
    }

    /**
     * @param aMax2 the max2 to set
     */
    public static void setMax2(int aMax2) {
        max2 = aMax2;
    }

    /**
     * @return the tahtadaki_altin_sayisi
     */
    public static int getTahtadaki_altin_sayisi() {
        return tahtadaki_altin_sayisi;
    }

    /**
     * @param aTahtadaki_altin_sayisi the tahtadaki_altin_sayisi to set
     */
    public static void setTahtadaki_altin_sayisi(int aTahtadaki_altin_sayisi) {
        tahtadaki_altin_sayisi = aTahtadaki_altin_sayisi;
    }

    /**
     * @return the baslangic_altin_sayisi
     */
    public static int getBaslangic_altin_sayisi() {
        return baslangic_altin_sayisi;
    }

    /**
     * @param aBaslangic_altin_sayisi the baslangic_altin_sayisi to set
     */
    public static void setBaslangic_altin_sayisi(int aBaslangic_altin_sayisi) {
        baslangic_altin_sayisi = aBaslangic_altin_sayisi;
    }

    /**
     * @return the gizli_altin_sayisi
     */
    public static int getGizli_altin_sayisi() {
        return gizli_altin_sayisi;
    }

    /**
     * @param aGizli_altin_sayisi the gizli_altin_sayisi to set
     */
    public static void setGizli_altin_sayisi(int aGizli_altin_sayisi) {
        gizli_altin_sayisi = aGizli_altin_sayisi;
    }

    /**
     * @return the hamle_sayisi
     */
    public static int getHamle_sayisi() {
        return hamle_sayisi;
    }

    /**
     * @param aHamle_sayisi the hamle_sayisi to set
     */
    public static void setHamle_sayisi(int aHamle_sayisi) {
        hamle_sayisi = aHamle_sayisi;
    }

    /**
     * @return the a_label
     */
    public JLabel getA_label() {
        return a_label;
    }

    /**
     * @param a_label the a_label to set
     */
    public void setA_label(JLabel a_label) {
        this.a_label = a_label;
    }

    /**
     * @return the b_label
     */
    public JLabel getB_label() {
        return b_label;
    }

    /**
     * @param b_label the b_label to set
     */
    public void setB_label(JLabel b_label) {
        this.b_label = b_label;
    }

    /**
     * @return the c_label
     */
    public JLabel getC_label() {
        return c_label;
    }

    /**
     * @param c_label the c_label to set
     */
    public void setC_label(JLabel c_label) {
        this.c_label = c_label;
    }

    /**
     * @return the d_label
     */
    public JLabel getD_label() {
        return d_label;
    }

    /**
     * @param d_label the d_label to set
     */
    public void setD_label(JLabel d_label) {
        this.d_label = d_label;
    }

    /**
     * @return the renk2
     */
    public Color getRenk2() {
        return renk2;
    }

    /**
     * @param renk2 the renk2 to set
     */
    public void setRenk2(Color renk2) {
        this.renk2 = renk2;
    }

    /**
     * @return the a
     */
    public Color getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Color a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Color getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Color b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Color getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Color c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public Color getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Color d) {
        this.d = d;
    }

    /**
     * @return the temp
     */
    public Color getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(Color temp) {
        this.temp = temp;
    }

    public Random getRand() {
        return rand;
    }

    /**
     * @param rand the rand to set
     */
    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int[] getGizli_tut() {
        return gizli_tut;
    }

    /**
     * @param gizli_tut the gizli_tut to set
     */
    public void setGizli_tut(int[] gizli_tut) {
        this.gizli_tut = gizli_tut;
    }

}
