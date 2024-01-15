package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassTest {
    public static <K, V> int countUniqueKeys(HashMap<K, V> hashMap) {
        ArrayList<K> arrayList = new ArrayList<>();

        for(var el: hashMap.keySet()) {
            System.out.println("Klucz: " + el + " Wartość: " + hashMap.get(el));
            if(!arrayList.contains(el)) {
                arrayList.add(el);
            }
        }

        //return arrayList.size();

        // lub
        return hashMap.keySet().size();

    }
}
