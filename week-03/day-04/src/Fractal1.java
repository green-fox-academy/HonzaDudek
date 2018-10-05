import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal1 {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.

//        graphics.drawRect(WIDTH/3, 0, WIDTH/3, HEIGHT);
//        graphics.drawRect(0, HEIGHT/3, WIDTH, HEIGHT/3);
//
//        graphics.drawRect(WIDTH/3 + WIDTH/9 , 0, WIDTH/9, HEIGHT / 3);
//        graphics.drawRect(WIDTH / 3, HEIGHT/9 , WIDTH/3, HEIGHT/9);
//
//        graphics.drawRect(WIDTH/3 + WIDTH/9 + WIDTH/27 , 0, WIDTH/27, HEIGHT / 9);
//        graphics.drawRect(WIDTH / 3 + WIDTH / 9, HEIGHT/27 , WIDTH/9, HEIGHT/27);


        drawCross(graphics, 0, 0, WIDTH);
//        drawCross(graphics, WIDTH / 3, 0, WIDTH / 3);

//        System.out.println(drawFractal(graphics, WIDTH/3, 0, WIDTH/3, HEIGHT, 10, 1));

    }

//    public static int drawFractal(Graphics graphics, int x, int y, int size, int n, int i) {
//        if (n == 0) {
//            return 1;
//        } else {
////            System.out.println(n);
//            System.out.println(x);
//            System.out.println(i);
//            graphics.drawRect(x, y, WIDTH / (i * 3), HEIGHT / i);
//            return drawFractal(graphics, x + WIDTH / i, y, WIDTH / i, HEIGHT / i, n - 1, i * 3);
//
//        }
//    }

    static void drawCross(Graphics graphics, int x, int y, int size) {
        graphics.drawRect(x + size / 3, y, size / 3, size);
        graphics.drawRect(x, y + size / 3, size, size / 3);
        if (size > 1) {
            drawCross(graphics, x + size / 3, y, size / 3);
            drawCross(graphics, x, y + size/3, size/3);
            drawCross(graphics, size /3 + size/3 + x,y + size/3, size / 3 );
            drawCross(graphics, x + size / 3 ,y + size/3 + size / 3, size / 3 );
        }
    }

    public static void drawSquare(Graphics graphics, int x, int y, int size) {

        graphics.drawRect(x, y, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setBackground(Color.YELLOW);

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

