package Rezeptverwaltung;

public class Zutat {

    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Zutat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

}
