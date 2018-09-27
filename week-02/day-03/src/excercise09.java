import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise09 {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        rectangle(graphics, 50);
    }

    public static void rectangle(Graphics graphics, int size) {
        for (int i = 0; i < 30; i+=10) {
            graphics.drawRect(WIDTH/2-size/2 + i/2,HEIGHT/2-size/2 + i/2,size - i,size - i);
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
