package h4;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRoundRect(20,20,200,400,180,150);
        g.setColor(Color.darkGray);
        g.fillRoundRect(40,40,160,360,140,110);
        g.setColor(Color.darkGray);
        g.fillRect(101,421,39,299);
        g.setColor(Color.black);
        g.drawRect(100,420,40,300);
        g.setColor(Color.red);
        g.fillOval(84,90,75,75);
        g.setColor(Color.ORANGE);
        g.fillOval(84,180,75,75);
        g.setColor(Color.green);
        g.fillOval(84,270,75,75);
    }
}


