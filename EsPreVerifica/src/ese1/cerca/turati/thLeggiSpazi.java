/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author turati_marco
 */
public class thLeggiSpazi extends Thread{
    DatiCondivisi datiCondivisi; 
  
   public thLeggiSpazi(DatiCondivisi datiCondivisi) {
        this.datiCondivisi = datiCondivisi;
        
    }
  
   public void run() {
        try {
            datiCondivisi.getSemaforoGenera().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(thLeggiSpazi.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i =0; i<datiCondivisi.getBufferLenght(); i++){
            if(datiCondivisi.getAt(i) == ' ')
                datiCondivisi.incrementaNumSpaziLetti();
        }
        datiCondivisi.getSemaforoConta().release();
    }
}
