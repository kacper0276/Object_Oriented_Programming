package travel;

import java.util.Arrays;

public class TestTravel {
    public static void main(String[] args) {
        TravelItem[] arr = new TravelItem[] {
                new TravelItem("Imie", 5, 1),
                new TravelItem("Inne", 2, 15),
                new TravelItem("Inne imie", 15, 8),
                new TravelItem("Jeszcze inne", 1, 1)
        };

        Arrays.sort(arr);

        for(var el: arr) {
            System.out.println(el.getName() + "  " + el.getWeight());
        }
    }
}
