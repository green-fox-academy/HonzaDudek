import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawHexagon {
    public static void mainDraw(Graphics graphics) {

        for (int i = 7; i > 0; i--) {
            drawHexagonColumn(graphics, i, 20, 20*i);
        }

    }

    public static void drawHexagonColumn(Graphics graphics, int numberOfHexagons, int sizeOfHexagon, int offset) {
        for (int i = 0; i < numberOfHexagons; i++) {
            drawHexagon(graphics, WIDTH/2 + offset * 1.76, HEIGHT/3 + sizeOfHexagon * i * 1.76, sizeOfHexagon);
        }
    }

//        drawHexagon(graphics, WIDTH/2 - 0 * 1.5, HEIGHT/3 + 0 *  1.75, 20);
//
//                drawHexagon(graphics, WIDTH/2 - 20 * 1.5, HEIGHT/3 + 10 * 1.5 + 0 *  1.75, 20);
//                drawHexagon(graphics, WIDTH/2 + 20 * 1.5, HEIGHT/3 + 10 * 1.5 + 0 *  1.75, 20);
//
//
//                drawHexagon(graphics, WIDTH/2 - 40 * 1.5, HEIGHT/3 + 20 * 1.5 + 20 *  1.75, 20);
//                drawHexagon(graphics, WIDTH/2 + 40 * 1.5, HEIGHT/3 + 20 * 1.5 + 20 *  1.75, 20);




    public static void drawHexagon(Graphics graphics, double x, double y, double size) {
        drawLine.drawOneLine(graphics, x - size/2, y - size*0.866, x + size/2, y - size*0.866);
        drawLine.drawOneLine(graphics, x + size/2, y - size*0.866, x+size, y);
        drawLine.drawOneLine(graphics, x +size, y , x+size/2, y + size*0.866);
        drawLine.drawOneLine(graphics, x+size/2, y + size*0.866, x - size/2, y + size*0.866);
        drawLine.drawOneLine(graphics, x - size/2, y + size*0.866, x - size, y);
        drawLine.drawOneLine(graphics, x - size, y, x - size/2, y - size*0.866);
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
