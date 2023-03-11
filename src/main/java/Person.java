public class Person {
    String vorname;
    String nachname;
    Adresse adresse;
    public String ganzerName() {
        return vorname + " " + nachname;
    }
    public Person(String vorname, String nachname, String strasse, int hausnummer, String plz, String ort){
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = new Adresse(strasse, hausnummer, plz, ort);
    }
}
