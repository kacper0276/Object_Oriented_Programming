import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Nazwa", 10, 10);
        Animal a2 = new Animal("Nazwa", 11, 10);
        Animal a3 = new Animal("Nazwa", 11, 10);
        System.out.println(Integer.toHexString(a1.hashCode()));
        System.out.println(Integer.toHexString(a2.hashCode()));
        System.out.println(Integer.toHexString(a3.hashCode()));

        // Record
        Person p1 = new Person("Imie", 10);
        Person p2 = new Person("Imie", -10);
        // p1.age = 22; - Pola domyślnie prywatne i final
        System.out.println(p1.name());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        p1.greet();
        Person.printHello();

        // Zadanie 1
        BookDTO book1 = new BookDTO("Nazwa", "Autor", 10, 2002);
        BookDTO book2 = new BookDTO("Ksiazka", "Autor#1", 25, 1920);
        BookDTO book3 = new BookDTO("Tytul", "Autor#2", 40, 2023);

        // Zadanie 2
        Person1 person1 = new Person1("Imie", "Nazwisko", new Address("Sloneczna", 10, 13306, "Olsztyn"));
        System.out.println(person1);

        // Zadanie 3
        Point2D point2D = new Point2D(10, 20);
        Point2D point2D1 = new Point2D(5, 25);
        System.out.printf("%.2f \n", point2D.distanceTo(point2D1));

        // Zadanie 4
        Student student = new Student("Imie", "Nazwisko", new ArrayList<Integer>(Arrays.asList(4, 4, 5, 5)));
        System.out.println(student.averageGrades());

        // Zadanie 5
        Order order = new Order(new ArrayList<Product>(Arrays
                .asList(new Product("Produkt#1", 10),
                        new Product("Produkt#2", 15),
                        new Product("Produkt#3", 25))));
        System.out.println(order.totalValue());
    }
}