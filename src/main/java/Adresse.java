public class Adresse {
    String strasse;
    private int hausnummer;
    String plz;
    String ort;
    public Adresse(String strasse, int hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public int getHausnummer(){
        return this.hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setHausnummer(int hausnummer){
        if (hausnummer >= 0){
        this.hausnummer = hausnummer;
        } else {
            this.hausnummer = 0;
        }
    }

}
