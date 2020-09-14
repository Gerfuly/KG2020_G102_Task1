package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.white);
        gr.fillRect(0, 0, 1200, 800);
        gr.setColor(Color.black);
        Enter(gr,465,600,50,200,5);
        gr.setColor(Color.green);
        gr.fillRect(0,700,1200,100);
        gr.setColor(Color.black);
        gr.drawRect(100, 600, 1000, 100);
        gr.drawRect(200, 450, 300, 150);
        gr.drawRect(700, 450, 300, 150);
        Wind(gr, 500, 200, 30, 40, 9, 5);
        Ruf(gr, 500, 200, 200, 100, 8);
        gr.setColor(Color.white);
        gr.fillRect(498,200,2,1);
        gr.setColor(Color.getHSBColor(22,30,64));
        Polygon r1 = new Polygon();
        r1.addPoint(200,450);
        r1.addPoint(300,400);
        r1.addPoint(500,400);
        r1.addPoint(500,450);
        gr.fillPolygon(r1);
        Polygon r2 = new Polygon();
        r2.addPoint(700,450);
        r2.addPoint(700,400);
        r2.addPoint(900,400);
        r2.addPoint(1000,450);
        gr.fillPolygon(r2);
        gr.setColor(Color.black);
        gr.drawRect(500, 200, 200, 400);
        Wind(gr,210, 455,30, 40,3,7);
        Wind(gr,710, 455,30, 40,3,7);
    }
    public void Enter(Graphics2D g, int x, int y, int w, int h, int n){
        for(int i = 0; i < n; i++){
            g.setColor(Color.gray);
            g.fillOval(x+i*w+5*i,y,w,h);
            g.setColor(Color.black);
        }
    }
    public void Wind(Graphics2D g, int x, int y, int w, int h, int f, int n) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < n; j++) {
                g.drawRect((x + 10) + w * j + 8 * j, (y + 5) + h * i + 3 * i, w, h);
            }
        }
    }

    public void Ruf(Graphics2D g, int x, int y, int w, int h, int n) {
        int nw = (w / n) / 2;
        int nh = h / n;

        for (int i = 0; i < n; i++) {
            g.drawLine(x-2+nw*i,y-nh*i,x-2+nw*(i+1),y-nh*i);
            g.drawLine(x-2+nw*(i+1),y-nh*i,x-2+nw*(i+1),y-nh*(i+1));
        }
        for (int i = 0; i < n; i++) {
            g.drawLine(x-2+w/2-3+nw*i,y-h+3+nh*i,x-2+w/2-3+nw*(i+1),y-h+3+nh*i);
            g.drawLine(x-2+w/2-3+nw*(i+1),y-h+3+nh*i,x-2+w/2-3+nw*(i+1),y-h+3+nh*(i+1));
        }


    }
}
