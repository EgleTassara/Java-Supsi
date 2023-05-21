package step2;

class Contatto {
    String nome;
    String cognome;
    Indirizzo indirizzo;
    String nrTelefono;
}

class Indirizzo {
    String via;
    int cap;
    String localita;
}

public class RubricaTelefonicaTest {

    private static void mostraContatto(Contatto contatto) {
        System.out.println(contatto.nome + " " + contatto.cognome);
        System.out.println(contatto.indirizzo.via + " \n" + contatto.indirizzo.cap + " " + contatto.indirizzo.localita);
        System.out.println("Tel: " + contatto.nrTelefono + "\n");
    }

    public static void main(String[] args) {
        // Informazioni per il contatto 1
        Contatto contatto1 = new Contatto();
        contatto1.nome = "Bruno";
        contatto1.cognome = "Orso";
        contatto1.indirizzo = new Indirizzo();
        contatto1.indirizzo.via = "via dei Meli 42";
        contatto1.indirizzo.cap = 1234;
        contatto1.indirizzo.localita = "Paese dei Balocchi";
        contatto1.nrTelefono = "+41 (0) 91 987 65 43";

        // Informazioni per il contatto 2
        Contatto contatto2 = new Contatto();
        contatto2.nome = "Anna";
        contatto2.cognome = "Rossi";
        contatto2.indirizzo = new Indirizzo();
        contatto2.indirizzo.via = "via dei Peri 99";
        contatto2.indirizzo.cap = 9674;
        contatto2.indirizzo.localita = "Paese delle Meraviglie";
        contatto2.nrTelefono = "+41 (0) 91 123 98 67";

        // Mostra contatto 1 e 2
        mostraContatto(contatto1);
        mostraContatto(contatto2);
    }
}