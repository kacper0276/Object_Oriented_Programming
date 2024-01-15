package utilities;

public class PersonTest {
    public static void main(String[] args) {
        Person[] arr = new Person[] {
                new Person("Imie", 10),
                new Person("Imie 1", 12),
                new Person("Imie 2", 15),
                new Person("Imie 3", 10),
                new Person("Imie 4", 13)
        };

        int res = TestClass.countLessThanOrEqual(arr, new Person("Imie", 13));
        System.out.println(res);
    }
}
