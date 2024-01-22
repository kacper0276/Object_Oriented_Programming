package transport;

import java.util.Objects;

public class IntercityBusStation extends BusStation{
    private int numberOfPlatforms;

    public IntercityBusStation(String name, String city, int numberOfPlatforms) {
        super(name, city);
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public String toString() {
        return "IntercityBusStation{" +
                "name='" + getName() + '\'' +
                ", city='" + getCity() + '\'' +
                ", buses=" + getBuses() +
                ", numberOfPlatforms=" + numberOfPlatforms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntercityBusStation that = (IntercityBusStation) o;
        return numberOfPlatforms == that.numberOfPlatforms &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getCity(), that.getCity()) &&
                Objects.equals(getBuses(), that.getBuses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getBuses(), numberOfPlatforms);
    }
}
