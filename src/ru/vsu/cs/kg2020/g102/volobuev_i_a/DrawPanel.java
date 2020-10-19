package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        DrawAll dr = new DrawAll();
        dr.Always(gr);
        Builder bl = new Builder();
        bl.Build(gr);
        Enters en =new Enters();
        for (int i = 0; i < 5; i++){
            en.Enter(gr, 465+ i * 50 + 5 * i, 600, 50, 200);
        }
        gr.setColor(Color.green);
        gr.fillRect(0, 700, 1200, 100);
        Windowes wd = new Windowes();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++){
                wd.Wind(gr,(500 + 10) + 30 * j + 8 * j, (200 + 5) + 40 * i + 3 * i,30,40);
            }
        }
        Ruf(gr, 517, 0, 150, 100, 5);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++){
                wd.Wind(gr,(210 + 10) + 30 * j + 8 * j, (455 + 5) + 40 * i + 3 * i,30,40);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++){
                wd.Wind(gr,(710 + 10) + 30 * j + 8 * j, (455 + 5) + 40 * i + 3 * i,30,40);
            }
        }
        Sun sun = new Sun();
        sun.Sun1(gr, 1000, 100, 50, 100, 50);
        Clouds cl = new Clouds();
        cl.Cloud(gr,150,200,4);
        cl.Cloud(gr,50,100,7);
        cl.Cloud(gr,100,300,2);

    }

    public void Wind(Graphics2D g, int x, int y, int w, int h, int f, int n) {
        g.setColor(Color.blue);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < n; j++) {
                g.fillRect((x + 10) + w * j + 8 * j, (y + 5) + h * i + 3 * i, w, h);
            }
        }
    }

    public void Ruf(Graphics2D g, int x, int y, int w, int h, int n) {
        g.setColor(Color.gray);
        int ww = w / 2;
        int wn = ww / n;
        int hn = h / n;
        Polygon p = new Polygon();
        for (int i = 0; i < n; i++) {
            p.addPoint(x + wn * i, y + h - hn * i);
            p.addPoint(x + wn * i + wn, y + h - hn * i);
            p.addPoint(x + wn * i + wn, y + h - hn * i - hn);
        }
        for (int i = 0; i < n; i++) {
            p.addPoint(x + ww + wn * i, y + hn * i);
            p.addPoint(x+ ww + wn * i + wn, y + hn * i);
            p.addPoint(x + ww+ wn * i + wn, y + hn * i + hn);
        }

        g.fillPolygon(p);
    }
}
