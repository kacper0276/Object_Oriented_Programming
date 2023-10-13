import java.util.*;

public class Main {
    private static Random random = new Random();

    public static int generateRandomInt() {
        return random.nextInt(10, 15);
    }

    public static double generateDouble() {
        return random.nextDouble();
    }

    public static void piramida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak:");
        String str = scanner.next();
        System.out.println("Podaj wysokość piramidy: ");
        int height = scanner.nextInt();

        for(int i = 0; i < height; i++) {
            int liczbaSpacji = height - 1 - i;
            int liczbaZnakow = 2 * i + 1;

            StringBuilder sb = new StringBuilder(); // synchroniczny

            while (liczbaSpacji-- > 0) {
                sb.append(' ');
            }
            while (liczbaZnakow-- > 0) {
                sb.append(str);
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        System.out.println(random.nextInt(10, 20)); // Ograniczenie od 0 do 9 - jeden argument
        System.out.println(generateRandomInt());
        System.out.println(generateDouble());

//        piramida();

        Integer[] array = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.stream(array).min().getAsInt());
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); // Dynamiczny rozmiar
        list.add(2);
        System.out.println(Collections.max(list));
    }
}