package Interfejs;

public class TestDrinkable {
    public static void main(String[] args) {
        Bottle bottleWater = new Bottle(new Water());
        Bottle bottleTea = new Bottle(new Tea());

        bottleWater.haveADrink();
        bottleTea.haveADrink();
    }
}
