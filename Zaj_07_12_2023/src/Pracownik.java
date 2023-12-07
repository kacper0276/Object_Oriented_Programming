import java.time.LocalDate;
import java.util.Comparator;

public class Pracownik implements Comparable<Pracownik> {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    @Override
    public String toString() {
        return "Pracownik{" +
                "pensja=" + pensja +
                '}';
    }

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.pensja, o.pensja);
    }
}
