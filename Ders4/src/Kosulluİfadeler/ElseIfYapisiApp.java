package Kosulluİfadeler;

import java.util.Scanner;

public class ElseIfYapisiApp {

    public static void main(String[] args) {

        int sayi1,sayi2;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        sayi1=input.nextInt();
        System.out.println("İkinici sayıyı giriniz");
        sayi2=input.nextInt();

        if (sayi1>sayi2){
            System.out.println("Sayı1 büyüktür sayı2'den");
        } else if (sayi1==sayi2){
            System.out.println("sayi1 ve Sayı2 eşittir");
        } else {
            System.out.println("sayi1 küçüktür sayı2'den");
        }

        System.out.println("bye bye..");
    }

}
