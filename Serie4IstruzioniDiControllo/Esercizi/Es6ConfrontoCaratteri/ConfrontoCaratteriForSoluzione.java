import java.util.Scanner;

/**
 * Programma che richiede, ripetutamente, l'immissione di 3 caratteri. Il ciclo
 * continua a iterare se: i tre caratteri sono identici, oppure il primo e il
 * terzo carattere sono fra loro diversi e il secondo e una 'a', oppure i tre
 * caratteri sono 'b', 'c' e 'd' in un qualsiasi ordine.
 * 
 * Versione con for.
 */
public class ConfrontoCaratteriForSoluzione {

    /**
     * Procedura main - parte principale del programma
     * 
     * @param args
     */
    public static void main(final String[] args) {
        // Inizializza lo scanner per leggere dati da tastiera
        final Scanner input = new Scanner(System.in);
        // Variabili per i tre caratteri inseriti
        char car1;
        char car2;
        char car3;
        // Flag per stop del ciclo
        boolean stopLoop = false;

        for (; !stopLoop;) {
            // Richiedi i tre caratteri
            System.out.print("Carattere 1: ");
            car1 = input.nextLine().charAt(0);

            System.out.print("Carattere 2: ");
            car2 = input.nextLine().charAt(0);

            System.out.print("Carattere 3: ");
            car3 = input.nextLine().charAt(0);

            // Reset flag per stop del loop
            stopLoop = true;

            // Controlla la prima condizione
            if (car1 == car2 && car2 == car3)
                stopLoop = false;

            // Controlla la seconda condizione
            if (car2 == 'a' && car1 != car3)
                stopLoop = false;

            // Controlla la terza condizione
            String tmp = car1 + "" + car2 + "" + car3;
            if (tmp.contains("b") && tmp.contains("c") && tmp.contains("d"))
                stopLoop = false;
        }

        // Finalizza lo scanner
        input.close();
    }
}
