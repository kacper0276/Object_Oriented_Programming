package Cloneable;

import java.util.Objects;

public class EqualsExt extends Klonowanie{
    private int size;

    public EqualsExt(String nazwa, double[] arr, int size) {
        super(nazwa, arr);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        EqualsExt equalsExt = (EqualsExt) o;
        return size == equalsExt.size;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = hash * 17 + this.size;
        return hash;
    }
}
