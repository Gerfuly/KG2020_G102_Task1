package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import java.awt.*;

public class Windowes {
    public void Wind(Graphics2D g, int x, int y, int w, int h) {
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.fillRect(x,y, w, h);
        g.setColor(c);
    }
}
