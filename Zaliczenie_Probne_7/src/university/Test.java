package university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 4.5));
        students.add(new Student(3, "Alice", 4.0));
        students.add(new Student(2, "Bob", 4.0));
        students.add(new Student(5, "Eve", 4.7));
        students.add(new Student(4, "Charlie", 3.5));


        Collections.sort(students, new AverageGradeComparator().thenComparing(new IdComparator()));
        printStudents(students);
    }
}
