package moto;

public class VehicleTest {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max = max.compareTo(arr[i]) <  0 ? arr[i] : max;
        }

        return max;
    }
}
