import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TextDateiSchreibenOutputStreamWriter {
    public static void main(String[] args) {
        String str = "\nText1\nTest2";

        try {
            File datei = new File("datei2.txt");
            FileOutputStream fos = new FileOutputStream(datei);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            for (int i = 0; i < 10; i++){
                osw.write("Zeile " + String.valueOf(i) + "\n");
            }
            osw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
