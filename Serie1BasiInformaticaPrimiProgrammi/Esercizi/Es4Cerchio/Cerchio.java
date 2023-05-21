package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es4Cerchio;

/*  Implementate un programma che richieda all’utente l’immissione del raggio di un cerchio (valore
con la virgola). Successivamente, il programma dovr`a calcolare e mostrare a schermo il diametro,
la circonferenza e l’area. Per il valore di π utilizzate una costante.
d = 2r C = 2πr A = πr2 */

import java.util.Scanner;

public class Cerchio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raggio = 0;
        double PI = 3.14159265358979323846;

        System.out.print("Inserisci un numero con la virgola: ");
        raggio = scan.nextDouble();
        scan.close();

        double diametro = raggio * 2;
        System.out.println("Il diametro è: " + diametro);

        double circonferenza = diametro * PI * raggio;
        System.out.println("La circonferenza è: " + circonferenza);

        double area = PI * raggio * 2;
        System.out.println("l'area è: " + area);


    }
}
