package music;
import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name, city;
    private ArrayList<String> albums;

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getAlbums() {
        return new ArrayList<>(albums); // Tworzenie kopii listy dla bezpieczeństwa
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

    public void addAlbum(String album) {
        albums.add(album);
    }

    public void removeAlbum(String album) {
        albums.remove(album);
    }

    // Przesłonięta metoda toString
    @Override
    public String toString() {
        return "MusicStore{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", albums=" + albums +
                '}';
    }

    // Przesłonięta metoda equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(city, that.city) &&
                Objects.equals(albums, that.albums);
    }

    // Przesłonięta metoda hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, city, albums);
    }
}
