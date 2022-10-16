package Bestellverwaltung;

public class Bestellzeile {

    private int menge;
    private int preis;
    private String Name;

    public Bestellzeile(int menge, int preis, String name) {
        this.menge = menge;
        this.preis = preis;
        Name = name;
    }

    public int getMenge() {
        return menge;
    }

    public int getPreis() {
        return preis;
    }

    public String getName() {
        return Name;
    }

    public double getKosten() {
        return (this.menge * 1.0 * this.preis * 1.0);
    }
}
