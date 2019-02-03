package Kosulluİfadeler;

import java.util.Scanner;

public class IfTheanElseApp {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("bir değer giriniz");
        int sayi=input.nextInt();

        String cevap=(sayi>5)?"girilen değer 5'den büyüktür.":"Girilen değer 5'den küçüktür";

        System.out.println(cevap);


    }
}
