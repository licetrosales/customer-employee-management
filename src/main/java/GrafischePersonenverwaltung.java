import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

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
               List<Person> personenListe = new ArrayList<>();
                    try {
                        String text = new String(Files.readAllBytes(fc.getSelectedFile().toPath()), StandardCharsets.UTF_8);
                        JSONObject json = new JSONObject(text);
                        JSONArray personen = json.getJSONArray("personen");

                        for (int i = 0; i < personen.length(); i++){
                            JSONObject person = personen.getJSONObject(i);
                            JSONObject adresse = person.getJSONObject("adresse");
                            personenListe.add(new Person(person.getString("vorname"), person.getString("nachname"), adresse.getString("strasse"), adresse.getInt("hausnummer"), adresse.getString("plz"), adresse.getString("ort")));
                        }


                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    //System.out.println(fc.getSelectedFile().getAbsolutePath());
                }
            }
        });
        f.add(button, BorderLayout.PAGE_START);



        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
