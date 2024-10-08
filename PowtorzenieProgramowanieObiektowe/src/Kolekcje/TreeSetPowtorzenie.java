package Kolekcje;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetPowtorzenie {
    public static void main(String[] args) {
//        https://pjastr.github.io/zima2023-24/POwyklad14.html#/treeset-zbiór-drzewiasty

        // Tworzenie TreeSet
        TreeSet<String> stringSet = new TreeSet<>();
        TreeSet<Integer> intSet = new TreeSet<>();

        // Dodawanie elementów
        stringSet.add("Jabłko");
        stringSet.add("Banana");
        intSet.add(1);
        intSet.add(2);

        // Sprawdzanie, czy zbiór zawiera element
        boolean containsBanana = stringSet.contains("Banana");

        // Pobieranie pierwszego i ostatniego elementu
        String firstString = stringSet.first();
        Integer lastInt = intSet.last();

        // Usuwanie elementów
        stringSet.remove("Jabłko");
        intSet.pollFirst();

        // Pobieranie podzbioru
        TreeSet<Integer> subSet = new TreeSet<>(intSet.subSet(1, true, 3, false));

        // Iteracja przez zbiór
        for(String s : stringSet) {
            System.out.println(s);
        }

        // Czyszczenie zbioru
        intSet.clear();

        // Utworzenie TreeSet z odwróconym porównywaniem
        TreeSet<String> reverseOrderSet = new TreeSet<>(Comparator.reverseOrder());

        // Dodanie elementów do TreeSet
        reverseOrderSet.add("Alfa");
        reverseOrderSet.add("Bravo");
        reverseOrderSet.add("Charlie");
        reverseOrderSet.add("Delta");

        // Wyświetlenie elementów w odwróconym porządku
        System.out.println("Elementy TreeSet w odwróconym porządku:");
        for(String element : reverseOrderSet) {
            System.out.println(element);
        }
    }
}
