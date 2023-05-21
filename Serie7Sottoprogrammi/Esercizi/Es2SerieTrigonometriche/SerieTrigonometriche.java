package Es2SerieTrigonometriche;

/*  Scrivete due funzioni che calcolino il valore di sin(x) e cos(x) utilizzando le serie trigonometriche
seguenti:

sin(x) = x - (x^3 / 3!) + (x^5 / 5!) - (x^7 / 7!) + (x^9 / 9!) - ...
cos(x) = 1 - (x^2 / 2!) + (x^4 /4!) - (x^6 / 6!) + (x^8 / 8!) - ...

Le due funzioni dovranno avere i prototipi seguenti (x deve essere in radianti):
• private static double sin(double x, int numTerms);
• private static double cos(double x, int numTerms);
Confrontate i valori calcolati utilizzando le serie trigonometriche con quelli calcolati utilizzando le
funzioni sin() e cos() della classe Math. Utilizzate un numero crescente di termini e dei valori di
x pari a 0, pi/6, pi/4, pi/3 e pi/2.

Suggerimento: al fine di evitare dei grandi numeri a denominatore che potrebbero causare degli
overflow, calcolate i termini della serie trigonometrica nella maniera seguente:

(x^n / n!) = (x/n) * (x / n-1) ... (x / n)

Per l’esercizio 7.2, nel caso dell’approssimazione, deve essere possibile specificare quanti termini 
della serie vengono usati per il calcolo. La richiesta dell’esercizio é di fare in modo, nel main, 
di richiamare la funzione che calcola l’approssimazione con un numero crescente di termini (ad 
esempio da 1 a 20 termini) e per ogni calcolo di capire (ad esempio con una sottrazione) 
quanto preciso é il valore approssimato rispetto al valore calcolato con le funzioni trigonometriche 
della classe Math. Tutto questo va fatto con i valori di x indicati nella serie 
(0, pi/6, pi/4, pi/3, pi/2).


*/

import java.lang.Math;


public class SerieTrigonometriche {

    static int fatt(int x) {
        int i;
        int fact = 1;
    
        for(i = 1; i <= x; i = i + 1) {
            fact = fact * i;
        }
        return fact;
    }

    //• private static double sin(double x, int numTerms);
    public static double sinX(double a, int b) {
        double sinOfX = 0; 
        //sin(x) = x - (x^3 / 3!) + (x^5 / 5!) - (x^7 / 7!) + (x^9 / 9!) - ...
        sinOfX = a - (Math.pow(a, b) / fatt(b))+
        (Math.pow(a, b + 2) / fatt(b + 2)) - 
        (Math.pow(a, b + 4) / fatt(b + 4)) +
        (Math.pow(a, b + 6) / fatt(b + 6)) - 
        (Math.pow(a, b + 8) / fatt(b + 8));
        return sinOfX;
    }

    //cos(x) = 1 - (x^2 / 2!) + (x^4 /4!) - (x^6 / 6!) + (x^8 / 8!) - ...
    public static double cosX(double a, int b) {
        double cosOfX = 0; 
        cosOfX = 1 - (Math.pow(a, b) / fatt(b))+
        (Math.pow(a, b + 2) / fatt(b + 2)) - 
        (Math.pow(a, b + 4) / fatt(b + 4)) +
        (Math.pow(a, b + 6) / fatt(b + 6)) - 
        (Math.pow(a, b + 8) / fatt(b + 8));
        return cosOfX;
    }
    public static void main(String[] args) {
        //Calcolare sin e cos
        int b = 5;

        //x = (0, pi/6, pi/4, pi/3, pi/2)
        double x0 = 0;
        double x1 = Math.PI/6;
        double x2 = Math.PI/4;
        double x3 = Math.PI/3;
        double x4 = Math.PI/2;

        double[] valueOfx = new double[5];
        valueOfx[0] = 0;
        valueOfx[1] = Math.PI/6;
        valueOfx[2] = Math.PI/4;
        valueOfx[3] = Math.PI/3;
        valueOfx[4] = Math.PI/2;

        double generatorSin = sinX(x0, b);
        double c = 0;


        for(int i = 0; i < valueOfx.length; i++) {
            generatorSin = sinX(valueOfx[i], b);
            System.out.println("Per x = " + valueOfx[i] + " ,Sin(x) = " + generatorSin);
            c = Math.sin(valueOfx[i]);
            System.out.println("Sin(x) con il metodo Math: " + c);
            System.out.println("Lo scarto è di: " + (generatorSin - c));
            System.out.println(" ");
        }

        double generatorCos = cosX(x0, b);
        double d = 0;

        for(int i = 0; i < valueOfx.length; i++) {
            generatorCos = cosX(valueOfx[i], b);
            System.out.println("Per x = " + valueOfx[i] + " ,Cos(x) = " + generatorCos);
            d = Math.sin(valueOfx[i]);
            System.out.println("Cos(x) con il metodo Math: " + d);
            System.out.println("Lo scarto è di: " + (generatorCos - c));
            System.out.println(" ");
        }
    }
    
}
