import java.util.Scanner;

public class LetturaNumeroStringaSoluzione {

    public static void main(String[] args) {
        // Chiedere all'utente un numero intero
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");

        // Leggere numero come stringa e salvarlo in variabile di tipo stringa
        String stringa = input.nextLine();

        // Convertire la stringa in un numero intero
        int numero = Integer.parseInt(stringa); // Integer.valueOf(stringa)

        // Controllare se < o > 10 e stampare a schermo
        if (numero < 10) {
            System.out.println("Il numero immesso e' minore di 10");
        } else if (numero > 10) {
            System.out.println("Il numero immesso e' maggiore di 10");
        } else { // questo blocco non era esplicitamente richiesto dal testo dell'esercizio
            System.out.println("Il numero immesso e' 10");
        }

        // Chiusura dello scanner
        input.close();
    }
}