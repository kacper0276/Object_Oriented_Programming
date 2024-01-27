package algorithm;

public class TestClass {
    static <T> boolean compareThree(T one, T two, T three) {
        return two.equals(three) && one.equals(three);
    }

    public static void main(String[] args) {
        Student student = new Student("Imie", 11);
        Student student1 = new Student("Imie", 10);
        Student student2 = new Student("Imie", 10);

        System.out.println("Czy takie same: " + compareThree(student, student1, student2));
    }
}
