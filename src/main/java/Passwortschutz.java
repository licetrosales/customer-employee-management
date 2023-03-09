import java.util.Scanner;

public class Passwortschutz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Passwort eingeben:");

        String passwort = scanner.next();

        if (passwort.equals("passwort")) {
            System.out.println("Passwort korrekt");

        } else if (passwort.equals("admin")) {
            System.out.println("Administrator-Passwort korrekt");
        } else {
            System.out.println("Passwort falsch");

        }
    }
}
