package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ClassTest {
    public static <K, V> int countUniqueKeys(HashMap<K, V> hashMap) {
        HashSet<K> uniqueItems = new HashSet<>();

        for (K key : hashMap.keySet()) {
            uniqueItems.add(key);
        }

        return uniqueItems.size();

    }
}
