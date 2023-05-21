package Serie3IntroduzioneAlleClassi.Esercizi.Es1OperazioniAritmetiche;

import java.util.Scanner;

/**
 * Programma che permette l'immissione da parte dell'utilizzatore delle variabili intere a, b, c, d
 * ed r e che visualizza il risultato di un'espressione.
 *
 * Tutte le divisioni eseguite saranno delle divisioni tra interi e la parte decimale verrà troncata
 * causando dei possibili errori nei risultati.
 */
public class OperazioniAritmeticheIntSoluzione {

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
		int a = input.nextInt();
		System.out.print("Inserisci b: ");
		int b = input.nextInt();
		System.out.print("Inserisci c: ");
		int c = input.nextInt();
		System.out.print("Inserisci d: ");
		int d = input.nextInt();

		// Controlla se i valori di a, b e d sono validi
		while (a + b * d == 0) {
			System.out.println("Valore non valido per a, b e/o d. Riprova: ");
			System.out.print("Inserisci a: ");
			a = input.nextInt();
			System.out.print("Inserisci b: ");
			b = input.nextInt();
			System.out.print("Inserisci d: ");
			d = input.nextInt();
		}

		// Richiedi r e controlla se il valore e valido
		System.out.print("Inserisci r: ");
		int r = input.nextInt();
		while (r == -34) {
			System.out.print("Valore non valido. Riprova: ");
			r = input.nextInt();
		}

		// Calcola e mostra il risultato
		int primaParte = 4 / (3 * (r + 34));
		int secondaParte = 9 * a + b * c;
		int terzaParte = (3 + d * (2 + a)) / (a + b * d);
		int risultato = primaParte - secondaParte / 3 + terzaParte;
		System.out.println("Risultato: " + risultato);

		// Finalizza lo scanner
		input.close();
	}
}
