/*  Frazione (3 punti)
    Sviluppate una classe che rappresenti una frazione (numeratore e denominatore).  
    Utilizzate questa classe in un programma che permetta di creare e immagazzinare 8 
    frazioni (inizializzate con valori a vostra scelta). Tutte le frazioni memorizzate 
    dovranno essere ridotte ai minimi termini, calcolando il massimo comun divisore 
    (algoritmo di Euclide): 
    “Dati due numeri naturali A e B (con A>B), si controlla se B è zero.   
    Se lo è, A è il MCD. Se non lo è, si calcola A / B e si assegna ad R il resto della divisione.   Se  
    Se R è uguale a 0, allora si può terminare affermando che B è il MCD  cercato,  
    altrimenti occorre assegnare A = B e B = R e ripetere nuovamente la divisione.
    ”Scrivete inoltre le procedure / funzioni necessarie per eseguire 
    le seguenti operazioni:

        • sommare due frazioni, ritornando il risultato in un nuovo oggetto
        • moltiplicare due frazioni, ritornando il risultato in un nuovo oggetto
        • calcolare l’opposto di una frazione, ritornando il risultato in un nuovo oggetto
        • calcolare l’inverso di una frazione, ritornando il risultato in un nuovo oggetto
        • stampare a schermo una frazione
        
    Assicuratevi di collaudare, all’interno del programma, tutte le procedure / funzioni sviluppate. 
*/

package Serie10Oggetti.Esercizi.Es1Frazione;

public class Frazione {

    private static int mcdFract(Fraction a) {
        int mcd = 0;
        double r = 0.0;
        boolean continueCycle = true;

        while (continueCycle) {

            if(a.numeratore > a.denominatore) {
                if(a.denominatore <= 0) {
                    mcd = a.numeratore;
                } else {
                    mcd = a.numeratore / a.denominatore;
                    r = a.numeratore % a.denominatore;
                }
            } else {
                r = a.numeratore % a.denominatore;
                if(r == 0) {
                    mcd = a.denominatore;
                }
            }

            if(r == 0) {
                System.out.println("Il MCD e' " + a.denominatore);
                continueCycle = false;
            } else {
                a.numeratore = a.denominatore;
                a.denominatore = (int)r;
                mcd = a.numeratore / a.denominatore;
                r = a.numeratore % a.denominatore;
            }    
        }

        return mcd;
    }

    private static double sumFract(int a, int b, int c, int d) {
        double resultFract;
        double numeratore = (a * d + b * c);
        double denominatore = (b * d);
        System.out.println("Data la frazione: " + numeratore / denominatore);
        resultFract = numeratore / denominatore;
        System.out.println("Somma di due frazioni: " + resultFract);
        return resultFract;
    }

    private static double multiplicationFract(int a, int b, int c, int d) {
        double resultFract;
        double numeratore = (a * c);
        double denominatore = (b * d);
        System.out.println("Data la frazione: " + numeratore + " / " + denominatore);
        resultFract = numeratore / denominatore;
        System.out.println("Moltiplicazione di due frazioni: " + resultFract);
        return resultFract;
    }

    private static double oppositeFract(int a, int b) {
        double resultFract;
        double numeratore = (-a);
        double denominatore = (-b);
        System.out.println("Data la frazione: " + numeratore + " / " + denominatore);
        resultFract = numeratore / denominatore;
        System.out.println("Gli opposti della frazione: " + resultFract);
        return resultFract;
    }

    public static double reverseFract(int a, int b) {
        double resultFract;
        double numeratore = (b);
        double denominatore = (a);
        System.out.println("Data la frazione: " + numeratore + " / " + denominatore);
        resultFract = numeratore / denominatore;
        System.out.println("L' inverso della frazione: " + resultFract);
        return resultFract;
    }

    public static void main(String[] args) {

        Fraction fract1 = new Fraction(5, 15);
        fract1.numeratore = 1;
        fract1.denominatore = 3;

        Fraction fract2 = new Fraction(30, 9);
        fract2.numeratore = 10;
        fract2.denominatore = 3;

        Fraction fract3 = new Fraction(11, 7);
        fract3.numeratore = 11;
        fract3.denominatore = 7;

        Fraction fract4 = new Fraction(12, 4);
        fract4.numeratore = 3;
        fract4.denominatore = 1;

        Fraction fract5 = new Fraction(15, 3);
        fract5.numeratore = 5;
        fract5.denominatore = 1;

        Fraction fract6 = new Fraction(45, 25);
        fract6.numeratore = 9;
        fract6.denominatore = 5;

        Fraction fract7 = new Fraction(78, 40);
        fract7.numeratore = 39;
        fract7.denominatore = 20;

        Fraction fract8 = new Fraction(65, 30);
        fract8.numeratore = 12;
        fract8.denominatore = 6;


        mcdFract(fract1);
        mcdFract(fract2);
        mcdFract(fract3);
        mcdFract(fract4);
        mcdFract(fract5);
        mcdFract(fract6);
        mcdFract(fract7);
        mcdFract(fract8); 
        sumFract(fract1.numeratore, fract1.denominatore, 
                 fract2.numeratore, fract2.denominatore);
        multiplicationFract(fract1.numeratore, fract1.denominatore, 
                            fract2.numeratore, fract2.denominatore);
        oppositeFract(fract1.numeratore, fract1.denominatore);
        reverseFract(fract1.numeratore, fract1.denominatore);

    }
    
}

//La classe Fraction si trova in fondo in quanto non compilava altrimenti!!
class Fraction {
    int numeratore;
    int denominatore;

    Fraction(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
}
