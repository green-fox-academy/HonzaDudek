import javafx.css.Size;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal1 {

    public static void mainDraw(Graphics graphics) {

        System.out.println(drawFractal1(graphics, 10, 0, 200));

//        drawLines(graphics, WIDTH / 3, 0, WIDTH / 3, HEIGHT);
//        drawLines(graphics, WIDTH - WIDTH / 3, 0, WIDTH - WIDTH / 3, HEIGHT);
//        drawLines(graphics, 0, HEIGHT / 3, WIDTH, HEIGHT / 3);
//        drawLines(graphics, 0, HEIGHT - HEIGHT / 3, WIDTH, HEIGHT - HEIGHT / 3);

        //drawCross(graphics, WIDTH / 2, HEIGHT / 2, 60);

    }

    public static int drawFractal1(Graphics graphics, int n, int i, int size) {
        if (n == 1) {
            return n;
        } else {

            drawCross(graphics, (WIDTH / 2), HEIGHT / 2, size / 3);
            drawCross(graphics, (WIDTH / 2 - size * i), HEIGHT / 2, size / 3);
            drawCross(graphics, (WIDTH / 2 + size * i), HEIGHT / 2, size / 3);
            drawCross(graphics, (WIDTH / 2), (HEIGHT / 2 - size * i), size / 3);
            drawCross(graphics, (WIDTH / 2), (HEIGHT / 2 + size * i), size / 3);

//            drawCross(graphics, (WIDTH / 2), HEIGHT / 2, size / 3);
//            drawCross(graphics, (WIDTH / 2), HEIGHT / 2, size / 3);
//            drawCross(graphics, (WIDTH / 2), HEIGHT / 2, size / 3);
//            drawCross(graphics, (WIDTH / 2), HEIGHT / 2, size / 3);


//            drawLines(graphics, WIDTH / 3 / i, 0, WIDTH / 3 / i, HEIGHT);
//            drawLines(graphics, WIDTH - WIDTH / 3 / i, 0, WIDTH - WIDTH / 3 / i, HEIGHT);
//            drawLines(graphics, 0, HEIGHT / 3 / i, WIDTH, HEIGHT / 3 / i);
//            drawLines(graphics, 0, HEIGHT - HEIGHT/3 / i, WIDTH, HEIGHT - HEIGHT / 3 / i);

//            drawCross(graphics, WIDTH / 2 + size, HEIGHT / 2, size / 2);
//            drawCross(graphics, WIDTH / 2, HEIGHT / 2 - size, size / 2);
//            drawCross(graphics, WIDTH / 2, HEIGHT / 2 + size, size / 2);

            return drawFractal1(graphics, n - 1, i + 1, size / 3);
        }
    }

    public static void drawLines(Graphics graphics, int x1, int y1, int x2, int y2) {
        graphics.drawLine(x1, y1, x2, y2);

    }

    public static void drawCross(Graphics graphics, int x, int y, int size) {
        drawUpperSquare(graphics, x, y, size);
        drawBottomSquare(graphics, x, y, size);
        drawLeftSquare(graphics, x, y, size);
        drawRightSquare(graphics, x, y, size);
    }


    public static void drawUpperSquare(Graphics graphics, int x, int y, int size) {
        graphics.drawLine(x - size, y - size, x - size, y - size * 3);
        graphics.drawLine(x - size, y - size * 3, x + size, y - size * 3);
        graphics.drawLine(x + size, y - size * 3, x + size, y - size);
        graphics.drawLine(x + size, y - size, x - size, y - size);
    }

    public static void drawLeftSquare(Graphics graphics, int x, int y, int size) {
        graphics.drawLine(x - size, y - size, x - size * 3, y - size);
        graphics.drawLine(x - size * 3, y - size, x - size * 3, y + size);
        graphics.drawLine(x - size * 3, y + size, x - size, y + size);
        graphics.drawLine(x - size, y + size, x - size, y - size);
    }

    public static void drawRightSquare(Graphics graphics, int x, int y, int size) {
        graphics.drawLine(x + size, y - size, x + size * 3, y - size);
        graphics.drawLine(x + size * 3, y - size, x + size * 3, y + size);
        graphics.drawLine(x + size * 3, y + size, x + size, y + size);
        graphics.drawLine(x + size, y + size, x + size, y - size);
    }

    public static void drawBottomSquare(Graphics graphics, int x, int y, int size) {
        graphics.drawLine(x - size, y + size, x - size, y + size * 3);
        graphics.drawLine(x - size, y + size * 3, x + size, y + size * 3);
        graphics.drawLine(x + size, y + size * 3, x + size, y + size);
        graphics.drawLine(x + size, y + size, x - size, y + size);
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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