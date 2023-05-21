package Serie4IstruzioniDiControllo.Esercizi.Es1SommaINumeri;
/*  - Disegnate il diagramma di flusso di un programma che richieda l’immissione ripetuta di valori 
    interi positivi da parte dell’utente. Il programma dovr`a:
        • terminare se l’utilizzatore specifica il numero 0,
        • sommare il numero specificato a quelli precedentemente specificati, se il numero `e piu` piccolo
        di 9,
        • stampare a schermo la somma se il numero `e 10,
        • stampare la media di tutti i numeri immessi (minori di 9), se il numero `e piu` grande di 10.
    Provate a sviluppare il programma, sia utilizzando un’istruzione if, 
    sia utilizzando un’istruzione switch.
*/

import java.util.Scanner;

public class SommaINumeriSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int maxSomma = 0;
        int somma = 0;
        int media = 0; 
        int counter = 0;

        System.out.println("Inserisci un valore intero");

        while(scanner.hasNextLine()) {
            //Controllo se il valore inserito sia un int
            for(; !scanner.hasNextInt() ;) {
                scanner.nextLine();
                System.out.println("Inserisci un valore intero!");
            }
            value = scanner.nextInt();

            // Controllo i casi per assegnare il risultato 
                switch (value) {
                    case 0 -> {
                        System.out.println("Il programma stà terminando!!!");
                        System.exit(0);
                    }
                    case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                        //Sommare il value con i value inseriti precedentemente
                        counter++;
                        somma = somma + value;
                        System.out.println("Somma i value inseriti: " + somma);;
                    }
                    case 9 -> {
                        //Reinserire nuovamente il value
                        System.out.println("Reinserisci un valore");
                        scanner.nextLine();
                    }
                    case 10 -> {
                        //Stampa la somma di tutti i value
                        maxSomma = somma + value;
                        System.out.println("Somma di tutti i valori: " + maxSomma);
                    }
                    default -> {
                        if(value > 10 && counter == 0) {
                            //Media di tutti i value < 9
                            System.out.println("Non è possibile effettuare la media con solo un valore");
                        } else {
                            //MEdia di tutti i value < 9 con counter != 0
                            media = (somma) /  counter;
                            System.out.println("Media di tutti i valori inseriti minori di 9: " + media);
                        }
                    }
                }            
        }
        scanner.close();
    }
}