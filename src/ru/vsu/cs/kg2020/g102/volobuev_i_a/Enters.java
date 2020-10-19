package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import java.awt.*;

public class Enters {
    public void Enter(Graphics2D g, int x, int y, int w, int h) {
        g.setColor(Color.gray);
        g.fillOval(x, y, w, h);
        g.setColor(Color.black);
    }
}
