package aritmetikoparatorler;

public class AritmatikArtirimApp {

    public static void main (String[] args) {

        int a=2,b=7,c=40,d=50;

          a++; // değişkenimi ata sonra arttır
        System.out.println("değişkenimi ata sonra arttır. "+a);

        ++b; // değişkenimi arttır sonra ata.
        System.out.println("değişkenimi arttır sonra ata. "+b);

          c--; // değişkenimi ata sonra azalt.
        System.out.println("değişkenimi ata sonra azalt. "+c);

          --d; // değişkenimi bir kere azalt sonra ata.
        System.out.println("değişkenimi bir kere azalt sonra ata. "+c);


        int x=7,y=7,sonuc1,sonuc2;
        sonuc1=++x;
        sonuc2=y++;

        System.out.println("sonuc1: "+sonuc1);
        System.out.println(" artırımdan sonraki x deger,: "+x);
        System.out.println("sonuc 2: "+sonuc2);
        System.out.println("artırımdan sonrakı y değeri: "+y);







    }

}
