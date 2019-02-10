package metodlar;

import java.util.Scanner;

public class MethodOrnekApp {

    public static void main(String[] args) {

        int secenek;
        int sayi1;
        int sayi2;
        float sonuc;


        System.out.println("HOŞGELDİNİZ");
        System.out.println("hangi işlemi yapmak istiyorsunuz");
        System.out.println("1-)toplama");
        System.out.println("2-)çıkarma");
        System.out.println("3-)çarpma");
        System.out.println("4-)bölme");
        System.out.print("SEÇİNİZ ");


        Scanner input = new Scanner(System.in);
        secenek = input.nextInt();


        switch (secenek) {

            case 1:
                System.out.println("ilk sayıyı giriniz");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                sonuc = ToplamaIslemı(sayi1,sayi2);
                System.out.println("toplama ıslemı sonucu"+sonuc);
                break;
            case 2:
                System.out.println("ilk sayıyı giriniz");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                sonuc = CıkarmaIslemı(sayi1,sayi2);

                System.out.println("çıkarma işleminin sonucu"+sonuc);
                break;
            case 3:
                System.out.println("ilk sayıyı giriniz");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                sonuc = CarpmaIslemı(sayi1,sayi2);
                System.out.println("çarpma işleminin sonucu"+sonuc);
                break;
            case 4:
                System.out.println("ilk sayıyı giriniz");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                sonuc = BolmeISlemı(sayi1,sayi2);
                System.out.println("bölme işleminin sonucu"+sonuc);
                break;

        }






    } public static int CıkarmaIslemı(int sayi1,int sayi2) {

        int sonuc=sayi1-sayi2;
        return sonuc;

    }

    public static int ToplamaIslemı(int sayi1, int sayi2){

        int sonuc=sayi1+sayi2;
        return sonuc;
    }

    public static int CarpmaIslemı(int sayi1,int sayi2){

        int sonuc=sayi1*sayi2;
        return sonuc;
    }

    public static float BolmeISlemı(float sayi1,float sayi2){

        float sonuc=sayi1/sayi2;
        return sonuc;
    }
}
