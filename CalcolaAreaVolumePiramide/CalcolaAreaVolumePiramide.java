import java.util.Scanner;
import java.util.*;

/**
*
*/

public class CalcolaAreaVolumePiramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double latoBase = 0;

        while (latoBase <= 0) {
            System.out.println("Inserie lato base: ");
            if (!input.hasNextDouble()) {
                System.out.print("Inserire un double: ");
                input.nextLine();
            } else {
                latoBase = input.nextDouble();
                input.nextLine();
            }
        }
        
        double altezza = 0;
        while (altezza <= 0) {
            System.out.println("Inserie altezza: ");
            if (!input.hasNextDouble()) {
                System.out.print("Inserire un double: ");
                input.nextLine();
            } else {
                altezza = input.nextDouble();
                input.nextLine();
            }
        }
        
    }
}