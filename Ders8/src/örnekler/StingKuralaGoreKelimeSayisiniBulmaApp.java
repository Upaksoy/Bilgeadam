package örnekler;

import java.util.Scanner;

public class StingKuralaGoreKelimeSayisiniBulmaApp {

    public static void main(String[] args) {

        //int CamelCaseCumle="";
        //camel case girilen bir string cümledeki kelime sayısını bulme
        //camel case string kullanıcı tarafından girilecek
        //String deger="stringIfadeleriGetirenMethod";

     Scanner scanner=new Scanner(System.in);
     System.out.print("Kelime sayısını bulmak istediğimiz camel case bir cümle giriniz");
     String deger = scanner.next();

     int sayac=1;

     char[] dizi=deger.toCharArray();
     String temp="";

     for (int i=0;i<dizi.length;i++){
         temp=String.valueOf(dizi[i]);

         if (temp.equals(temp.toUpperCase())){
             sayac++;

         }
     }


        System.out.println("girilen kelime sayısı");




    }
}
