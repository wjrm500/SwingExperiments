import javax.swing.*;
import java.awt.*;

public class SwingApp3JPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLACK);
        g.fillRect(0, 0, panelWidth, panelHeight);
        Color[] colors = new Color[2];
        for (int i = 0; i < 2; i++) {
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            colors[i] = new Color(red, green, blue);
        }
        int ovalSize = 100;
        int ovalStartX = panelWidth / 2 - ovalSize / 2;
        int ovalStartY = panelHeight / 2 - ovalSize / 2;
        GradientPaint gradientPaint = new GradientPaint(ovalStartX, ovalStartY, colors[0], ovalStartX + ovalSize, ovalStartY + ovalSize, colors[1]);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(ovalStartX, ovalStartY, ovalSize, ovalSize);
    }
}