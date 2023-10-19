class Dog {
    public String name;
    public int breed;
    public int age;

    public void bark() {
        System.out.println("Hau Hau");
    }
}

class BankAccount {
    public int balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class Time {
    public int hours, minutes;

    public void addTime(Time otherTime) {
        hours += otherTime.hours;
        minutes += otherTime.minutes;

        if(minutes >= 59){
            hours += 1;
            minutes -= 59;
        }
        if(hours >= 23) {
            hours -= 23;
        }

    }
}

class Car {
    public String brand;
}

class Licznik {
    public int liczba;

    public void zwieksz(int a) {
        liczba += a;
    }

    public void zwieksz(Licznik a) {
        liczba += a.liczba;
    }
}

class Zmieniacz {
    public void zmienWartosc(int a) {
        a = 15;
    }

    public void zmienObiekt(Licznik licznik) {
        licznik.liczba = 69;
    }
}

class Osoba {
    public String imie;
    private String haslo;
}

class Samochod {
    private void zawalSilnik() {
        System.out.println("Brum Brum");
    }
}

public class Main {
    public static void main(String[] args) {
        Dom dom = new Dom(1, 2, true, false, 10);

        Dom dom1 = new Dom();
        dom1.area = 150;
        dom1.floors = 2;
        dom1.garage = false;
        dom1.garden = false;
        dom1.rooms = 15;

        System.out.println(dom1.valueHouse());

        // Zadanie 1
        Dog dog = new Dog();
        dog.bark();

        // Zadanie 2
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100.0d);
        System.out.println(bankAccount.balance);
        bankAccount.withdraw(250.0d);
        System.out.println(bankAccount.balance);

        // Zadanie 3
        Time time = new Time();
        time.hours = 15;
        time.minutes = 30;
        Time time1 = new Time();
        time1.hours = 5;
        time1.minutes = 10;

        time.addTime(time1);
        System.out.println(time.hours + " - " + time.minutes);

        // Zadanie 4
        Car car = new Car();
        car = null;
//        System.out.println(car.brand);

        if(car != null) {
            System.out.println(car.brand);
        }

        // Zadanie 5
        Licznik licznik = new Licznik();
        int a = 10;
        licznik.zwieksz(a);
        System.out.println(licznik.liczba);
        System.out.println(a);

        Licznik licznik1 = new Licznik();
        licznik1.liczba = 15;
        licznik.zwieksz(licznik1);
        System.out.println(licznik.liczba);

        int c = 10;
        new Zmieniacz().zmienWartosc(c);
        System.out.println(c);

        Licznik licznikd = new Licznik();
        licznikd.liczba = 15;
        new Zmieniacz().zmienObiekt(licznikd);
        System.out.println(licznikd.liczba);

        // Zadanie 6
        Osoba osoba = new Osoba();
//        System.out.println(osoba.imie + " - " + osoba.haslo);

        // Zadanie 7
        Samochod samochod = new Samochod();
//        samochod.zawalSilnik();
    }
}