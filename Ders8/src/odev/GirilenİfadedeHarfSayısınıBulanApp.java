package odev;

import java.util.Scanner;

public class GirilenİfadedeHarfSayısınıBulanApp {

    public static void main(String[] args) {


        //Kullanıcı ilk olarak bir string ifade girecek,
        //sonrasında bir haft girecek,
        //program girdiği harf sayısını o ifade içerisinde bulacak.


        Scanner input=new Scanner(System.in);
        System.out.println("Bir String İfade Giriniz: ");
        String ifade=input.nextLine();//ard arda bir string ifade girilirken nexline ile ilk kullanım

        ifade=ifade.toLowerCase();

        System.out.print("sayısı bulunacak harfi giriniz: ");
        String harf=input.next();

        harf=harf.toLowerCase();

        if (ifade.length()>0) {

            char[] karakterler = ifade.toCharArray();
            int sayac = 0;
            for (char karakter : karakterler) {

                String a = String.valueOf(karakter);
                // if (String.valueOf(karakter).equals(harf)) {
                //}

                if (a.equals(harf)) {

                    sayac++;
                }


            }

            System.out.println("girilen harf sayı: " + sayac);



            }else {

            System.out.println("bir string ifade girmelisiniz");
        }





        System.out.println("girilen harf sayısından şu kadar var: ");
    }
}
