package algorithm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Klasa {
    public static <T> T atIndex(Iterator<T> iterator, int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Nie może myć mniej niż 0");
        }

        int currentIndex = 0;
        while (iterator.hasNext()) {
            T el = iterator.next();
            if(currentIndex == index) {
                return el;
            }
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Iterator<Integer> iterator = list.iterator();

        int result = atIndex(iterator, 2);
        System.out.println("Element at index 2: " + result);
    }
}
