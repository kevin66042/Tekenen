package h4;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(20,20,220,20);
        g.drawString("Lijn",110,32);
        //rechthoek
        g.drawRect(20,40,200,100);
        g.drawString("Rechthoek",90,155);
        //ronde rechthoek
        g.drawRoundRect(20,163,200,100,30,30);
        g.drawString("Afgeronde rechthoek",65,277);
        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(225,40,200,101);
        g.setColor(Color.blue);
        g.drawOval(225,40,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",245,155);
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(225,163,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",280,277);
        //Taartpunt met ovaal
        g.setColor(Color.magenta);
        g.fillArc(430,40,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(430,40,200,100);
        g.drawString("Taartpunt met ovaal eromheen",445,155);
        //cirkel
        g.drawOval(480,163,100,100);
        g.drawString("Ovaal",515,277);
    }
}
