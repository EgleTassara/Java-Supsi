import java.util.Arrays;

public class OrdinaNumeri {
    public static void main(String[] args) {
        int[] numeri = { 13, 19, 5, 99, 71 };

        // Copia l'array originale
        int[] numeriOrdinati = Arrays.copyOf(numeri, numeri.length);
        // Ordina la copia
        Arrays.sort(numeriOrdinati);

        // Mostra l'array originale e quello ordinato
        System.out.println("Non ordinati: " + Arrays.toString(numeri));
        System.out.println("Ordinati: " + Arrays.toString(numeriOrdinati));

        // Confronta i due arrays
        System.out.println("Sono uguali? " + Arrays.equals(numeri, numeriOrdinati));
    }
}
