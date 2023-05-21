package Serie9Ricorsione.Esercizi.Es1numberPrimeFattorizzazione;

import java.util.Scanner;

/* number Primo e Fattorizzazione:
    Ogni numero naturale può essere scomposto in una serie di fattori primi tali 
    che il loro prodotto sia uguale al number originario.  
    Ad esempio: 52 = 2×2×13     
    15010 = 2×5×19×79
    Scrivete due procedure/funzioni ricorsive.  

    - La prima dovr`a controllare se un numero fornito tramite un parametro 
    `e un numero primo (divisibile solo per 1 e per se stesso).  
    - La seconda dovr`a stampare a schermo la scomposizione in fattori primi del 
    number fornitogli.  
    In seguito, sviluppate un programma che richieda all’utente, 
    in maniera ripetuta, l’inserimento di un numero naturale. Mostrate  
    a  schermo  la  scomposizione  in  fattori  primi  del  numero,  
    nel  caso  il  valore  non  sia  un numero primo.  Il programma dovr`a 
    terminare se il numero immesso `e minore o uguale a 1.  
 */


public class NumeroPrimoFattorizzazione {

    private static boolean numberPrime(int number, int divider) {
        if (divider == 1) {
            return true;
        } else if (number % divider == 0){
            return false;
        }
        return numberPrime(number, divider - 1);
    }

    private static boolean checkNumberPrime(int number) {
        return numberPrime(number, number - 1);
    }

    private static void printPrimeNumbers(int number, int divider) {
        if (checkNumberPrime(number)) {
            System.out.println(number);
            return;
        }else if (number % divider == 0 && checkNumberPrime(divider)) {
            System.out.print(divider + " x ");
            printPrimeNumbers(number / divider, 2);
        } else {
            printPrimeNumbers(number, divider + 1);
        }
    }

    private static int requestInt(Scanner scan, String message) {
        System.out.print(message);
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Il numero inserito non è un intero. Riprova: ");
        }
        return scan.nextInt();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int divider = 2;
        String istruction = "Inserire un numero, per terminare il programma inserire un valore <= 1: ";

        int number = requestInt(scan, istruction);
        while (number > 1) {
            System.out.print(number + " = ");
            printPrimeNumbers(number, divider);

            number = requestInt(scan, istruction);

        }
        scan.close();
    }
}

