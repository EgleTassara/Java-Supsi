package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es6SeparaCifre;

/*  Scrivete un programma che richieda l’immissione di un numero intero di 5 cifre. Successivamente,
    il programma dovr`a dividere le singole cifre che compongono il numero. Le singole cifre dovranno
    essere visualizzate separate da tre spazi.
    Assicuratevi che il numero inserito contenga effettivamente 5 cifre. In caso contrario, visualizzate
    un messaggio di errore.

    Esempio di output:
    Inserisci un numero intero di 5 cifre: 12345
    Singole cifre: 1 2 3 4 5 
*/

import java.util.Scanner;

public class SeparaCifre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero: ");
        int numero = input.nextInt();

        if (numero < 10000 || numero > 99999) {
            System.out.println("Numero non valido!!");
        } else {
            int divisore = 10000;
            while (divisore > 0) {
                System.out.println(numero / divisore % 10 + " ");
                divisore = divisore / 10;
            }
        }
        input.close();
    }

}
