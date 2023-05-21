/*  Array di numeri casuali, Scrivete un programma che:
    - richieda all'utente un valore intero compreso tra 5 e 15 che rappresenta la dimensione dell'array,
    - crei e popoli l'array con dei valori casuali compresi tra -25 e +25 (limiti inclusi),
    - calcoli il totale dei numeri memorizzati nell'array,
    - identifichi il primo numero positivo (maggiore di 0) presente nell'array e il relativo indice,
    - identifichi l'ultimo numero negativo (minore di 0) presente nell'array e il relativo indice,
    - mostri a schermo:
        - il contenuto dell'array,
        - il totale dei numeri presenti nell'array,
        - il primo valore positivo e il relativo indice,
        - l'ultimo valore negativo e il relativo indice.  */

import java.util.Scanner;
import java.io.*;
import java.util.*; 

public class ArrayDiNumeriCasuali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueTmp;


        int input = 0;
        boolean askInput = true;
        

        while(askInput) {
            System.out.println("Inserisci un intero compreso tra 5 e 15!");

            valueTmp = scanner.nextInt();

            if((valueTmp < 5) || (valueTmp > 15)){
                System.out.println("Ciao");
                scanner.nextLine();
            }

            input = scanner.nextInt();
            int[] arrValue = new int[input];
            System.out.println(Arrays.toString(arrValue));


            

            //break;
        }
        scanner.close();
    }
}