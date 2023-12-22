import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public void checkAge(int age) throws IllegalArgumentException {
        if(age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemy");
        }

        System.out.println("Wiek to: " + age);
    }

    public static void przyklad2() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int wynik = a/b;

                System.out.println("Wynik to " + (a + b));
            } catch (ArithmeticException ex1) {
                System.out.println(ex1);
            } catch (InputMismatchException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void sprawdzFormatDanych(String napis) throws NiepoprawnyFormatDanychException {
        if(napis.contains("a")) {
            throw new NiepoprawnyFormatDanychException();
        }

        System.out.println(napis);
    }

    public static void WlasnyWyjatek() {


        try {
            Scanner scanner = new Scanner(System.in);

            String nazwa = scanner.nextLine();

            sprawdzFormatDanych(nazwa);
        } catch (NiepoprawnyFormatDanychException ex) {
            System.out.println(ex);
        }
    }

}
