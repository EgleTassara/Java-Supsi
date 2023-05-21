public class Ricorsione {
    private static void ricorsiva(int contatore) {
        if (contatore == 0)
            return;
        System.out.println("Prima: " + contatore);
        ricorsiva(--contatore);
        System.out.println("Dopo: " + contatore);
    }

    public static void main(final String[] args) {
        ricorsiva(5);
    }
}