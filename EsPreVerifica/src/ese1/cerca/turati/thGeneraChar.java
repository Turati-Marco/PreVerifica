/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

import java.util.Random;

/**
 *
 * @author turati_marco
 */
public class thGeneraChar extends Thread{
    private  String caratteri = "abcdefghijklmnopqrstuvwzyz. ";
    private  DatiCondivisi datiCondivisi;    
    private  int caratteriDaGenerare;
    
    
    public thGeneraChar(DatiCondivisi datiCondivisi,int caratteriDaGenerare) {
        this.datiCondivisi = datiCondivisi;
        this.caratteriDaGenerare = caratteriDaGenerare;
    }
    
     public void run() {
        final Random rn = new Random();
        int numRandom;
        char ris;
        
        for(int i = 0; i < caratteriDaGenerare; i++) {
             numRandom = rn.nextInt(caratteri.length());
             ris = caratteri.charAt(numRandom);
             
             datiCondivisi.pushChar(ris);
             
             if(ris == ' '){
                 datiCondivisi.incrementaNumSpaziInseriti();
             }
             if(ris == '.'){
                 datiCondivisi.incrementaNumPuntiInseriti();
             }
            
            
        }
        
        
    }
}
