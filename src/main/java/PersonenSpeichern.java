import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class PersonenSpeichern {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", "Mustermann", "Musterstrasse", 7, "01234", "Musterstadt");
        Person p2 = new Person("Mary", "Musterfrau", "Musterstrasse", 9, "01234", "Musterstadt");
        List<Person> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);

        File datei = new File("personen.csv");
        try {
            FileOutputStream fos = new FileOutputStream(datei);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("voranme,nachname,strasse,hausnummer,plz,ort\n");
            for (Person person : personen) {
                osw.write(person.getVorname() + "," + person.getNachname() + "," + person.getAdresse().strasse + "," +
                        person.getAdresse().getHausnummer() + "," + person.getAdresse().getPlz() + "," + person.getAdresse().getOrt() + "\n");
            }
            osw.close();
        } catch (IOException e) {
            System.out.println("Fehler bei Seichern der Daten.");
            e.printStackTrace();
        }
    }
}


