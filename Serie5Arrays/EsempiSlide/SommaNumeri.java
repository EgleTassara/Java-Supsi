public class SommaNumeri {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Math.random() * 30;

        double somma = 0.;
        for (int i = 0; i < arr.length; i++)
            somma += arr[i];

        System.out.println("Somma: " + somma);
    }
}
