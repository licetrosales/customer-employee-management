import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextdateiSchreiben {
    public static void main(String[] args) {
        String str = "\nText1\nTest2";

        try{
            FileWriter dateiSchreiber = new FileWriter("datei.txt", true);
            BufferedWriter schreiber = new BufferedWriter(dateiSchreiber);
            schreiber.write(str);
            schreiber.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
