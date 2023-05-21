public class Palindroma {
    public static String palindroma(String a) {
        a = a.toLowerCase();
        a = a.substring(1, a.length() - 1);

        if(a.charAt(0) != a.charAt(a.length() -1)) {
            return a;
        } else {
            System.out.println("La frase: ");
            return a;
        }
    }

    public static void main(String[] args) {
        String frase = "angolo bar a Bologna";
        palindroma(frase);
    }
    
}
