package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es2ConfrontoNumeri;

/*  Scrivete un programma capace di richiedere all’utente l’immissione di due numeri 
    con la virgola.
    Successivamente, il programma dovr`a identificare il numero maggiore e mostrare 
    a schermo tale numero seguito dalle parole “`e maggiore”. 
    Se i due numeri dovessero essere uguali, il programma
    dovr`a visualizzare il messaggio “I due numeri sono uguali”. 
*/


import java.util.Scanner;


public class ConfrontoNumeri {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        String message = " è maggiore di: ";

        System.out.println("Inserisci 2 numeri con la virgola: ");

        firstNumber = scan.nextDouble();
        scan.nextLine();
        secondNumber = scan.nextDouble();

        scan.close();

        if(firstNumber > secondNumber) {
            System.out.println(firstNumber + message);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + message);
        } else {
            System.out.println("I due numeri sono uguali!");
        }
    }
}