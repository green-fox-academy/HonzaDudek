import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise14 {

    public static void mainDraw(Graphics graphics){
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        lineToCenter(graphics, 20, 50);

    }

    public static void lineToCenter(Graphics graphics, int x, int y) {
        for (int i = 0; i < WIDTH - x; i += 20) {
                graphics.drawLine(x + i,y, WIDTH - i - x, HEIGHT - y);
                graphics.drawLine(x, y + i, WIDTH - x, HEIGHT - i - y);
        }
    }


    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}

