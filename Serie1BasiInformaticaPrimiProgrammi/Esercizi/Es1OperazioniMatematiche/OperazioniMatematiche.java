/*  Operazioni Matematiche:
 *      Sviluppate un programma in grado di richiedere all’utente l’immissione 
 *      di due numeri interi e di calcolare e mostrare a schermo la somma, 
 *      il prodotto, la differenza e il quoziente di tali numeri.
 */

package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es1OperazioniMatematiche;

import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        System.out.println("Inserisci 2 numeri interi:");

        String message = "da come risultato: ";

        int firstNumber = scan.nextInt();;
        scan.nextLine();
        int secondNumber = scan.nextInt();

        scan.close();

        result = firstNumber + secondNumber;
        System.out.println("La somma" + message + result);

        result = firstNumber - secondNumber;
        System.out.println("La sottrazione" + message + result);

        result = firstNumber * secondNumber;
        System.out.println("La moltiplicazione" + message + result);

        result = firstNumber / secondNumber;
        System.out.println("La somma" + message + result);

    }
}