import java.awt.*;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class linePlay {
        public static void mainDraw(Graphics graphics){

            for (int i = 0; i < WIDTH; i+=20) {
                graphics.setColor(new Color(112,39,195));
                drawLine.drawOneLine(graphics,i,0, WIDTH,i);

                graphics.setColor(new Color(16,229,10));
                drawLine.drawOneLine(graphics,WIDTH-i,HEIGHT, 0,HEIGHT - i);
            }
        }

        public static void linePlay(Graphics graphics, int spacing, int color) {

        }

//        public static void createQuarter(Graphics graphics, int spacing, String position) {
//            if (position.toLowerCase() == "top-right") {
//                for (spacing = 0; spacing < WIDTH; spacing+=20) {
//                    drawLine.drawOneLine(graphics,WIDTH-spacing,HEIGHT, 0,HEIGHT - spacing);
//                }
//            } else if (position.toLowerCase() == "top-left") {
//                for (spacing = 0; spacing < WIDTH; spacing +=20) {
//                    drawLine.drawOneLine(graphics, 0, HEIGHT - spacing, WIDTH - spacing, HEIGHT);
//                }
//            }
//            else if (position.toLowerCase() == "bottom-right") {
//                for (spacing = 0; spacing < WIDTH; spacing+=20) {
//                    drawLine.drawOneLine(graphics,WIDTH-spacing,HEIGHT, 0,HEIGHT - spacing);
//                }
//            }
//             else if (position.toLowerCase() == "bottom-left") {
//                for (spacing = 0; spacing < WIDTH; spacing+=20) {
//                    drawLine.drawOneLine(graphics,WIDTH-spacing,HEIGHT, 0,HEIGHT - spacing);
//                }
//             }
//        }



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
