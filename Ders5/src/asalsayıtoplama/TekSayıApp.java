package asalsayıtoplama;

public class TekSayıApp {

    public static void main(String[] args) {

        int i;

        String TekSayilar=" ";

        for (i=1;i<=100;i++) {

            if (i%2==1){

                TekSayilar+=i+" "; //concat işlemi
            }

        }

        System.out.println(" birden yüzde kadar tek sayılar"+TekSayilar);



    }
}
