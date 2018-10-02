import java.awt.*;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawLine {
    public static void mainDraw(Graphics graphics) {


    }

    public static void drawOneLine(Graphics graphics, double x1, double y1, double x2, double y2) {
        graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }

    public static void drawTriangle(Graphics graphics, double x, double y, double size) {
        drawLine.drawOneLine(graphics, x, y, x + size / 2, y + triangleHeight(size));
        drawLine.drawOneLine(graphics, x, y, x - size / 2, y + triangleHeight(size));
        drawLine.drawOneLine(graphics, x - size / 2, y + triangleHeight(size), x + size / 2, y + triangleHeight(size));
    }

    public static void drawOneHexagon(Graphics graphics, double x, double y, double size) {
        drawLine.drawOneLine(graphics, x - size/2, y - size*0.866, x + size/2, y - size*0.866);
        drawLine.drawOneLine(graphics, x + size/2, y - size*0.866, x+size, y);
        drawLine.drawOneLine(graphics, x +size, y , x+size/2, y + size*0.866);
        drawLine.drawOneLine(graphics, x+size/2, y + size*0.866, x - size/2, y + size*0.866);
        drawLine.drawOneLine(graphics, x - size/2, y + size*0.866, x - size, y);
        drawLine.drawOneLine(graphics, x - size, y, x - size/2, y - size*0.866);
    }

    public static double triangleHeight(double size) {
        double triangleHeight = size * Math.sqrt(3) / 2;
        return triangleHeight;
    }

    public static void linePlay(Graphics graphics, int startingPointX, int startingPointY, int spacing, int ratio) {
        for (int i = 0; i < WIDTH/ratio; i += spacing) {
            graphics.setColor(new Color(112, 39, 195));
            drawLine.drawOneLine(graphics, i, 0, WIDTH/ratio, i);

            graphics.setColor(new Color(16, 229, 10));
            drawLine.drawOneLine(graphics, WIDTH/ratio - i, HEIGHT/ratio, 0, HEIGHT/ratio - i);
        }
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
