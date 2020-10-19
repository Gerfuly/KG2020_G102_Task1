package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import java.awt.*;

public class Enters {
    int x,y,w,h;

    public Enters(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.gray);
        g.fillOval(x, y, w, h);
        g.setColor(Color.black);
    }
}
