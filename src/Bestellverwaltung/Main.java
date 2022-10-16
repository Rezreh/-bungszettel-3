package Bestellverwaltung;

public class Main {
    public static void main(String[] args) {

        Bestellzeile[] zeilen = new Bestellzeile[4];

        zeilen[0] = new Bestellzeile(5, 36, "Wilde Hilde im Hallenbad");
        zeilen[1] = new Bestellzeile(7, 78, "Tom Turbo und das Turbobier");
        zeilen[2] = new Bestellzeile(45, 19, "Saufen ohne Kater, Das Erfolgsrezept");
        zeilen[3] = new Bestellzeile(336, 23, "Error 404 Der Wohl bekannteste Fehler der Welt");

        Bestellung buchklub = new Bestellung("2265", zeilen);

        buchklub.printBestellung();
        System.out.println("Die Gesamtkosten der Bestellung betragen: " + buchklub.getKosten());

    }

}

