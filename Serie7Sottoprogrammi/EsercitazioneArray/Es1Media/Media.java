/*  Esercizio 1 - Media (15 minuti)
    Scrivete un programma che richieda all’utente l’inserimento di 7 numeri 
    interi positivi. Nel caso in cui l’utente inserisca un valore non corretto,  
    visualizzare un messaggio di errore e ripetere la richiesta.  
    Tutti i numeri validi inseriti (devono essere 7) dovranno essere salvati 
    in un array. Una volta completato l’inserimento, il programma dovrà 
    determinare il numero maggiore e quello minore e calcolare la media dei 
    valori inseriti. La media dovrà essere calcolata come un valore in virgola 
    mobile ma visualizzata senza la sua parte decimale.
    L’output dovrà essere simile al seguente 
    (in italico l’inserimento fatto dall’utente): 

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

package Es1Media;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Media {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int[] container = new int[7];
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double average = 0.0;
        int troncade = 0;

        for(; count <= container.length; count++) {
            System.out.print("Inserisci un numero intero positivo: ");
            input = scan.nextInt();

            while(!scan.hasNextInt() || input < 0) {
                System.out.print("Valore inserito non valido! Riprova: ");
                input = 0;
                scan.nextLine();
            }
        }
        input = container[count];
        System.out.println("PORCA PUTTANA " + Arrays.toString(container));
        min = Math.min(min, container[count]);
        max = Math.max(max, container[count]);
        sum += container[count];       
        average = (double) sum / container.length;
        troncade = (int) Math.floor(average);
        System.out.println("Value: " + Arrays.toString(container) + "\n" +
                            "Min: " + min + "\n" +
                            "Max: " + max + "\n" + 
                            "Sum: " + sum + "\n" + 
                            "Avarage: " + troncade);
        scan.close();
    }
}
