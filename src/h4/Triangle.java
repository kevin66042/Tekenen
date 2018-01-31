package h4;


import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(20, 100, 100, 100);
        g.drawLine(20,20,20,100);
        g.drawLine(20,20,100,100);
    }
}