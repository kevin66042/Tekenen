package h4;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(20,20,201,201,25,25);
        g.setColor(Color.black);
        g.drawRoundRect(20,20,200,200,25,25);
        g.fillOval(60,60,40,40);
        g.fillOval(140,60,40,40);
        g.fillOval(60,140,40,40);
        g.fillOval(140,140,40,40);
    }
}
