package algorithm;

public class TestClass {
    static <T> boolean compareThree(T one, T two, T three) {
        return two.equals(three) && one.equals(three);
    }
}
