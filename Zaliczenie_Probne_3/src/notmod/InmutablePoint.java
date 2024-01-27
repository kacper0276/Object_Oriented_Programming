package notmod;

import java.util.Objects;

public final class InmutablePoint {
    private final int x, y, z;

    public InmutablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "InmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InmutablePoint that = (InmutablePoint) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result += x * 3;
        result += y * 2;
        result += z * 5;
        return result;
    }
}
