package Kosulluİfadeler;

import java.util.Scanner;

public class İfElseApp {

    public static void main(String[] args) {


        // if parantez içerisindeki değer true ise blok içerisine girer.

        //int a=5;
        //if (a==5) {

            //System.out.println("a değişkeni 5'e eşittir.");



       // System.out.println("good bye...");


        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=scanner.nextInt();

        if (sayi<10){

            System.out.println("girilen sayı 10 dan küçüktür");
        }

    }


}