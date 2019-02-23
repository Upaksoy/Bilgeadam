package nesne;

public class StartApp {

    public static void main(String[] args) {

        dikdortgen dikdortgen=new dikdortgen();


        System.out.println(dikdortgen.uzunlugu);
        System.out.println(dikdortgen.en);
        System.out.println(dikdortgen.cevre);
        System.out.println(dikdortgen.alan);

        dikdortgen.en=5;
        dikdortgen.uzunlugu=6;

        System.out.println(dikdortgen.uzunlugu);
        System.out.println(dikdortgen.en);


        dikdortgen.cevre=2*dikdortgen.en+2*dikdortgen.uzunlugu;


        System.out.println(dikdortgen.cevre);

        dikdortgen.alan=dikdortgen.en*dikdortgen.uzunlugu;
        System.out.println(dikdortgen.alan);


        dikdortgen dikdortgen1=new dikdortgen();
        dikdortgen1.uzunlugu=4;
        dikdortgen1.cevre=0;
        dikdortgen1.alan=0;
        dikdortgen1.en=2;
        dikdortgen1.cevre=2*dikdortgen1.en+2*dikdortgen1.uzunlugu;

        System.out.println("dikdörtgen1 alanı: "+dikdortgen1.alan);
        System.out.println("dikdörtgen çevresi: "+dikdortgen1.cevre);













    }
}
