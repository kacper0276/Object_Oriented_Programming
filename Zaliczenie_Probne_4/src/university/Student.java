package university;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.averageGrade, o.averageGrade) == 0) {
            return this.yearOfStudy - o.yearOfStudy;
        }
        return Double.compare(o.averageGrade, this.averageGrade);
    }
}
