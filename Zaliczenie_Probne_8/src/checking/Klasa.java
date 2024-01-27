package checking;

public class Klasa {
    public static <T> boolean containsDuplicates(T el1, T el2, T el3) {
        return el1.equals(el2) || el1.equals(el3) || el2.equals(el3);
    }

    public static void main(String[] args) {
        System.out.println("Czy liczby są równe " + containsDuplicates(1, 2, 2));
    }
}
