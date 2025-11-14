import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Faktorial faktorial = new Faktorial();




        //long[] cisla = {5, 23, 1012, 100123, 3, 21};

         /* for (long cislo : cisla) {
            System.out.println("Faktoriál čísla " + cislo + " je: ");
            System.out.println(faktorial.spoctiFaktorial(cislo));
            System.out.println("--------------------------------");
        }*/

        int cislo1 = 5;
        int cislo2 = 3;
        int cislo3 = 21;

        AtomicBoolean a = new AtomicBoolean(false);
        AtomicBoolean b = new AtomicBoolean(false);
        AtomicBoolean c = new AtomicBoolean(false);

        Thread vlaknoA =  new Thread(()->{
            faktorial.spoctiFaktorial(cislo1);
            a.set(true);
        });
        Thread vlaknoB =  new Thread(()->{
            faktorial.spoctiFaktorial(cislo2);
            b.set(true);
        });
        Thread vlaknoC =  new Thread(()->{
           faktorial.spoctiFaktorial(cislo3);
           c.set(true);
        });


        vlaknoA.start();
        vlaknoB.start();
        vlaknoC.start();


        try {
            vlaknoA.join();
            vlaknoB.join();
            vlaknoC.join();
            System.out.println("vlákno doběhlo");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
