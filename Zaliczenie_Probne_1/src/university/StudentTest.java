package university;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
    public static <T> int countElements(Iterator<T> items, Object element) {
        int count = 0;

        while(items.hasNext()) {
            T current = items.next();
            if(current != null && current.equals(element)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nazwa", 10));
        students.add(new Student("Nazwa", 10));
        students.add(new Student("Nazwa", 15));

        Iterator<Student> iterator = students.iterator();
        int res = StudentTest.countElements(iterator, new Student("Nazwa", 10));
        System.out.println("Liczba wystąpień studenta ['Nazwa'] [10] to: " + res);
    }
}
