import javax.swing.*;
import java.awt.*;

public class BLayout {
    public static void main(String[] args) {
        Frame f = new JFrame();
        f.setSize(300,200);
        f.setLayout(new BorderLayout());

        JButton button = new JButton("B1");
        f.add(button, BorderLayout.PAGE_START);

        JButton button2 = new JButton("B2");
        f.add(button2, BorderLayout.LINE_START);

        JButton button3 = new JButton("B3");
        f.add(button3, BorderLayout.CENTER);

        JButton button4 =new JButton("B4");
        f.add(button4, BorderLayout.LINE_END);

        JButton button5 =new JButton("B5");
        f.add(button5, BorderLayout.PAGE_END);
        f.setVisible(true);
    }
}
