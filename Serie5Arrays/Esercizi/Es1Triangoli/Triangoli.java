package Es1Triangoli;
/* Triangoli:
    Scrivete un programma in grado di visualizzare, separatamente uno sotto l’altro, i quattro 
    triangoli proposti piu` sotto. Usate dei cicli for per generarli. Per ogni triangolo, tutti 
    gli asterischi (*) dovranno essere prodotti utilizzando una sola istruzione System.out.print(’*’); 
    che mostrer`a gli asterischi uno di fianco all’altro. Potete inoltre utilizzare un’istruzione 
    System.out.println(); per andare alla riga successiva e un’istruzione System.out.print(’ ’); 
    per inserire uno spazio.
*/

public class Triangoli {
    public static void main(String[] args) {
        int[] arrA = new int[11];


        for(int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        System.out.println(" ");

        for(int i = 0; i <= arrA.length; i++) {
            for (int j = 11; j > i; j--) {
                System.out.print("*");

            }
            System.out.println("*");
        }
        System.out.println(" ");

        for(int i = 0; i <= arrA.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int h = 11; h > i; h--) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println(" ");

        int j;

        for(int i = 0; i <= arrA.length; i++) {
            for (j = 11; j > i; j--) {
                System.out.print(" ");
            }
            for (int h = 0; h < j; h++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }

}