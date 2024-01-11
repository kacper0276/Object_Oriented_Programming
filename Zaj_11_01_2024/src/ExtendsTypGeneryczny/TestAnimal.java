package ExtendsTypGeneryczny;

public class TestAnimal {
    public static void main(String[] args) {

    }

    public static <T extends Animal & Comparable<T>> T findMax(T element1, T element2) {
        return element1.compareTo(element2) >= 0 ? element1 : element2;
    }
}
