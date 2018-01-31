package h4;

import java.awt.*;
import java.applet.*;

public class staafdiagram extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50,50,50,200);
        g.drawLine(50,200,300,200);
        //valerie
        g.setColor(Color.magenta);
        g.fillRect(81,161,49,39);
        g.setColor(Color.black);
        g.drawRect(80,160,50,40);
        //Jeroen
        g.setColor(Color.green);
        g.fillRect(151,101,49,99);
        g.setColor(Color.black);
        g.drawRect(150,100,50,100);
        //Hans
        g.setColor(Color.blue);
        g.fillRect(221,121,49,79);
        g.setColor(Color.black);
        g.drawRect(220,120,50,80);

        //schaal
        g.drawLine(45,60,55,60);
        g.drawLine(45,80,55,80);
        g.drawLine(45,100,55,100);
        g.drawLine(45,120,55,120);
        g.drawLine(45,140,55,140);
        g.drawLine(45,160,55,160);
        g.drawLine(45,180,55,180);
        g.drawLine(45,200,55,200);

        //namen
        g.drawString("Valerie",85,215);
        g.drawString("Jeroen",155,215);
        g.drawString("Hans",230,215);

        //Schaalnummering
        g.drawString("0",35,205);
        g.drawString("20",30,185);
        g.drawString("40",30,165);
        g.drawString("60",30,145);
        g.drawString("80",30,125);
        g.drawString("100",23,105);
        g.drawString("120",23,85);
        g.drawString("140",23,65);
        g.drawString("Gewicht",20,30);
        g.drawString("in KG",25,40);
    }
}
