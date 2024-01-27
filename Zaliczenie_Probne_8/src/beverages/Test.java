package beverages;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<BeverageItem> arr = new ArrayList<>();
        arr.add(new BeverageItem("Nazwa", 10, 15));
        arr.add(new BeverageItem("Imie", 12, 10));
        arr.add(new BeverageItem("Inna", 8, 18));
        arr.add(new BeverageItem("Jeszcze inne", 1, 2));

        Collections.sort(arr);

        for(var elArr: arr) {
            System.out.println(elArr.getName() + " " + elArr.getSugarContent());
        }

    }
}
