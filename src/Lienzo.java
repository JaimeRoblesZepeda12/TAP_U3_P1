
import java.awt.Canvas;
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
public class Lienzo extends Canvas{
    NewJFrame puntero;
    
    int x=100;
    int y=150;
    int desplazamientoX=5;
    HiloFrases hf=new HiloFrases(this);
    HiloCambiar hc=new HiloCambiar(this);
    HiloColor hco=new HiloColor(this);
    String[] cad = new String[40];
    String frase;
    int t=3;
    boolean rojo;
    boolean azul;
    boolean verde;
    //int desplazamientoY;
    
    
    
    public Lienzo(NewJFrame p) {
        
        puntero=p;
        hf.start();
        hc.start();
        hco.start();
    }
    
    public void cambiarFrase(){
        cad[0]="Jaime Robles Zepeda";
        cad[1]="hello word";
        cad[2]="cats are cool";
        cad[3]="dogs are cool";
        cad[4]="turtles are cool";
        cad[5]="this is a bath tub";
        cad[6]="use the force luke";
        cad[7]="may the force be with you";
        cad[8]="this is the way";
        cad[9]="its over anakin";
        cad[10]="i got have the highground";
        cad[11]="believe it";
        cad[12]="thats my ninja way";
        cad[13]="it a trap";
        cad[14]="say cheese";
        cad[15]="i wanna be the very best";
        cad[16]="foo fighters";
        cad[17]="flatbush zombies";
        cad[18]="Just keep swimming";
        cad[19]="Why so serious?";
        cad[20]="You talking to me?";
        cad[21]="The stuff that dreams are made of.";
        cad[22]="E.T. phone home";
        cad[23]="Bond. James Bond.";
        cad[24]="Show me the money!";
        cad[25]="I want to be alone";
        cad[26]="I'll have what she's having";
        cad[27]="You're gonna need a bigger boat.";
        cad[28]="I'll be back.";
        cad[29]="We rob banks.";
        cad[30]="I see dead people.";
        cad[31]="It's alive! It's alive!";
        cad[32]="You had me at ‘hello";
        cad[33]="What a dump";
        cad[34]="Here's Johnny!";
        cad[35]="They're here!";
        cad[36]="My precious.";
        cad[37]="Yo, Adrian!";
        cad[38]="I'm king of the world!";
        cad[39]="Nobody puts Baby in a corner";
        //t=hc.count;
        frase=cad[hc.count];
        /*for(int i=0;i<cad.length;i++){
            frase=cad[i];
        }*/
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2= (Graphics2D)g;
        this.setBackground(Color.GRAY); 
        
        switch(hco.semaforo){
            case 1:
                rojo=true;
                azul=false;
                verde=false;
                break;
            case 2:
                rojo=false;
                azul=true;
                verde=false;
                break;
            case 3:
                rojo=false;
                azul=false;
                verde=true;
                break;
        }
        if(rojo==true){
            g2.setColor(Color.red);
            
        }
        if(azul==true){
            g2.setColor(Color.blue);
            
        }
        if(verde==true){
            g2.setColor(Color.green);
            
        }
        //g2.setColor(Color.red);
        g2.setFont(new Font("Arial",Font.PLAIN,30));
        g2.drawString(frase,x,y);
            /*
            g2.setColor(Color.red);
            g2.setFont(new Font("Arial",Font.PLAIN,30));
            g2.drawString("jaime", x, y);
            */
        
        
    }
    /*public void cambiarColores(Graphics2D g2){
        g2.setColor(Color.red);
        g2.setFont(new Font("Arial",Font.PLAIN,30));
        g2.drawString(frase,x,y);
    }*/
    public void rebotar(){
        x+=desplazamientoX;
        //Analisis de rebote
        if(x>450){
            x=-50;
        }
    }
    
}
