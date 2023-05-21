import java.util.Random;
import java.util.Scanner;

/*  Esercizio 5.5 - Lettura numero come stringa (facoltativo)
    Scrivere un programma che chieda all’utente di inserire un numero intero.  
    Il programma dovrà leggere il numero immesso dall’utente come stringa e 
    stampare a schermo se il numero immesso è minore o maggiore di 10.
*/
public class LetturaNumeroStringa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        String trans = " ";
        boolean continueCycle = true;

        while(continueCycle) {
            System.out.print("Inserisci un numero intero: ");

            while(!scan.hasNextInt()) {
                System.out.print("Devi inserire un numero intero: ");
                scan.nextLine();
            }
            trans = scan.nextLine();
            input = Integer.parseInt(trans);
            System.out.println(input);

            if(input < 10) {
                System.out.println("Il numero è minore di 10");
            } else if(input == 10) {
                System.out.println("Il numero è uguale a 10");
            } else {
                System.out.println("Il numero è minore di 10");
            }
        }
        scan.close();
    }
}
