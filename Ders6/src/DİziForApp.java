public class DİziForApp {

    public static void main(String[] args) {

        int[] dizi=new int[5];

        for (int i=0;i<dizi.length;i++){

            dizi[i]=i+2;


        }

        for (int i=0;i<dizi.length;i++){  //tek tek sout yazmamak için.

            System.out.println("dizinin "+i+". indisinin değeri "+dizi[i]);
        }

    }
}
