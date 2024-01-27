package university;

import java.util.ArrayList;

public class StudentTest {
    public static <T> int countElements(Iterable<T> items, Object element) {
        int count = 0;

        for (T item : items) {
            if (item != null && item.equals(element)) {
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

        Iterable<Student> iterable = students;
        int res = StudentTest.countElements(iterable, new Student("Nazwa", 10));
        System.out.println("Liczba wystąpień studenta ['Nazwa'] [10] to: " + res);
    }
}
