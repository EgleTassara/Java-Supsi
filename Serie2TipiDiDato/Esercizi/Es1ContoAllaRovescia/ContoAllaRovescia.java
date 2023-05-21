package Serie2TipiDiDato.Esercizi.Es1ContoAllaRovescia;
/*  Conto alla rovescia:
*       Sviluppate un programma che richieda l'immissione di un numero intero compreso tra 0 e 100.
*       Visualizzate un messaggio d'errore nel caso in cui il valore immesso non sia compreso all'interno
*       dell'intervallo. In seguito, il programma dovrà mostrare a schermo se il numero è compreso tra
*       0 e 10, tra 11 e 20, ecc... fino al 100. Alla fine stampate a schermo, su una sola riga e in ordine
*       decrescente, tutti i numeri compresi tra 0 e il valore immesso.
*/

//Import che servono:
import java.util.Scanner;

// Creare la classe ContoAllaRovescia
public class ContoAllaRovescia {

    //Creare il main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Valore inserito dall'utente
        int input; 

        //Count per il while per ciclare i valori e stamparli a video
        int count = 0;

        System.out.print("Inserire un intero compreso tra 0 e 100: ");

         while (!scanner.hasNextInt()) {
            System.out.print("Inserire un intero!! Riprova: ");
            // richiamo lo scanner per far reinserire il valore
            scanner.nextLine();
        }
        //Salvo il valore dato dall'utente
        input = scanner.nextInt();

        //Chiudo lo scanner
        scanner.close();       

        //Verifico il range di valore in cui è compreso l'input

        if ((input >= 0) && (input <= 10)) {
            System.out.println("Il tuo numero è compreso tra 0 e 10");

        } else if ((input >= 11) && (input <= 20)) {
             System.out.println("Il tuo numero è compreso tra 11 e 20");

        } else if ((input >= 21) && (input <= 30)) {
            System.out.println("Il tuo numero è compreso tra 21 e 30");

         } else if ((input >= 31) && (input <= 40)) {
            System.out.println("Il tuo numero è compreso tra 31 e 40");
                
        } else if ((input >= 41) && (input <= 50)) {
            System.out.println("Il tuo numero è compreso tra 41 e 50");
                    
        } else if ((input >= 51) && (input <= 60)) {
            System.out.println("Il tuo numero è compreso tra 51 e 60");
                    
        } else if ((input >= 61) && (input <= 70)) {
            System.out.println("Il tuo numero è compreso tra 61 e 70");
                    
        } else if ((input >= 71) && (input <= 80)) {
            System.out.println("Il tuo numero è compreso tra 71 e 80");
                    
        } else if ((input >= 81) && (input <= 90)) {
            System.out.println("Il tuo numero è compreso tra 81 e 90");
                    
        } else if ((input >= 91) && (input <= 100)) {
             System.out.println("Il tuo numero è compreso tra 91 e 100");
                    
        } else if ((input > 100) || (input < 0)) {
            System.out.println("Hai inserito un valore non compreso tra 0 e 100!");
        }

        //Ciclo e stampo i valori a video tanti quanti input
        while (input >= 0 && input <= 100 && count <= input)  {
            System.out.print(count + " ");
            count ++;
        }

    }

}