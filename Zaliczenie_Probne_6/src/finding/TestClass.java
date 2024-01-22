package finding;

import java.util.HashMap;

public class TestClass {
    public static <K, V> V findValueByKey(HashMap<K,V> hashMap, K key) {
        if(hashMap == null || key == null) {
            throw new IllegalArgumentException("HashMapa nie może być pusta");
        }

        return hashMap.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("one", 1);
        sampleMap.put("two", 2);
        sampleMap.put("three", 3);

        String existingKey = "two";
        Integer valueForExistingKey = findValueByKey(sampleMap, existingKey);
        System.out.println("Value for key '" + existingKey + "': " + valueForExistingKey);

        String nonExistingKey = "four";
        Integer valueForNonExistingKey = findValueByKey(sampleMap, nonExistingKey);
        System.out.println("Value for key '" + nonExistingKey + "': " + valueForNonExistingKey);
    }
}
