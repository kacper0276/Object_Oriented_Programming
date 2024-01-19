package MetodaGeneryczna;

public class Student extends Person{
    double avgGrand;

    public Student(int age, String name, double avgGrand) {
        super(age, name);
        this.avgGrand = avgGrand;
    }
}
