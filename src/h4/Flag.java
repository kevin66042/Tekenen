package h4;

import com.sun.javafx.scene.control.skin.ColorPalette;

import java.awt.*;
import java.applet.*;

public class Flag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(20,20,10,200);
        g.drawRect(30,20,150,99);
        g.drawRect(30,20,150,33);
        g.drawRect(30,53,150,33);
        g.drawRect(30,86,150,33);
        g.setColor(Color.red);
        g.fillRect(31,21,149,32);
        g.setColor(Color.white);
        g.fillRect(31,54,149,32);
        g.setColor(Color.blue);
        g.fillRect(31,87,149,32);
        g.setColor(Color.lightGray);
        g.fillRect(21,21,9,199);
    }
}
