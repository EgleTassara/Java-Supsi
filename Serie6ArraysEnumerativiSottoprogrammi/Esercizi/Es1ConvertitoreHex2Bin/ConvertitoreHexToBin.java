package Serie6ArraysEnumerativiSottoprogrammi.Esercizi.Es1ConvertitoreHex2Bin;
/*  Sviluppate un programma che legga un valore esadecimale dalla tastiera e che stampi a schermo
        la sequenza binaria corrispondente. Eseguite dei controlli sulla correttezza del valore esadecimale
        inserito e ripetete la richiesta in caso d’errore.
        L’output dovr`a essere simile al seguente (in italico l’inserimento fatto dall’utente):

        Valore esadecimale da convertire in binario: 21FA
        Valore binario: 0010 0001 1111 1010
*/

import java.util.Scanner;

public class ConvertitoreHexToBin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Assegno le variabili
        String question = "Inserisci una sequenza esadecimale: ";
        String error = "La sequenza non e' corretta! Riprova:";
        boolean askUser = true;
        String input = "";
        String validate = "";
        String result = "";
        int p = 0;
        int i = 0;

        // Controllo che l'input sia valido
        while(askUser) {
            System.out.println(question);
            validate = scanner.nextLine();
            validate = validate.toUpperCase();

            for (i = 0 ; i < validate.length() ; i++) {
                char ch = validate.charAt(i);

                if ((ch < '0' || ch > '9') &&
                (ch < 'A' || ch > 'F')) {
                    System.out.println(error);
                    validate = "";

                }

            }

            // Riassegno il valore corretto e lo convalido
            input = validate; 

            if(input.length() > 0) {
                askUser = false;
            }
        }

        // Chiudo lo scanner
        scanner.close();

        // Trasformo l'esadecimale in binario
        while (p < input.length()) {
            char c = input.charAt(p);

            switch (c) {
                case '0' -> result += "0000";
                case '1' -> result += "0001";
                case '2' -> result += "0010";
                case '3' -> result += "0011";
                case '4' -> result += "0100";
                case '5' -> result += "0101";
                case '6' -> result += "0110";
                case '7' -> result += "0111";
                case '8' -> result += "1000";
                case '9' -> result += "1001";
                case 'A' -> result += "1010";
                case 'B' -> result += "1011";
                case 'C' -> result += "1100";
                case 'D' -> result += "1101";
                case 'E' -> result += "1110";
                case 'F' -> result += "1111";
                default -> result += "";
            } 

            p++;
        }

        //Stampo il risultato
        System.out.println("Risultato: " + result);
    }
}