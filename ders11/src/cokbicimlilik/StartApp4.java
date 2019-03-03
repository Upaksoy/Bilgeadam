package cokbicimlilik;

public class StartApp4 {

    public static void main(String[] args) {
        genisletebilirlilik();


    }

    public static void genisletebilirlilik(){

        Sekiller sekiller=new Sekiller();
        Sekiller sekiller2=new Sekiller();
        Diktorgen diktorgen=new Diktorgen(en:3,boy:5);
        Diktorgen diktorgen2=new Diktorgen();
        diktorgen.setEn(2);
        diktorgen.setBoy(3);
        Kare kare=new Kare(kenar:9);
        Kare kare2=new Kare();
        kare2.setKenar(7);

        Sekiller[] sekillers=new Sekiller[6];

        sekillerDizisi[0]=sekiller;
        sekillerDizisi[1]=sekiller2;
        sekillerDizisi[2]=diktorgen;
        sekillerDizisi[3]=diktorgen2;
        sekillerDizisi[4]=kare;
        sekillerDizisi[5]=kare2;

        sekillerAlanlari(sekillerDizisi);
    }

    public static void sekillerAlanlari(Sekiller[] sekillerDizi){

        if (sekillerDizi.length>0){

            for (Sekiller sekiller:sekillerDizi){
                System.out.println("şekillerin alanı:"+sekiller.alanHesapla());
            }
        }

    }
}
