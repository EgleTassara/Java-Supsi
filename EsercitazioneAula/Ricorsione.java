public class Ricorsione {

    public static int sum(int a) {
        //4 + 2 + 8 + 6 + 3 + 5
        int b;
        int c = 2;
        b = a % 10 + sum(a / 10);

        if(a < 10) {
            System.out.println("Il programma è terminato in quanto il mio numero è minore di 10!");
            return a;
        } else {
            System.out.println("Valore: " + b);
            return b;
        }
    }
    public static void main(String[] args) {
        sum(428639250);
    }
    
}
