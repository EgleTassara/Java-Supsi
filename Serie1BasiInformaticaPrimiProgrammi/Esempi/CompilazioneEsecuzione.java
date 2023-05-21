/*  Utilizzando i programmi messi a disposizione provate a:
    • creare una directory nella vostra home in cui salvare tutti i programmi
    • creare un file per ogni esercizio, assicurandovi che il nome del file coincida con il nome del
    programma, oppure scaricare i files .java da iCorsi
    • se avete creato i files, copiare il codice del programma all’interno del file (utilizzando un
    editore di testo, ad esempio Visual Studio Code)
    • compilare il programma utilizzando il comando javac
    • eseguire il programma utilizzando il comando java
    • interagire con il programma tramite la console
*/

package Serie1BasiInformaticaPrimiProgrammi.Esempi;

import java.util.Scanner;

// Programma HelloStudent
public class CompilazioneEsecuzione {
    //Procedura main , viene eseguita al lancio del programma
    public static void main ( String [] args ) {
        // Inizializza lo scanner per leggere dati da tastiera
        Scanner input = new Scanner(System.in);

        //Mostra a schermo la domanda " Come ti chiami ?"
        System.out.print("Come ti chiami?");
        
        //Legge il nome da tastiera
        String name = input.nextLine();

        //Mostra a schermo la frase finale
        System.out.println("Ciao " + name + "!");

        // Finalizza lo scanner
        input.close();
    }
}