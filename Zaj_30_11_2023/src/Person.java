public record Person(String name, int age) {// Pola i konstruktor w jednej linii
    // Nie może dziedziczyć, on po innych klasach i inne klasy po nim
    // Konstruktor domyślny - wszystkie pola
    public Person{
        if(age < 0) {
            age = 0;
        }
    }

    public Person(String name) {
        this(name, 0);
    }

    public void greet() {
        System.out.println("Hello!");
    }

    public static void printHello() {
        System.out.println("Hello but static!");
    }
}
