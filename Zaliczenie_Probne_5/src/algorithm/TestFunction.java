package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestFunction {
    public static <T> void clearIfContains(Collection<T> collection, T el) {
        if(collection == null) {
            throw new IllegalArgumentException("Błąd");
        }

        if(collection.contains(el)) {
            collection.clear();
        }
    }

    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(-13.0);
        System.out.println(set);
        clearIfContains(set, 2.0);
        System.out.println(set);
    }
}
