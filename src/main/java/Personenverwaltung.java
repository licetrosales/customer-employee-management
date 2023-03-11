import java.util.Scanner;

public class Personenverwaltung {
    // Einlesen der PErsonendaten
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("New Person erfassen");
        System.out.println("Bitte geben Sie den Vornamen der Person ein:");
        String vorname = scanner.next();

        System.out.println("Bitte geben Si den Nachnamen der Person ein:");
        String nachname = scanner.next();

        System.out.println("Bitte geben Sie die Straße an, inder die PErson wohnt:");
        String strasse = scanner.next();

        System.out.println("Bitte geben Sie die Hausnummer an, in der die Person wohnt:");
        int hausnummer = Integer.valueOf(scanner.next());

        System.out.println("Bitte geben Sie die PLZ ein, and der die Person wohnt:");
        String plz = scanner.next();

        System.out.println("Bitte geben Sie den Ort ein, an der die Person wohnt:");
        String ort = scanner.next();
    }

}
