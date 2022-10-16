public class Rezept {

    private String name;
    private int persons;
    private Zutat[] ingredients;

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setIngredients(Zutat[] ingredients) {
        this.ingredients = ingredients;
    }

    public Rezept(String name, int persons, Zutat[] ingredients) {
        this.name = name;
        this.persons = persons;
        this.ingredients = ingredients;
    }

    public void printRecipe() {
        System.out.println("You want to cook = " + name + " for " + persons + " persons");
        for (Zutat z : ingredients) {
            System.out.println("Ingredient = " + z.getName());
            System.out.println("Amount = " + z.getAmount());
        }
    }

    public Rezept adjust(int newAmount) {
        Zutat[] angepasst = new Zutat[this.ingredients.length];
        double ratio = (double) this.persons / (double) newAmount * 1.0;
        for (int i = 0; i < angepasst.length; i++) {
            angepasst[i] = new Zutat(this.ingredients[i].getName(), (int) (this.ingredients[i].getAmount() / ratio));
        }
        return new Rezept(this.name, newAmount, angepasst);
    }

    /*public Rezept adjust(int people) {
        Rezept newRecepie = new Rezept(this.name, this.persons, this.ingredients);
        double ratio = 0;
        int counter = 0;
        if (this.persons == people) {
            printRecipe();
            return newRecepie;
        } else if (this.persons < people && people > 0) {
            ratio = Math.round((persons / people *1.0) * 10.0) / 10.0;
            for (Zutat z : ingredients) {
                newRecepie.ingredients[counter] = new Zutat(this.ingredients[counter].getName(), (int) (z.getAmount() / ratio));
            }
            newRecepie.printRecipe();
            return newRecepie;
        } else if (this.persons > people && people > 0) {
            ratio = Math.round((persons / people*1.0) * 10.0) / 10.0;
            for (Zutat z : ingredients) {
                newRecepie.ingredients[counter] = new Zutat(this.ingredients[counter].getName(), (int) (z.getAmount() / ratio));
            }
            newRecepie.printRecipe();
            return newRecepie;
        } else {
            System.out.println("There seems to be a problems with the amount of people you want to cook for!");
            System.out.println("Please check your input.");
            return newRecepie;
        }
    }*/

 /*   public Rezept adjust(int newAmount) {
        Zutat[] zutaten = this.ingredients;
        for (int i = 0; i < zutaten.length; i++) {
            double interm = (double) this.ingredients[i].getAmount() / (double) this.persons*1.0;
            zutaten[i] = new Zutat(this.ingredients[i].getName(), (int) (interm * newAmount));
        }
        return new Rezept(this.name, newAmount, zutaten);
    }
  */
}
