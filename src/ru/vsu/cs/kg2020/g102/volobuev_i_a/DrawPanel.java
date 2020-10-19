package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class DrawPanel extends JPanel {
    Sun sun = new Sun(1000, 100, 50, 100, 50);



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        DrawAll dr = new DrawAll();
        dr.Always(gr);
        Builder bl = new Builder();
        bl.Build(gr);
        for (int i = 0; i < 5; i++){
            Enters en =new Enters(465+ i * 50 + 5 * i, 600, 50, 200);
            en.draw(gr);
        }
        gr.setColor(Color.green);
        gr.fillRect(0, 700, 1200, 100);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++){
                Windowes wd = new Windowes((500 + 10) + 30 * j + 8 * j, (200 + 5) + 40 * i + 3 * i,30,40);
                wd.draw(gr);
            }
        }
        Ruf(gr, 517, 0, 150, 100, 5);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++){
                Windowes wd = new Windowes((210 + 10) + 30 * j + 8 * j, (455 + 5) + 40 * i + 3 * i,30,40);
                wd.draw(gr);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++){
                Windowes wd = new Windowes((710 + 10) + 30 * j + 8 * j, (455 + 5) + 40 * i + 3 * i,30,40);
                wd.draw(gr);
            }
        }

        sun.draw(gr);
        Clouds cl1 = new Clouds(150,200,4);
        cl1.draw(gr);
        Clouds cl2 = new Clouds(50,100,7);
        Clouds cl3 = new Clouds(100,300,2);
        cl2.draw(gr);
        cl3.draw(gr);

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
