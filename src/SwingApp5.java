import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class SwingApp5 {
    private JFrame frame = new JFrame();
    private int x = 150;
    private int y = 150;
    private boolean positiveDirection = true;
    public static void main(String[] args) {
        SwingApp5 app = new SwingApp5();
        app.go();
    }

    public void go() {
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(BorderLayout.CENTER, new MyPanel());
        while (true) {
            x += positiveDirection ? 1 : -1;
            y += positiveDirection ? 1 : -1;
            frame.repaint();
            if (x == 30 || x == 240) {
                positiveDirection = !positiveDirection;
            }
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillOval(x - 15, y - 15, 30, 30);
        }
    }
}