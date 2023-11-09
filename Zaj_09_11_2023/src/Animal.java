import java.util.Objects;

public class Animal {
    public String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name to: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if(o instanceof Animal temp) {
//            return this.name.equals(temp.name);
//        }
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    public void makeSound() {
        System.out.println("Jakiś niewiadomy odgłos");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override // Przesłonięta metoda
    public void makeSound() {
        System.out.println("Moew moew");
    }
}