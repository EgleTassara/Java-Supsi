/*  Input psw: 
    Scrivete un programma in grado di controllare se una password inserita 
    dall'utente rispetta i criteri seguenti:
    la password deve avere una lunghezza minima di 8 caratteri;
    la password deve contenere almeno tre lettere;
    la password deve contenere almeno due cifre;
    la password deve contenere almeno un carattere speciale scelti tra i seguenti: 
    _, $, & oppure %.
    Ogni criterio dovrà essere controllato utilizzando un sottoprogramma che riceve 
    in input la password e restituisce se il criterio è rispettato o meno.

    private static boolean controllaLunghezzaMinima(String password)
    private static boolean controllaQuantitaMinimaLettere(String password)
    private static boolean controllaQuantitaMinimaCifre(String password)
    private static boolean controllaQuantitaMinimaCaratteriSpeciali(String password)
    Il programma dovrà richiedere all'utente l'inserimento di una password e mostrare a schermo 
    se la password inserita rispetta i criteri sopra elencati.

    L'output dovrà essere uguale all'esempio seguente 
    (in italico i dati immessi dall'utente):

    Inserire una password: testPassword123
    Lunghezza minima: OK
    Numero minimo di lettere: OK
    Numero minimo di cifre: OK
    Numero minimo di caratteri speciali: NOK 
*/

import java.util.Scanner;

public class RegexPsw {

    private static boolean controllaLunghezzaMinima(String password) {
        boolean minLengthPsw = false;
        if(password.length() < 8) {
            minLengthPsw = false;
            System.out.println("Lunghezza minima: KO");
        } else {
            minLengthPsw = true;
            System.out.println("Lunghezza minima: OK");
        }
        return minLengthPsw;
        
    }

    private static boolean controllaQuantitaMinimaLettere(String password) {
        boolean countChar = false;
        int count = 0;
        int i = 0;
        while((!countChar) && (password.charAt(i) >= 'a') && (password.charAt(i) <= 'z')){
            count++; 
            i++;
            if(count >= 3) {
                countChar = true;
                System.out.println("Numero minimo di lettere: OK");
            }           
        } 
        System.out.println("Numero minimo di lettere: KO");
        return countChar;
    }

    private static boolean controllaQuantitaMinimaCifre(String password) {
        boolean countInt = false;
        int i = 0;
        int count = 0;
        while((!countInt) && (password.charAt(i) >= '0') && (password.charAt(i) <= '9')){
            count++;
            i++;
            if(count >= 2) {
                System.out.println("Numero minimo di cifre: OK");
                countInt = true;
            }
        } 
        System.out.println("Numero minimo di cifre: KO");
        return countInt;
    }

    private static boolean controllaQuantitaMinimaCaratteriSpeciali(String password) {
        boolean countSpecialChar = false;
        int count = 0;
        if(password.contains("_")){
            count++;
        } else if(password.contains("$")) {
            count++;
        } else if(password.contains("&")) {
            count++;
        } else if(password.contains(";")) {
            count++;
        } else if(password.contains("%")) {
            count++;
        }
        if(count >= 1) {
            countSpecialChar = true;
            System.out.println("Numero minimo di caratteri speciali: OK");
        }        
        System.out.println("Numero minimo di caratteri speciali: KO");
        return countSpecialChar;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String psw = "";
        System.out.print("Inserire una password: ");

        psw = scan.nextLine();
        scan.close();
        psw = psw.toLowerCase();
        controllaLunghezzaMinima(psw);
        controllaQuantitaMinimaLettere(psw);
        controllaQuantitaMinimaCifre(psw);
        controllaQuantitaMinimaCaratteriSpeciali(psw);
       
        /*Inserire una password: testPassword123
        Lunghezza minima: OK
        Numero minimo di lettere: OK
        Numero minimo di cifre: OK
        Numero minimo di caratteri speciali: NOK  */
    }
    
}
