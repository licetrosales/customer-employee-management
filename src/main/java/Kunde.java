public class Kunde {
    String vorname;
    String nachname;
    Adresse adresse;
    public String ganzerName() {
        return vorname + " " + nachname;
    }
    public Kunde(String vn, String nn, String str, int nummer, String p, String o){
        vorname = vn;
        nachname = nn;
        adresse = new Adresse(str, nummer, p, o);
    }
}
