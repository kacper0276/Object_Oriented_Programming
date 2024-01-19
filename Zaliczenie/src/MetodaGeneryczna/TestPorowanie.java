package MetodaGeneryczna;

public class TestPorowanie {
    public static void main(String[] args) {
        Student student = new Student(10, "Imie", 5);
        Student student1 = new Student(5, "Imie 1", 10);

        Student result = MetodaPorownanie.findMax(student, student1);
        System.out.println(result.age + " " + result.name + " " + result.avgGrand);
    }
}
