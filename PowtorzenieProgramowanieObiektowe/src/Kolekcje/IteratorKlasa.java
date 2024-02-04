package Kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class IteratorKlasa {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(1.0);
        list.add(1.0);
        printUnique(list);
    }

    public static <T> void printUnique(Collection<T> items) {
        HashSet<T> temp = new HashSet<>(items);
        System.out.println(temp);
    }
}
