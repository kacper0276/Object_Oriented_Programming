package finding;

public class TestClass {
    public static <T> T findFirstNonNull(T[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        for (T t : arr) {
            if (t != null) {
                return t;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {
                null,
                null,
                15,
                20
        };

        System.out.println(findFirstNonNull(arr));
    }
}
