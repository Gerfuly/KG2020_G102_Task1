package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;

public class Sun extends JFrame {
    public void Sun1(Graphics2D g, int x, int y, int r, int R, int n) {
        double da = Math.PI * 2 / n;
        g.setColor(Color.yellow);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
        g.setColor(Color.black);
    }
}
