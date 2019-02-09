package metodlar;

public class MetodApp {

    public static void main(String[] args) {

        helloMethod();
        //sayiYaz(50);

        int sonuc=10+20;
        sayiYaz(sonuc);

        toplamaIslemi(4,8);

        int gelenDeger=donusTipiolanToplamaIslemi(7,2);
        System.out.println("dönüş tipi olan toplama işlemi: "+gelenDeger);
    }

    //RETURN TİPİ OLMAYAN VE PARAMETRE ALMAYAN METHOD
    //STATİC OLMASININ SEBEBİ STATİC METHOD'DAN ÇAĞIRABİLMEK İÇİN.
    public static void helloMethod() {

        System.out.println("HELLO METHOD");
    }
    //donüş tipi olmayan parametre alan method
    public static void sayiYaz(int sayi) {

        System.out.println("sayınız: "+sayi);
    }
     //dönüş tipi olmayan 1 den fazla parametre alan method
    public static void toplamaIslemi(int sayi1,int sayi2){

        int sonuc=sayi1+sayi2;
        System.out.println("toplama işleminin  sonucu: "+sonuc);
    }

    public static int donusTipiolanToplamaIslemi(int sayi1,int sayi2){

        int sonuc=sayi1+sayi2;

                return sonuc;

    }

}
