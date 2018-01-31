package h4;

import java.awt.*;
import java.applet.*;

public class Ellipse extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20,20,500,300,0,360);
    }
}
