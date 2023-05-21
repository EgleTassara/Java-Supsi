public class ElevamentoPotenzaIt {
    private static long elevamentoPotenza(int base, int esponente) {
        long risultato = 1;
        for (int i = 0; i < esponente; i++)
            risultato *= base;
        return risultato;
    }

    public static void main(String[] args) {
        int base = 3;
        int esponente = 4;
        System.out.println(base + "^" + esponente + " = " + elevamentoPotenza(base, esponente));
    }
}