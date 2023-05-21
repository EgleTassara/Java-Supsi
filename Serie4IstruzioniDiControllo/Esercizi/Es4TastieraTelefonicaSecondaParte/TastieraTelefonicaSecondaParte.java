/*  Tastiera telefonica, seconda parte (facoltativo)
        Riprendete l’esercizio della tastiera telefonica della serie precedente 
        ed implementatene una versioneche utilizzi l’istruzione switch. 
*/

import java.util.Scanner;

public class TastieraTelefonicaSecondaParte {
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
