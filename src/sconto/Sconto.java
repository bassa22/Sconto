
package sconto;

import java.util.Scanner;

/**
 *
 * @author bel22724
 * progetto Sconto.
 */
public class Sconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner lettore = new Scanner(System.in);
        System.out.println("Inserisci il prezzo del prodotto non scontato in euro: ");
         int prezzo = lettore.nextInt();
         
         System.out.println("Inserisci la percentuale di sconto: ");
         Scanner l = new Scanner(System.in);
         int percentualesconto = l.nextInt();
         
         float sconto = prezzo*percentualesconto/100;
         
               
          float PrezzoScontato = prezzo - sconto;
         
         System.out.println("Il prezzo scontato è di: " + PrezzoScontato + " euro ");
        
    }
}

