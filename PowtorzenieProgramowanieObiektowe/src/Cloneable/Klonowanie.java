package Cloneable;

import java.util.Objects;

public class Klonowanie implements Cloneable {
    private String nazwa;
    private double[] arr;

    public Klonowanie(String nazwa, double[] arr) {
        this.nazwa = nazwa;
        this.arr = arr != null ? arr.clone() : new double[0];
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klonowanie that = (Klonowanie) o;
        return Objects.equals(nazwa, that.nazwa) && Objects.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, arr);
    }

    @Override
    protected Klonowanie clone() throws CloneNotSupportedException {
        Klonowanie clone = (Klonowanie) super.clone();
        clone.arr = arr.clone();
        return clone;
    }
}
