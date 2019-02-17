package Stringler;

public class Stringİfadeler {

    public static void main(String[] args) {

        String jv="Merhaba Java";
        String java="Merhaba Java";
        String a=new String("Merhaba Java");
        //String a="Merhaba Java";

        System.out.println(java);
        System.out.println(a);

        System.out.println("java değişkeninin boyutu "+jv.length());

        if (jv==a){
            System.out.println("eşit");


        }


        if (jv.equals(a)){

            System.out.println("Equals ile eşittir");
        }



    }
}
