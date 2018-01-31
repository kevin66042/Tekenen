package h4;

import java.awt.*;
import java.applet.*;

public class House extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //vierkant
        g.drawLine(20,100,20,200);
        g.drawLine(20,200,120,200);
        g.drawLine(120,200,120,100);
        g.drawLine(20,100,120,100);
        //dak
        g.drawLine(20,100,70,20);
        g.drawLine(70,20,120,100);
        //deur
        //g.drawLine(70,200,70,160);
        //g.drawLine(70,160,95,160);
        //g.drawLine(95,160,95,200);
        g.drawRect(70,160,25,40);
        //raam
        g.drawRect(30,120,30,30);
        g.drawRect(30,120,13,13);
        g.drawRect(47,120,13,13);
        g.drawRect(30,137,13,13);
        g.drawRect(47,137,13,13);
    }
}
