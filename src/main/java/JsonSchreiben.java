import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSchreiben {
    public static void main(String[] args) {
        Person p = new Person("Mike", "Mustermann", "Musterstrasse", 7, "01234", "Musterstadt");
        JSONObject obj = new JSONObject(p);

        try {
            FileWriter dateiSchreiber = new FileWriter("person.json");
            BufferedWriter schreiber = new BufferedWriter(dateiSchreiber);
            schreiber.write(obj.toString(4));
            schreiber.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
