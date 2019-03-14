/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1.cerca.turati;

import java.util.Vector;

/**
 *
 * @author turati_marco
 */
public class DatiCondivisi {
    
    private Vector<Character> buffer = new Vector<Character>();
    
    private int SpaziInseriti;
    
    private int PuntiInseriti;
    
    private int SpaziLetti;
    
    private int PuntiLetti;
    
   
    public DatiCondivisi() {
        SpaziInseriti=0;
        PuntiInseriti=0;
        SpaziLetti=0;
        PuntiLetti=0;
    }
    public void pushChar(char carattere) {
        buffer.add(carattere);
    }
    
    public char getAt(int i){
        return buffer.get(i);
    }
    
    public Vector<Character> getBuffer() {
        return buffer;
    }

    
    public int getNumSpaziInseriti() {
        return SpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return PuntiInseriti;
    }

    public int getNumSpaziLetti() {
        return SpaziLetti;
    }
    
    
    public void incrementaNumSpaziLetti() {
        SpaziLetti++;
    }
   
    public int getNumPuntiLetti() {
        return PuntiLetti;
    }
    
    
    public void incrementaNumPuntiLetti() {
        PuntiLetti++;
    }
    public int getBufferLenght(){
        return buffer.size();
    }
    public void incrementaNumSpaziInseriti(){
        SpaziInseriti++;
    }
    
    public void incrementaNumPuntiInseriti(){
        PuntiInseriti++;
    }
            
}
