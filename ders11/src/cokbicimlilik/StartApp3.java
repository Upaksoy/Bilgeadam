package cokbicimlilik;

public class StartApp3 {

    public static void main(String[] args) {

        Sekiller sekiller=new Sekiller();

        Diktorgen diktorgen=new Diktorgen();
        diktorgen.setBoy(6);
        diktorgen.setEn(5);
        Kare kare=new Kare();
        kare.setKenar(10);

        sekillerinAlaniniHesapla(sekiller);
        Kisi kisi=new Kisi();
        sekillerinAlaniniHesapla(kisi);
        sekillerinAlaniniHesapla(diktorgen);

    }

    public static void sekillerinAlaniniHesapla(Object nesne){

        if (nesne instanceof Sekiller ){
            Sekiller sekiller= (Sekiller) nesne;

            System.out.println("şekiller nesnesinin alanı: "+sekiller.alanHesapla());
        } else{
            System.out.println("bu bir şekil değildir");
        }
    }
}
