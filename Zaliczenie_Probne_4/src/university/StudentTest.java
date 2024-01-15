package university;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[] {
                new Student("Imie", 10, 5),
                new Student("Imie1", 10, 4),
                new Student("Imie2", 5, 3),
                new Student("Imie3", 12, 4)
        };

        Arrays.sort(arr);

        for(var el: arr) {
            System.out.println(el.name());
        }
    }
}
