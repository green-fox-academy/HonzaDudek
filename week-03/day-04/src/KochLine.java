import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {

    public static void mainDraw(Graphics graphics) {

        //drawLine(graphics, WIDTH/3, HEIGHT/2, 200);

    }


    public static void drawFractal(Graphics graphics, int x, int y, int size) {
//        drawLine(graphics,x, y, size);
//        if (size > 1) {
//            drawFractal();
//        }
    }

    public static void drawLine(Graphics graphics, int x, int y, int size, double angle) {
//        graphics.drawLine(x, y, x + size/3, y), angle;
//        graphics.drawLine(x + 2*size/3, y, x + size, y, angle);
//        graphics.drawLine(x+size/3, y, x+size/2, (int)(y - size*0.75), angle);
//        graphics.drawLine(x + 2*size/3, y, x+size/2, (int)(y - size*0.75), angle);


//        if (size > 1) {
////        graphics.setColor(Color.WHITE);
////        graphics.drawLine((int)(x + size/3), y, x + 2*size/3, y);
//        graphics.setColor((Color.BLACK));
//        graphics.drawLine(x+size/3, y, x+size/2, (int)(y - size*0.75));
//        graphics.drawLine(x + 2*size/3, y, x+size/2, (int)(y - size*0.75));
//        size = size/2;
//        }



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