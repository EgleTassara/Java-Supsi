package Serie3IntroduzioneAlleClassi.Esercizi.Es2TastierinoNumericoTNove;
/* Sulla tastiera del telefono, le lettere sono associate alle cifre nella maniera seguente: ABC (2),
DEF (3), GHI (4), JKL (5), MNO (6), PQRS (7), TUV (8), WXYZ (9). Lo spazio e associato alla
cifra 0 e tutti gli altri caratteri al tasto * Asterisco.

Scrivete un programma:
    - che richieda all’utente una stringa e che 

    - la converta in una sequenza di cifre da premere sulla tastiera per comporre la parola desiderata. 


Perfezionate il programma in modo
che richieda una nuova parola dopo aver mostrato il risultato di quella precedente. Il programma
dovra terminare esclusivamente quando verra inserita una stringa vuota.
Importante: per limitare il numero di combinazioni di lettere da gestire, convertite la stringa
inserita in una stringa con solo caratteri minuscoli.
La sequenza numerica dovra corrispondere a quella digitata su di un telefono con il servizio T9 attivato (per maggiori informazioni 
https://it.wikipedia.org/wiki/T9). Ad esempio, immettendo
la frase Ciao come stai?, il programma dovr`a mostrare la sequenza 24260266307824 */

//Esercizio svolto in gruppo con Martina Malvestito I 1B

import java.util.Scanner;

public class TastierinoNumericoTNove {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi la tua stringa!!");
        String inputString; // = null;
        String result = "";

        //Controllare la stringa se è vuota o meno inserita dall'utente
        // scanner.hasNextLine() -> True, False
        while (scanner.hasNextLine()) {
            inputString = scanner.nextLine();

            if (inputString == "") { // end case
                System.out.println("Il programma stà per interrompersi!!");
                break;
            }

            inputString = inputString.toLowerCase();
            System.out.println("Parsa la stringa: " + inputString);
            
            int i = 0; // indice della stringa
            while (i < inputString.length()) {
                char c = inputString.charAt(i);
                // Controllo i casi dello switch per assegnare il risultato 
                switch (c) {
                    case 'a', 'b', 'c' -> result += "2";
                    case 'd', 'e', 'f' -> result += "3";
                    case 'g', 'h', 'i' -> result += "4";
                    case 'j', 'k', 'l' -> result += "5";
                    case 'm', 'n', 'o' -> result += "6";
                    case 'p', 'q', 'r', 's' -> result += "7";
                    case 't', 'u', 'v' -> result += "8";
                    case 'w', 'x', 'y', 'z' -> result += "9";
                    case ' ' -> result += "0";
                    default -> result += "*";
                }            
                    i++; // increment index variable 
            }
            System.out.println("Risultato: " + result);
            result = "";
            System.out.println("Dammi di nuovo una stringa!");
        }
        scanner.close();
    }
}
