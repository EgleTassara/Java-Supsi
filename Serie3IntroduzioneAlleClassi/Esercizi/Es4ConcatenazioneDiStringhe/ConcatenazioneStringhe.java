/*  Esercizio 3.4 - Concatenazione di stringhe (facoltativo)
    Scrivete un programma che richieda l’immissione, per 20 volte di fila, 
    di una parola e un valore numerico intero.  
    Al termine, il programma dovr`a mostrare un’unica stringa composta dalla 
    sequenza di parole immesse separate da una virgola e la somma totale di 
    tutti i valori inseriti. 
*/

package Serie3IntroduzioneAlleClassi.Esercizi.Es4ConcatenazioneDiStringhe;

import java.util.Scanner;

public class ConcatenazioneStringhe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpString = " ";
        int number = 0;
        int i = 0;

        while(i <= 20) {
            System.out.println("Inserisci una parola");
            inpString += scan.nextLine();
            if(i < 19){
            inpString += ", ";
            }
            i++;
        }

        i = 0;
        while(i <= 20) {
            System.out.println("Inserisci un intero");
            number += scan.nextInt();
            i++;
        }
        scan.close();

        System.out.print("Stringhe: " + inpString);
        System.out.println("Numeri: " + number);
    }
    
}
