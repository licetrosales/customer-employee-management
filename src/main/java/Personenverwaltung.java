import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Personenverwaltung {
    // Einlesen der Personendaten
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personen = new LinkedList<>();
        boolean erfassen = true;

        while ( erfassen) {

            System.out.println("Neue Person erfassen");
            System.out.println("Bitte geben Sie den Vornamen der Person ein:");
            String vorname = scanner.next();

            System.out.println("Bitte geben Sie den Nachnamen der Person ein:");
            String nachname = scanner.next();

            System.out.println("Bitte geben Sie die Straße an, in der die Person wohnt:");
            String strasse = scanner.next();

            System.out.println("Bitte geben Sie die Hausnummer an, in der die Person wohnt:");
            int hausnummer = Integer.valueOf(scanner.next());

            System.out.println("Bitte geben Sie die PLZ ein, an der die Person wohnt:");
            String plz = scanner.next();

            System.out.println("Bitte geben Sie den Ort ein, an dem die Person wohnt:");
            String ort = scanner.next();

            System.out.println("Ist die Person ein Mitarbeiter? ja/ nein");
            String mitarbeiter = scanner.next();

            if (mitarbeiter.equals("ja")) {
                System.out.println("Bitte geben Sie das Gehalt der Person ein:");
                double gehalt = Double.valueOf(scanner.next());
                Mitarbeiter m = new Mitarbeiter(vorname, nachname, strasse, hausnummer, plz, ort, gehalt);
                personen.add(m);
                System.out.println(m.ganzerName());
            } else {
                Kunde k = new Kunde(vorname, nachname, strasse, hausnummer, plz, ort);
                personen.add(k);
                System.out.println(k.ganzerName());
            }

            System.out.println("Datenerfassung abschlossen. Möchten Sie fortfahren? ja/ nein");
            String fortfahren = scanner.next();
            if(fortfahren.equals("nein")){
                erfassen = false;
            }
        }
    }

}
