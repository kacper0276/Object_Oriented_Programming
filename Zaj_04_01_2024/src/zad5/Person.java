package zad5;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age - o.age == 0)
            return this.name.compareTo(o.name);
        return this.age - o.age;
    }
}
