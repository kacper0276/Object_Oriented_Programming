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

    static class Person implements Comparable<Person> {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Person other) {
            return this.name.compareTo(other.name);
        }
    }
}


