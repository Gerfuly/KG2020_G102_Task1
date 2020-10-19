package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import java.awt.*;

public class Clouds {
    public void Cloud(Graphics2D g, int x, int y, int n){
        g.setColor(Color.white);
        for(int i = 0; i<n;i++){
            g.fillOval(x+25*i,y,50,50);
        }
        g.fillRect(x+25,y+25,25*(n-1),25);
    }
}
