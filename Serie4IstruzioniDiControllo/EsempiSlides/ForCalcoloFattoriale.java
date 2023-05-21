public class ForCalcoloFattoriale {
    public static void main(String[] args) {
        int fattoriale = 1;
        for (int i = 1; i < 10; i++) {
            fattoriale *= i;
            System.out.println(i + "! = " + fattoriale);
        }

    }
}
