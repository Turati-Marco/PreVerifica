/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

import java.util.Vector;
import java.util.concurrent.Semaphore;

/**
 *
 * @author turati_marco
 */
public class DatiCondivisi {
    
    private Vector<Character> buffer = new Vector<Character>(10);
    
    private int SpaziInseriti;
    
    private int PuntiInseriti;
    
    private int SpaziLetti;
    
    private int PuntiLetti;
    
    private Semaphore SemaforoConta;//0
    private Semaphore SemaforoGenera;
    
   
    public DatiCondivisi() {
        SpaziInseriti=0;
        PuntiInseriti=0;
        SpaziLetti=0;
        PuntiLetti=0;
        SemaforoConta = new Semaphore(0);
        SemaforoGenera = new Semaphore(1);
    }
    synchronized public void pushChar(char carattere) {
        buffer.add(carattere);
    }
    
    synchronized public char getAt(int i){
        return buffer.get(i);
    }
    
    synchronized public Vector<Character> getBuffer() {
        return buffer;
    }

    
    synchronized public int getNumSpaziInseriti() {
        return SpaziInseriti;
    }

    synchronized public int getNumPuntiInseriti() {
        return PuntiInseriti;
    }

    synchronized public int getNumSpaziLetti() {
        return SpaziLetti;
    }
    
    
   synchronized  public void incrementaNumSpaziLetti() {
        SpaziLetti++;
    }
   
    synchronized public int getNumPuntiLetti() {
        return PuntiLetti;
    }
    
    
    synchronized public void incrementaNumPuntiLetti() {
        PuntiLetti++;
    }
    synchronized public int getBufferLenght(){
        return buffer.size();
    }
    synchronized public void incrementaNumSpaziInseriti(){
        SpaziInseriti++;
    }
    
    synchronized public void incrementaNumPuntiInseriti(){
        PuntiInseriti++;
    }
            
}
