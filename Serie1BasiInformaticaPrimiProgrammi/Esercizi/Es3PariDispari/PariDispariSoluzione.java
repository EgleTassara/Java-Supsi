package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es3PariDispari;
import java.util.Scanner;

public class PariDispariSoluzione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " è pari");
        } else {
            System.out.println(numero + " è dispari");
        }

        input.close();
    }
}