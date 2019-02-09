package mantiksaloparatorler;

public class MantiksalOperatorApp {

    public static void main(String[] args) {





        //  <var1> && <var2> ve operatörü -> sağındaki ve solundaki değişken değeri true ise true değerini döner

        /**
        <var1> || <var2> yada operatörü
         sağındaki ve solundaki değerler false ise false değerini verir.
         sağındaki ve solundaki değerlerden birisi true diğeri false ise true değerini verir

         */

        /**
         * !<var1> değil mi oparetörü
         * verilen değişkenin tersini bize verir
         * verilen değişken true i,se false verir
         * verilen değişken false ise true verir
          */

        /**
         * <var1> ^ <var2> xor işareti yada işleminin tersi
         * sağındaki ve solundaki değerler true ise false değerini verir
         */


        boolean x=true, y=false, z=true, t=false, sonuc;
        sonuc=x&&z;
        System.out.println("x ve z and(&&) ile karşılaştırılması: "+sonuc);

        sonuc=x&&y;
        System.out.println("X ve Y and(&&) ile karşılaştırılması: "+sonuc);

        sonuc=x||t;
        System.out.println("Y ve T yada(||) ile karşılaştırılması: "+sonuc);

        sonuc=x||y;
        System.out.println(" X ve Y yada(||) ile karşılaştırılması: "+sonuc);


        sonuc=!x;
        System.out.println("X değişkeninin tersini alma: "+sonuc);

        sonuc=x^z;
        System.out.println(" X ve Z yada operatörünün tersi (^) ie karşılaştırılması: "+sonuc);

        sonuc=x^y;
        System.out.println("X ve y yada operatörünün tersi (^) ie karşılaştırılması: "+sonuc);



    }

}
