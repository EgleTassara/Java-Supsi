package Serie6ArraysEnumerativiSottoprogrammi.Esercizi.Es3RimuoviDuplicati;

import java.util.Arrays;
import java.util.Scanner;

/*  Esercizio 6.3 - Rimozione duplicati (facoltativo)
    Usate un array monodimensionale per risolvere il seguente problema:  
    scrivete un’applicazione che legga da tastiera cinque numeri, ciascuno 
    compreso tra i valori 10 e 100 inclusi. Dopo l’acquisizione di ogni numero,  
    memorizzatelo solamente se non è un duplicato di un numero già
    inserito in precedenza. Dopo aver richiesto i cinque numeri,  
    visualizzate l’insieme completo di valori unici memorizzati. 
*/

public class RimuoviDuplicati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int[] container = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Inserisci un numero compreso tra 10 e 100: ");

            while(!scan.hasNextInt()) {
                System.out.println("Inserire un numero intero");
                scan.nextLine();
            }
            input = scan.nextInt();
    
            if (input >= 10 && input <= 100) {
                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (container[i] == input) {
                        isDuplicate = true;
                        break;
                    }
                }
    
                if (!isDuplicate) {
                    container[count] = input;
                    count++;
                } else {
                    System.out.println("Il numero inserito è già stato inserito in precedenza, riprova.");
                }
            } else {
                System.out.println("Il numero inserito non è compreso tra 10 e 100, riprova.");
            }
        }
    
        System.out.print("I numeri unici inseriti sono:" + "\n" +
                        Arrays.toString(container));
    }
    
}
