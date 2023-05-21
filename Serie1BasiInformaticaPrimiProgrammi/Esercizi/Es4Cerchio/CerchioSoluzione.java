package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es4Cerchio;
import java.util.Scanner;

public class CerchioSoluzione {

	static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserire raggio: ");
		double raggio = input.nextDouble();

		input.close();

		System.out.println("Diametro = " + 2 * raggio);
		System.out.println("Circonferenza = " + 2 * raggio * PI);
		System.out.println("Area = " + raggio * raggio * PI);
	}
}
