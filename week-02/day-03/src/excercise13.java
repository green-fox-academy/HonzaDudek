import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class excercise13 {

    public static void mainDraw(Graphics graphics){
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        printRow(graphics, 10);
    }

    public static void printRow(Graphics graphics, int numberOfRows) {
        int size = WIDTH/numberOfRows;
        int row = 0;
        for (int j = 0; j < numberOfRows; j++) {
            for (int i = 0; i < numberOfRows; i++) {
                if (j%2 == 0 && i%2 != 0 || j%2 != 0 && i%2 == 0) {
                    blackBox(graphics, i, row, size);
                }
                else {
                    whiteBox(graphics, i, row, size);
                }
            }
            row += size;
        }
    }

    public static void blackBox(Graphics graphics, int x, int y, int size) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x*size,y,size,size);
    }

    public static void whiteBox(Graphics graphics, int x, int y, int size) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x*size,y,size,size);
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

