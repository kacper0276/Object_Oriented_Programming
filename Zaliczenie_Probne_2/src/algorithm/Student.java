package algorithm;

import java.util.Objects;

public class Student {
    private String name;
    private float grade;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        return this.name.equals(student.name) && this.grade == student.grade;
    }

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long floatToLongRating = Float.floatToIntBits(grade);
        result = 31 * result + (int) (floatToLongRating ^ floatToLongRating >>> 32);
        result = 31 * result + name.hashCode();

        return result;
    }
}
