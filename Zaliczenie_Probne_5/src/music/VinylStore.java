package music;

import java.util.ArrayList;
import java.util.Objects;

public class VinylStore extends MusicStore{
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return "VinylStore{" +
                "name='" + getName() + '\'' +
                ", city='" + getCity() + '\'' +
                ", albums=" + getAlbums() +
                ", numberOfVinyls=" + numberOfVinyls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VinylStore that = (VinylStore) o;
        return numberOfVinyls == that.numberOfVinyls &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getCity(), that.getCity()) &&
                Objects.equals(getAlbums(), that.getAlbums());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity(), getAlbums(), numberOfVinyls);
    }
}
