package utilities;

public class Test {
    public static void main(String[] args) {
        TestClass alg = new TestClass();
        System.out.println(alg.findMin(1, -2, 3));
        System.out.println(alg.findMin(1.1, 2.2, -3.3));
        System.out.println(alg.findMin("a", "b", "c"));
        System.out.println(alg.findMin('a', 'Ą', 'T'));
    }
}
