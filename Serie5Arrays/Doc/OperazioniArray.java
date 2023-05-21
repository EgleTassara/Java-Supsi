package Serie5Arrays.Doc;

import java.util.Scanner;

public class OperazioniArray {
    static final int MIN = -25;
    static final int MAX = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dimensione array: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Inserire un intero. Riprova: ");
            scanner.nextLine();
        }
        int dimensione = scanner.nextInt();
        while (dimensione < 5 || dimensione > 15) {
            System.out.print("Dimensione array non valida! Riprova: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Inserire un intero. Riprova: ");
                scanner.nextLine();
            }
            dimensione = scanner.nextInt();
        }
        scanner.close();

        int[] numeri = new int[dimensione];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        }

        int somma = 0;
        for (int numero : numeri)
            somma += numero;

        int indicePrimoValorePositivo = -1;
        int primoValorePositivo = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] > 0) {
                indicePrimoValorePositivo = i;
                primoValorePositivo = numeri[i];
                break;
            }
        }

        int indiceUltimoValoreNegativo = -1;
        int ultimoValoreNegativo = 0;
        for (int i = numeri.length - 1; i >= 0 ; i--) {
            if (numeri[i] < 0) {
                indiceUltimoValoreNegativo = i;
                ultimoValoreNegativo = numeri[i];
                break;
            }
        }

        System.out.print("Contenuto array: ");
        for (int numero : numeri)
            System.out.print(numero + " ");
        System.out.println();

        System.out.println("Somma: " + somma);

        if (indicePrimoValorePositivo == -1)
            System.out.println("Nessun valore positivo(maggiore di 0) presente");
        else
           System.out.println("Primo valore positivo (maggiore di 0): " + primoValorePositivo + ", indice: " + indicePrimoValorePositivo);

        if (indiceUltimoValoreNegativo == -1)
            System.out.println("Nessun valore negativo (minore di 0) presente");
        else
            System.out.println("Ultimo valore negativo (minore di 0): " + ultimoValoreNegativo + ", indice: " + indiceUltimoValoreNegativo);
    }
}