package tipdonosumleri;

public class Main {

    /**
     * @throws NullPointerException
     * @Author ufuk paksoy
     * @param arga
     */

    public static void main(String[] arga) {
        //not tut
        /*

        Tip dönüşümleri genelde küçükten büyüğüe doğru olur.
        Dikkat etmemiz gereken büyükten küçüğe doğru olan tip dönüşümleridir.
        Aksi takdirde veri kayıpları yaşanabilir.

         */


        byte bytea=127;
        int intb;


      intb = bytea;

      intb=125;
      bytea= (byte) intb;
        System.out.println("Maximum boyutu geçmediğimde tip dönüşümü " +bytea);


        intb = bytea;

        intb=256;
        bytea= (byte) intb;
        System.out.println("Maximum boyutu geçtiğime tip dönüşümü " +bytea);




        Integer xInt=12;
        String xString;
        xString=xInt.toString();
        System.out.println(xString); // integerı, stringe çevirme











    }

}
