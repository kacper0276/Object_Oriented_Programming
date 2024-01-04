package zad2;

public class Zad2 {
    public static <T> boolean isEqual(T obj1, T obj2) {
        return obj1.hashCode() == obj2.hashCode();
    }
}
