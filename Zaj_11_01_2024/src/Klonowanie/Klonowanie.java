package Klonowanie;

public class Klonowanie implements Cloneable{
    // Głębokie kopie i płytkie kopie
    String name;
    Double[] salaries = new Double[7];

    //W takich przypadkach możemy użyć słowa kluczowego final .
    // Słowo to umieszczone przed klasą oznacza, że nie możemy po danej klasie dziedziczyć.
    // W przypadku metody oznacza, że metoda nie może zostać nadpisana.

    public Klonowanie(String name, Double[] salaries) {
        this.name = name;
        this.salaries = salaries;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
