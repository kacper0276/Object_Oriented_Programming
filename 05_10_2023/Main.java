import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę 1: ");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj liczbę 2:");
        double liczba2 = scanner.nextDouble();

        System.out.println("Dodawanie: " + (liczba1 + liczba2));
        System.out.println("Odejmowanie: " + (liczba1 - liczba2));
        System.out.println("Mnożenie: " + (liczba1 * liczba2));
        System.out.println("Dzielenie: " + (liczba1 / liczba2));
        System.out.println("Potęgowanie: " + (Math.pow(liczba1, liczba2)));

        System.out.println("____________________________________");
        System.out.println("Podaj ciąg znaków1:");
        String tekst1 = scanner.nextLine();
        System.out.println("Podaj ciąg znaków2: ");
        String tekst2 = scanner.nextLine();

        System.out.println("Tekst1: " + tekst1);
        System.out.println("Tekst2: " + tekst2);
    }
}