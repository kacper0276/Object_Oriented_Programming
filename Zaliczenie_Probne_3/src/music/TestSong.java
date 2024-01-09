package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
          new Song("AA", "BB", 10),
          new Song("BA", "BC", 15),
          new Song("BA", "CC", 10)
        };

        Arrays.sort(songs, new ArtistTitleComparator());
        Arrays.sort(songs, new DurationComparator());

        for(Song s: songs) {
            System.out.println(s.title + " " + s.artist + " " + s.duration);
        }
    }
}
