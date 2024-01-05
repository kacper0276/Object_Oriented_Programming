package university;

public class StudentTest {
    public static <T> int countElements(Iterable<T> items, T element) {
        int count = 0;

        for (T item : items) {
            if (item != null && item.equals(element)) {
                count++;
            }
        }

        return count;
    }
}
