package checking;

public class Klasa {
    public static <T> boolean containsDuplicates(T el1, T el2, T el3) {
        int i = 0;
        if(el1.equals(el2)) {
            i++;
        }
        if(el1.equals(el3)) {
            i++;
        }
        if(el2.equals(el3)) {
            i++;
        }

        return i > 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Czy liczby są równe " + containsDuplicates(1, 2, 2));
    }
}
