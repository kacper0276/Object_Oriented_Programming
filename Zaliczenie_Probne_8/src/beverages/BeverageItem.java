package beverages;

import java.util.ArrayList;
import java.util.Collections;

public class BeverageItem implements Comparable<BeverageItem> {
    private String name;
    private double volume, sugarContent;

    public BeverageItem(String name, double volume, double sugarContent) {
        this.name = name;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    @Override
    public int compareTo(BeverageItem o) {
        return Double.compare(this.sugarContent, o.sugarContent);
    }

    public static void main(String[] args) {
        ArrayList<BeverageItem> arr = new ArrayList<>();
        arr.add(new BeverageItem("Nazwa", 10, 15));
        arr.add(new BeverageItem("Imie", 12, 10));
        arr.add(new BeverageItem("Inna", 8, 18));
        arr.add(new BeverageItem("Jeszcze inne", 1, 2));

        Collections.sort(arr);

        for(var elArr: arr) {
            System.out.println(elArr.name + " " + elArr.sugarContent);
        }

    }


}
