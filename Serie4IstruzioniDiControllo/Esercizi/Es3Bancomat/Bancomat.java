/*  Disegnate il diagramma di flusso di un semplice bancomat (ATM). 
    Il diagramma dovr`a rappresentare le funzionalit`a per:
    •   l’introduzione della carta bancomat e la digitazione del codice 
    (con gestione dell’errore con 3 possibilit`a ed eventuale cancellazione 
    della procedura),
    •   la specifica dell’importo da prelevare e la verifica della disponibilit`a 
    sul conto (o la cancellazzione del prelievo),
    •   il prelievo dei soldi e la restituzione della carta bancomat.
    In seguito, con gli strumenti che avete imparato fino ad oggi e 
    prendendo spunto dal diagrammadi flusso, provate a sviluppare un semplice 
    programma che simuli il bancomat. 

    START -> INSERIRE LA CARTA, PREGO! -> INSERIMENTO CARTA -> 
    RICHIESTA PIN x3 (un while o un for?) O CANCELLAZIONE PROCEDURA (break!) ->  
    SBAGLIATO 3 VOLTE IL PIN (BREAK!) -> SCEGLIERE L'IMPORTO DA PRELEVARE -> IF CIFRA 
    DA PRELEVARE <= A DISPONIBILITA' ALLORA RITIRA ELSE CANCELLAZIONE PRELIEVO -> 
    RESTITUZIONE CARTA 
*/

package Serie4IstruzioniDiControllo.Esercizi.Es3Bancomat;

import java.util.Scanner;

public class Bancomat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountAvailability = 2500;
        int amaunt = 0;
        int valueUser = 0;
        int pin = 12345;
        boolean bancomatPlay = true;
        int cnt = 3;


        while(bancomatPlay) {
            System.out.println("INSERIRE LA CARTA, PREGO...\n" +
                                "ATTENDERE PREGO...\n" +
                                "INSERIRE IL PIN");
            
            while(!scan.hasNextInt()) {
                System.out.println("INSERIRE CARATTERI VALIDI 0 - 9!!");
                scan.nextLine();
            }

            valueUser = scan.nextInt();
            while(valueUser != pin && cnt > 0) {
                System.out.println("PIN NON VALIDO TENTATIVI RIMASTI: " + cnt);
                cnt--;
                scan.nextLine();
            }

            if(cnt <= 0) {
                System.out.println("PROCEDURA ANNULLATA!");
                System.out.println("RITIRARE LA CARTA");
                break;
            } else if(valueUser == pin) {
                System.out.println("SCEGLIERE L'IMPORTO DA PRELEVARE");

                while(!scan.hasNextInt()) {
                    System.out.println("L'IMPORTO DEV'ESSERE UN INTERO");
                    scan.nextLine();
                }

                amaunt = scan.nextInt();
                if(amaunt <= accountAvailability) {
                    System.out.println("RITITRARE I SOLDI ENTRO 30 SECONDI");
                    System.out.println("RITIRARE LA CARTA");
                } else {
                    System.out.println("OPERAZIONE ANNULLATA FONDI INSUFFICENTI");
                    System.out.println("RITIRARE LA CARTA");
                    break;
                }
            }
            bancomatPlay = false;    
        }
        scan.close();
    }
}
