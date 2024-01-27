package algorithm;

import java.util.HashMap;

public class TestClass {
    public static <K, V> String mapToString(HashMap<K, V> hashMap) {
        if (hashMap == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        String result = "";

        for(K key: hashMap.keySet()) {
            result += "klucz: " + key + " wartość:" + hashMap.get(key)+ ", ";
        }

        return result;
    }

    public static void main(String[] args) {
        HashMap<Person, String> personMap = new HashMap<>();
        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        Person perso3 = new Person("John");

        personMap.put(person1, "Enginer");
        personMap.put(person2, "Worker");
        personMap.put(perso3, "Policeman");

        System.out.println(mapToString(personMap));
    }
}
