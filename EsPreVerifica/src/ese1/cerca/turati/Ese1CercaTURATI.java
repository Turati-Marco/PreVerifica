/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

import java.util.Scanner;

/**
 *
 * @author turati_marco
 */
public class Ese1CercaTURATI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         final Scanner sc = new Scanner(System.in);
        
        System.out.print("Quanti caratteri vuoi generare? ");
        int numDaGenerare = sc.nextInt();
         DatiCondivisi datiCondivisi = new DatiCondivisi();
         
         thGeneraChar generaTh = new thGeneraChar(datiCondivisi, numDaGenerare);
         thLeggiSpazi contaSpaziTh = new thLeggiSpazi(datiCondivisi);
         thLeggiPunti contaPuntiTh = new thLeggiPunti(datiCondivisi);
         thVisualizza visualizzaTh = new thVisualizza(datiCondivisi);
         try {
             
        generaTh.start();
        generaTh.join();
        
        contaSpaziTh.start();
        contaPuntiTh.start();
        visualizzaTh.start();

        contaSpaziTh.join();
        contaPuntiTh.join();
        visualizzaTh.join();
    } catch (InterruptedException ex) {
            System.err.println("thread interrotto");           
            
        }
         if(datiCondivisi.getNumPuntiInseriti() == datiCondivisi.getNumPuntiLetti()){
             System.out.println("NUMERO DI PUNTI CORRISPONDE");
         }
          if(datiCondivisi.getNumSpaziInseriti() == datiCondivisi.getNumSpaziLetti()){
             System.out.println("NUMERO DI SPAZI CORRISPONDE");
         }
         
    }
    
}
