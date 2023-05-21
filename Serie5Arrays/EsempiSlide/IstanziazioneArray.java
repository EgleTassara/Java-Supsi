import java.util.Scanner;

public class IstanziazioneArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimensione array: ");
        int dimensione = input.nextInt();

        float[] valori = new float[dimensione];
        System.out.print("Valori: ");
        for (int i = 0; i < valori.length; i++)
            valori[i] = input.nextFloat();
        input.close();

        System.out.println("Array prima del ridimensionamento:");
        System.out.println("Lunghezza: " + valori.length);
        System.out.print("Contenuto: ");
        for (int i = 0; i < valori.length; i++)
            System.out.print(valori[i] + " ");
   
        // Raddoppia la dimensione dell'array
        float[] tmp = new float[valori.length * 2];
        for (int i = 0; i < dimensione; i++)
            tmp[i] = valori[i];
        valori = tmp;

        System.out.println("\n\nArray dopo il ridimensionamento:");
        System.out.println("Lunghezza: " + valori.length);
        System.out.print("Contenuto: ");
        for (int i = 0; i < valori.length; i++)
            System.out.print(valori[i] + " ");
    }
}
