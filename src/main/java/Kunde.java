public class Kunde {
    String vorname;
    String nachname;
    String strasse;
    int hausnummer;
    String plz;
    String ort;
    public String ganzerName() {
        return vorname + " " + nachname;
    }
    public Kunde(String vn, String nn, String str, int nummer, String p, String o){
        vorname = vn;
        nachname = nn;
        strasse = str;
        hausnummer = nummer;
        plz = p;
        ort = o;
    }


}
