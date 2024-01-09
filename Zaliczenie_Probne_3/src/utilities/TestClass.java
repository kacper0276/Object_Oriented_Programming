package utilities;

public class TestClass {
    public static <T extends Comparable<T>> T findMin(T t1, T t2, T t3) {
        T min = t1;
        if(min.compareTo(t2) > 0) {
            min = t2;
        }

        if(min.compareTo(t3) > 0) {
            min = t3;
        }

        return min;
    }
}
