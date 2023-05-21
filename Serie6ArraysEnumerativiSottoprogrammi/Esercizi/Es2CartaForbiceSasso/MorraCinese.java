/*  Esercizio 6.2 - Morra cinese (carta, forbice, sasso) (3 punti)
    Sviluppate un programma che permetta di giocare alla morra cinese contro il 
    computer.  L’utente avrà la possibilità di specificare il numero di partite da 
    giocare. Per ogni partita verrà richiesta all’utente la mossa da eseguire 
    (controllando, segnalando e ripetendo eventuali immissioni errate),
    calcolata in maniera casuale la mossa del computer e stabilito il vincitore.  
    In caso di parità la partita è considerata nulla e verrà ripetuta.   
    Memorizzate all’interno di un array i vincitori di ogni partita.  
    Dopo aver giocato il numero di partite desiderate, mostrate le statistiche 
    del match: partite eseguite, numero di vittorie e relativa percentuale per 
    ogni giocatore.
*/

package Serie6ArraysEnumerativiSottoprogrammi.Esercizi.Es2CartaForbiceSasso;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int numOfPlay = 0;
        Symbol symbolUser = Symbol.CARTA;
        Symbol symbolComputer = Symbol.CARTA;
        boolean continueCycle = true;
        String errorMessage = "Valore immesso non valido ";
        String instruction1 = "Morra cinese: \nScegli quante partite giocare: " ;
        String instruction2 = "Scegli cosa giocare \nCARTA, FORBICE, SASSO: " ;

        while(continueCycle) {
            System.out.print(instruction1);

            while(!scan.hasNextInt()) {
                System.out.print(errorMessage);
                scan.nextLine();
            }
            numOfPlay = scan.nextInt();

            System.out.println(numOfPlay);

            String[] win = new String[numOfPlay];

            for(int count = 0; count < numOfPlay; count++) {
                if(win[0] != null) {
                    System.out.print(instruction2);
                    scan.nextLine(); 
                }

                boolean inputValid = false;

                while (!inputValid) {
                    System.out.print(instruction2);
                    scan.nextLine();
                    String input = scan.nextLine().toUpperCase();
                    if (EnumSet.allOf(Symbol.class).contains(Symbol.valueOf(input))) {
                        symbolUser = Symbol.valueOf(input);
                        inputValid = true;
                        System.out.println("\n" +"Hai scelto di giocare: " + symbolUser);
                    } else {
                        System.out.print(errorMessage);
                    }
                }

                int randNumber = rand.nextInt(3);
                symbolComputer = Symbol.values()[randNumber];
                System.out.println("Il computer gioca: " + symbolComputer + "\n");

                if((symbolUser == Symbol.CARTA) && (symbolComputer == Symbol.FORBICE)) {
                    System.out.println("Vince il Computer!" + "\n");
                    win[count] = "Vince Computer ";
                } else if((symbolUser == Symbol.CARTA) && (symbolComputer == Symbol.SASSO)) {
                    System.out.println("Hai vinto!" + "\n");
                    win[count] = "Vince l'utente ";
                } else if((symbolUser == Symbol.FORBICE) && (symbolComputer == Symbol.SASSO)) {
                    System.out.println("Vince il Computer!" + "\n");
                    win[count] = "Vince Computer ";
                } else {
                    System.out.println("Pareggio!" + "\n");
                    win[count] = "Pareggio";
                    count --;
                    symbolComputer = Symbol.values()[randNumber];
                    continue;
                }
            }    
            System.out.println(Arrays.toString(win) + "\n");
            System.out.println("Numero di partite: " + numOfPlay + "\n");
        }
        scan.close();
    }
    
}

enum Symbol {
    CARTA, FORBICE, SASSO;
}
