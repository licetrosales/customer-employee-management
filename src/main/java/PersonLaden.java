import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonLaden {
    public static void main(String[] args) throws IOException {
        List<Person> personen = new ArrayList<>();
        File datei = new File("personen.csv");
        try {
            Scanner scanner = new Scanner(datei);
            // Überspringen der ersten Zeile
            if(scanner.hasNextLine()){
                scanner.nextLine();
            }
            while(scanner.hasNextLine()){
                String zeile = scanner.nextLine();
                String[] felder = zeile.split(",");
                if(felder.length != 6) {
                    throw new java.io.IOException("Datei enthält ungültige Daten.");
                }
                personen.add(new Person(felder[0], felder[1], felder[2], Integer.valueOf(felder[3]),felder[4],felder[5]));
            }
        }catch(IOException | NumberFormatException e){
            System.out.println("Fehler bein Laden der Daten.");
            e.printStackTrace();
        }
        System.out.println(personen.get(0));
    }
}
