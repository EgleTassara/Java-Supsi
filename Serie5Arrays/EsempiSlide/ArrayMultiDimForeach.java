public class ArrayMultiDimForeach {
    public static void main(String[] args) {
        int[][] nums = { { 99, 85, 98 }, 
                { 98, 57, 78 }, 
                { 92, 77, 76 }, 
                { 94, 32, 11 }, 
                { 99, 34, 22 }, 
                { 90, 46, 54 },
                { 76, 59, 88 }, 
                { 92, 66, 89 }, 
                { 97, 71, 24 }, 
                { 89, 29, 38 } };

        for (int[] riga : nums) {
            for (int valore : riga) {
                System.out.print(valore + " ");
            }
            System.out.println();
        }
    }
}
