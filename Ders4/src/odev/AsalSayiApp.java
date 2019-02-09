package odev;


/*
Klavyeden girilen sayının
asal olup olmadığını bulan program
 */
public class AsalSayiApp {

    public static void main(String[] args) {



        if (sayi > 1) {

            boolean asalMiDegilMi = false; //flag

            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {

                    asalMiDegilMi = true;

                }

            }

            if (asalMiDegilMi) {

                System.out.println("girilen sayı asal değildir.");

            } else {

                System.out.println("girilen ayı asaldır");
            }

        }


    }

}
