public class CopiaArray2 {
    public static void main(String[] args) {
        int[] v = { 3, 72, 4, 1 };

        // Crea un nuovo array con la stessa taglia dell'originale
        int[] w = new int[v.length];
        // Copia l'intero array
        System.arraycopy(v, 0, w, 0, v.length);

        System.out.print("Originale: ");
        for (int value : v)
            System.out.print(value + " ");
        System.out.print("\nCopia: ");
        for (int value : w)
            System.out.print(value + " ");
    }
}