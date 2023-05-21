package Es2OperazioniStringhe;
/*  Operazioni su Stringhe:
        Sviluppate un programma in grado di eseguire le seguenti operazioni:
        • richiedere l’immissione, da parte dell’utente, di una stringa formata da almeno 20 caratteri
        • ripetere la richiesta qualora la dimensione minima non sia quella richiesta
        • contare e visualizzare:
        – quante cifre (numeri) contiene
        – quanti caratteri minuscoli contiene
        – quanti caratteri maiuscoli contiene
        – quanti spazi contiene (comprese le tabulazioni)
        • nel caso in cui la stringa inserita dovesse contenere delle cifre, il programma dovra` 
            trovare e mostrare la cifra minima e quella massima contenuta
        • creare e visualizzare una nuova stringa cos`ı formata:
        – stringa letta “al contrario”
        – icaratteriminuscolidovrannoessererimpiazzaticolcorrispettivomaiuscolo(eviceversa) – 
            le cifre dovranno essere sostituite dal loro “complemento a 9”
        Esempio di output:
        Inserire una stringa con almeno 20 caratteri: ciao come stai?
        Stringa non valida. Riprova: Non sono un matematico, ma una cosa la so: ci sono InFiNiTi numeri 
        tra 0 e 1.
*/

import java.util.Scanner;

public class OperazioniStringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Boolean validate = true;

        while(validate) {
            System.out.println("Ciao inserisci una stringa lunga almeno 20 caratteri!");

            input = scanner.nextLine();
            int length = input.length();


            if(!(length >= 20)) {
                scanner.nextLine();
                System.out.println("Inserisci almeno 20 caratteri!");
                length = 0;
            }

            break;
        }
        scanner.close();
 
    }
}