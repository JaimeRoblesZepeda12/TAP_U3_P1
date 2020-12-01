
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class HiloCambiar extends Thread{
    public boolean pausado=false;
    public boolean ejecutar = true;
    Lienzo puntero;
    String frase[];
    int count;
    
    public HiloCambiar(Lienzo p){
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
                count++;
                if(count==40){
                count=0;
                }
                puntero.cambiarFrase();
                //puntero.repaint();
                sleep(5000);
            } catch (InterruptedException ex) {
               
            }
        }
        
    }
        
    
    private boolean estaDespausado() {
        return !pausado;
    }
}
