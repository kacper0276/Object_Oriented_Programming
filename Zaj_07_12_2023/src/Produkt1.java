import java.time.LocalDate;
import java.util.Comparator;

public class Produkt1 {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    @Override
    public String toString() {
        return "Produkt1{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataWaznosci=" + dataWaznosci +
                '}';
    }

    public Produkt1(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }
}

class CompareProdukt1DataWaznosci implements Comparator<Produkt1> {

    protected int compareDate(LocalDate d1, LocalDate d2) {
        int compareValue = d1.compareTo(d2);

        if (compareValue > 0) {
            return 1;
        } else if (compareValue < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Produkt1 o1, Produkt1 o2) {
        return compareDate(o1.dataWaznosci, o2.dataWaznosci);
    }
}

class CompareProdukt1Cena implements Comparator<Produkt1> {

    @Override
    public int compare(Produkt1 o1, Produkt1 o2) {
        return Double.compare(o1.cena, o2.cena);
    }
}