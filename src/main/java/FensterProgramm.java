import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


        JButton button = new JButton("Speichern");
        f.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button gedrueckt!");
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
    }
}
