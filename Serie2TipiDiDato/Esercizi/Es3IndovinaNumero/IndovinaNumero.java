/*  Esercizio 2.3 - Indovina il numero
    Scrivete un programma che, utilizzando l’istruzione
    int  numero = (int) (Math.random() * 101);
    generi un numero casuale da 0 a 100 e lo memorizzi in una variabile di 
    nome numero.  In seguito, il programma dovr`a richiedere all’utente,  
    in maniera ripetuta,  di indovinare il numero generato casualmente.  
    Il programma terminer`a quando l’utente indovina il numero. 
*/


package Serie2TipiDiDato.Esercizi.Es3IndovinaNumero;
import java.util.Scanner;

public class IndovinaNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = (int) (Math.random() * 101);
        boolean isCorrect = false;
        int input = 0;

        System.out.println("Inserisci il numero pensi sia uscito");

        while(!isCorrect) {
            input = scan.nextInt();

            if(input != numero) {
                System.out.println("Mi dispiace il numero non è corretto!! Riprova:");
                scan.nextLine();
            } else {
                System.out.println("Congratulazioni il numero è corretto!!");
                isCorrect = true;
                break;
            }

        }
    }
    
}
