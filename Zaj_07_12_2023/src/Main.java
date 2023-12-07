import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Bogdan", 3.2, 3);
        Student s2 = (Student) s1.clone();

        // Zadanie 1
        ArrayList<Pracownik> arrayList = new ArrayList<>();
        arrayList.add(new Pracownik("Imie", 1500, LocalDate.now()));
        arrayList.add(new Pracownik("Imie", 1200, LocalDate.now()));
        arrayList.add(new Pracownik("Imie", 4000, LocalDate.now()));
        arrayList.add(new Pracownik("Imie", 3000, LocalDate.now()));
        arrayList.add(new Pracownik("Imie", 2200, LocalDate.now()));
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Zadanie 2
        ArrayList<Produkt> arrayList1 = new ArrayList<>();
        arrayList1.add(new Produkt("Nazwa", 100, LocalDate.of(2022, 10, 12)));
        arrayList1.add(new Produkt("Nazwa", 100, LocalDate.of(2023, 10, 12)));
        arrayList1.add(new Produkt("Nazwa", 150, LocalDate.of(2022, 10, 12)));
        arrayList1.add(new Produkt("Nazwa", 20, LocalDate.of(2022, 10, 12)));
        arrayList1.add(new Produkt("Nazwa", 120, LocalDate.of(2022, 10, 12)));
        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        // Zadanie 3
        ArrayList<Osoba> arrayList2 = new ArrayList<>();
        arrayList2.add(new Osoba("Imie", 150, LocalDate.now()));
        arrayList2.add(new Osoba("Abcd", 150, LocalDate.now()));
        arrayList2.add(new Osoba("Kacper", 150, LocalDate.now()));
        arrayList2.add(new Osoba("Imie", 250, LocalDate.now()));
        arrayList2.add(new Osoba("Imie", 180, LocalDate.now()));
        Collections.sort(arrayList2);
        System.out.println(arrayList2);

        // Zadanie 4
        ArrayList<Produkt1> arrayList3 = new ArrayList<>();
        arrayList3.add(new Produkt1("AAA", 150, LocalDate.of(2022, 10, 14)));
        arrayList3.add(new Produkt1("AAA", 150, LocalDate.of(2023, 10, 14)));
        arrayList3.add(new Produkt1("AAA", 150, LocalDate.of(2022, 11, 14)));
        arrayList3.add(new Produkt1("AAA", 150, LocalDate.of(2022, 9, 14)));
        arrayList3.add(new Produkt1("AAA", 250, LocalDate.of(2022, 10, 14)));
        arrayList3.sort(new CompareProdukt1DataWaznosci());
        arrayList3.sort(new CompareProdukt1Cena());
        System.out.println(arrayList3);

        // Zadanie 5
        ArrayList<Order> arrayList4 = new ArrayList<>();
        arrayList4.add(new Order(1, "Name", LocalDate.of(2022, 10, 10)));
        arrayList4.add(new Order(3, "Name", LocalDate.of(2022, 10, 10)));
        arrayList4.add(new Order(2, "Name", LocalDate.of(2022, 10, 10)));
        arrayList4.add(new Order(1, "Name", LocalDate.of(2022, 11, 10)));
        arrayList4.add(new Order(1, "Name", LocalDate.of(2020, 10, 10)));
        arrayList4.sort(new CompareOrderId());
        arrayList4.sort(new CompareOrderDate());
        System.out.println(arrayList4);

        // Zadanie 6
        ArrayList<Song> arrayList5 = new ArrayList<>();
        arrayList5.add(new Song("AA", "AB", 100));
        arrayList5.add(new Song("AA", "AC", 100));
        arrayList5.add(new Song("ZA", "AA", 120));
        arrayList5.add(new Song("BA", "AB", 1));
        arrayList5.add(new Song("GA", "AA", 120));
        arrayList5.sort(new ArtistTitleComparator());
        arrayList5.sort(new DurationComparator());
        System.out.println(arrayList5);

        // Zadanie 7
        Athlete at1 = new Athlete("Name", new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 5)));
        Athlete at2 = (Athlete) at1.clone();
        at2.lapTimes.set(0, 5);
        at2.lapTimes.set(1, 3);
        at2.lapTimes.set(4, 10);
        System.out.println(at1);
        System.out.println(at2);
    }
}