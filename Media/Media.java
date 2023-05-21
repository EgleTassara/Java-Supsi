/* Scrivete un programma che richieda all’utente l’inserimento di 7 numeri interi positivi. Nel caso
    in cui l’utente inserisca un valore non corretto, visualizzare un messaggio di errore e ripetere la
    richiesta. Tutti i numeri validi inseriti (devono essere 7) dovranno essere salvati in un array.
    Una volta completato l’inserimento, il programma dovr`a determinare il numero maggiore e quello
    minore e calcolare la media dei valori inseriti. La media dovr`a essere calcolata come un valore in
    virgola mobile ma visualizzata senza la sua parte decimale.
    L’output dovr`a essere simile al seguente (in italico l’inserimento fatto dall’utente):

    Inserisci un numero = 3
    Inserisci un numero = 5
    Inserisci un numero = 6
    Inserisci un numero = -1
    Numero non valido! Inserisci un numero = -5
    Numero non valido! Inserisci un numero = 32
    Inserisci un numero = 34
    Inserisci un numero = -23
    Numero non valido! Inserisci un numero = 10
    Inserisci un numero = 0
    Numero minimo: 0
    Numero massimo: 34
    Media dei valori inseriti: 12 
*/

package Media;

import java.util.Scanner;
import java.util.Random;

public class Media {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int[] value = new int[4];

        while(value.length != 0) {
            System.out.println("Inserisci un numero intero");
            if(scan.hasNextInt()) {
                value = scan.nextInt();
            }
        }*/

        Random rand = new Random();

        // Obtain a number between [0 - 49].
        int n = rand.nextInt(50);

        // Add 1 to the result to get a number from the required range
        // (i.e., [1 - 50]).
        n += 1;

        System.out.print("Random number 50: " + n);
    }
    
}
