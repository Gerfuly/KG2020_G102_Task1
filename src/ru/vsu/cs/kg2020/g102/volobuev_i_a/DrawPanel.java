package ru.vsu.cs.kg2020.g102.volobuev_i_a;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        //gr.setColor(Color.cyan);
        //gr.fillRect(0, 0, 1200, 800);
        Enter(gr, 465, 600, 50, 200, 5);
        DrawAll dr = new DrawAll();
        dr.Always(gr);
        Build(gr);
        //gr.setColor(Color.green);
        //gr.fillRect(0, 700, 1200, 100);
        Wind(gr, 500, 200, 30, 40, 9, 5);
        Ruf(gr, 517, 0, 150, 100, 5);
        /*
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
        */
        Wind(gr, 210, 455, 30, 40, 3, 7);
        Wind(gr, 710, 455, 30, 40, 3, 7);
        Sun(gr, 1000, 100, 50, 100, 50);
        Text(gr);
        BuiltCon(gr);
        Cloud(gr,150,200,4);
        Cloud(gr,50,100,7);
        Cloud(gr,100,300,2);

    }

    public void Sun(Graphics2D g, int x, int y, int r, int R, int n) {
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
    public void Build(Graphics2D gr){
        gr.setColor(Color.white);
        gr.fillRect(500, 200, 200, 400);
        gr.fillRect(525, 100, 150, 100);
        gr.setColor(Color.gray);
        for(int i = 0; i<5; i++){
            gr.fillRect(550+ i*21,110,16,80);
        }
        gr.setColor(Color.white);
        gr.fillRect(100, 600, 1000, 100);
        gr.fillRect(200, 450, 300, 150);
        gr.fillRect(700, 450, 300, 150);}
    public void BuiltCon(Graphics2D gr){
        gr.setColor(Color.black);
        gr.drawRect(500, 200, 200, 400);
        gr.drawRect(525, 100, 150, 100);
        gr.drawRect(100, 600, 1000, 100);
        gr.drawRect(200, 450, 300, 150);
        gr.drawRect(700, 450, 300, 150);
    }
    public void Text(Graphics2D g){
        Polygon l = new Polygon();
        g.setColor(Color.black);
        l.addPoint(125,625);
        l.addPoint(130,625);
        l.addPoint(130,670);
        l.addPoint(150,670);
        l.addPoint(150,675);
        l.addPoint(125,675);
        g.fillPolygon(l);
        g.fillOval(160,625,25,50);
        g.setColor(Color.white);
        g.fillOval(165,630,15,40);
        g.setColor(Color.black);
        Polygon s = new Polygon();
        s.addPoint(195,625);
        s.addPoint(195, 653);
        s.addPoint(215,653);
        s.addPoint(215,670);
        s.addPoint(195,670);
        s.addPoint(195,675);
        s.addPoint(220,675);
        s.addPoint(220,648);
        s.addPoint(200,648);
        s.addPoint(200,630);
        s.addPoint(220,630);
        s.addPoint(220,625);
        g.fillPolygon(s);
        Polygon a = new Polygon();
        a.addPoint(275,675);
        a.addPoint(280,675);
        a.addPoint(283,660);
        a.addPoint(292,660);
        a.addPoint(295,675);
        a.addPoint(300,675);
        a.addPoint(291,625);
        a.addPoint(284,625);
        g.fillPolygon(a);
        Polygon aa = new Polygon();
        g.setColor(Color.white);
        aa.addPoint(284,655);
        aa.addPoint(291,655);
        aa.addPoint(289,630);
        aa.addPoint(286,630);
        g.fillPolygon(aa);
        g.setColor(Color.black);
        Polygon n = new Polygon();
        n.addPoint(310,625);
        n.addPoint(310,675);
        n.addPoint(315,675);
        n.addPoint(315,635);
        n.addPoint(330,675);
        n.addPoint(335,675);
        n.addPoint(335,625);
        n.addPoint(330,625);
        n.addPoint(330,665);
        n.addPoint(315,625);
        g.fillPolygon(n);
        Polygon G = new Polygon();
        G.addPoint(340,625);
        G.addPoint(340,675);
        G.addPoint(365,675);
        G.addPoint(365,650);
        G.addPoint(350,650);
        G.addPoint(350,655);
        G.addPoint(360,655);
        G.addPoint(360,670);
        G.addPoint(345,670);
        G.addPoint(345,630);
        G.addPoint(365,630);
        G.addPoint(365,625);
        g.fillPolygon(G);
        g.fillRect(375,670,5,5);
        g.setFont(new Font("Times New Roman",Font.BOLD,50));
        g.drawString("CITY HALL",770,670);
    }
    public void Cloud(Graphics2D g,int x,int y,int n){
        g.setColor(Color.white);
        for(int i = 0; i<n;i++){
            g.fillOval(x+25*i,y,50,50);
        }
        g.fillRect(x+25,y+25,25*(n-1),25);
    }
    public void Enter(Graphics2D g, int x, int y, int w, int h, int n) {
        for (int i = 0; i < n; i++) {
            g.setColor(Color.gray);
            g.fillOval(x + i * w + 5 * i, y, w, h);
            g.setColor(Color.black);
        }
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
