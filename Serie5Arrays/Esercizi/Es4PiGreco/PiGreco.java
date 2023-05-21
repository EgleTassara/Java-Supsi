/* Es 5.4 - Pi greco (facoltativo)
    Scrivete un programma in grado di approssimare il valore di (π Pi greco) 
    utilizzando la serie infinita seguente:
        π= 4 − (4/3) + (4/5) − (4/7) + (4/9) − (4/11) + ...
    Visualizzate  una  tabella  che  mostri  il  valore  di (π Pi greco) 
    approssimato  al  primo  termine  della  serie,  al secondo, e così via 
    fino al trentesimo termine. 
*/

public class PiGreco {
    public static void main(String[] args) {
        int div = 2;
        int operator = 1;
        double operationPiGreco = 0.0;
        for (int i = 1; i < 10; i++) {
            operationPiGreco += (4.0 / div) * operator;
            System.out.println(i + " Operation Pi Greco: (4.0 / " + div + ")" + " * " + operator );
            operator *= -1;
            div += 2;   
            System.out.println(i + " Result of Pi Greco: " + operationPiGreco);
        }
    }
    
}
