import java.util.Objects;

public class Animal {
    public String name;
    public int age;
    public double weight;


    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = 17; // Najlepiej liczba pierwsza
        result = 31 * result + age;
        long doubleToLong = Double.doubleToLongBits(weight); // ^ - XOR
        result = 31 * result + (int) (doubleToLong ^ doubleToLong >>> 32); // >>> - przesunięcie bitowe
        result = 31 * result + name.hashCode();
        return result;
    }
}
