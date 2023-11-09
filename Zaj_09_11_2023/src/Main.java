public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Zebra");
        System.out.println(animal.toString());
        System.out.println(animal); // Domyślnie wykonuje toString()

        Animal animal1 = new Animal("Zebra");
        System.out.println(animal.equals(animal1));
        System.out.println(animal == animal1);

        animal.makeSound();

        Cat cat = new Cat("Kotek");
        System.out.println(cat);
        cat.makeSound();

        Animal animal2 = new Cat("Animal");
        animal2.makeSound();
        System.out.println(animal2.name);

//        Cat ca1 = new Animal("AAA");

        // Zadanie 1
        Employee person = new Employee("Imie", "Nazwisko");
        person.displayData();

        // Zadanie 2
        Book book = new Book("Tytul", "Autor", -10);
        System.out.println(book);
        Book book1 = new Book("", "Autor", 51);
        System.out.println(book1);
        Book book2 = new Book("Tytul", "Autor", -10);
        System.out.println(book.equals(book2));

        // Zadanie 3
        Tool tool = new Tool();
        Hammer hammer = new Hammer();
        System.out.println(tool.name + " " + hammer.name);

        // Zadanie 4
        new Samochod().jedz();

        // Zadanie 7
        Programista programista = new Programista();
    }
}