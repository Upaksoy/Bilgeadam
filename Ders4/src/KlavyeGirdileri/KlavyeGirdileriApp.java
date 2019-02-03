package KlavyeGirdileri;

import java.util.Scanner;

public class KlavyeGirdileriApp {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       //scanner.nextInt(); ınteger değer okuyacağım zaman bu metodu kullanıyoruz.
        //scanner.nextInt(); Double değer okuyacağım zaman bu metodu kullanıyoruz.

        //scanner.next(); // String değerleri okumak için
        //scanner.nextLine();// String değerleri okumak için(tüm satır)


        int sayi1,sayi2,sonuc;

        System.out.println("iki sayıyı toplayan program..");
        System.out.print("Bir sayı giriniz");
        sayi1=scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        sayi2=scanner.nextInt();


        sonuc=sayi1+sayi2;
        System.out.println("Toplama işleminizin sonucu: "+sonuc);

    }

}
