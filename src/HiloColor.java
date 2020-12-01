
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class HiloColor extends Thread{
    public boolean pausado=false;
    public boolean ejecutar = true;
    Lienzo puntero;
    private int contador=0;

    public int semaforo=0;
    public HiloColor(Lienzo p){
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
                contador++;
                if(contador>0 && contador<=10){
                    semaforo=1;
                    
                }
                if(contador>11 && contador<=21){
                    semaforo=2;
                }
                if(contador>22 && contador<32){
                    semaforo=3;
                }
                if(contador==32){
                    contador=0;
                    semaforo=0;
                
                }
                sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
        
    }
        
    

    private boolean estaDespausado() {
        return !pausado;
    }
}
