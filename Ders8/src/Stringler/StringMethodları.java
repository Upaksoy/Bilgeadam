package Stringler;

public class StringMethodları {

    public static void main(String[] args) {


        String deger="Merhaba Java";

        System.out.println(deger.toUpperCase());//büyük harfe çevirme

        System.out.println(deger.toLowerCase());//küçük harfe çevirme

        System.out.println(deger.charAt(3));//verilen index numarasındaki karakteri alma

        System.out.println(deger.indexOf('J'));// verilen harfin hangi indexte olduğunu verir

        System.out.println(deger.lastIndexOf('a')); //seçilen karakterden en son olan değeri verir

        System.out.println(deger.substring(8));//verilen indis numrasından başlayıp geriye kalan tüm ifadeyi getirir.(verilen indis numarası da dahil!!)

        System.out.println(deger.substring(5,7));//5.indisten başla 7.elemanı al.

        System.out.println(deger.concat(" Naber"));//ifade birleştirme

        System.out.println(deger.replace('a','o')); //karakterleri değiştirme

        System.out.println(deger.replaceAll(" ",""));//metin arasındaki boşluğu kaldırma

        String bosluk="Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim());//metinin başındaki ve sonundaki boşluğu silme

        String adSoyad="Ufuk Paksoy";
        String ad="";
        String soyad="";

        int boslukDeger=adSoyad.indexOf(" ");


        System.out.println("bosluk deger: "+boslukDeger);
        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);
        System.out.println("ad: "+ad);
        System.out.println("soyad: "+soyad);

        System.out.println("char arrayy kullanımı");
        char[] dizi=deger.toCharArray();
        for (char c:dizi){
            System.out.println(c);
        }

        String a="12";

        //İlkel tipe dönüştürmek için parseInt() methodu kullanılır.



        int sayi=Integer.parseInt(a);
        System.out.println(sayi);

        Integer sayi2=Integer.valueOf(a);
        System.out.println(sayi2);


       //Primitive tipleri, String veri tipine dönüştürmek için valueOf kullanılır.
        String stringSayi=String.valueOf(sayi);
        String stringSayi2=sayi2.toString();
        //(Wrapper) Nesne tipindeki bir değeri stringe çevirmek için valueof kullanılabilir.
        //String.valueof methodu Object türünden nesne aldığı için.
        //Java'da tüm nesneler object sınıfından türerler.
        String asa=String.valueOf(sayi2);

        double doubleSayi=Double.parseDouble(a);
        System.out.println(doubleSayi);





    }

}
