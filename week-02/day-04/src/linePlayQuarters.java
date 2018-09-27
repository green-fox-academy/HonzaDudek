import java.awt.*;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlayQuarters {
    public static void mainDraw(Graphics graphics){


        for (int k = 0; k < 4; k++) {
            double width = WIDTH;

            for (int i = 0; i < width/2; i+=20) {
                for (int j = 1; j < width-i; j *= 2) {
                    drawLine.linePlay(graphics, i, i,20,2);
                }
            }
            width += width;
        }
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
        jFrame.setBackground(Color.WHITE);
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

