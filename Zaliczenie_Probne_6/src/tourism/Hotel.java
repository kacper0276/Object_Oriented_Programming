package tourism;

public class Hotel implements Cloneable {
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        this.name = name == null ? "" : name;
        this.capacity = capacity < 1 ? 50 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "" + getClass() + "  Hotel [name=" + name + ", capacity=" + capacity + "]";
    }

    @Override
    protected Hotel clone() throws CloneNotSupportedException {
        return (Hotel) super.clone();
    }
}
