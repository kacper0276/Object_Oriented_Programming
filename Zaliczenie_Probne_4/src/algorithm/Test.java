package algorithm;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Klucz", 10);
        hashMap.put("Klucz", 15);
        hashMap.put("Klucz1", 132);
        hashMap.put("DSADA", 122);
        hashMap.put("Klucz", 12);
        hashMap.put("Inny", 100);

        int res = ClassTest.countUniqueKeys(hashMap);
        System.out.println(res);
    }
}
