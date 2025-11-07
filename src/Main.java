public class Main {
    public static void main(String[] args) {
        Faktorial faktorial = new Faktorial();


        long[] cisla = {5, 23, 1012, 100123, 3, 21};


        for (long cislo : cisla) {
            System.out.println("Faktoriál čísla " + cislo + " je: ");
            System.out.println(faktorial.spoctiFaktorial(cislo));
            System.out.println("--------------------------------");
        }
    }
}
