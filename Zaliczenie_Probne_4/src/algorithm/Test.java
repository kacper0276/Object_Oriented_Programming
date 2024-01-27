package algorithm;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Person, Integer> hashMap = new HashMap<>();

        hashMap.put(new Person("Alice"), 1);
        hashMap.put(new Person("Bob"), 2);
        hashMap.put(new Person("Alice"), 3);

        int result = ClassTest.countUniqueKeys(hashMap);
        System.out.println(result);
    }
}
