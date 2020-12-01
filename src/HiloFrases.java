
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class HiloFrases extends Thread{
    
    public boolean pausado=false;
    public boolean ejecutar = true;
    Lienzo puntero;
    
    public HiloFrases(Lienzo p){
        puntero=p;
    }
    public void pausar(){
        pausado =! pausado;
        
    }
    public void detener(){
        ejecutar = false;
    }
    @Override
    public void run(){
        while(ejecutar){
            try {
                
                    puntero.rebotar();
                
                puntero.repaint();
                sleep(100);
            } catch (InterruptedException ex) {
               
            }
        }
        
    }
        
    

    private boolean estaDespausado() {
        return !pausado;
    }
}
