package örnekler;

public class StringİfadeyiTerstenYazdıranApp {

    public static void main(String[] args) {

        String deger="Merhaba Java";//merhaba javayı tersten yazdıran uyg.

       char[] dizi=deger.toCharArray();
       for (int i=dizi.length-1;i>=0;i--)
           System.out.print(dizi[i]);


    }
}
