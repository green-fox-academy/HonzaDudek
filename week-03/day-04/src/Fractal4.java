import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal4 {

    public static void mainDraw(Graphics graphics) {
        drawFractal(graphics, WIDTH / 2, HEIGHT / 2, 300);
    }


    public static void drawFractal(Graphics graphics, double x, double y, int size) {
        drawCircle(graphics, x, y, size);
        if (size > 40) {
            drawFractal(graphics, (x - size * 0.35 / 2), (y + size * 0.35 / 2), size / 2);
            drawFractal(graphics, (x + size * 0.35 / 2), (y + size * 0.35 / 2), size / 2);
            drawFractal(graphics, x, y - size / 4, size / 2);
        }
    }


    public static void drawCircle(Graphics graphics, double x, double y, int radius) {
        graphics.drawOval((int) (x - radius / 2), (int) (y - radius / 2), radius, radius);
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