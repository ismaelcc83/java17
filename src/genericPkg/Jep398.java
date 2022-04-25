package genericPkg;

import java.applet.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;

//<applet code="Jep398.class" width="370" height="270"></applet>
public class Jep398 extends Applet implements Runnable{

    private Thread hilo = null;
    private Font fuente;
    private String horaActual = "00:00:00";
 
    public void init()
    {  
       fuente = new Font("Verdana", Font.BOLD, 24);
    }
    
    public void start(){
       if (hilo == null)
       {
          hilo = new Thread(this, "Reloj");
          hilo.start();
       }
    }
    
    public void run(){
       Thread hiloActual = Thread.currentThread();
       while (hilo == hiloActual)
       {
          //obtener la hora actual
          Calendar cal = Calendar.getInstance();
          Date hora = (Date) cal.getTime();
          DateFormat df = DateFormat.getTimeInstance();
          horaActual = df.format(hora);
          repaint();
          try
          {
             Thread.sleep(1000);
          }
          catch (InterruptedException e){}
       }
    }
    
    public void paint(Graphics g){   
       //Dibujar un rectángulo alrededor del contenedor
       g.draw3DRect(1, 1, getSize().width-3, getSize().height-3, false);
       //Establecer la Fuente
       g.setFont(fuente);
       //mostrar la Hora
       g.drawString(horaActual,14,40);
    }
    
    public void stop(){   
       hilo = null;
    }
}