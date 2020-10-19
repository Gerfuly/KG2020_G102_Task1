package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import java.awt.*;

public class Windowes {
    int x,y,w,h;

    public Windowes(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics2D g) {
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.fillRect(x,y, w, h);
        g.setColor(c);
    }
}
