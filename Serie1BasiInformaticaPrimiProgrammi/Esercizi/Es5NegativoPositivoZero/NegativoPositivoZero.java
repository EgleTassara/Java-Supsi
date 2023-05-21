package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es5NegativoPositivoZero;

import java.util.Scanner;

/*  Scrivete un programma in grado di richiedere all’utente l’immissione di 10 valori numerici e di
contare e visualizzare quanti numeri positivi, negativi e uguali a zero sono stati inseriti. */

public class NegativoPositivoZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;

        int positivi = 0;
        int negativi = 0;
        int zero = 0;

        int count = 0;

        while(count < 10) {
            System.out.print("Inserisci numero: ");
            numero = scan.nextInt();
            scan.nextLine();

            if(numero < 0) {
                negativi++;
            } else if(numero > 0) {
                positivi++;
            } else {
                zero++;
            }
            count++;
        }
        scan.close();

        System.out.println("Tot positivi: " + positivi);
        System.out.println("Tot negativi: " + negativi);
        System.out.println("Tot zero: " + zero);

    }
}
