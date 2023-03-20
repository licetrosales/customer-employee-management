import javax.swing.*;

public class FensterProgramm {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setVisible(true);
        JTextArea textArea = new JTextArea();
        f.add(textArea);
        f.setVisible(true);

    }
}
