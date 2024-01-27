package algorithm;

import java.util.TreeMap;

public class Klasa {
    public static <K, V> String mapToString(TreeMap<K, V> treeMap) {
        String result = "";

        for(K key: treeMap.keySet()) {
            result += "klucz: " + key + " wartość: " + treeMap.get(key) + ", ";
         }

        return result;
    }

    public static void main(String[] args) {
        TreeMap<Person, String> personMap = new TreeMap<>();
        personMap.put(new Person("Alice"), "Engineer");
        personMap.put(new Person("Bob"), "Doctor");
        personMap.put(new Person("Alice"), "Teacher");

        String result = mapToString(personMap);
        System.out.println(result);
    }
}


