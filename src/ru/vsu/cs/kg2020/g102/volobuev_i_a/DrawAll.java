package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;

public class DrawAll extends JFrame {
    public void Always(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;


        gr.setColor(Color.cyan);
        gr.fillRect(0, 0, 1200, 800);
        gr.setColor(Color.getHSBColor(22, 30, 64));
        Polygon r1 = new Polygon();
        r1.addPoint(200, 450);
        r1.addPoint(300, 400);
        r1.addPoint(500, 400);
        r1.addPoint(500, 450);
        gr.fillPolygon(r1);
        Polygon r2 = new Polygon();
        r2.addPoint(700, 450);
        r2.addPoint(700, 400);
        r2.addPoint(900, 400);
        r2.addPoint(1000, 450);
        gr.fillPolygon(r2);
    }
}
