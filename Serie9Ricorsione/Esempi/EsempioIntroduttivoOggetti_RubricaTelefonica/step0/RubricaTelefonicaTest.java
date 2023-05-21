package step0;

public class RubricaTelefonicaTest {

    private static void mostraContatto(String nome, String cognome, String via, int cap, String localita,
            String nrTelefono) {
        System.out.println(nome + " " + cognome);
        System.out.println(via + " \n" + cap + " " + localita);
        System.out.println("Tel: " + nrTelefono + "\n");
    }

    public static void main(String[] args) {
        // Informazioni per il contatto 1
        String nomeContatto1 = "Bruno";
        String cognomeContatto1 = "Orso";
        String viaContatto1 = "via dei Meli 42";
        int capContatto1 = 1234;
        String localitaContatto1 = "Paese dei Balocchi";
        String nrTelefonoContatto1 = "+41 (0) 91 987 65 43";

        // Informazioni per il contatto 2
        String nomeContatto2 = "Anna";
        String cognomeContatto2 = "Rossi";
        String viaContatto2 = "via dei Peri 99";
        int capContatto2 = 9674;
        String localitaContatto2 = "Paese delle Meraviglie";
        String nrTelefonoContatto2 = "+41 (0) 91 123 98 67";

        // Mostra contatto 1 e 2
        mostraContatto(nomeContatto1, cognomeContatto1, viaContatto1, capContatto1, localitaContatto1,
                nrTelefonoContatto1);
        mostraContatto(nomeContatto2, cognomeContatto2, viaContatto2, capContatto2, localitaContatto2,
                nrTelefonoContatto2);
    }
}