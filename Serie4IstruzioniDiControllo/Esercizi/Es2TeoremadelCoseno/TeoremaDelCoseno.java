package Serie4IstruzioniDiControllo.Esercizi.Es2TeoremadelCoseno;
/*
utilizzando il teorema del coseno, 
- calcoli la lunghezza di un lato di un triangolo qualsiasi avendo, come punto di partenza, due lati e l'angolo in essi contenuto
- Validate i dati inseriti dall’utente in modo da essere certi di poter formare un triangolo
*/
// Importo lo scanner
import java.util.Scanner;

public class TeoremaDelCoseno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Iniziallizzo le variabili
        double latoA = 0.0; 
        double latoB = 0.0; 
        double angoloC = 0.0;
        String error = "Valore errato.";
        boolean askUserA = true;
        boolean askUserB = true;
        boolean askUserC = true;

        // Controllo il valore inserito dall'utente
        while (askUserA) {        
            System.out.println("Inserisci il valore del lato a: ");
                    
            while (!scanner.hasNextDouble()) {
                System.out.println(error);
                scanner.nextLine();
                System.out.println("Inserisci un numero positivo!");
            }

            latoA = scanner.nextDouble();

            if (latoA <= 0.0) {
                System.out.println("Inserisci un numero positivo!");
                scanner.nextLine();

            } else {
                askUserA = false;
            }
        }

        while (askUserB) {
            System.out.println("Inserisci il valore del lato b: ");

            while (!scanner.hasNextDouble()) {
                System.out.println(error);
                scanner.nextLine();
                System.out.println("Inserisci un numero positivo!");
            }

            latoB = scanner.nextDouble();

            if (latoB <= 0.0) {
                System.out.println("Inserisci un numero positivo!");
                scanner.nextLine();

            } else {
                askUserB = false;
            }
        }
        
        while (askUserC) {
            System.out.println("Inserisci il valore dell'angolo C: ");

            while (!scanner.hasNextDouble()) {
                System.out.println(error);
                scanner.nextLine();
                System.out.println("Inserisci un numero positivo e minore di 90!");
            }

            angoloC = scanner.nextDouble();

            if (angoloC <= 0.0 || angoloC > 90.0) {
                System.out.println("Inserisci un numero positivo e minore di 90!");
                scanner.nextLine();

            } else {
                askUserC = false;
            }
        }

        // Chiudo lo scanner
        scanner.close();

        // Definisco il terzo lato e lo calcolo
        Double latoC2 = 0.0;
        Double latoC = 0.0;

        angoloC = (angoloC * Math.PI) / 180;

        latoC2 = Math.pow(latoA, 2.0) + Math.pow(latoB, 2.0) - 2 * latoA * latoB * Math.cos(angoloC);
        latoC = Math.sqrt(latoC2);

        System.out.println("Il terzo lato e' lungo " + latoC);


    }
    

}