package travel;

import java.util.Arrays;

public class TravelItem implements Comparable<TravelItem>{
    private String name;
    private double weight;
    private double volume;

    public TravelItem(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public int compareTo(TravelItem o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {
        TravelItem[] arr = new TravelItem[] {
                new TravelItem("Imie", 5, 1),
                new TravelItem("Inne", 2, 15),
                new TravelItem("Inne imie", 15, 8),
                new TravelItem("Jeszcze inne", 1, 1)
        };

        Arrays.sort(arr);

        for(var el: arr) {
            System.out.println(el.name + "  " + el.weight);
        }
    }
}
