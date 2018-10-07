import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal3 {

    public static void mainDraw(Graphics graphics) {
        drawFractal(graphics, WIDTH/2, 0, 150);
    }


    public static void drawFractal(Graphics graphics, double x, double y, int size) {
        drawTriangle(graphics, x, y, size);
        if (size > 10) {
            System.out.println(triangleHeight(size));
            drawFractal(graphics, x, (y + triangleHeight(size)), size/2);
            drawFractal(graphics, (x - size/2), y, size/2);
            drawFractal(graphics, (x + size/2), y, size/2);
        }

    }


    public static void drawTriangle(Graphics graphics, double x, double y, double size) {
        graphics.drawLine((int)x, (int)y, (int)(x + size / 2), (int)(y + triangleHeight(size)));
        graphics.drawLine((int)x, (int)y, (int)(x - size / 2), (int)(y + triangleHeight(size)));
        graphics.drawLine((int)(x - size / 2),(int)( y + triangleHeight(size)), (int)(x + size / 2),(int) (y + triangleHeight(size)));
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



