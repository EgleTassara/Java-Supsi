package Serie1BasiInformaticaPrimiProgrammi.Esercizi.Es6SeparaCifre;
import java.util.Scanner;

public class SeparaCifreSoluzione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserire un numero: ");
        int numero = input.nextInt();

        if (numero < 10000 || numero > 99999) {
            System.out.println("Numero non valido!!");
        } else {
            /*
            // Versione con 5 variabili
            int unita = numero % 10;
            int decina = numero / 10 % 10;
            int centinaia = numero / 100 % 10;
            int migliaia = numero / 1000 % 10;
            int decimigliaia = numero / 10000 % 10;

            System.out.println(decimigliaia + "   " + migliaia + "   " + centinaia + "   " + decina + "   " + unita);
            */

            /*
            // Versione con stringa
            String n = "" + numero;

            int i = 0;
            while (i < 5) {
                System.out.print(n.charAt(i) + "   ");
                i++;
            }
            */

            // Versione con while
            int divisore = 10000;
            while (divisore > 0) {
                System.out.print(numero / divisore % 10 + "   ");
                divisore = divisore / 10;
            }
        }
        input.close();
    }
}