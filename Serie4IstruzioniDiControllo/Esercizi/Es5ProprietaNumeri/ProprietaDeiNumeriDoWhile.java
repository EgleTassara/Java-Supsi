/* Esercizio 4.5 - Proprieta' dei numeri (facoltativo)
        Scrivete un programma che, per tutti i numeri da -10 a 9, 
        stampi a schermo se il numero `e positivo e se `e pari o dispari.
        Provate a realizzare 3 versioni del programma, una che utilizzi 
        un’istruzione for, una che utilizzi un’istruzione whilee una che utilizzi 
        un’istruzione do while. 
*/

public class ProprietaDeiNumeriDoWhile {
    public static void main(String[] args) {
        int value = -10;

        do {
            System.out.println("Value: " + value);
            if (value < 0 && value % 2 == 0) {
                System.out.println(" Il valore è negativo");
                System.out.println(" Il numero è pari");
                System.out.println(" ");
            } else if (value < 0 && value % 2 != 0) {
                System.out.println(" Il valore è negativo");
                System.out.println(" Il numero è dispari");
                System.out.println(" ");
            } else if (value > 0 && value % 2 != 0) {
                System.out.println(" Il valore è positivo");
                System.out.println(" Il numero è dispari");
                System.out.println(" ");
            } else {
                System.out.println(" Il valore è positivo");
                System.out.println(" Il numero è pari");
                System.out.println(" ");
            }
            value++;
        } while (value < 10);
        System.out.println("Il programma è terminato!");
    }
}
