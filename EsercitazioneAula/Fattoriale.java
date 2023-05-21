public class Fattoriale {
    /*
  Calcola il fattoriale di un numero
*/
    static int fatt(int x) {
        int i;
        int fact = 1;
    
        for(i = 1; i <= x; i = i + 1) {
            fact = fact * i;
        }
        return fact;
    }
  
    public static void main(String[] args) {
      int a;
      int r;
  
      a = 5;
      r = fatt(a);
      System.out.println("Il fattoriale di "+ a +" vale " + fatt(a));
  
      a = 4;
      System.out.println("Il fattoriale di "+ a +" vale "+ fatt(a));
  
      System.out.println("Il fattoriale di 2 vale "+ fatt(2));
    }
}
  

