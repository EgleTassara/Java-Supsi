package step1;

class Contatto {
    String nome;
    String cognome;
    String via;
    int cap;
    String localita;
    String nrTelefono;
}

public class RubricaTelefonicaTest {

    private static void mostraContatto(Contatto contatto) {
        System.out.println(contatto.nome + " " + contatto.cognome);
        System.out.println(contatto.via + " \n" + contatto.cap + " " + contatto.localita);
        System.out.println("Tel: " + contatto.nrTelefono + "\n");
    }

    public static void main(String[] args) {
        // Informazioni per il contatto 1
        Contatto contatto1 = new Contatto();
        contatto1.nome = "Bruno";
        contatto1.cognome = "Orso";
        contatto1.via = "via dei Meli 42";
        contatto1.cap = 1234;
        contatto1.localita = "Paese dei Balocchi";
        contatto1.nrTelefono = "+41 (0) 91 987 65 43";

        // Informazioni per il contatto 2
        Contatto contatto2 = new Contatto();
        contatto2.nome = "Anna";
        contatto2.cognome = "Rossi";
        contatto2.via = "via dei Peri 99";
        contatto2.cap = 9674;
        contatto2.localita = "Paese delle Meraviglie";
        contatto2.nrTelefono = "+41 (0) 91 123 98 67";

        // Mostra contatto 1 e 2
        mostraContatto(contatto1);
        mostraContatto(contatto2);
    }
}