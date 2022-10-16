package Bestellverwaltung;

public class Bestellung {

    String nummer;
    Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public void printBestellung() {
        for (Bestellzeile b : this.zeilen) {
            System.out.println("Name: " + b.getName() + " | Anzahl :" + b.getMenge() + " | Preis/Einheit: " + b.getPreis());
        }
    }

    public double getKosten() {
        double total = 0.0;
        for (Bestellzeile b : this.zeilen) {
            total += b.getKosten();
        }
        return total;
    }
}
