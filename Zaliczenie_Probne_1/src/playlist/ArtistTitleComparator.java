package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if(o1.getArtist().equals(o2.getArtist())) {
            return o1.getTitle().compareTo(o2.getTitle());
        }

        return o1.getArtist().compareTo(o2.getArtist());
    }
}
