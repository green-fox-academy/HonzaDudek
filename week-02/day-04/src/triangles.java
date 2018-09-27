import java.awt.*;


import javax.swing.*;

import java.awt.*;
import java.rmi.MarshalException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangles {
    public static void mainDraw(Graphics graphics) {

        for (int i=0; i <= HEIGHT - HEIGHT/6 ; i += 20) {
            for (int j = 0; j < i ; j += 20) {
                    drawLine.drawTriangle(graphics, WIDTH/2 + j - i/2 , HEIGHT/3+i*0.866, 20);
            }
        }

    }

    public static void drawTriangle(Graphics graphics, double x, double y, double size) {
        drawLine.drawOneLine(graphics, x, y, x + size / 2, y + triangleHeight(size));
        drawLine.drawOneLine(graphics, x, y, x - size / 2, y + triangleHeight(size));
        drawLine.drawOneLine(graphics, x - size / 2, y + triangleHeight(size), x + size / 2, y + triangleHeight(size));
    }

    public static double triangleHeight(double size) {
        double triangleHeight = size * Math.sqrt(3) / 2;
        return triangleHeight;
    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setBackground(Color.WHITE);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
