import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
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

                        TableModel dataModel = new AbstractTableModel() {
                            @Override
                            public int getRowCount() {
                                return personenListe.size();
                            }

                            @Override
                            public int getColumnCount() {
                                return 6;
                            }

                            @Override
                            public Object getValueAt(int row, int col) {
                                Person p = personenListe.get(row);
                                String cell = "";
                                switch (col) {
                                    case 0:
                                        cell = p.getVorname();
                                        break;
                                    case 1:
                                        cell = p.getNachname();
                                        break;
                                    case 2:
                                        cell = p.getAdresse().getStrasse();
                                        break;
                                    case 3:
                                        cell = String.valueOf(p.getAdresse().getHausnummer());
                                        break;
                                    case 4:
                                        cell = p.getAdresse().getPlz();
                                        break;
                                    case 5:
                                        cell = p.getAdresse().getOrt();
                                        break;
                                }

                                return cell;
                            }
                        };
                        f.add(button, BorderLayout.PAGE_START);
                        JTable table = new JTable(dataModel);
                        ((AbstractTableModel) dataModel).fireTableDataChanged();
                        f.add(table, BorderLayout.CENTER);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    //System.out.println(fc.getSelectedFile().getAbsolutePath());
                }
            }
        });





        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
