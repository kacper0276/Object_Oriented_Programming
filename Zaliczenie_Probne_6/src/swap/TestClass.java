package swap;

public class TestClass {
    public static <T> void swapElements(T[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("Nieprawidłowe indeksy.");
        }
    }

    public static void main(String[] args) {
        VideoGame[] arr = new VideoGame[] {
                new VideoGame("Nazwa", "Dev", 15.2f),
                new VideoGame("Inna nazwa", "Dev2", 10.2f),
                new VideoGame("Jeszcze inna nazwa", "Dev3", 12f)
        };

        swapElements(arr, 0, 2);

        for(var el: arr) {
            System.out.println(el);
        }
    }
}
