package utilities;

public class TestClass {
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] arr, T el) {
        int result = 0;

        for(var arrEl: arr) {
            if(arrEl.compareTo(el) <= 0) {
                result++;
            }
        }

        return result;
    }
}
