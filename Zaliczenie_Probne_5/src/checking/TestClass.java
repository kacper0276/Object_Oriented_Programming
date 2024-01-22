package checking;

public class TestClass {
    public static <T> boolean isEqualOrNull(T el1, T el2) {
        return el1 == null ? el2 == null : el1.equals(el2);
    }

    public static void main(String[] args) {
        // Przypadek testowy
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = null;

        System.out.println("isEqualOrNull(str1, str2): " + isEqualOrNull(str1, str2)); // false
        System.out.println("isEqualOrNull(str1, str3): " + isEqualOrNull(str1, str3)); // false
        System.out.println("isEqualOrNull(str3, str3): " + isEqualOrNull(str3, str3)); // true
    }
}
