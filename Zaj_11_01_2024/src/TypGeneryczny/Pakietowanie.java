package TypGeneryczny;

public class Pakietowanie {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3};
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        System.out.println("----------------------");

        swap(arr,0, 1);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    public static <T> void swap(T[] arr, int i1, int i2) {
        if(i1 >= arr.length || i2 >= arr.length) {
            return;
        }

        T pom = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = pom;
    }
}
