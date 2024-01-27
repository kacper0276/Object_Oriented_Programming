package moto;

public class VehicleTest {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }

        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max = max.compareTo(arr[i]) <  0 ? arr[i] : max;
        }

        return max;
    }

    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[] {
                new Vehicle("Model", 10),
                new Vehicle("Inny model", 5),
                new Vehicle("Jeszcze inny model", 15),
                new Vehicle("Inny", 1)
        };

        Vehicle result = maxValue(arr);

        System.out.println(result);
    }
}
