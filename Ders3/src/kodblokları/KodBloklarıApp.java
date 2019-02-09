package kodblokları;

public class KodBloklarıApp {

    public static void main(String[] args) {

        int a = 5;
        System.out.println(" kademe 1" + a);

        {
            a = 3;
            System.out.println("kademe 2" + a);

            {

                int b = 10;
                a = 2;
                System.out.println("Kademe 3 " + "a  değeri: " + a + " b değeri");
            }

            {
                b = 7;
                System.out.println("kademe 4 " + "a  degeri: " + a + " b degeri");

            }
        }
    }
}

