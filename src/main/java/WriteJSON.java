import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) throws IOException {
        JSONObject j = new JSONObject();
        j.put("name","mike");
        j.put("age", 22);
        JSONArray prevJobs = new JSONArray();
        prevJobs.put("student");
        prevJobs.put("TA");
        prevJobs.put("Teacher");
        j.put("previous Jobs", prevJobs);

        String fileName = "mikeProfile";

        try(FileWriter file = new FileWriter(fileName)){
            file.write(j.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
