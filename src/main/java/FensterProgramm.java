import javax.swing.*;
import java.awt.*;

public class FensterProgramm {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.BLUE);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));

        f.add(textArea);
        f.setVisible(true);



    }
}
