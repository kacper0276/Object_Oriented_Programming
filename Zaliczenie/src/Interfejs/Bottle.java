package Interfejs;

public class Bottle {
    private Drinkable drinkable;

    public Bottle(Drinkable drinkable) {
        this.drinkable = drinkable;
    }

    public void haveADrink() {
        drinkable.drink();
    }
}
