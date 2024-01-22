package music;

import java.util.ArrayList;

public class TestMusicStore {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy MusicStore
        MusicStore musicStore = new MusicStore("Music Shop", "City", new ArrayList<String>());

        // Dodawanie i usuwanie albumów
        musicStore.addAlbum("Album 1");
        musicStore.addAlbum("Album 2");
        System.out.println("Albums: " + musicStore.getAlbums());

        musicStore.removeAlbum("Album 1");
        System.out.println("Updated Albums: " + musicStore.getAlbums());

        // Tworzenie obiektu klasy VinylStore
        VinylStore vinylStore = new VinylStore("Vinyl Shop", "City", new ArrayList<String>(), 50);
        vinylStore.addAlbum("Vinyl Album 1");
        System.out.println("Vinyls: " + vinylStore.getNumberOfVinyls());

        // Wyświetlanie informacji o sklepach
        System.out.println("Music Store Info: " + musicStore);
        System.out.println("Vinyl Store Info: " + vinylStore);
    }
}