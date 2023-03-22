import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrafischePersonenverwaltung {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(1024,768);
        f.setLayout(new BorderLayout());

        JButton button = new JButton("Laden");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                final  JFileChooser fc = new JFileChooser();
                int returnVal = fc. showOpenDialog(fc.getParent());

                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println(fc.getSelectedFile().getAbsolutePath());
                }
            }
        });
        f.add(button, BorderLayout.PAGE_START);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
