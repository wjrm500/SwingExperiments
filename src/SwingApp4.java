import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp4 {
    JFrame frame = new JFrame();
    JButton leftButton = new JButton("Click me");
    JButton rightButton = new JButton("Click me");
    SwingApp3JPanel leftPanel = new SwingApp3JPanel();
    SwingApp3JPanel rightPanel = new SwingApp3JPanel();

    public static void main(String[] args) {
        SwingApp4 app = new SwingApp4();
        app.go();
    }

    public void go() {
        JPanel topContainer = new JPanel();
        topContainer.setLayout(new GridLayout(1, 2));
        topContainer.add(leftPanel);
        topContainer.add(rightPanel);
        JPanel bottomContainer = new JPanel();
        leftButton.addActionListener(new LeftPanelListener());
        rightButton.addActionListener(new RightPanelListener());
        bottomContainer.setLayout(new GridLayout(1, 2));
        bottomContainer.add(leftButton);
        bottomContainer.add(rightButton);
        frame.add(BorderLayout.CENTER, topContainer);
        frame.add(BorderLayout.PAGE_END, bottomContainer);
        setupFrame();
    }

    private void setupFrame() {
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class LeftPanelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            leftPanel.repaint();
        }
    }

    class RightPanelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rightPanel.repaint();
        }
    }
}
