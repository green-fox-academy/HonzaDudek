import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal5 {

    public static void mainDraw(Graphics graphics) {

//    drawOneHexagon(graphics, WIDTH/2, HEIGHT/2, 150);
//    drawOneHexagon(graphics, WIDTH/2 - 50, HEIGHT/2 + 86, 50) ;
//    drawOneHexagon(graphics, WIDTH/2 - 50, HEIGHT/2 - 86, 50) ;
//    drawOneHexagon(graphics, WIDTH/2 + 50, HEIGHT/2 + 86, 50) ;
//    drawOneHexagon(graphics, WIDTH/2 + 50, HEIGHT/2 - 86, 50) ;
//    drawOneHexagon(graphics, WIDTH/2 - 100, HEIGHT/2, 50) ;
//    drawOneHexagon(graphics, WIDTH/2 + 100, HEIGHT/2, 50) ;

        drawFractal(graphics, WIDTH/2, HEIGHT/2, 200);


    }


    public static void drawFractal(Graphics graphics, int x, int y, int size) {
        drawOneHexagon(graphics, x, y, size);
        if (size > 20) {
            drawFractal(graphics, x - size/3, (int)(y + size*0.57), size/3) ;
            drawFractal(graphics, x - size/3, (int)(y - size*0.57), size/3) ;
            drawFractal(graphics, x + size/3, (int)(y + size*0.57), size/3) ;
            drawFractal(graphics, x + size/3, (int)(y - size*0.57), size/3) ;
            drawFractal(graphics, (int)(x - size*0.66), y, size/3) ;
            drawFractal(graphics, (int)(x + size*0.66), y, size/3) ;
        }

    }

    public static void drawOneHexagon(Graphics graphics, int x, int y, int size) {
        graphics.drawLine( (x - size / 2), (int) (y - size * 0.866), x + size / 2, (int) (y - size * 0.866));
        graphics.drawLine( (x + size / 2),(int)( y - size * 0.866),x + size,  y);
        graphics.drawLine( (x + size    ), y, x + size / 2,(int)( y + size * 0.866));
        graphics.drawLine( (x + size / 2),(int)( y + size * 0.866),x - size / 2, (int) (y + size * 0.866));
        graphics.drawLine( (x - size / 2),(int)( y + size * 0.866),x - size, y);
        graphics.drawLine( (x - size    ),y, x - size / 2,(int)( y - size * 0.866));
    }


    public static void drawCircle(Graphics graphics, int x, int y, int radius) {
        graphics.drawOval(x - radius / 2, y - radius / 2, radius, radius);
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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
