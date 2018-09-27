import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise10 {

    public static void mainDraw(Graphics graphics){
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        rectangle(graphics, 50);
    }

    public static void rectangle(Graphics graphics, int size) {
        for (int i = 0; i < WIDTH; i += 80) {
            int red = (int)(Math.random() * 255-0 +1);
            int green = (int)(Math.random() * 255-0 +1);
            int blue = (int)(Math.random() * 255-0 +1);
            graphics.setColor(new Color(red, green, blue));
            graphics.fillRect(WIDTH - i/2,WIDTH - i/2, WIDTH - i/2,HEIGHT - i/2);
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
