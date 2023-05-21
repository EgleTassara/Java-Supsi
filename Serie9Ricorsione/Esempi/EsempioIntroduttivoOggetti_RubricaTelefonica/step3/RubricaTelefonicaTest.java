package step3;

class Contatto {
    String nome;
    String cognome;
    Indirizzo indirizzo;
    String nrTelefono;

    Contatto(String nomeC, String cognomeC, Indirizzo indirizzoC, String nrTelefonoC) {
        nome = nomeC;
        cognome = cognomeC;
        indirizzo = indirizzoC;
        nrTelefono = nrTelefonoC;
    }
}

class Indirizzo {
    String via;
    int cap;
    String localita;

    Indirizzo(String viaI, int capI, String localitaI) {
        via = viaI;
        cap = capI;
        localita = localitaI;
    }
}

public class RubricaTelefonicaTest {

    private static void mostraContatto(Contatto contatto) {
        System.out.println(contatto.nome + " " + contatto.cognome);
        System.out.println(contatto.indirizzo.via + " \n" + contatto.indirizzo.cap + " " + contatto.indirizzo.localita);
        System.out.println("Tel: " + contatto.nrTelefono + "\n");
    }

    public static void main(String[] args) {
        // Informazioni per il contatto 1
        Indirizzo indirizzo1 = new Indirizzo("via dei Meli 42", 1234, "Paese dei Balocchi");
        Contatto contatto1 = new Contatto("Bruno", "Orso", indirizzo1, "+41 (0) 91 987 65 43");

        // Informazioni per il contatto 2
        Indirizzo indirizzo2 = new Indirizzo("via dei Peri 99", 9674, "Paese delle Meraviglie");
        Contatto contatto2 = new Contatto("Anna", "Rossi", indirizzo2, "+41 (0) 91 123 98 67");

        // Mostra contatto 1 e 2
        mostraContatto(contatto1);
        mostraContatto(contatto2);
    }
}