package Serie3IntroduzioneAlleClassi.Esercizi.Es1OperazioniAritmetiche;
/* Operazioni Aritmetiche:
    - Scrivete un programma che permetta l’immissione, da parte dell’utilizzatore, 
    - delle variabili numeriche a, b, c, d e r, 
        e che visualizzi il risultato della seguente formula matematica:
    
    Assicuratevi di introdurre i controlli necessari ad evitare una divisione per 0. In caso di errore,
    richiedete nuovamente i valori all’utente.
    Provate a sviluppare due versioni del programma: una che per i calcoli utilizzi solo tipi di dato
    interi, l’altra che utilizzi numeri a virgola mobile. Qual `e la differenza?
    
    La differenza è che gli interi tagliano tutti i numeri dopo la virgola il double no.
*/

import java.util.Scanner;

public class OperazioniAritmeticheDouble {
    public static void main(String[] args) {

        //Scanner per prendere in input
        Scanner scanner = new Scanner(System.in);
        //Dichiaro in blocco le variabili da popolare con i valori in input
        double a, b, c, d, r;

        //Richiesta input di interi
        System.out.println("Ciao Inserisci dei valori con la virgola: A, B, C, D, R!");

        //Stampa il valore di A:
        System.out.println("Valore di A:");

        while(scanner.hasNextDouble()) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Inserisci un numero con la virgola!");
                scanner.nextLine();
            }
            a = scanner.nextDouble();

            System.out.println("Valore di B:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Inserisci un numero con la virgola!");
                scanner.nextLine();
            }
            b = scanner.nextDouble();

            System.out.println("Valore di C:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Inserisci un numero con la virgola!");
                scanner.nextLine();
            }
            c = scanner.nextDouble();

            System.out.println("Valore di D:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Inserisci un numero con la virgola!");
                scanner.nextLine();
            }
            d = scanner.nextDouble();


            System.out.println("Valore di R:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Inserisci un numero con la virgola!");
                scanner.nextLine();
            }
            r = scanner.nextDouble();

            System.out.println("Valori inseriti: " + a + " " + b + " " + c + " " + d + " " + r + " ");

            //Stanzio le 2 variabili per il denominatore dell'espressione
            double den1 = (3 * (r + 34));
            double den2 = (a + (b * d));

            // Pongo i denominatori diversi da 0 ed eseguo l'espressione
            if (den1 == 0 || den2 == 0) {
                System.out.println("L'equazione risulta impossibile");

            } else {
                double soluzione = ((4 / den1) - ((1 / 3) * (9 * a + b * c)) + ((3 + d * (2 + a)) / den2));
                    System.out.println("Risultato espressione: " + soluzione);
            }

            break;
        }
        scanner.close();       
    }
    
}
