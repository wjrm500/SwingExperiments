import javax.swing.*;
import java.awt.event.*;

public class SwingApp2 implements ActionListener {
    private JButton button;
    private static final String TEXT_A = "Text A";
    private static final String TEXT_B = "Text B";
    private String buttonText = TEXT_A;

    public static void main(String[] args) {
        SwingApp2 app = new SwingApp2();
        app.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton(buttonText);
        button.addActionListener(this);
        frame.add(button); // Is there any need for frame.getContentPane().add(x) ?
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void switchState() {
        switch (buttonText) {
            case TEXT_A:
                buttonText = TEXT_B;
                break;
            case TEXT_B:
                buttonText = TEXT_A;
                break;
        }
    }

    public void actionPerformed(ActionEvent event) {
        switchState();
        button.setText(buttonText);
    }
}
