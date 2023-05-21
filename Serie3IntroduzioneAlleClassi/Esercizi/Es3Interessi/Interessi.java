/*  Scrivete un programma che permetta di specificare un importo iniziale di un 
    conto bancario, un tasso d’interesse annuo e un periodo di tempo (in anni) e 
    che visualizzi il valore del conto alla fine del periodo specificato.  
    Eseguite il calcolo anno per anno, senza utilizzare la formula per il 
    calcolo degli interessi composti. 
*/

package Serie3IntroduzioneAlleClassi.Esercizi.Es3Interessi;
import java.util.Scanner;

public class Interessi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cc = 0.0;
        double tassoInteresse = 0;
        int anni = 0;

        System.out.print("Inserisci l'importo iniziale del tuo CC: ");
        cc = scan.nextDouble();
        while(cc <= 0) {
            System.out.println("Il numero inserito dev'essere maggiore di 0");
            scan.nextLine();
        } 

        System.out.print("Inserisci l'importo iniziale del tuo CC: ");
        tassoInteresse = scan.nextDouble();
        while(tassoInteresse <= 0) {
            System.out.println("Il numero inserito dev'essere maggiore di 0");
            scan.nextLine();
        }   

        System.out.print("Inserisci gli anni di durata: ");
        anni = scan.nextInt();
        while(anni <= 0) {
            System.out.println("Il numero inserito dev'essere maggiore di 0");
            scan.nextLine();
        }   

        double result = cc;
        int i = 0;
        while(i <= anni) {
            result += result * tassoInteresse / 100.0;
            i++;
        }

		System.out.println("Ammontare dopo " + anni + " anni: " + result);
        scan.close();
    }
}
