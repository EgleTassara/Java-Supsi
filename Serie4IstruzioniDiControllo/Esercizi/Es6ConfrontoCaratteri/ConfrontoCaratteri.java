import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/*  Esercizio 4.6 - Confronto caratteri (facoltativo)
        Utilizzando un’istruzione while o do while, scrivete un programma che 
        richieda, ripetutamente,l’immissione di 3 caratteri.  
        Il ciclo dovrà continuare a iterare se:
        •   i tre caratteri sono identici, oppure

        •   il primo e il terzo carattere sono fra loro diversi e il secondo 
        è una ’a’, oppure

        •   i tre caratteri sono ’b’, ’c’ e ’d’ in un qualsiasi ordine.

        In seguito, provate a risolvere il medesimo problema utilizzando un’istruzione 
        for al posto dell’istruzione while o do while. 
*/

public class ConfrontoCaratteri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean playWhile = true;
        String input = "";
        char a;
        char b;
        char c;

        while (playWhile) {
            System.out.print("Inserisci 3 caratteri: ");
            input = scan.nextLine();

            a = input.charAt(0);
            b = input.charAt(1);
            c = input.charAt(2);

            input = input.toLowerCase();

            if (a == b && b == c) {
                System.out.println("I caratteri sono uguali!");
                continue;
            } else if (a != c && b == 'a') {
                System.out.println("Il primo e il terzo carattere sono fra loro diversi e il secondo è una ’a’");
                continue;
                // Verificare che siano presenti i caratteri b c d in qualsiasi ordine
            } else if (input.contains("b" + "c" + "d")) {
                System.out.println("I tre caratteri sono ’b’, ’c’ e ’d’ in un qualsiasi ordine.");
                continue;
            } else {
                System.out.println("Nessun riscontro il programma verrà arrestato");
                playWhile = false;
            }
        }
        scan.close();
    }
}
