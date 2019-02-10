import java.util.Scanner;

public class DortIslem {

    public static void main(String[] args) {


        double sonuc;

        Scanner input = new Scanner(System.in);
        int secenek, sayi1, sayi2;
        boolean devamEdilsinMi=false;

        do {
            System.out.println("hoşgeldiniz");
            System.out.println("hangi işlemi yapmak istiyorsunuz");
            System.out.println("1-) toplama işlemi");
            System.out.println("2-) çıkarma işlemi");
            System.out.println("3-) bölme işlemi");
            System.out.println("4-) çarpma işlemi");
            System.out.println("0-) çıkış");

            System.out.println("seçiniz");
            secenek = input.nextInt();

            switch (secenek) {

                case 1:
                    System.out.print("birinci sayıyı giriniz");
                    sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    sayi2 = input.nextInt();
                    sonuc = toplamaIslemı(sayi1, sayi2);
                    System.out.println("toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinMi=true;
                    break;

                case 2:
                    System.out.print("birinci sayıyı giriniz");
                    sayi1 = input.nextInt();
                    System.out.println("ikinci sayıyı giriniz");
                    sayi2 = input.nextInt();
                    sonuc = cıkarmaIslemı(sayi1, sayi2);
                    System.out.println("çıkarma işleminizin sonucu: " + sonuc);
                    devamEdilsinMi=true;
                    break;


                case 3:
                    System.out.println("birinci sayıyı giriniz");
                    sayi1 = input.nextInt();
                    System.out.println("ikinici sayıyı giriniz");
                    sayi2 = input.nextInt();
                    sonuc = bolmeIslemı(sayi1,sayi2);
                    System.out.println("bölme işleminizin sonucu "+sonuc);
                    devamEdilsinMi=true;
                    break;

                case 4:
                    System.out.println("birinci sayıyı giriniz");
                    sayi1 = input.nextInt();
                    System.out.println("ikinici sayıyı giriniz");
                    sayi2= input.nextInt();
                    sonuc = carpmaIslemı(sayi1,sayi2);
                    System.out.println("bölme işleminizin sonucu "+sonuc);
                    devamEdilsinMi=true;
                    break;


                case 0:
                    devamEdilsinMi = false;
                    System.out.println();
                    break;
                default:
                    System.err.println("yanlış bir giriş yaptınız");
                    devamEdilsinMi = true;


            }

        }

        while (devamEdilsinMi);


    }

    public static double toplamaIslemı(double sayi1, double sayi2) {

        double sonuc;
        sonuc = sayi1 + sayi2;
        return sonuc; } //return sayi1+sayi2


        public static double cıkarmaIslemı(double sayi1,double sayi2) {

        double sonuc;
        sonuc = sayi1 - sayi2;
        return sonuc; }

        public static double bolmeIslemı(double sayi1, double sayi2) {

            double sonuc;
        sonuc = sayi1/sayi2;
        return sonuc;
    }

        public static double carpmaIslemı(double sayi1, double sayi2){

        double sonuc;
        sonuc = sayi1*sayi2;
        return sonuc;
    }



    }

