import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę 1");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj liczbę 2");
        double liczba2 = scanner.nextDouble();
        System.out.println("Podaj liczbę 3");
        double liczba3 = scanner.nextDouble();
        System.out.println("Podaj liczbę 4");
        double liczba4 = scanner.nextDouble();

        System.out.println("Suma 4 liczby wynosi: " + (liczba1 + liczba2 + liczba3 + liczba4));

        System.out.println("Zadanie 2:");
        System.out.println("Podaj bok a:");
        double bok1 = scanner.nextDouble();
        System.out.println("Podaj bok b:");
        double bok2 = scanner.nextDouble();

        System.out.println("Pole kwadratowe wynosi: " + (bok1 * bok2));

        System.out.println("Zadanie 3:");
        System.out.println("Podaj liczbę 1:");
        double licz1 = scanner.nextDouble();
        System.out.println("Podaj liczbę 2:");
        double licz2 = scanner.nextDouble();
        System.out.println("Podaj liczbę 3:");
        double licz3 = scanner.nextDouble();

        if(licz1 >= licz2 && licz1 >= licz3) {
            System.out.println(licz1);
        } else if(licz2 >= licz1 && licz2 >= licz3) {
            System.out.println(licz2);
        } else {
            System.out.println(licz3);
        }

        System.out.println("Zadanie 4");
        System.out.println("Podaj dzień tygodnia");
        int weekDay = scanner.nextInt();
        switch (weekDay) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Niepoprawny numer dnia tygodnia");
                break;
        }

        System.out.println("Zadanie 5:");
        int rok = scanner.nextInt();
        if(rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie przestępny");
        }

        System.out.println("Zadanie 6:");
        System.out.println("Podaj godzinę");
        int hour = scanner.nextInt();
        System.out.println("Podaj minutę");
        int minutes = scanner.nextInt();
        System.out.println("Podaj sekundy");
        int seconds = scanner.nextInt();

        if((hour >= 0 && hour <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59)) {
            System.out.println("Poprawna godzina");
        }

        System.out.println("Zadanie 7:");
        System.out.println("Podaj liczbę: ");
        int sumaLiczbBas = scanner.nextInt();
        int suma = 0;

        while (sumaLiczbBas != 0) {
            suma += sumaLiczbBas % 10;
            sumaLiczbBas /= 10;
        }

        System.out.println(suma);

        System.out.println("Zadanie 8:");
        int odwrotnoscLiczby = scanner.nextInt();
        while (odwrotnoscLiczby != 0) {
            System.out.println(odwrotnoscLiczby % 10);
            odwrotnoscLiczby /= 10;
        }

        System.out.println("Zadanie 9:");
        int armstrong = scanner.nextInt();
        int ileCyfr = 0;
        int basic = armstrong;
        int sumaArmstrong = 0;

        while (armstrong != 0) {
            ileCyfr++;
            armstrong /= 10;
        }

        armstrong = basic;
        while (armstrong != 0) {
            sumaArmstrong += Math.pow(armstrong % 10, ileCyfr);
            armstrong /= 10;
        }

        if(sumaArmstrong == basic) {
            System.out.println("Jest to liczba Armstronga");
        }

        System.out.println("Zadanie 10:");
        int sumaDup = 0;

        while(sumaDup <= 100) {
            int liczba = scanner.nextInt();
            sumaDup += liczba;
        }

        System.out.println("Liczba przekroczyła 100!");

    }
}
