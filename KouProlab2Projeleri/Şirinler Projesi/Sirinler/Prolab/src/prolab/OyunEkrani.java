/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import prolab.GFG.Graph;
import prolab.GFG.*;
import java.util.Random;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import prolab.Dusmanpackage.Dusman;

import static prolab.Main.matris;
import static prolab.Main.baslangicDusman;
import prolab.Oyuncupackage.Oyuncu;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JLabel;
import prolab.Oyuncupackage.GozlukluSirin;
import prolab.Oyuncupackage.TembelSirin;
import prolab.GFG.*;
import prolab.Obje.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import prolab.Main.*;
import prolab.GameOver.*;

/**
 *
 * @author Arthas
 */
public class OyunEkrani extends JFrame {
    // TimerTask AltinEkle;
    // TimerTask MantarEkle;

    Random r = new Random();
    int x = 5;
    int y = 6;
    JPanel[][] panels;
    JButton sirin = new JButton();
    JLabel oyuncuPuani = new JLabel();
    JLabel d1 = new JLabel();
    JLabel d2 = new JLabel();
    JLabel sirine = new JLabel();
    TembelSirin tembelSirin = new TembelSirin();
    GozlukluSirin gozlukluSirin = new GozlukluSirin();
    JLabel mantar1 = new JLabel();
    JLabel altın1 = new JLabel();
    JLabel altın2 = new JLabel();
    JLabel altın3 = new JLabel();
    JLabel altın4 = new JLabel();
    JLabel altın5 = new JLabel();

    JFrame frame;
    int sayac = 0;
    int adimsayac1 = gozlukluSirin.getAdimS();
    int adimsayac2 = tembelSirin.getAdimS();
    int adimsayac;

    int zaman = 0;
    int[][] altınKonum = new int[5][2];
    int[][] mantarKonum = new int[1][2];
    int objeX = 0;
    int objeY = 0;
    int mantarX = 0;
    int mantarY = 0;
    int adet = 0;
    int src = 0;
    int dest = 0;
    int V = 1000;
    Graph g = new Graph(V);
    int[][] pathMatris1 = new int[100][2];
    int[][] pathMatris2 = new int[100][2];
    Dusman dusman1;
    Dusman dusman2;
    int i, n, m, o, k, j;
    int dusman1N, dusman2N, dusman1M, dusman2M;
    KeyListener listener;
    TimerTask MantarEkle;
    Timer timer;
    TimerTask AltinEkle;

    public OyunEkrani(Oyuncu oyuncu) {
        g.addEdge(03, 13, 2);
        g.addEdge(13, 03, 2);
        g.addEdge(50, 51, 2);
        g.addEdge(51, 50, 2);
        g.addEdge(103, 93, 2);
        g.addEdge(93, 103, 2);
        g.addEdge(10, 110, 2);
        g.addEdge(110, 10, 2);
        g.addEdge(11, 21, 2);
        g.addEdge(21, 11, 2);
        g.addEdge(11, 12, 2);
        g.addEdge(12, 11, 2);
        g.addEdge(12, 13, 2);
        g.addEdge(13, 12, 2);
        g.addEdge(13, 14, 2);
        g.addEdge(14, 13, 2);
        g.addEdge(13, 23, 2);
        g.addEdge(23, 13, 2);
        g.addEdge(23, 24, 2);
        g.addEdge(24, 23, 2);
        g.addEdge(24, 25, 2);
        g.addEdge(25, 24, 2);
        g.addEdge(24, 34, 2);
        g.addEdge(34, 24, 2);
        g.addEdge(23, 33, 2);
        g.addEdge(33, 23, 2);
        g.addEdge(12, 13, 2);
        g.addEdge(13, 12, 2);
        g.addEdge(14, 14, 2);
        g.addEdge(24, 14, 2);
        g.addEdge(33, 34, 2);
        g.addEdge(34, 33, 2);
        g.addEdge(33, 32, 2);
        g.addEdge(32, 33, 2);
        g.addEdge(21, 31, 2);
        g.addEdge(31, 21, 2);
        g.addEdge(31, 32, 2);
        g.addEdge(32, 31, 2);
        g.addEdge(31, 41, 2);
        g.addEdge(41, 31, 2);
        g.addEdge(41, 51, 2);
        g.addEdge(51, 41, 2);
        g.addEdge(51, 61, 2);
        g.addEdge(61, 51, 2);
        g.addEdge(61, 71, 2);
        g.addEdge(71, 61, 2);
        g.addEdge(71, 81, 2);
        g.addEdge(81, 71, 2);
        g.addEdge(81, 91, 2);
        g.addEdge(91, 81, 2);
        g.addEdge(91, 92, 2);
        g.addEdge(92, 91, 2);
        g.addEdge(92, 93, 2);
        g.addEdge(93, 92, 2);
        g.addEdge(33, 43, 2);
        g.addEdge(43, 33, 2);
        g.addEdge(43, 53, 2);
        g.addEdge(53, 43, 2);
        g.addEdge(53, 54, 2);
        g.addEdge(54, 53, 2);
        g.addEdge(54, 55, 2);
        g.addEdge(55, 54, 2);
        g.addEdge(55, 56, 2);
        g.addEdge(56, 55, 2);
        g.addEdge(54, 64, 2);
        g.addEdge(64, 54, 2);
        g.addEdge(64, 65, 2);
        g.addEdge(65, 64, 2);
        g.addEdge(65, 66, 2);
        g.addEdge(66, 65, 2);
        g.addEdge(55, 65, 2);
        g.addEdge(65, 55, 2);
        g.addEdge(56, 66, 2);
        g.addEdge(66, 56, 2);
        g.addEdge(64, 74, 2);
        g.addEdge(74, 64, 2);
        g.addEdge(73, 74, 2);
        g.addEdge(74, 73, 2);
        g.addEdge(73, 83, 2);
        g.addEdge(83, 73, 2);
        g.addEdge(83, 93, 2);
        g.addEdge(93, 83, 2);
        g.addEdge(93, 94, 2);
        g.addEdge(94, 93, 2);
        g.addEdge(94, 95, 2);
        g.addEdge(95, 94, 2);
        g.addEdge(95, 96, 2);
        g.addEdge(96, 95, 2);
        g.addEdge(96, 97, 2);
        g.addEdge(97, 96, 2);
        g.addEdge(74, 75, 2);
        g.addEdge(75, 74, 2);
        g.addEdge(65, 75, 2);
        g.addEdge(75, 65, 2);
        g.addEdge(75, 76, 2);
        g.addEdge(76, 75, 2);
        g.addEdge(66, 76, 2);
        g.addEdge(76, 66, 2);
        g.addEdge(76, 77, 2);
        g.addEdge(77, 76, 2);
        g.addEdge(46, 56, 2);
        g.addEdge(56, 46, 2);
        g.addEdge(36, 46, 2);
        g.addEdge(46, 36, 2);
        g.addEdge(26, 36, 2);
        g.addEdge(36, 26, 2);
        g.addEdge(25, 26, 2);
        g.addEdge(26, 25, 2);
        g.addEdge(16, 26, 2);
        g.addEdge(26, 16, 2);
        g.addEdge(16, 17, 2);
        g.addEdge(17, 16, 2);
        g.addEdge(17, 18, 2);
        g.addEdge(18, 17, 2);
        g.addEdge(26, 27, 2);
        g.addEdge(27, 26, 2);
        g.addEdge(17, 27, 2);
        g.addEdge(27, 17, 2);
        g.addEdge(27, 28, 2);
        g.addEdge(28, 27, 2);
        g.addEdge(18, 28, 2);
        g.addEdge(28, 18, 2);
        g.addEdge(18, 19, 2);
        g.addEdge(19, 18, 2);
        g.addEdge(19, 110, 2);
        g.addEdge(110, 19, 2);
        g.addEdge(110, 111, 2);
        g.addEdge(111, 110, 2);
        g.addEdge(28, 38, 2);
        g.addEdge(38, 28, 2);
        g.addEdge(38, 39, 2);
        g.addEdge(39, 38, 2);
        g.addEdge(38, 48, 2);
        g.addEdge(48, 38, 2);
        g.addEdge(48, 58, 2);
        g.addEdge(58, 48, 2);
        g.addEdge(58, 68, 2);
        g.addEdge(68, 58, 2);
        g.addEdge(68, 78, 2);
        g.addEdge(78, 68, 2);
        g.addEdge(77, 78, 2);
        g.addEdge(78, 77, 2);
        g.addEdge(68, 69, 2);
        g.addEdge(69, 68, 2);
        g.addEdge(78, 79, 2);
        g.addEdge(79, 78, 2);
        g.addEdge(69, 79, 2);
        g.addEdge(79, 69, 2);
        g.addEdge(79, 89, 2);
        g.addEdge(89, 79, 2);
        g.addEdge(89, 99, 2);
        g.addEdge(99, 89, 2);
        g.addEdge(97, 98, 2);
        g.addEdge(98, 97, 2);
        g.addEdge(98, 99, 2);
        g.addEdge(99, 98, 2);
        g.addEdge(69, 610, 2);
        g.addEdge(610, 69, 2);
        g.addEdge(510, 610, 2);
        g.addEdge(610, 510, 2);
        g.addEdge(111, 211, 2);
        g.addEdge(211, 111, 2);
        g.addEdge(211, 311, 2);
        g.addEdge(311, 211, 2);
        g.addEdge(311, 411, 2);
        g.addEdge(411, 311, 2);
        g.addEdge(411, 511, 2);
        g.addEdge(511, 411, 2);
        g.addEdge(511, 611, 2);
        g.addEdge(611, 511, 2);
        g.addEdge(611, 711, 2);
        g.addEdge(711, 611, 2);
        g.addEdge(711, 811, 2);
        g.addEdge(811, 711, 2);
        g.addEdge(811, 911, 2);
        g.addEdge(911, 811, 2);
        g.addEdge(99, 910, 2);
        g.addEdge(910, 99, 2);
        g.addEdge(910, 911, 2);
        g.addEdge(911, 910, 2);
        g.addEdge(610, 710, 2);
        g.addEdge(710, 610, 2);
        g.addEdge(79, 710, 2);
        g.addEdge(710, 79, 2);
        g.addEdge(710, 711, 2);
        g.addEdge(711, 710, 2);
        g.addEdge(510, 511, 2);
        g.addEdge(511, 510, 2);
        g.addEdge(610, 611, 2);
        g.addEdge(611, 610, 2);
        g.addEdge(710, 810, 2);
        g.addEdge(810, 710, 2);
        g.addEdge(89, 810, 2);
        g.addEdge(810, 89, 2);
        g.addEdge(810, 811, 2);
        g.addEdge(811, 810, 2);
        g.addEdge(810, 910, 2);
        g.addEdge(910, 810, 2);

        this.listener = new KeyListener() {

            public int[][] BulYol(int src, int dest) throws FileNotFoundException, IOException {

                PrintStream o = new PrintStream(new File("path.txt"));
                PrintStream console = System.out;
                System.setOut(o);
                System.out.println(g.findShortestPath(src, dest));
                System.setOut(console);
                String[] pathLine;
                int p = 0;
                int temp;
                FileReader rf = new FileReader("path.txt");
                BufferedReader rb = new BufferedReader(rf);
                int[][] pathMatris = new int[100][2];
                int j = 0;
                String line;

                while ((line = rb.readLine()) != null) {
                    pathLine = line.split(" ");
                    int i;
                    for (i = 0; i < pathLine.length - 1; i++) {
                        p = Integer.parseInt(pathLine[i]);

                        if (p == 10) {

                            temp = 10;
                            p = 0;

                            //System.out.println("*"+temp);
                            pathMatris[i][j] = p;
                            j++;
                            pathMatris[i][j] = temp;
                            j = 0;

                        }

                        if (p == 103) {
                            temp = 3;
                            p = 10;

                            //System.out.println("*"+temp);
                            pathMatris[i][j] = p;
                            j++;
                            pathMatris[i][j] = temp;
                            j = 0;

                        }
                        if (p > 100) {
                            temp = p % 100;
                            p = p - temp;
                            p = p / 100;

                            //System.out.println("*"+temp);
                            pathMatris[i][j] = p;
                            j++;
                            pathMatris[i][j] = temp;
                            j = 0;
                        } else {
                            temp = p % 10;
                            p = p - temp;
                            p = p / 10;
                            //  System.out.println(temp);
                            // System.out.println(p);
                            pathMatris[i][j] = p;
                            j++;
                            pathMatris[i][j] = temp;
                            j = 0;

                        }
                    }

                }

                return pathMatris;

            }

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {

                int key = e.getKeyCode();

                for (k = 0; k < 11; k++) {

                    for (j = 0; j < 13; j++) {
                        if (matris[k][j] == 1) {
                            panels[k][j].setBackground(Color.white);
                        }
                    }
                }

                if (key == KeyEvent.VK_LEFT) {

                    if ("GozlukluSirin".equals(oyuncu.getKarakterAdi())) {

                        if (adimsayac1 == 2) {
                            if (matris[x][y - 2] == 1 && matris[x][y - 1] == 1) {

                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                y -= 2;
                                adimsayac1 -= 2;
                                panels[x][y].add(sirin);
                            } else if (matris[x][y - 1] == 1 && matris[x][y - 2] != 1) {
                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                y -= 1;
                                adimsayac1 -= 1;
                                panels[x][y].add(sirin);

                            }

                        }
                        if (adimsayac1 == 1 && matris[x][y - 1] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            y -= 1;
                            panels[x][y].add(sirin);

                            adimsayac1 -= 1;

                        }
                        if (adimsayac1 == 0) {
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);

                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            adimsayac1 = 2;
                        }
                    }
                    if ("TembelSirin".equals(oyuncu.getKarakterAdi())) {
                        if (matris[x][y - 1] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            y -= 1;
                            panels[x][y].add(sirin);
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            System.out.println(ifade3);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }

                        }

                    }

                }
                if (key == KeyEvent.VK_RIGHT) {
                    if ("GozlukluSirin".equals(oyuncu.getKarakterAdi())) {

                        if (adimsayac1 == 2) {
                            if (matris[x][y + 2] == 1 && matris[x][y + 1] == 1) {

                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                y += 2;
                                adimsayac1 -= 2;
                                panels[x][y].add(sirin);
                            } else if (matris[x][y + 1] == 1 && matris[x][y + 2] != 1) {
                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                y += 1;
                                adimsayac1 -= 1;
                                panels[x][y].add(sirin);

                            }

                        }
                        if (adimsayac1 == 1 && matris[x][y + 1] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            y += 1;
                            panels[x][y].add(sirin);

                            adimsayac1 -= 1;

                        }
                        if (adimsayac1 == 0) {
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            adimsayac1 = 2;
                        }
                    }
                    if ("TembelSirin".equals(oyuncu.getKarakterAdi())) {
                        if (matris[x][y + 1] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            y += 1;
                            panels[x][y].add(sirin);
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            System.out.println(ifade3);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }

                        }
                    }
                }
                if (key == KeyEvent.VK_UP) {

                    if ("GozlukluSirin".equals(oyuncu.getKarakterAdi())) {

                        if (adimsayac1 == 2) {
                            if (matris[x - 2][y] == 1 && matris[x - 1][y] == 1) {

                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                x -= 2;
                                adimsayac1 -= 2;
                                panels[x][y].add(sirin);
                            } else if (matris[x - 1][y] == 1 && matris[x - 2][y] != 1) {
                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                x -= 1;
                                adimsayac1 -= 1;
                                panels[x][y].add(sirin);

                            }

                        }
                        if (adimsayac1 == 1 && matris[x - 1][y] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            x -= 1;
                            panels[x][y].add(sirin);

                            adimsayac1 -= 1;

                        }
                        if (adimsayac1 == 0) {
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            adimsayac1 = 2;
                        }
                    }
                    if ("TembelSirin".equals(oyuncu.getKarakterAdi())) {
                        if (matris[x - 1][y] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            x -= 1;
                            panels[x][y].add(sirin);
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            System.out.println(ifade3);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }

                        }

                    }
                }
                if (key == KeyEvent.VK_DOWN) {
                    if ("GozlukluSirin".equals(oyuncu.getKarakterAdi())) {

                        if (adimsayac1 == 2) {
                            if (matris[x + 2][y] == 1 && matris[x + 1][y] == 1) {

                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                x += 2;
                                adimsayac1 -= 2;
                                panels[x][y].add(sirin);
                            } else if (matris[x + 1][y] == 1 && matris[x + 2][y] != 1) {
                                panels[x][y].remove(sirin);
                                panels[x][y].setVisible(false);
                                panels[x][y].setVisible(true);
                                x += 1;
                                adimsayac1 -= 1;
                                panels[x][y].add(sirin);

                            }

                        }
                        if (adimsayac1 == 1 && matris[x + 1][y] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            x += 1;
                            panels[x][y].add(sirin);

                            adimsayac1 -= 1;

                        }
                        if (adimsayac1 == 0) {
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            adimsayac1 = 2;
                        }
                    }
                    if ("TembelSirin".equals(oyuncu.getKarakterAdi())) {
                        if (matris[x + 1][y] == 1) {
                            panels[x][y].remove(sirin);
                            panels[x][y].setVisible(false);
                            panels[x][y].setVisible(true);
                            x += 1;
                            panels[x][y].add(sirin);
                            oyuncu.setKonumX(x);
                            oyuncu.setKonumY(y);
                            int hdusman1, hdusman2, gdusman1, gdusman2;
                            hdusman1 = dusman1.getKonumX();
                            gdusman1 = dusman1.getKonumY();
                            hdusman2 = dusman2.getKonumX();
                            gdusman2 = dusman2.getKonumY();
                            String a = String.valueOf(x + "" + y);
                            String b = String.valueOf(hdusman1 + "" + gdusman1);
                            String c = String.valueOf(hdusman2 + "" + gdusman2);
                            int ifade1 = Integer.parseInt(b);
                            int ifade2 = Integer.parseInt(a);
                            int ifade3 = Integer.parseInt(c);
                            System.out.println(ifade3);
                            try {
                                pathMatris1 = BulYol(ifade1, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                pathMatris2 = BulYol(ifade3, ifade2);
                            } catch (IOException ex) {
                                Logger.getLogger(OyunEkrani.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            int l;

                            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[2][0];
                                dusman1M = pathMatris1[2][1];
                                if (oyuncu.getKonumX() == pathMatris1[2][0] && oyuncu.getKonumY() == pathMatris1[2][1]) {
                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }

                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }
                            if ("Azman".equals(dusman1.getKarakterAdi())) {
                                d1.setVisible(false);
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].remove(d1);
                                dusman1N = pathMatris1[1][0];
                                dusman1M = pathMatris1[1][1];
                                if (oyuncu.getKonumX() == pathMatris1[1][0] && oyuncu.getKonumY() == pathMatris1[1][1]) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman1.getKonumX() && oyuncu.getKonumY() == dusman1.getKonumY()) {

                                    dusman1.setKonumX(dusman1.getBaslangicX());
                                    dusman1.setKonumY(dusman1.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman1.setKonumX(dusman1N);
                                    dusman1.setKonumY(dusman1M);

                                }
                                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                                d1.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris1[l][0];
                                    m = pathMatris1[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.green);
                                    }
                                }
                            }

                            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[2][0];
                                dusman2M = pathMatris2[2][1];
                                if (oyuncu.getKonumX() == pathMatris2[2][0] && oyuncu.getKonumY() == pathMatris2[2][1]) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 15);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 2; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                            if ("Azman".equals(dusman2.getKarakterAdi())) {
                                d2.setVisible(false);
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].remove(d2);
                                dusman2N = pathMatris2[1][0];
                                dusman2M = pathMatris2[1][1];
                                if (oyuncu.getKonumX() == pathMatris2[1][0] && oyuncu.getKonumY() == pathMatris2[1][1]) {
                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());
                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else if (oyuncu.getKonumX() == dusman2.getKonumX() && oyuncu.getKonumY() == dusman2.getKonumY()) {

                                    dusman2.setKonumX(dusman2.getBaslangicX());
                                    dusman2.setKonumY(dusman2.getBaslangicY());

                                    oyuncu.setSkor(oyuncu.getSkor() - 5);

                                } else {
                                    dusman2.setKonumX(dusman2N);
                                    dusman2.setKonumY(dusman2M);

                                }
                                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                                d2.setVisible(true);
                                for (l = 1; l < 50; l++) {

                                    n = pathMatris2[l][0];
                                    m = pathMatris2[l][1];
                                    if (n != 0 && m != 0) {
                                        panels[n][m].setBackground(Color.yellow);
                                    }
                                }

                            }
                        }

                    }
                }

                if (oyuncu.getKonumX() == altınKonum[0][0] && oyuncu.getKonumY() == altınKonum[0][1]) {
                    altın1.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 5);
                }
                if (oyuncu.getKonumX() == altınKonum[1][0] && oyuncu.getKonumY() == altınKonum[1][1]) {
                    altın2.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 5);
                }
                if (oyuncu.getKonumX() == altınKonum[2][0] && oyuncu.getKonumY() == altınKonum[2][1]) {
                    altın3.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 5);
                }
                if (oyuncu.getKonumX() == altınKonum[3][0] && oyuncu.getKonumY() == altınKonum[3][1]) {
                    altın4.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 5);
                }
                if (oyuncu.getKonumX() == altınKonum[4][0] && oyuncu.getKonumY() == altınKonum[4][1]) {
                    altın5.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 5);
                }

                if (oyuncu.getKonumX() == mantarKonum[0][0] && oyuncu.getKonumY() == mantarKonum[0][1]) {
                    mantar1.setVisible(false);

                    oyuncu.setSkor(oyuncu.getSkor() + 50);
                }

                oyuncuPuani.setBounds(10, 10, 100, 100);
                oyuncuPuani.setText("" + oyuncu.getSkor());
                panels[0][12].add(oyuncuPuani);
                oyuncuPuani.setVisible(true);
                if (oyuncu.getSkor() <= 0 || (oyuncu.getKonumX() == 7 && oyuncu.getKonumY() == 12)) {
                    System.out.println("Game Over");
                    frame.setVisible(false);
                    new GameOver().setVisible(true);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        };
        //Oyun Arayüzü
        frame = new JFrame("Sirinler Arayuz");
        frame.setSize(650, 550);
        GridLayout grid = new GridLayout(11, 13, 10, 10);
        frame.setLayout(grid);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon gargamel = new ImageIcon("src\\prolab\\resimler\\gargamel.png");
        ImageIcon altıns = new ImageIcon("src\\prolab\\resimler\\altın.png");
        ImageIcon mantars = new ImageIcon("src\\prolab\\resimler\\mantar.png");
        ImageIcon azman = new ImageIcon("src\\prolab\\resimler\\azman.png");
        ImageIcon tembel = new ImageIcon("src\\prolab\\resimler\\tembel.png");
        ImageIcon gozluklu = new ImageIcon("src\\prolab\\resimler\\gözlüklü.png");
        ImageIcon Sirine = new ImageIcon("src\\prolab\\resimler\\şirine.png");
        d1.setVisible(false);
        d2.setVisible(false);
        altın1.setIcon(altıns);
        altın2.setIcon(altıns);
        altın3.setIcon(altıns);
        altın4.setIcon(altıns);
        altın5.setIcon(altıns);
        mantar1.setIcon(mantars);
        panels = new JPanel[11][13];

        for (i = 0; i < 11; i++) {
            for (j = 0; j < 13; j++) {
                panels[i][j] = new JPanel();
                if (matris[i][j] == 0) {
                    panels[i][j].setBackground(Color.gray);
                } else if (matris[i][j] == 1) {
                    panels[i][j].setBackground(Color.white);
                }
                panels[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                frame.add(panels[i][j]);
            }
        }

        panels[oyuncu.getKonumX()][oyuncu.getKonumY()].add(sirin);
        if (oyuncu.getKarakterAdi() == "TembelSirin") {
            sirin.setIcon(tembel);

        }
        if (oyuncu.getKarakterAdi() == "GozlukluSirin") {
            sirin.setIcon(gozluklu);
        }

        panels[7][12].add(sirine);
        sirine.setIcon(Sirine);
        sirin.setFocusable(true);
        int dusmanS = 0;
        for (i = 0; i < 2; i++) {
            //System.out.println(baslangicDusman[i][0]);
            if (baslangicDusman[i][0] == null) {
                break;
            }

            dusmanS++;
        }

        if (dusmanS == 1) {
            dusman1 = new Dusman("Dusman1", baslangicDusman[0][0], "Dusmna", baslangicDusman[0][1]);
            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                d1.setVisible(true);
                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                d1.setIcon(gargamel);

            } else if ("Azman".equals(dusman1.getKarakterAdi())) {
                d1.setVisible(true);
                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                d1.setIcon(azman);

            }

        } else if (dusmanS == 2) {
            dusman1 = new Dusman("Dusman1", baslangicDusman[0][0], "Dusman", baslangicDusman[0][1]);

            if ("Gargamel".equals(dusman1.getKarakterAdi())) {
                d1.setVisible(true);
                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                d1.setIcon(gargamel);

            } else if ("Azman".equals(dusman1.getKarakterAdi())) {
                d1.setVisible(true);
                panels[dusman1.getKonumX()][dusman1.getKonumY()].add(d1);
                d1.setIcon(azman);

            }
            dusman2 = new Dusman("Dusman2", baslangicDusman[1][0], "Dusman", baslangicDusman[1][1]);

            if ("Gargamel".equals(dusman2.getKarakterAdi())) {
                d2.setVisible(true);
                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                d2.setIcon(gargamel);

            } else if ("Azman".equals(dusman2.getKarakterAdi())) {
                d2.setVisible(true);
                panels[dusman2.getKonumX()][dusman2.getKonumY()].add(d2);
                d2.setIcon(azman);

            }

        }
        sirin.addKeyListener(listener);
        Timer timer = new Timer();

        this.AltinEkle = new TimerTask() {
            @Override
            public void run() {
                int adet = 0;
               

                while (adet < 5) {
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);

                    if (adet == 0 && matris[objeX][objeY] == 1) {
                        altınKonum[0][0] = objeX;
                        altınKonum[0][1] = objeY;
                        panels[objeX][objeY].add(altın1);
                        altın1.setVisible(true);
                        adet++;

                    }
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);
                    if (adet == 1 && matris[objeX][objeY] == 1) {
                        altınKonum[1][0] = objeX;
                        altınKonum[1][1] = objeY;
                        panels[objeX][objeY].add(altın2);
                        altın2.setVisible(true);
                        adet++;
                    }
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);
                    if (adet == 2 && matris[objeX][objeY] == 1) {
                        altınKonum[2][0] = objeX;
                        altınKonum[2][1] = objeY;
                        panels[objeX][objeY].add(altın3);
                        altın3.setVisible(true);
                        adet++;
                    }
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);
                    if (adet == 3 && matris[objeX][objeY] == 1) {
                        altınKonum[3][0] = objeX;
                        altınKonum[3][1] = objeY;
                        panels[objeX][objeY].add(altın4);
                        altın4.setVisible(true);
                        adet++;
                    }
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);
                    if (adet == 4 && matris[objeX][objeY] == 1) {
                        altınKonum[4][0] = objeX;
                        altınKonum[4][1] = objeY;
                        panels[objeX][objeY].add(altın5);
                        altın5.setVisible(true);
                        adet++;
                    }

                }
                if (zaman == 5) {
                    int a = altınKonum[0][0];
                    int b = altınKonum[0][1];
                    altın1.setVisible(false);
                    panels[a][b].remove(altın1);
                    a = altınKonum[1][0];
                    b = altınKonum[1][1];
                    altın2.setVisible(false);
                    panels[a][b].remove(altın2);
                    a = altınKonum[2][0];
                    b = altınKonum[2][1];
                    altın3.setVisible(false);
                    panels[a][b].remove(altın3);
                    a = altınKonum[3][0];
                    b = altınKonum[3][1];
                    altın4.setVisible(false);
                    panels[a][b].remove(altın4);
                    a = altınKonum[4][0];
                    b = altınKonum[4][1];
                    altın5.setVisible(false);
                    panels[a][b].remove(altın5);
                    adet = 0;

                }
              
            }

        };
        this.MantarEkle = new TimerTask() {
            @Override
            public void run() {
                int adet = 0;

                while (adet < 1) {
                    objeX = r.nextInt(11);
                    objeY = r.nextInt(13);
                    if (adet == 0 && matris[objeX][objeY] == 1) {
                        mantarKonum[0][0] = objeX;
                        mantarKonum[0][1] = objeY;
                        panels[objeX][objeY].add(mantar1);
                        mantar1.setVisible(true);
                        adet++;
                    }
                }
                if (zaman == 7) {
                    int a = mantarKonum[0][0];
                    int b = mantarKonum[0][1];
                    mantar1.setVisible(false);
                    panels[a][b].remove(mantar1);
                    adet = 0;
                    zaman = 0;
                }
              
                zaman++;

            }

        };

        timer.schedule(AltinEkle, 5000, 5000);
        timer.schedule(MantarEkle, 5000, 7000);
    }
}
