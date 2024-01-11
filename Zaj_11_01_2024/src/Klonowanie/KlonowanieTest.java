package Klonowanie;

public class KlonowanieTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Bogdan", 3.2, 3);
        Student s2 = (Student) s1.clone();
    }
}
