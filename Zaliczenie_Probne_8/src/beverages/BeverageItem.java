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


    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getSugarContent() {
        return sugarContent;
    }
}
