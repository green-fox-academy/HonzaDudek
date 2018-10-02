import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawHexagon {
    public static void mainDraw(Graphics graphics) {

        drawBigHexagon(graphics, 7, 20, 20);

    }

    public static void drawHexagonColumn(Graphics graphics, int numberOfHexagons, int sizeOfHexagon, int offset) {
            for (int i = numberOfHexagons; i > 0; i--) {
                drawLine.drawOneHexagon(graphics, WIDTH/2 , HEIGHT/10 +  i * offset * 1.7, sizeOfHexagon);
            }
        }

    public static void drawHexagonHalfs(Graphics graphics, int numberOfHexagons, int sizeOfHexagon, int offset) {
        for (int j = 1; j <= numberOfHexagons - 1; j++ ) {
            for (int i = numberOfHexagons; i > 0; i--) {
                drawLine.drawOneHexagon(graphics, WIDTH/2 + j * offset * 1.5, HEIGHT/10 +  i * offset * 1.7 + j * offset * 0.866, sizeOfHexagon);
                drawLine.drawOneHexagon(graphics, WIDTH/2 - j * offset * 1.5, HEIGHT/10 +  i * offset * 1.7 + j * offset * 0.866, sizeOfHexagon);
            }
            numberOfHexagons -= 1;
        }
    }

    public static void  drawBigHexagon(Graphics graphics, int numberOfHexagons, int sizeOfHexagon, int offset) {
        drawHexagonColumn(graphics, numberOfHexagons,sizeOfHexagon, offset);
        drawHexagonHalfs(graphics, numberOfHexagons - 1,sizeOfHexagon, offset);
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
