package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es3PariDispari;

/*  Scrivete un programma che richieda l’immissione di un numero intero e che 
    sia in grado di determinare se tale numero `e pari o dispari. */

import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int result;

        System.out.print("Inserisci un numero intero: ");
        input = scan.nextInt();
        scan.close();

        result = input % 2;
        if(result == 0) {
            System.out.println("Il numero è pari!");
        } else {
            System.out.println("Il numero è dispari!");
        }
    }
}
