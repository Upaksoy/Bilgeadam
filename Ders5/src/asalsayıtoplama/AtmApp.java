package asalsayıtoplama;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {


        int secenek = 0;
        String sifre = "1234";
        String girilenSifre = "";
        int bakiye = 1_000_000;
        int cekilcekMiktar = 0;
        boolean devamEdilsinMi = false;

        Scanner input = new Scanner(System.in);


        do {

            System.out.println("HOŞGELDİNİZ");
            System.out.println("ŞİFRENİZİ GİRİNİZ");
            girilenSifre = input.next();


            if (girilenSifre.equals(sifre)) {

                System.out.println("HANGİ İŞLEMİ YAPMAK İSTİYORSUNUZ");
                System.out.println("1-) PARA ÇEK");
                System.out.println("0-) ÇIKIŞ");
                System.out.println("SEÇİNİZ");
                secenek = input.nextInt();

                if (secenek >= 0 && secenek <= 1) {

                    switch (secenek) {

                        case 0:
                            System.out.println("YİNE BEKLERİZ");
                            devamEdilsinMi = false;
                            break;

                        case 1:
                            System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ");
                            cekilcekMiktar = input.nextInt();
                            if (cekilcekMiktar < bakiye) {
                                bakiye = bakiye - cekilcekMiktar;
                                System.out.println("PARANIZ ÇEKİLİYOR");
                                System.out.println("KALAN MİKTAR " + bakiye + "TL");
                                System.out.println("GÜLE GÜLE :");
                                devamEdilsinMi = true;

                            } else {

                                System.out.println("YETERSİZ BAKİYE");
                                devamEdilsinMi = false;
                            }


                    }
                } else {

                    System.out.println("YANLIŞ ŞİFRE GİRDİNİZ");
                }


            }



        } while (devamEdilsinMi) ;
    }
}
