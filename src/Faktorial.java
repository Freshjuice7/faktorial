import java.math.BigInteger;

public class Faktorial {

    BigInteger spoctiFaktorial(long n) {
        BigInteger vysledek = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            vysledek = vysledek.multiply(BigInteger.valueOf(i));
        }
        System.out.println("faktorial cisla " +n + " je: "+ vysledek);
        return vysledek;
    }
}
