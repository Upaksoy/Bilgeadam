package nesne;

public class dikdortgen {

    //sınıf içerisinde verilen değişkenler sınıf değişkenleridir
    //o sınıfın özellikleridir.(properties)

    public double uzunlugu;
    public  double en;
    public double cevre;
    public double alan;
    public  static int sayi;
    public static final double PI=3.14;

public dikdortgen(){

    //this keyword ile class değişkenlerinden bahsediyor olacağız

    this.uzunlugu=5;
    this.en=6;
    //uzunlugu=5;
    //en=6;



}

public void cevreHesapla(){

    this.alan=(2*this.en)+(2*this.uzunlugu);
    System.out.println("dikdörtgenin alanı "+this.cevre);

}

public void alanHesapla(){

    this.alan=this.en*this.uzunlugu;
    System.out.println("dikdörtgenimin alanı "+alan);



}



}
