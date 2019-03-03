package cokbicimlilik;

public class StartApp {

    public static void main(String[] args) {

        Sekiller sekiller=new Sekiller();

        System.out.println(sekiller.alanHesapla());

        //Diktorgen diktorgen=new Diktorgen();
        //diktorgen.setEn(5);
        //diktorgen.setBoy(6);
        //System.out.println("dikdörtgen alanı: "+diktorgen.alanHesapla);



        Kare kare=new Kare();
        Kare.setKenar(3);
        System.out.println("karenin alanı: "+kare.alanHesapla());

       sekillerinAlaniniHesapla(sekiller);
       sekillerinAlaniniHesapla(dikdorgen);
       sekillerinAlaniniHesapla(kare);

    }

    public static void sekillerinAlaniniHesapla(Sekiller sekiller){

        System.out.println("şeklin alanı: "+sekiller.alanHesapla());

    }


}
