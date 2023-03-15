

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonParser {
    public static void main(String[] args) {
        try{
            String text = new String(Files.readAllBytes(Paths.get("/personen.json")), StandardCharsets.UTF_8);
            JSONObject json = new JSONObject(text);
            JSONArray personen = json.getJSONArray("personen");
            for(int i=0; i< personen.length();i++){
                JSONObject person = personen.getJSONObject(i);
                String nachname = person.getString("nachname");
                System.out.println(nachname);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
