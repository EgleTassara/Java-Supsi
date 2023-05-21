/*  Esercizio 2.4 - Benvenuto (facoltativo)Scrivete un programma che stampi a schermo, 
    rispettando la formattazione, il seguente messaggio:
    Buongiorno studenti,
    benvenuti alla SUPSI e
    benvenuti al corso di fondamenti di informatica
    del bachelor in ingegneria informatica. 
*/

package Serie2TipiDiDato.Esercizi.Es4Benvenuto;

public class Benvenuto {
    public static void main(String[] args) {
        String message = "Buongiorno studenti \n" + 
                         "benvenuti alla SUPSI e \n" + 
                         "benvenuti al corso di fondamenti di informatica \n" +
                         "del bechelor in ingegneria informatica";
        System.out.println(message);
    }
    
}
