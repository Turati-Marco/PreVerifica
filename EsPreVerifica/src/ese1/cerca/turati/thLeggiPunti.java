/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

/**
 *
 * @author turati_marco
 */
public class thLeggiPunti extends Thread{
    DatiCondivisi datiCondivisi; 
  
   public thLeggiPunti(DatiCondivisi datiCondivisi) {
        this.datiCondivisi = datiCondivisi;
        
    }
  
   public void run() {
        for(int i =0; i<datiCondivisi.getBufferLenght(); i++){
            if(datiCondivisi.getAt(i) == '.')
                datiCondivisi.incrementaNumPuntiLetti();
        }
   }
}
