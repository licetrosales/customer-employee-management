import org.json.JSONObject;

import java.io.Serializable;

public class Person implements Serializable {
    String vorname;
    String nachname;
    Adresse adresse;

    public String getVorname(){
        return vorname;
    }
    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String ganzerName() {
        return vorname + " " + nachname;
    }
    public Person(String vorname, String nachname, String strasse, int hausnummer, String plz, String ort){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = new Adresse(strasse, hausnummer, plz, ort);
    }
    public String toString(){
      return  this.getVorname() + "," + this.getNachname() + "," + this.getAdresse().strasse + "," +
                this.getAdresse().getHausnummer() + "," + this.getAdresse().getPlz() + "," + this.getAdresse().getOrt();
    }
    public JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("vorname", this.getVorname());
        obj.put("nachname", this.getNachname());

        JSONObject adresse = new JSONObject();
        adresse.put("strasse", this.getAdresse().getStrasse());
        adresse.put("hausnummer", this.getAdresse().getHausnummer());
        adresse.put("plz", this.getAdresse().getPlz());
        adresse.put("ort", this.getAdresse().getOrt());

        obj.put("adresse", adresse);

        return obj;
    }
}
