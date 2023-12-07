import java.time.LocalDate;

public class Osoba implements Comparable<Osoba> {
    String imie;
    int wzrost;

    public Osoba(String imie, int wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wzrost=" + wzrost +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    LocalDate dataUrodzenia;

    @Override
    public int compareTo(Osoba o) {
        if(this.wzrost - o.wzrost == 0)
            return this.imie.compareTo(o.imie);
        return this.wzrost - o.wzrost;
    }
}
