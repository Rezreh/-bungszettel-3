public class Main {
    public static void main(String[] args) {

        Zutat[] ingridients = new Zutat[4];
        ingridients[0] = new Zutat("Nudeln in Gramm", 500);
        ingridients[1] = new Zutat("Tomatensoße in Gramm", 250);
        ingridients[2] = new Zutat("Prisen Salz", 2);
        ingridients[3] = new Zutat("Zwiebeln", 2);
        Rezept recepe = new Rezept("Thunfischpasta", 4, ingridients);

        recepe.printRecipe();
        recepe.adjust(2).printRecipe();
    }
}