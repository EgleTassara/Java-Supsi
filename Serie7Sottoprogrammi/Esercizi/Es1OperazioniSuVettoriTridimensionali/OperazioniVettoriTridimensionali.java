/*  Sviluppate alcune funzioni/procedure che permettano di eseguire operazioni elementari su vettori
    nello spazio tridimensionale. In particolare dovranno permettere di:
• creare un vettore,
• inizializzare un vectorGenerator con valori casuali per le coordinate x, y e z (dovr`a essere possibile
    specificare il valore minimo e quello massimo possibili tramite i parametri della procedura),
• stampare a schermo un vettore,
• eseguire la somma di due vettori memorizzando il risultato in un nuovo vettore,
• eseguire il prodotto di una costante con un vettore memorizzando il risultato in un nuovo
    vectorGenerator,
• eseguire il prodotto vettoriale di due vettori memorizzando il risultato in un nuovo vettore
    (https://it.wikipedia.org/wiki/Prodotto_vettoriale).
Inoltre, scrivete un programma che permetta di collaudare esaustivamente le funzioni/procedure
sviluppate. */
package Es1OperazioniSuVettoriTridimensionali;

import java.util.Random;
import java.util.*; 

public class OperazioniVettoriTridimensionali {
    static double[] vectorGenerator(double x, double y, double z) {
        double[] vectorStatic = {x, y, z};
        return vectorStatic;
    }

    static void sumGenerator(double[] a, double[] b) {
        double[] sum = new double [3];
        for (int i = 0; i < sum.length; i++){
            sum[i] = a[i] + b[i];
        }
        System.out.println(
            "La somma dei vettori ha coordinate " + Arrays.toString(sum));
    }

    static void lamba(double[] a, double b) {
        double[] lambaOperation = new double[3];
        for(int i = 0; i < lambaOperation.length; i++) {
            lambaOperation[i] = a[i] * b;
        }
        System.out.println("La moltiplicazione ha coordinate: " + Arrays.toString(lambaOperation));

    }

    static void vectorProduct(double[] a, double[] b) {
        //Il primo array, il secondo array fare una matrice
        double[] operationVector = new double[3];  
        /*cross_P[0] = vect_A[1] * vect_B[2] - vect_A[2] * vect_B[1];
        cross_P[1] = vect_A[2] * vect_B[0] - vect_A[0] * vect_B[2];
        cross_P[2] = vect_A[0] * vect_B[1] - vect_A[1] * vect_B[0];*/    
        operationVector[0] = a[1] * b[2] - a[2] * b[1];
        operationVector[1] = a[2] * b[0] - a[0] * b[2];
        operationVector[2] = a[0] * b[1] - a[1] * b[0];
        System.out.println("Il prodotto vettorila è: " + Arrays.toString(operationVector));

        //System.out.println("Il prodotto di vettori" + operationVector[a][b]);
    }
    public static void main (String args[]) {
        Random rand = new Random();

        double x = Math.round(rand.nextDouble(51));
        double y = Math.round(rand.nextDouble(51));
        double z = Math.round(rand.nextDouble(51));

        double vectorStatic[] = vectorGenerator (10, 15, 20);
        System.out.println("Il vettore statico dichiarato ha coordinate" + Arrays.toString(vectorStatic));

        double vectorDynamics[] = vectorGenerator(x, y, z);
        System.out.println("Il vettore dinamico dichiarato ha coordinate" + Arrays.toString(vectorDynamics));

        sumGenerator(vectorStatic, vectorDynamics);
        lamba(vectorStatic, 10);
        vectorProduct(vectorStatic, vectorDynamics);


    }
}