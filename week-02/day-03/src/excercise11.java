import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise11 {

    public static void mainDraw(Graphics graphics){
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        rectangle(graphics, 10);
    }

    public static void rectangle(Graphics graphics, int size) {
        graphics.setColor(Color.MAGENTA);
        for (int i = 0; i < 200; i += size) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(i,i,size,size);

            graphics.setColor(Color.BLACK);
            graphics.drawLine(i,i,i+size,i);
            graphics.drawLine(i+size,i,i+size,i+size);
            graphics.drawLine(i+size, i+size,i, i+size);
            graphics.drawLine(i,i+size, i,i);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
