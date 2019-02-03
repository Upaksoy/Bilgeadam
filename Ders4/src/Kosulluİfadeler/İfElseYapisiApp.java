package Kosulluİfadeler;

import java.util.Scanner;

public class İfElseYapisiApp {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz");
        int sayi1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz");
        int sayi2=input.nextInt();

        if (sayi1==sayi2){

            System.out.println("Sayi1 ve sayi2 eşittir");

        } else{

            System.out.println("Sayi1 ve Sayi2 eşit değildir.");
        }

        System.out.println("Güle güle..");

    }
}
