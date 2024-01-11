package Compare;

import java.util.Arrays;

public class SongTest {
    public static void main(String[] args) {
        Song[] arr = new Song[] {
                new Song("AAA", "BBB", 10),
                new Song("BBB", "AAA", 10),
                new Song("AAA", "AAA", 10),
                new Song("AAA", "ZZZ", 15),
                new Song("DSAD", "SDAD", 1)
        };

        //Arrays.sort(arr, new ArtistTitleComparator());
        //Arrays.sort(arr, new DurationComparator());

        Arrays.sort(arr, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(Song el: arr) {
            System.out.println(el.artist + " - " + el.title + " - " + el.duration);
        }

        // CompareToIgnoreCase
    }
}
