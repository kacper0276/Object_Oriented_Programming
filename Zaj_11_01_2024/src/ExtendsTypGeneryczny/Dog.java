package ExtendsTypGeneryczny;

public class Dog extends Animal implements Comparable<Dog>{
    String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    @Override
    public int compareTo(Dog o) {
        return super.age - o.age;
    }
}
