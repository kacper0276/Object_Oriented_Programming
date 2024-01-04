//import Przyklad.Animal;
import Przyklad.Box;
import zad3.Counter;
import zad5.Person;
import zad6.*;
import zad7.*;
import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       // Box<Animal, String> box = new Box<>(new Animal(), "Napis");
       // box.value.makeSound();
       // System.out.println(box.value1);
       // wypisz(new Animal());
        wypisz("Napis");
        wypisz(3);

        // Zadanie 1

        // Zadanie 2

        // Zadanie 3
        Counter<Animal> counter = new Counter<>();
        counter.add(new Animal());
        counter.add(new Animal());
        System.out.println(counter.getCount());
        Counter<String> counter1 = new Counter<>();
        System.out.println(counter1.getCount());
        counter1.add("Napis");
        System.out.println(counter1.getCount());

        // Zadanie 4
        String[] arr = {"Napis 1", "Napis2"};
        System.out.println(arr.length);
        swap(arr, 0, 1);
        System.out.println(arr[0] + " - " + arr[1]);
        swap(arr, 0, 2);
        System.out.println(arr[0] + " - " + arr[1]);

        // Zadanie 5
        Person[] arr1 = {new Person("AA", 1), new Person("B", 2), new Person("AB", 1)};
        Person person = minValue(arr1);
        System.out.println(person.name + " " + person.age);

        // Zadanie 6
        Dog dog = new Dog("Pimpek", 10);
        Dog dog1 = new Dog("Azor", 12);
        Dog wynik = findMax(dog, dog1);
        System.out.println(wynik.getName());

        // Zadanie 7
        Tree[] arr3 = {new Tree("Nazwa", 10), new Tree("AA", 15), new Tree("FASDA", 102), new Tree("DSA", 5)};
        Pair<Tree> pair = new Pair<>();
        findMinMaxHeight(arr3, pair);
        System.out.println(pair.getObj1().getHeight());
        System.out.println(pair.getObj2().getHeight());
    }

    // Zadanie 4
    public static <T> void swap(T[] arr, int i, int j) {
        if(i >= arr.length || j >= arr.length)
            return;

        T help = arr[i];
        arr[i] = arr[j];
        arr[j] = help;
    }

    // Zadanie 5
    public static <T extends Comparable<T>> T minValue(T[] arr) {
        if(arr.length == 0) return null;

        T min = arr[0];
        for(T act: arr) {
            if(act.compareTo(min) < 0) {
                min = act;
            }
        }

        return min;
    }

    // Zadanie 6
    public static <T extends Animal> T findMax(T obj1, T obj2) {
        return obj1.getAge() > obj2.getAge() ? obj1 : obj2;
    }

    // Zadanie 7
    public static void findMinMaxHeight(Tree[] arr, Pair<? super Tree> result) {
        Arrays.sort(arr, Comparator.comparingInt(Tree::getHeight));

        result.setObj1(arr[0]);
        result.setObj2(arr[arr.length - 1]);
    }

    public static <T> void wypisz(T value) {
        System.out.println(value);
    }
}