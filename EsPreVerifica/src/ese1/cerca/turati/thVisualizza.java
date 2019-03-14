package ese1.cerca.turati;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author turati_marco
 */
public class thVisualizza extends Thread{
     private  int delay = 100;
    
   
    private  DatiCondivisi datiCondivisi;
    
    
   
    public thVisualizza(DatiCondivisi datiCondivisi) {
        this.datiCondivisi = datiCondivisi;
    }
    
  
   
    public void run() {
        
        try {
                System.out.print("Frase: ");
                System.out.println(datiCondivisi.getBuffer());
                System.out.print("NumSpaziInseriti: ");
                System.out.println(datiCondivisi.getNumSpaziInseriti());
                System.out.print("NumPuntiInseriti: ");
                System.out.println(datiCondivisi.getNumPuntiInseriti());
                System.out.print("NumSpaziLetti: ");
                System.out.println(datiCondivisi.getNumSpaziLetti());
                System.out.print("NumPuntiLetti: ");
                System.out.println(datiCondivisi.getNumPuntiLetti());
            
                Thread.sleep(delay);
            
            
        } catch(InterruptedException ignored) {
           
        }
    }
}
