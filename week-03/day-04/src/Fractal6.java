import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal6 {

    public static void mainDraw(Graphics graphics) {
        drawFractal(graphics, WIDTH / 2, HEIGHT / 2, 200);
    }

    public static void drawFractal(Graphics graphics, int x, int y, int size) {
        drawFilledSquare(graphics, x, y, size);
        if (size > 2) {
            graphics.setColor(new Color(randomColor(),0,0));
            drawFractal(graphics, x - size, y - size, size / 3);
            drawFractal(graphics, x - size, y, size / 3);
            drawFractal(graphics, x - size, y + size, size / 3);
            drawFractal(graphics, x, y + size, size / 3);
            drawFractal(graphics, x + size, y + size, size / 3);
            drawFractal(graphics, x + size, y, size / 3);
            drawFractal(graphics, x + size, y - size, size / 3);
            drawFractal(graphics, x, y - size, size / 3);
        }
    }

    static void drawFilledSquare(Graphics graphics, int x, int y, int size) {
        graphics.fillRect(x - size / 2, y - size / 2, size, size);
    }

    static int randomColor() {
        Random random = new Random();
        int r = 100 + (int)(Math.random()*(150 - 100) +1);
        return r;
    }

    // Don't touch the code below
    static int WIDTH = 750;
    static int HEIGHT = 750;

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
