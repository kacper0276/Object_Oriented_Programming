import java.util.*;

public class Zad1 {
    private static double generateRandomGuassian() {
        return new Random().nextGaussian();
    }

    private static boolean generateRandomBoolean() {
        return new Random().nextBoolean();
    }

    public static void genReverseArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arr.add(new Random().nextInt(15));
        }
        System.out.println(arr);

        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + ", ");
        }
//        Collections.reverse(arr);
//        System.out.println(arr);
    }

    public static void avgArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < 20; i++) {
            int num = new Random().nextInt(1, 100);
            arr.add(num);
            sum += num;
        }

        System.out.println(sum / arr.size());
    }

    public static void minMaxFun() {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 15; i++) {
            arr.add(new Random().nextInt(0, 20));
        }

        System.out.println(arr);

        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));

    }

    public static void removeString() {
        StringBuilder stringBuilder = new StringBuilder("");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> charInString = new ArrayList<>();
        System.out.println("Podaj napis");
        String napis = scanner.next();
        for (int i = 0; i < napis.length(); i++) {
            if(!charInString.contains(napis.charAt(i) + "")) {
                charInString.add(napis.charAt(i) + "");
                stringBuilder.append(napis.charAt(i));
            }
        }

        System.out.println(stringBuilder);
    }

    public static StringBuilder reverseString(StringBuilder originalString) {
        StringBuilder newString = new StringBuilder();
        for(int i = originalString.length() - 1; i >= 0; i--) {
            newString.append(originalString.charAt(i));
        }

        return newString;
    }

    public static void reverseInt() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe nr: " + (i + 1));
            arr.add(scanner.nextInt());
        }

        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }

    public static void avgDouble() {
        ArrayList<Double> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextDouble(0, 100));
        }
        double sum = 0.0d;
        for(int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        System.out.println(sum);
    }

    public static double avg(ArrayList<Double> arr) {
        if(arr.size() == 0) return 0.0d;

        double sum = 0.0d;

        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        return sum/arr.size();
    }

    int countZeros(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomGuassian());
        System.out.println(generateRandomBoolean());
        genReverseArray();
        avgArray();
        minMaxFun();
        removeString();

        System.out.println(reverseString(new StringBuilder("Tak")));
        reverseInt();
        avgDouble();

        ArrayList<Double> arr = new ArrayList<>();
        arr.add(2.2);
        arr.add(2.5);
        arr.add(2.2);
        arr.add(2.5);
        arr.add(2.2);
        arr.add(2.5);
        arr.add(2.2);
        arr.add(2.5);
        arr.add(2.2);
        arr.add(2.5);
        System.out.println(arr);

        System.out.println(countZeros(new ArrayList<Integer>([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])));
    }
}
