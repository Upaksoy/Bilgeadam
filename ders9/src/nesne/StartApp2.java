package nesne;

public class StartApp2 {

    public static void main(String[] args) {


        dikdortgen dikdortgen1=new dikdortgen();

        dikdortgen1.alan=5;

        System.out.println("dikdörtgen1 alanı "+dikdortgen1.alan);

        dikdortgen dikdortgen2=new dikdortgen();


        //dikdörtgen1 artık dikdörtgen2'nin heap'de oluşturduğu
        //obejeyi(örneklendirme/instance) refere ettiği için
        //refere ettiği örneklendirmenin değerlerini alır.
        //dikdörgen1'in önceden refere ettiği örneklendirme,
        //gc tarafından yok edilir.(destroy edilir)
        dikdortgen1=dikdortgen2;
        System.out.println("dikdörtgen1 alanı "+dikdortgen1.alan);


        dikdortgen1.alan=6;
        System.out.println("dikdörgen1 alanı "+dikdortgen1.alan);





    }

}
