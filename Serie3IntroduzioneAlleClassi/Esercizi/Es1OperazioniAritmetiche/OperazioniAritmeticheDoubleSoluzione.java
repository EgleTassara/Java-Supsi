package Serie3IntroduzioneAlleClassi.Esercizi.Es1OperazioniAritmetiche;

/**
 * Programma che permette l'immissione da parte dell'utilizzatore delle variabili a, b, c, d ed r e
 * che visualizza il risultato di un'espressione.
 */

import java.util.Scanner;

public class OperazioniAritmeticheDoubleSoluzione {

	/**
	 * Procedura main - parte principale del programma
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Inizializza lo scanner per leggere dati da tastiera
		Scanner input = new Scanner(System.in);

		// Richiedi a, b, c, d
		System.out.print("Inserisci a: ");
		double a = input.nextDouble();
		System.out.print("Inserisci b: ");
		double b = input.nextDouble();
		System.out.print("Inserisci c: ");
		double c = input.nextDouble();
		System.out.print("Inserisci d: ");
		double d = input.nextDouble();

		// Controlla se i valori di a, b e d sono validi
		while (a + b * d == 0.) {
			System.out.println("Valore non valido per a, b e/o d. Riprova: ");
			System.out.print("Inserisci a: ");
			a = input.nextDouble();
			System.out.print("Inserisci b: ");
			b = input.nextDouble();
			System.out.print("Inserisci d: ");
			d = input.nextDouble();
		}

		// Richiedi r e controlla se il valore e valido
		System.out.print("Inserisci r: ");
		double r = input.nextDouble();
		while (r == -34.) {
			System.out.print("Valore non valido. Riprova: ");
			r = input.nextDouble();
		}

		// Calcola e mostra il risultato
		double primaParte = 4.0 / (3.0 * (r + 34.0));
		double secondaParte = 9.0 * a + b * c;
		double terzaParte = (3.0 + d * (2.0 + a)) / (a + b * d);
		double risultato = primaParte - 1.0 / 3.0 * secondaParte + terzaParte;
		System.out.println("Risultato: " + risultato);

		// Finalizza lo scanner
		input.close();
	}
}
