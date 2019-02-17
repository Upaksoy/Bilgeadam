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
        System.out.print("sayısı bulunacak harfi giriniz: ");
        String harf=input.next();





        System.out.println("girilen harf sayısından şu kadar var: ");
    }
}
