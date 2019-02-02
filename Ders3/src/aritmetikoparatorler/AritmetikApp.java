package aritmetikoparatorler;

public class AritmetikApp {

    public static void main(String[] args) {

        /*
            ctrl+alt+a gite ekleme islemi
            ctrl+shift+k push kısayolu
            sag alt koseden yeni branch acılabilir
             */

        System.out.println("Merhaba ilk branch");

         /*
         operants(oparatörler)         karsılastırma oparaotleri           mantıksal oparatörler

          + toplama
         - çıkarma
         * çarpma
         / bölme
         ++
         --
          */

         int a=7,c=3,d;
         int b=3;

         int sonuc;
         double bolmeSonucu,x=7,y=3; //ondalıklı bolme sonucu icin
        //Degisken isimleri farklı olmalıdır

         sonuc=a+b;
        System.out.println("toplama ıslemi: "+sonuc);

        sonuc=a-b;
        System.out.println("cıkarma islemi: "+sonuc);

        sonuc=a*b;
        System.out.println("carpma islemi: "+sonuc);

        sonuc=a/b;
        System.out.println("bolme islemi: "+sonuc);

        bolmeSonucu=x/y;
        System.out.println("double bolme sonucu: "+bolmeSonucu);

        sonuc=a%b;
        System.out.println("(Mod Alma) sayının kalanını bulma ıslemı: "+sonuc);





    }


}





















