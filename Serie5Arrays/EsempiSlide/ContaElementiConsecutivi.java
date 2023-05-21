public class ContaElementiConsecutivi {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 7);

        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                cnt++;
        }

        System.out.print("Contenuto array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nNumero di elementi consecutivi: " + cnt);
    }
}
