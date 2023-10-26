class Ksiazka {
    public String title, autor;
    public int rokWydania;

    public Ksiazka() {
    }

    public Ksiazka(String title, String autor, int rokWydania) {
        this.title = title;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                '}';
    }
}

class Samochod {
    public String marka, model;
    public int rokProdukcji;

    public Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Samochod() {
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}

// Konstruktor w konstruktorze
class Osoba {
    public String imie, nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko) {
        this(imie, nazwisko, 0);
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}

class Kwadrat {
    public int bok;

    public Kwadrat() {
        this(1);
    }

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public String toString() {
        return "Długość boku to:" + bok;
    }
}

class Student {
    public String imie, nazwisko, kierunekStudiow;

    public Student(String imie, String nazwisko) {
        this(imie, nazwisko, "nieznany");
    }

    public Student(String imie, String nazwisko, String kierunekStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunekStudiow = kierunekStudiow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kierunekStudiow='" + kierunekStudiow + '\'' +
                '}';
    }
}

class Osoba1 {
    public static int licznik; // Pole wspólne dla wszystkich instancji
    public String imie;

    public static int getLicznik(){
        return licznik;
    }

    public Osoba1() {
        licznik++;
    }
}

class Matematyka {
    public static final double PI = 3.14d;
}

class Kalkulator {
    static int dodawanie(int a, int b) {
        return a + b;
    }

    static int odejmowanie(int a, int b) {
        return a - b;
    }

    static int mnozenie(int a, int b) {
        return a * b;
    }

    static int dzielenie(int a, int b) {
        return a / b;
    }
}

class TestowanieKalkulatora {
    public TestowanieKalkulatora() {
        int a = 10, b = 5;
        System.out.println(Kalkulator.dodawanie(a, b));
        System.out.println(Kalkulator.odejmowanie(a, b));
        System.out.println(Kalkulator.mnozenie(a, b));
        System.out.println(Kalkulator.dzielenie(a, b));
    }
}

class Produkt {
    public static int liczbaProduktow;
    public static final int MAX_PRODUKTOW = 2;
    private static Produkt instance = null;

    private Produkt() {
        liczbaProduktow++;
    }

    public static Produkt getInstance() {
        if(liczbaProduktow < MAX_PRODUKTOW) {
            instance = new Produkt();
        }
        return instance;
    }

}

class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka = new Ksiazka("Ksiazka", "Autor", 1900);
        System.out.println(ksiazka);

        Samochod samochod = new Samochod("Auto", "Marka", 2000);
        System.out.println(samochod);

        Osoba osoba = new Osoba("Adam", "Małysz");
        Osoba osoba1 = new Osoba("Adam", "Mickiewicz", 15);
        System.out.println(osoba.imie + " " + osoba.nazwisko + " " + osoba.wiek);
        System.out.println(osoba1.imie + " " + osoba1.nazwisko + " " + osoba1.wiek);

        Kwadrat kwadrat = new Kwadrat(15);
        Kwadrat kwadrat1 = new Kwadrat();
        System.out.println(kwadrat);
        System.out.println(kwadrat1);

        Student student = new Student("Kacper", "Renkel", "Informatyka");
        Student student1 = new Student("Test", "Testowy");
        System.out.println(student);
        System.out.println(student1);

        System.out.println(new Osoba1().getLicznik());
        new Osoba1();
        new Osoba1();
        System.out.println(new Osoba1().getLicznik());
        System.out.println(Osoba1.getLicznik());

        System.out.println(Matematyka.PI);

        new TestowanieKalkulatora();

        Produkt produkt = Produkt.getInstance();
        Produkt produkt1 = Produkt.getInstance();
        Produkt produkt2 = Produkt.getInstance();
        System.out.println(produkt.hashCode());
        System.out.println(produkt1.hashCode());
        System.out.println(produkt2.hashCode());

    }
}