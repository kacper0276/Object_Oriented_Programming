package healthcare;
import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name == null ? "" : name;
        this.capacity = capacity < 0 ? 50.0 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity >= 0) {
            this.capacity = capacity;
        }
    }

    @Override
    public String toString() {

        if(this.name == null) {
            return  String.format("[%s]: Capacity: %d.", this.getClass().getSimpleName(), this.capacity);
        }

        return String.format("[%s]: Name: %s. Capacity: %d.", this.getClass().getSimpleName(), this.name, this.capacity);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;

        return Objects.equals(name, hospital.name) && Double.valueOf(capacity).equals(Double.valueOf(hospital.capacity));
    }

    @Override
    public int hashCode() {
        int result = 17;
        long doubleToLong = Double.doubleToLongBits(capacity);
        result = result * 31 + (int) (doubleToLong ^ doubleToLong >>> 32);
        result = 31 * result + name.hashCode();

        return result;
    }
}
