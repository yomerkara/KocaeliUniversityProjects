/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Arthas
 */
public class Main {

    public static BaslangicEkrani secim = new BaslangicEkrani();
    public static int[][] matris = new int[11][13];
    public static int[][] pathmatris = new int[20][20];
    public static String[][] baslangicDusman = new String[2][2];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("harita.txt"));

        //Geçici tutucular
        String line;
        String[] harita;
        String[] karakterData;
        String dusmanBilgisi, kapiBilgisi;
        //

        //Dusmanın ilk bilgileri ve kapilari
        int a = 0;
        int satirS = 0;
        int i = 0;
        int y = 0;
        //harita ağırlık bilgileri

        while ((line = br.readLine()) != null) {

            if (satirS > 1) {
                harita = line.split("\t");

                for (i = 0; i < harita.length; i++) {
                    matris[y][i] = Integer.parseInt(harita[i]);
                    //System.out.println(matris[y][i]);
                }
                y++;
                //System.out.println("\n");

            } else {

                karakterData = line.split(",");
                dusmanBilgisi = karakterData[0].substring(karakterData[0].indexOf(":") + 1);
                //System.out.println(dusmanBilgisi);
                kapiBilgisi = karakterData[1].substring(karakterData[1].indexOf(":") + 1);
                //System.out.println(kapiBilgisi);

                baslangicDusman[a][0] = dusmanBilgisi;
                baslangicDusman[a][1] = kapiBilgisi;

                a++;
            }

            satirS++;
        }
        br.close();

        secim.setVisible(true);

    }

   
}
