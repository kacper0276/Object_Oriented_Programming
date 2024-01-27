package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int artistCompare = o2.artist.compareTo(o1.artist);
        if(artistCompare == 0) {
            return o2.title.compareTo(o1.title);
        }

        return artistCompare;
    }
}
