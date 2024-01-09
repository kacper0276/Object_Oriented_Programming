package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int artistCompare = o1.artist.compareTo(o2.artist);
        if(artistCompare == 0) {
            return o1.title.compareTo(o2.title);
        }

        return artistCompare;
    }
}
