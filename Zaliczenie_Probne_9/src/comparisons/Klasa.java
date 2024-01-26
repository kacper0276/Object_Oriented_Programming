package comparisons;

public class Klasa {
    public static <T extends Comparable<T>> boolean isFirstLargest(T el1, T el2, T el3) {
        return el1.compareTo(el2) > 0 && el1.compareTo(el3) > 0;
    }

    public static void main(String[] args) {
        System.out.println("Większe " + isFirstLargest(1, 2, 3));
        System.out.println("Inny przykład " + isFirstLargest(5, 2, 3));
    }
}
