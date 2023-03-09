import java.util.Scanner;

public class Nutzereingabe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Namen eingeben");

        String name = scanner.next();

        System.out.println("Hallo " + name);


    }
}
