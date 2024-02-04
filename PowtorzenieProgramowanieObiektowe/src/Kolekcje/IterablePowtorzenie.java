package Kolekcje;
import java.util.ArrayList;
import java.util.Iterator;

public class IterablePowtorzenie {
    public static <T> T showAllElements(Iterator<T> t, int index) {
        int actualIndex = 0;

        while (t.hasNext()) {
            T el = t.next();
            if(index == actualIndex) {
                return el;
            }
            actualIndex++;
        }

        return null;
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> iterator = numbers.iterator();
//        System.out.println(showAllElements(iterator, 2));

        while(iterator.hasNext()) {
            Integer i = iterator.next();
            if(i < 10) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
