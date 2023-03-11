public class Mitarbeiter extends Person {
    double gehalt;
    public Mitarbeiter(String vorname, String nachname, String strasse, int hausnummer, String plz, String ort, double gehalt){
        super (vorname, nachname, strasse, hausnummer, plz, ort);
       this.gehalt = gehalt;
    }
}
