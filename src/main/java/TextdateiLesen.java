import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextdateiLesen {
    public static void main(String[] args) {
        try {
            File datei = new File ("datei.txt");
            Scanner scanner = new Scanner(datei);
            while (scanner.hasNextLine()){
                String zeile = scanner.nextLine();
                System.out.println(zeile);
            }
            scanner.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
