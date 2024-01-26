package arrayAlg;

public class Algorytm {
    public static <T extends Comparable<T>> int findMaxIndex(T[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Błąd");
        }

        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(arr[maxIndex]) > 0) {
                // Najmniejszy index >
                // Najwiekszy index >=
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
