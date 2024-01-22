package algorithm;

import java.util.ArrayList;
import java.util.Collection;

public class TestFunction {
    public static <T> void clearIfContains(Collection<T> collection, T el) {
        if(collection == null) {
            return;
        }

        if(collection.contains(el)) {
            collection.clear();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        ArrayList<String> nullList = null;
        clearIfContains(nullList, "aaa");

        System.out.println("Before clear: " + stringList);

        clearIfContains(stringList, "Banana");

        System.out.println("After clear: " + stringList);
    }
}
