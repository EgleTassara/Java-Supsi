public class SommaNumeriForeach {
    public static void main(String[] args) {
        int[] numeri = { 1, 3, 5, 2, 12, 8, 21, 56, 3, 23 };
        int somma = 0;

        for (int numero : numeri) {
            System.out.println("Elemento: " + numero);
            somma += numero;
        }
        System.out.println("Somma: " + somma);
    }
}
