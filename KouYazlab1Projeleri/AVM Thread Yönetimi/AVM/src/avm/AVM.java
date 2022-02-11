package avm;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AVM {

    static int kat1 = 0;
    static int kat2 = 0;
    static int kat3 = 0;
    static int kat4 = 0;
    static int kat0 = 0;
    static int kuyruk_zemin1 = 0;
    static int kuyruk_zemin2 = 0;
    static int kuyruk_zemin3 = 0;
    static int kuyruk_zemin4 = 0;
    static int asansor1_kat = 0;
    static int asansor2_kat = 0;
    static int asansor3_kat = 0;
    static int asansor4_kat = 0;
    static int asansor5_kat = 0;
    static int kuyruk1 = 0;
    static int kuyruk2 = 0;
    static int kuyruk3 = 0;
    static int kuyruk4 = 0;
    static int toplam_kuyruk = 0;
    static boolean asansor1 = true;
    static boolean asansor2 = false;
    static boolean asansor3 = false;
    static boolean asansor4 = false;
    static boolean asansor5 = false;
    static int exitcount = 0;
    static int direction1 = 0;
    static int direction2 = 0;
    static int direction3 = 0;
    static int direction4 = 0;
    static int direction5 = 0;
    static int count_inside1 = 0;
    static int count_inside2 = 0;
    static int count_inside3 = 0;
    static int count_inside4 = 0;
    static int count_inside5 = 0;

    public static void main(String[] args) throws InterruptedException, IOException {
        Random random = new Random();
        Thread Giris = new Thread() {
            public void run() {

                int giren_kisi_sayisi = 1 + random.nextInt(9);
                int kat = 1 + random.nextInt(4);
                if (kat == 1) {
                    kuyruk_zemin1 += giren_kisi_sayisi;
                }
                if (kat == 2) {
                    kuyruk_zemin2 += giren_kisi_sayisi;
                }
                if (kat == 3) {
                    kuyruk_zemin3 += giren_kisi_sayisi;
                }
                if (kat == 4) {
                    kuyruk_zemin4 += giren_kisi_sayisi;
                }

            }
        };

        Thread Cikis = new Thread() {
            public void run() {
                int cikan_kisi_sayisi = 1 + random.nextInt(5);
                int cikilcak_kat = 1 + random.nextInt(4);

                if (cikilcak_kat == 1) {
                    kuyruk1 += cikan_kisi_sayisi;
                    // kat1 -= cikan_kisi_sayisi;
                }
                if (cikilcak_kat == 2) {
                    kuyruk2 += cikan_kisi_sayisi;
                    // kat2 -= cikan_kisi_sayisi;
                }
                if (cikilcak_kat == 3) {
                    kuyruk3 += cikan_kisi_sayisi;
                    // kat3 -= cikan_kisi_sayisi;
                }
                if (cikilcak_kat == 4) {
                    kuyruk4 += cikan_kisi_sayisi;
                    // kat4 -= cikan_kisi_sayisi;
                }

            }
        };

        Thread Asansor1 = new Thread() {

            public void run() {
                if (asansor1 == true) {
                    if (kuyruk_zemin1 > 0 || kuyruk1 > 0) {
                        if (kuyruk_zemin1 > 0) {
                            direction1 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat - 1)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //asansor1_kat-1'in mutlağı *200 ms delay
                            if (kuyruk_zemin1 <= 10) {
                                kat1 += kuyruk_zemin1;
                                count_inside1 = kuyruk_zemin1;
                                kuyruk_zemin1 = 0;
                                asansor1_kat = 1;
                            } else {
                                kat1 += 10;
                                count_inside1 = 10;
                                kuyruk_zemin1 -= 10;
                                asansor1_kat = 1;
                            }
                        } else if (kuyruk1 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction1 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk1 <= 10) {
                                exitcount += kuyruk1;
                                count_inside1 = kuyruk1;
                                kat1 -= kuyruk1;
                                kuyruk1 = 0;
                                asansor1_kat = 0;
                            } else {
                                exitcount += 10;
                                count_inside1 = 10;
                                kat1 -= 10;
                                kuyruk1 -= 10;
                                asansor1_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin2 > 0 || kuyruk2 > 0) {

                        if (kuyruk_zemin2 > 0) {
                            //asansor1_kat-2'in mutlağı *200 ms delay
                            direction1 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat - 2)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin2 <= 10) {
                                count_inside1 = kuyruk_zemin2;
                                kat2 += kuyruk_zemin2;
                                kuyruk_zemin2 = 0;
                                asansor1_kat = 2;
                            } else {
                                kat2 += 10;
                                count_inside1 = 10;
                                kuyruk_zemin2 -= 10;
                                asansor1_kat = 2;
                            }
                        } else if (kuyruk2 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction1 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk2 <= 10) {
                                count_inside1 = kuyruk2;
                                exitcount += kuyruk2;
                                kat2 -= kuyruk2;
                                kuyruk2 = 0;
                                asansor1_kat = 0;
                            } else {
                                count_inside1 = 10;
                                exitcount += 10;
                                kat2 -= 10;
                                kuyruk2 -= 10;
                                asansor1_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin3 > 0 || kuyruk3 > 0) {

                        if (kuyruk_zemin3 > 0) {
                            direction1 = 1;
                            //asansor1_kat-3'ün mutlağı *200 ms delay
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat - 3)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin3 <= 10) {
                                count_inside1 = kuyruk_zemin3;
                                kat3 += kuyruk_zemin3;
                                kuyruk_zemin3 = 0;
                                asansor1_kat = 3;
                            } else {
                                count_inside1 = 10;
                                kat3 += 10;
                                kuyruk_zemin3 -= 10;
                                asansor1_kat = 3;
                            }
                        } else if (kuyruk3 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction1 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk3 <= 10) {
                                count_inside1 = kuyruk3;
                                exitcount += kuyruk3;
                                kat3 -= kuyruk3;
                                kuyruk3 = 0;
                                asansor1_kat = 0;
                            } else {
                                count_inside1 = 10;
                                exitcount += 10;
                                kat3 -= 10;
                                kuyruk3 -= 10;
                                asansor1_kat = 0;
                            }
                        }

                    } else if (kuyruk_zemin4 > 0 || kuyruk4 > 0) {
                        if (kuyruk4 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction1 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk4 <= 10) {
                                count_inside1 = kuyruk4;
                                exitcount += kuyruk4;
                                kat4 -= kuyruk4;
                                kuyruk4 = 0;
                                asansor1_kat = 0;
                            } else {
                                count_inside1 = 10;
                                exitcount += 10;
                                kat4 -= 10;
                                kuyruk4 -= 10;
                                asansor1_kat = 0;
                            }
                        } else if (kuyruk_zemin4 > 0) {
                            direction1 = 1;
                            //asansor1_kat-4'ün mutlağı *200 ms delay
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor1_kat - 4)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin4 <= 10) {
                                count_inside1 = kuyruk_zemin4;
                                kat4 += kuyruk_zemin4;
                                kuyruk_zemin4 = 0;
                                asansor1_kat = 4;
                            } else {
                                count_inside1 = 10;
                                kat4 += 10;
                                kuyruk_zemin4 -= 10;
                                asansor1_kat = 4;
                            }
                        }

                    }

                }

            }
        };
        Thread Asansor2 = new Thread() {

            public void run() {
                if (asansor2 == true) {

                    if (kuyruk_zemin2 > 0 || kuyruk2 > 0) {

                        if (kuyruk_zemin2 > 0) {
                            //asansor1_kat-2'in mutlağı *200 ms delay
                            direction2 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat - 2)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin2 <= 10) {
                                count_inside2 = kuyruk_zemin2;
                                kat2 += kuyruk_zemin2;
                                kuyruk_zemin2 = 0;
                                asansor2_kat = 2;
                            } else {
                                count_inside2 = 10;
                                kat2 += 10;
                                kuyruk_zemin2 -= 10;
                                asansor2_kat = 2;
                            }
                        } else if (kuyruk2 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction2 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk2 <= 10) {
                                count_inside2 = kuyruk2;
                                exitcount += kuyruk2;
                                kat2 -= kuyruk2;
                                kuyruk2 = 0;
                                asansor2_kat = 0;
                            } else {
                                count_inside2 = 10;
                                exitcount += 10;
                                kat2 -= 10;
                                kuyruk2 -= 10;
                                asansor2_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin3 > 0 || kuyruk3 > 0) {
                        if (kuyruk_zemin3 > 0) {
                            //asansor1_kat-3'ün mutlağı *200 ms delay
                            direction2 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat - 3)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin3 <= 10) {
                                count_inside2 = kuyruk_zemin3;
                                kat3 += kuyruk_zemin3;
                                kuyruk_zemin3 = 0;
                                asansor2_kat = 3;
                            } else {
                                count_inside2 = 10;
                                kat3 += 10;
                                kuyruk_zemin3 -= 10;
                                asansor2_kat = 3;
                            }
                        } else if (kuyruk3 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction2 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk3 <= 10) {
                                count_inside2 = kuyruk3;
                                exitcount += kuyruk3;
                                kat3 -= kuyruk3;
                                kuyruk3 = 0;
                                asansor2_kat = 0;
                            } else {
                                count_inside2 = 10;
                                exitcount += 10;
                                kat3 -= 10;
                                kuyruk3 -= 10;
                                asansor2_kat = 0;
                            }
                        }

                    } else if (kuyruk_zemin4 > 0 || kuyruk4 > 0) {
                        if (kuyruk_zemin4 > 0) {
                            //asansor1_kat-4'ün mutlağı *200 ms delay
                            direction2 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat - 4)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin4 <= 10) {
                                count_inside2 = kuyruk_zemin4;
                                kat4 += kuyruk_zemin4;
                                kuyruk_zemin4 = 0;
                                asansor2_kat = 4;
                            } else {
                                count_inside2 = 10;
                                kat4 += 10;
                                kuyruk_zemin4 -= 10;
                                asansor2_kat = 4;
                            }
                        } else if (kuyruk4 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction2 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk4 <= 10) {
                                count_inside2 = kuyruk4;
                                exitcount += kuyruk4;
                                kat4 -= kuyruk4;
                                kuyruk4 = 0;
                                asansor2_kat = 0;
                            } else {
                                count_inside2 = 10;
                                exitcount += 10;
                                kat4 -= 10;
                                kuyruk4 -= 10;
                                asansor2_kat = 0;
                            }
                        }

                    } else if (kuyruk_zemin1 > 0 || kuyruk1 > 0) {
                        if (kuyruk_zemin1 > 0) {
                            //asansor1_kat-1'in mutlağı *200 ms delay
                            direction2 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat - 1)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin1 <= 10) {
                                count_inside2 = kuyruk_zemin1;
                                kat1 += kuyruk_zemin1;
                                kuyruk_zemin1 = 0;
                                asansor2_kat = 1;
                            } else {
                                count_inside2 = 10;
                                kat1 += 10;
                                kuyruk_zemin1 -= 10;
                                asansor2_kat = 1;
                            }
                        } else if (kuyruk1 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction2 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor2_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk1 <= 10) {
                                count_inside2 = kuyruk1;
                                exitcount += kuyruk1;
                                kat1 -= kuyruk1;
                                kuyruk1 = 0;
                                asansor2_kat = 0;
                            } else {
                                count_inside2 = 10;
                                exitcount += 10;
                                kat1 -= 10;
                                kuyruk1 -= 10;
                                asansor2_kat = 0;
                            }
                        }
                    }
                } else if (asansor2 == false) {
                    count_inside2 = 0;
                }
            }
        };
        Thread Asansor3 = new Thread() {

            public void run() {
                if (asansor3 == true) {
                    if (kuyruk_zemin3 > 0 || kuyruk3 > 0) {
                        if (kuyruk_zemin3 > kuyruk3) {
                            if (kuyruk_zemin3 > 0) {
                                //asansor1_kat-3'ün mutlağı *200 ms delay
                                direction3 = 1;
                                try {
                                    TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat - 3)) * 200);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                if (kuyruk_zemin3 <= 10) {
                                    count_inside3 = kuyruk_zemin3;
                                    kat3 += kuyruk_zemin3;
                                    kuyruk_zemin3 = 0;
                                    asansor3_kat = 3;
                                } else {
                                    count_inside3 = 10;
                                    kat3 += 10;
                                    kuyruk_zemin3 -= 10;
                                    asansor3_kat = 3;
                                }
                            } else if (kuyruk3 > 0) {
                                //asansor1_kat-0'in mutlağı *200 ms delay
                                direction3 = 0;
                                try {
                                    TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat)) * 200);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                if (kuyruk3 <= 10) {
                                    count_inside3 = kuyruk3;
                                    exitcount += kuyruk3;
                                    kat3 -= kuyruk3;
                                    kuyruk3 = 0;
                                    asansor3_kat = 0;
                                } else {
                                    count_inside3 = 10;
                                    exitcount += 10;
                                    kat3 -= 10;
                                    kuyruk3 -= 10;
                                    asansor3_kat = 0;
                                }
                            }
                        } else if (kuyruk3 > kuyruk_zemin3) {
                            if (kuyruk3 > 0) {
                                //asansor1_kat-0'in mutlağı *200 ms delay
                                direction3 = 0;
                                try {
                                    TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat)) * 200);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                if (kuyruk3 <= 10) {
                                    count_inside3 = kuyruk3;
                                    exitcount += kuyruk3;
                                    kat3 -= kuyruk3;
                                    kuyruk3 = 0;
                                    asansor3_kat = 0;
                                } else {
                                    count_inside3 = 10;
                                    exitcount += 10;
                                    kat3 -= 10;
                                    kuyruk3 -= 10;
                                    asansor3_kat = 0;
                                }
                            } else if (kuyruk_zemin3 > 0) {
                                //asansor1_kat-3'ün mutlağı *200 ms delay
                                direction3 = 1;
                                try {
                                    TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat - 3)) * 200);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                if (kuyruk_zemin3 <= 10) {
                                    count_inside3 = kuyruk_zemin3;
                                    kat3 += kuyruk_zemin3;
                                    kuyruk_zemin3 = 0;
                                    asansor3_kat = 3;
                                } else {
                                    count_inside3 = 10;
                                    kat3 += 10;
                                    kuyruk_zemin3 -= 10;
                                    asansor3_kat = 3;
                                }
                            }
                        }

                    } else if (kuyruk_zemin4 > 0 || kuyruk4 > 0) {
                        if (kuyruk_zemin4 > 0) {
                            //asansor1_kat-4'ün mutlağı *200 ms delay
                            direction3 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat - 4)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin4 <= 10) {
                                count_inside3 = kuyruk_zemin4;
                                kat4 += kuyruk_zemin4;
                                kuyruk_zemin4 = 0;
                                asansor3_kat = 4;
                            } else {
                                count_inside3 = 10;
                                kat4 += 10;
                                kuyruk_zemin4 -= 10;
                                asansor3_kat = 4;
                            }
                        } else if (kuyruk4 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction3 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk4 <= 10) {
                                count_inside3 = kuyruk4;
                                exitcount += kuyruk4;
                                kat4 -= kuyruk4;
                                kuyruk4 = 0;
                                asansor3_kat = 0;
                            } else {
                                count_inside3 = 10;
                                exitcount += 10;
                                kat4 -= 10;
                                kuyruk4 -= 10;
                                asansor3_kat = 0;
                            }
                        }

                    } else if (kuyruk_zemin1 > 0 || kuyruk1 > 0) {
                        if (kuyruk_zemin1 > 0) {
                            //asansor1_kat-1'in mutlağı *200 ms delay
                            direction3 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat - 1)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin1 <= 10) {
                                count_inside3 = kuyruk_zemin1;
                                kat1 += kuyruk_zemin1;
                                kuyruk_zemin1 = 0;
                                asansor3_kat = 1;
                            } else {
                                count_inside3 = 10;
                                kat1 += 10;
                                kuyruk_zemin1 -= 10;
                                asansor3_kat = 1;
                            }
                        } else if (kuyruk1 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction3 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk1 <= 10) {
                                count_inside3 = kuyruk1;
                                exitcount += kuyruk1;
                                kat1 -= kuyruk1;
                                kuyruk1 = 0;
                                asansor3_kat = 0;
                            } else {
                                count_inside3 = 10;
                                exitcount += 10;
                                kat1 -= 10;
                                kuyruk1 -= 10;
                                asansor3_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin2 > 0 || kuyruk2 > 0) {

                        if (kuyruk_zemin2 > 0) {
                            //asansor1_kat-2'in mutlağı *200 ms delay
                            direction3 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat - 2)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin2 <= 10) {
                                count_inside3 = kuyruk_zemin2;
                                kat2 += kuyruk_zemin2;
                                kuyruk_zemin2 = 0;
                                asansor3_kat = 2;
                            } else {
                                count_inside3 = 10;
                                kat2 += 10;
                                kuyruk_zemin2 -= 10;
                                asansor3_kat = 2;
                            }
                        } else if (kuyruk2 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction3 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor3_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk2 <= 10) {
                                count_inside3 = kuyruk2;
                                exitcount += kuyruk2;
                                kat2 -= kuyruk2;
                                kuyruk2 = 0;
                                asansor3_kat = 0;
                            } else {
                                count_inside3 = 10;
                                exitcount += 10;
                                kat2 -= 10;
                                kuyruk2 -= 10;
                                asansor3_kat = 0;
                            }
                        }
                    }

                } else if (asansor3 == false) {
                    count_inside3 = 0;
                }
            }
        };
        Thread Asansor4 = new Thread() {

            public void run() {
                if (asansor4 == true) {
                    if (kuyruk_zemin4 > 0 || kuyruk4 > 0) {
                        if (kuyruk_zemin4 > 0) {
                            //asansor1_kat-4'ün mutlağı *200 ms delay
                            direction4 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat - 4)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin4 <= 10) {
                                count_inside4 = kuyruk_zemin4;
                                kat4 += kuyruk_zemin4;
                                kuyruk_zemin4 = 0;
                                asansor4_kat = 4;
                            } else {
                                count_inside4 = 10;
                                kat4 += 10;
                                kuyruk_zemin4 -= 10;
                                asansor4_kat = 4;
                            }
                        } else if (kuyruk4 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction4 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk4 <= 10) {
                                count_inside4 = kuyruk4;
                                exitcount += kuyruk4;
                                kat4 -= kuyruk4;
                                kuyruk4 = 0;
                                asansor4_kat = 0;
                            } else {
                                count_inside4 = 10;
                                exitcount += 10;
                                kat4 -= 10;
                                kuyruk4 -= 10;
                                asansor4_kat = 0;
                            }
                        }

                    } else if (kuyruk_zemin1 > 0 || kuyruk1 > 0) {
                        if (kuyruk_zemin1 > 0) {
                            //asansor1_kat-1'in mutlağı *200 ms delay
                            direction4 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat - 1)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin1 <= 10) {
                                count_inside4 = kuyruk_zemin1;
                                kat1 += kuyruk_zemin1;
                                kuyruk_zemin1 = 0;
                                asansor4_kat = 1;
                            } else {
                                count_inside4 = 10;
                                kat1 += 10;
                                kuyruk_zemin1 -= 10;
                                asansor4_kat = 1;
                            }
                        } else if (kuyruk1 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction4 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk1 <= 10) {
                                count_inside4 = kuyruk1;
                                exitcount += kuyruk1;
                                kat1 -= kuyruk1;
                                kuyruk1 = 0;
                                asansor4_kat = 0;
                            } else {
                                count_inside4 = 10;
                                exitcount += 10;
                                kat1 -= 10;
                                kuyruk1 -= 10;
                                asansor4_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin2 > 0 || kuyruk2 > 0) {

                        if (kuyruk_zemin2 > 0) {
                            //asansor1_kat-2'in mutlağı *200 ms delay
                            direction4 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat - 2)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin2 <= 10) {
                                count_inside4 = kuyruk_zemin2;
                                kat2 += kuyruk_zemin2;
                                kuyruk_zemin2 = 0;
                                asansor4_kat = 2;
                            } else {
                                count_inside4 = 10;
                                kat2 += 10;
                                kuyruk_zemin2 -= 10;
                                asansor4_kat = 2;
                            }
                        } else if (kuyruk2 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction4 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk2 <= 10) {
                                count_inside4 = kuyruk2;
                                exitcount += kuyruk2;
                                kat2 -= kuyruk2;
                                kuyruk2 = 0;
                                asansor4_kat = 0;
                            } else {
                                count_inside4 = 10;
                                exitcount += 10;
                                kat2 -= 10;
                                kuyruk2 -= 10;
                                asansor4_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin3 > 0 || kuyruk3 > 0) {
                        if (kuyruk_zemin3 > 0) {
                            //asansor1_kat-3'ün mutlağı *200 ms delay
                            direction4 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat - 3)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin3 <= 10) {
                                count_inside4 = kuyruk_zemin3;
                                kat3 += kuyruk_zemin3;
                                kuyruk_zemin3 = 0;
                                asansor4_kat = 3;
                            } else {
                                count_inside4 = 10;
                                kat3 += 10;
                                kuyruk_zemin3 -= 10;
                                asansor4_kat = 3;
                            }
                        } else if (kuyruk3 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction4 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor4_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk3 <= 10) {
                                count_inside4 = kuyruk3;
                                exitcount += kuyruk3;
                                kat3 -= kuyruk3;
                                kuyruk3 = 0;
                                asansor4_kat = 0;
                            } else {
                                count_inside4 = 10;
                                exitcount += 10;
                                kat3 -= 10;
                                kuyruk3 -= 10;
                                asansor4_kat = 0;
                            }
                        }

                    }

                } else if (asansor4 == false) {
                    count_inside4 = 0;
                }
            }
        };
        Thread Asansor5 = new Thread() {

            public void run() {
                if (asansor5 == true) {
                    if (kuyruk_zemin4 > 0 || kuyruk4 > 0) {
                        if (kuyruk4 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction5 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk4 <= 10) {
                                count_inside5 = kuyruk4;
                                exitcount += kuyruk4;
                                kat4 -= kuyruk4;
                                kuyruk4 = 0;
                                asansor5_kat = 0;
                            } else {
                                count_inside5 = 10;
                                exitcount += 10;
                                kat4 -= 10;
                                kuyruk4 -= 10;
                                asansor5_kat = 0;
                            }
                        } else if (kuyruk_zemin4 > 0) {
                            //asansor1_kat-4'ün mutlağı *200 ms delay
                            direction5 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat - 4)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin4 <= 10) {
                                count_inside5 = kuyruk_zemin4;
                                kat4 += kuyruk_zemin4;
                                kuyruk_zemin4 = 0;
                                asansor5_kat = 4;
                            } else {
                                count_inside5 = 10;
                                kat4 += 10;
                                kuyruk_zemin4 -= 10;
                                asansor5_kat = 4;
                            }
                        }

                    } else if (kuyruk_zemin3 > 0 || kuyruk3 > 0) {
                        if (kuyruk3 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction5 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk3 <= 10) {
                                count_inside5 = kuyruk3;
                                exitcount += kuyruk3;
                                kat3 -= kuyruk3;
                                kuyruk3 = 0;
                                asansor5_kat = 0;
                            } else {
                                count_inside5 = 10;
                                exitcount += 10;
                                kat3 -= 10;
                                kuyruk3 -= 10;
                                asansor5_kat = 0;
                            }
                        } else if (kuyruk_zemin3 > 0) {
                            //asansor1_kat-3'ün mutlağı *200 ms delay
                            direction5 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat - 3)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin3 <= 10) {
                                count_inside5 = kuyruk_zemin3;
                                kat3 += kuyruk_zemin3;
                                kuyruk_zemin3 = 0;
                                asansor5_kat = 3;
                            } else {
                                count_inside5 = 10;
                                kat3 += 10;
                                kuyruk_zemin3 -= 10;
                                asansor5_kat = 3;
                            }
                        }

                    } else if (kuyruk_zemin1 > 0 || kuyruk1 > 0) {
                        if (kuyruk_zemin1 > 0) {
                            //asansor1_kat-1'in mutlağı *200 ms delay
                            direction5 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat - 1)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin1 <= 10) {
                                count_inside5 = kuyruk_zemin1;
                                kat1 += kuyruk_zemin1;
                                kuyruk_zemin1 = 0;
                                asansor5_kat = 1;
                            } else {
                                count_inside5 = 10;
                                kat1 += 10;
                                kuyruk_zemin1 -= 10;
                                asansor5_kat = 1;
                            }
                        } else if (kuyruk1 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction5 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk1 <= 10) {
                                count_inside5 = kuyruk1;
                                exitcount += kuyruk1;
                                kat1 -= kuyruk1;
                                kuyruk1 = 0;
                                asansor5_kat = 0;
                            } else {
                                count_inside5 = 10;
                                exitcount += 10;
                                kat1 -= 10;
                                kuyruk1 -= 10;
                                asansor5_kat = 0;
                            }
                        }
                    } else if (kuyruk_zemin2 > 0 || kuyruk2 > 0) {

                        if (kuyruk_zemin2 > 0) {
                            //asansor1_kat-2'in mutlağı *200 ms delay
                            direction5 = 1;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat - 2)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk_zemin2 <= 10) {
                                count_inside5 = kuyruk_zemin2;
                                kat2 += kuyruk_zemin2;
                                kuyruk_zemin2 = 0;
                                asansor5_kat = 2;
                            } else {
                                count_inside5 = 10;
                                kat2 += 10;
                                kuyruk_zemin2 -= 10;
                                asansor5_kat = 2;
                            }
                        } else if (kuyruk2 > 0) {
                            //asansor1_kat-0'in mutlağı *200 ms delay
                            direction5 = 0;
                            try {
                                TimeUnit.MILLISECONDS.sleep((Math.abs(asansor5_kat)) * 200);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(AVM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if (kuyruk2 <= 10) {
                                count_inside5 = kuyruk2;
                                exitcount += kuyruk2;
                                kat2 -= kuyruk2;
                                kuyruk2 = 0;
                                asansor5_kat = 0;
                            } else {
                                count_inside5 = 10;
                                exitcount += 10;
                                kat2 -= 10;
                                kuyruk2 -= 10;
                                asansor5_kat = 0;
                            }
                        }
                    }
                } else if (asansor5 == false) {
                    count_inside5 = 0;
                }
            }
        };
        Thread Kontrol = new Thread() {
            public void run() {
                toplam_kuyruk = kuyruk1 + kuyruk2 + kuyruk3 + kuyruk4 + kuyruk_zemin1 + kuyruk_zemin2 + kuyruk_zemin3 + kuyruk_zemin4;
                if (toplam_kuyruk > 20) {
                    if (asansor2 == false) {
                        asansor2 = true;
                        Asansor2.run();
                    } else if (asansor3 == false) {
                        asansor3 = true;
                        Asansor3.run();
                    } else if (asansor4 == false) {
                        asansor4 = true;
                        Asansor4.run();
                    } else if (asansor5 == false) {
                        asansor5 = true;
                        Asansor5.run();
                    }
                } else if (toplam_kuyruk < 10) {
                    if (asansor2 == true) {
                        asansor2 = false;
                        Asansor2.run();
                    } else if (asansor3 == true) {
                        asansor3 = false;
                        Asansor3.run();
                    } else if (asansor4 == true) {
                        asansor4 = false;
                        Asansor4.run();

                    } else if (asansor5 == true) {
                        asansor5 = false;
                        Asansor5.run();

                    }
                }

            }
        };
        //500 msde bir avmye giris 1000msde bir avmden cıkıs
        try {
            while (true) {
                Giris.run();
                Thread.sleep(500);
                Cikis.run();
                Thread.sleep(1000);
                //  Kontrol.run();
                Asansor1.run();
                Kontrol.run();

                System.out.println("0.floor : queue : " + (kuyruk_zemin1 + kuyruk_zemin2 + kuyruk_zemin3 + kuyruk_zemin4));
                if (kat1 >= 0) {
                    System.out.println("1.floor : all : " + kat1 + " queue : " + kuyruk1);
                } else {
                    System.out.println("1.floor : all : " + "0" + " queue : " + kuyruk1);
                }
                if (kat2 >= 0) {
                    System.out.println("2.floor : all : " + kat2 + " queue : " + kuyruk2);
                } else {
                    System.out.println("1.floor : all : " + "0" + " queue : " + kuyruk2);
                }
                if (kat3 >= 0) {
                    System.out.println("3.floor : all : " + kat3 + " queue : " + kuyruk3);
                } else {
                    System.out.println("1.floor : all : " + "0" + " queue : " + kuyruk3);
                }
                if (kat4 >= 0) {
                    System.out.println("4.floor : all : " + kat4 + " queue : " + kuyruk4);
                } else {
                    System.out.println("1.floor : all : " + "0" + " queue : " + kuyruk4);
                }

                System.out.println("Asansör1");
                System.out.println("active :" + asansor1);
                System.out.println("\tmode : working");
                System.out.println("\tfloor : " + asansor1_kat);
                //System.out.println("destination : "+);
                if (direction1 == 0) {
                    System.out.println("\tdirection : down");
                } else {
                    System.out.println("\tdirection : up");
                }

                System.out.println("\tcapacity : 10");
                System.out.println("\tcount_inside : " + count_inside1);
                //System.out.println("inside : ");

                System.out.print("\n");
                System.out.println("Asansör2");
                if (count_inside2 > 0) {
                    System.out.println("active :" + "true");
                } else {
                    System.out.println("active :" + "false");
                }
                if (count_inside2 > 0) {
                    System.out.println("\tmode : working");
                } else {
                    System.out.println("\tmode : idle");
                }

                System.out.println("\tfloor : " + asansor2_kat);

                //System.out.println("destination : "+);
                if (direction2 == 0) {
                    System.out.println("\tdirection : down");
                } else {
                    System.out.println("\tdirection : up");
                }

                System.out.println("\tcapacity : 10");
                System.out.println("\tcount_inside : " + count_inside2);
                //System.out.println("inside : ");

                System.out.print("\n");
                System.out.println("Asansör3");
                if (count_inside3 > 0) {
                    System.out.println("active :" + "true");
                } else {
                    System.out.println("active :" + "false");
                }
                if (count_inside3 > 0) {
                    System.out.println("\tmode : working");
                } else {
                    System.out.println("\tmode : idle");
                }
                System.out.println("\tfloor : " + asansor3_kat);
                //System.out.println("destination : "+);
                if (direction3 == 0) {
                    System.out.println("\tdirection : down");
                } else {
                    System.out.println("\tdirection : up");
                }

                System.out.println("\tcapacity : 10");
                System.out.println("\tcount_inside : " + count_inside3);
                //System.out.println("inside : ");

                System.out.print("\n");
                System.out.println("Asansör4");
                if (count_inside4 > 0) {
                    System.out.println("active :" + "true");
                } else {
                    System.out.println("active :" + "false");
                }
                if (count_inside4 > 0) {
                    System.out.println("\tmode : working");
                } else {
                    System.out.println("\tmode : idle");
                }

                System.out.println("\tfloor : " + asansor4_kat);
                //System.out.println("destination : "+);
                if (direction4 == 0) {
                    System.out.println("\tdirection : down");
                } else {
                    System.out.println("\tdirection : up");
                }

                System.out.println("\tcapacity : 10");
                System.out.println("\tcount_inside : " + count_inside4);
                //System.out.println("inside : ");

                System.out.print("\n");
                System.out.println("Asansör5");
                if (count_inside5 > 0) {
                    System.out.println("active :" + "true");
                } else {
                    System.out.println("active :" + "false");
                }
                if (count_inside5 > 0) {
                    System.out.println("\tmode : working");
                } else {
                    System.out.println("\tmode : idle");
                }
                System.out.println("\tfloor : " + asansor5_kat);
                //System.out.println("destination : "+);
                if (direction5 == 0) {
                    System.out.println("\tdirection : down");
                } else {
                    System.out.println("\tdirection : up");
                }

                System.out.println("\tcapacity : 10");
                System.out.println("\tcount_inside : " + count_inside5);
                //System.out.println("inside : ");

                System.out.println("0.floor : [[" + kuyruk_zemin1 + "," + "1]" + "[" + kuyruk_zemin2 + "," + "2]" + "[" + kuyruk_zemin3 + "," + "3]" + "[" + kuyruk_zemin4 + "," + "4]]");
                if (kuyruk1 > 0) {
                    System.out.println("1.floor : [[" + kuyruk1 + "," + "0]]");
                } else {
                    System.out.println("1.floor : []");
                }
                if (kuyruk2 > 0) {
                    System.out.println("2.floor : [[" + kuyruk2 + "," + "0]]");
                } else {
                    System.out.println("2.floor : []");
                }

                if (kuyruk3 > 0) {
                    System.out.println("3.floor : [[" + kuyruk3 + "," + "0]]");
                } else {
                    System.out.println("3.floor : []");
                }
                if (kuyruk4 > 0) {
                    System.out.println("4.floor : [[" + kuyruk4 + "," + "0]]");
                } else {
                    System.out.println("4.floor : []");
                }

                System.out.println("Exit count: " + exitcount);

                System.out.println("*************************");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
