/*  Esercizio 2.5 - Numeri pari, dispari e media (facoltativo)
    Scrivete tre programmi con le seguenti funzionalit`a:
    •   un programma che stampi a schermo tutti i numeri pari fra 0 e un valore 
    massimo specificato dall’utente;
    •   un  programma  che  stampi  a  schermo tutti  i  numeri  dispari  fra  
    0  e  un  valore  massimo specificato dall’utente;
    •   un programma che calcoli e visualizzi il valore medio di tutti i numeri compresi 
    fra 0 e un valore massimo specificato dall’utente 
*/

package Serie2TipiDiDato.Esercizi.Es5PariDispariMedia;
import java.util.Scanner;

public class PariDispariMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;

        //un programma che stampi a schermo tutti i numeri pari fra 0 e un valore 
        //massimo specificato dall’utente;

        System.out.println("Inserire un numero intero!");
        int numero = scan.nextInt();

        while (numero <= 0) {
            System.out.println("Il numero dev'essere maggiore di 0, riprova!");
            scan.nextLine();
        }

        int i = 0;
        while(i <= numero) {
            System.out.println("Stampa numeri pari: " + i + " ");
            i += 2;
        }

        //un  programma  che  stampi  a  schermo tutti  i  numeri  dispari  fra  
        //0  e  un  valore  massimo specificato dall’utente;
        System.out.println("Inserisci un nuovamente un numero intero: ");
        numero = scan.nextInt();

        while (numero <= 0) {
            System.out.println("Il numero dev'essere maggiore di 0, riprova!");
            scan.nextLine();
        }

        i = 1;
        while(i <= numero) {
            System.out.println("Stampa numeri dispari: " + i + " ");
            i += 2;
        }

        //un programma che calcoli e visualizzi il valore medio di tutti i numeri compresi 
        //fra 0 e un valore massimo specificato dall’utente
        System.out.println("Inserisci un nuovamente un numero intero: ");
        numero = scan.nextInt();

        while (numero <= 0) {
            System.out.println("Il numero dev'essere maggiore di 0, riprova!");
            scan.nextLine();
        }

        i = 0;
        int result = 0;
        while(i <= numero) {
            result = result + i;
            i++;
        }
        System.out.print("Media: " + (double) result / (numero + 1));
        scan.close();

    }
}