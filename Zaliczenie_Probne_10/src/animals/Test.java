package animals;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1.getClass().getSimpleName());
        System.out.println(dog1.getClass());
        Animal animal1 = new Animal();
        System.out.println(Checking.isSameSpecies(dog1, dog2));
        System.out.println(Checking.isSameSpecies(dog1, animal1));
    }
}
