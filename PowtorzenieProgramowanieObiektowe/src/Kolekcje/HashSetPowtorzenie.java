package Kolekcje;

import java.util.HashSet;

public class HashSetPowtorzenie {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(7);

        for(var value: hashSet) {
            System.out.println(value);
        }

        System.out.println(hashSet);
        System.out.println("If contains 10: " + hashSet.contains(10));
        System.out.println("Size: " + hashSet.size());
        hashSet.remove(10);
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println("Is empty: " + hashSet.isEmpty());
    }
}
