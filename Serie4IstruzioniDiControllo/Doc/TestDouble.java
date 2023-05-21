package Serie4IstruzioniDiControllo.Doc;

import java.math.BigDecimal;

public class TestDouble {
    static final double EPSILON = 1e-12;

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        double risultatoAtteso = 0.3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("risultatoAtteso = " + risultatoAtteso);
        System.out.println();

        System.out.println("Confronto con ==");
        if (c == risultatoAtteso)
            System.out.println("Risultato OK");
        else
            System.out.println("Risultato NOK");

        System.out.println("\nConfronto con 'soglia'");
        if (Math.abs(c - risultatoAtteso) < EPSILON)
            System.out.println("Risultato OK");
        else
            System.out.println("Risultato NOK");

        // BigDecimal
        BigDecimal bigA = BigDecimal.valueOf(0.1);
        BigDecimal bigB = BigDecimal.valueOf(0.2);
        BigDecimal bigC = bigA.add(bigB);
        BigDecimal bigRisultatoAtteso = BigDecimal.valueOf(0.3);

        System.out.println("\n\nUsando BigDecimal");

        System.out.println("bigA = " + bigA);
        System.out.println("bigB = " + bigB);
        System.out.println("bigC = " + bigC);
        System.out.println("bigRisultatoAtteso = " + bigRisultatoAtteso);

        System.out.println("\nConfronto con equals()");
        if (bigC.equals(bigRisultatoAtteso))
            System.out.println("Risultato OK");
        else
            System.out.println("Risultato NOK");
    }
}