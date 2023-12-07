import java.time.LocalDate;

public class Produkt implements Comparable<Produkt> {
    String nazwa;
    double cena;
    LocalDate dataProdukcji;

    public Produkt(String nazwa, double cena, LocalDate dataProdukcji) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataProdukcji = dataProdukcji;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataProdukcji=" + dataProdukcji +
                '}';
    }

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
    public int compareTo(Produkt o) {
        if(Double.compare(this.cena, o.cena) == 0)
            return compareDate(this.dataProdukcji, o.dataProdukcji);
        return Double.compare(this.cena, o.cena);
    }
}
