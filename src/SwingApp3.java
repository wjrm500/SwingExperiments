import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApp3 implements ActionListener {
    private JFrame frame = new JFrame();
    private SwingApp3JPanel panel;
    private JButton button;

    public static void main(String[] args) {
        SwingApp3 app = new SwingApp3();
        app.go();
    }

    public void go() {
        panel = new SwingApp3JPanel();
        frame.add(BorderLayout.CENTER, panel);

        button = new JButton("Click me");
        button.addActionListener(this);
        frame.add(BorderLayout.PAGE_END, button);

        setupFrame();
    }

    private void setupFrame() {
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
