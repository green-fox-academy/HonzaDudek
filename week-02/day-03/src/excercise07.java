import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise07 {
    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("BLACK", "GREEN", "BLUE", "PURPLE"));

        for (int i = 0; i < 120; i+=30) {
            graphics.setColor(new Color(i,i+10,i+20));
            graphics.fillRect(10, i, 100 + i, 20);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}