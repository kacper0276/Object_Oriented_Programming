package transport;

import java.util.ArrayList;
import java.util.Objects;

public class IntercityBusStation extends BusStation{
    private int numberOfPlatforms;

    public IntercityBusStation(String name, String city, ArrayList<String> buses, int numberOfPlatforms) {
        super(name, city, buses);
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
        if (!super.equals(o)) return false;
        IntercityBusStation that = (IntercityBusStation) o;
        return this.numberOfPlatforms == that.numberOfPlatforms;

    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + this.numberOfPlatforms;
        return hash;
    }
}
