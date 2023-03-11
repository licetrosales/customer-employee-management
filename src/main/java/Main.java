public class Main {
    public static void main(String[] args) {

            Kunde k1 = new Kunde ("Mike", "Mustermann", "Musterstrasse", 7, "01234", "Musterstadt");
            Kunde k2 = new Kunde ("Mary", "Musterfrau", "Musterstrasse", 9, "01234", "Musterstadt");
            System.out.println(k1.vorname);
            System.out.println(k1.ganzerName());
        //System.out.println(k2.adresse.hausnummer);
        System.out.println(k2.adresse.getHausnummer());
        k2.adresse.setHausnummer(11);
        System.out.println(k2.adresse.getHausnummer());

    }
}
