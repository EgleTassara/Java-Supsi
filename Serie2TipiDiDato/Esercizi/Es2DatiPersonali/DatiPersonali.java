package Serie2TipiDiDato.Esercizi.Es2DatiPersonali;

/*  Esercizio 2.2 - Dati personali:
    Scrivete un programma che richieda l’immissione dei dati personali di una persona 
    come, ad esempio, il nome, il cognome, l’indirizzo e l’anno di nascita. In seguito, 
    il programma dovr`a calcolare l’et`a attuale della persona e mostrarne i dati 
    nella forma seguente:

    Nome: Francesca
    Cognome: Bianchi
    Indirizzo: Galleria 2, CH-6928 Manno
    Anno di nascita: 1982
    Anni: 40
    Punti da seguire per lo sviluppo del programma:

    • dichiarare tre variabili di tipo String nelle quali verranno memorizzati il nome, 
    il cognome e l’indirizzo;
    • dichiarare una variabile di tipo int nella quale verr`a memorizzato 
    l’anno di nascita;
    • inizializzare lo Scanner per la lettura dei dati da tastiera;
    • richiedere i dati necessari e memorizzarli nelle variabili dichiarate precedentemente;
    • calcolare l’et`a attuale della persona;
    • stampare a schermo le informazioni richieste nella forma desiderata;
    • finalizzare lo Scanner utilizzato per la lettura dei dati. 
*/

import java.util.Scanner;

public class DatiPersonali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        String surname = "";
        String adress = "";
        int ageBirth = 0;

        System.out.print("Inserire il nome: ");  
        name = scan.nextLine();
        
        System.out.print("Inserire il cognome: ");  
        surname = scan.nextLine();

        System.out.print("Inserire l' indirizzo : ");  
        adress = scan.nextLine();

        System.out.print("Inserire l' anno di nascita : ");  
        ageBirth = scan.nextInt();

        scan.close();

        System.out.println("Nome: " + name);
        System.out.println("Cognome: " + surname);
        System.out.println("Indirizzo: " + adress);
        System.out.println("Anno di nascita: " + ageBirth);
        int age = 2022 - ageBirth;
        System.out.println("Eta': " + age);
    }



}
