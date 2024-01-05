import playlist.ArtistTitleComparator;
import playlist.DurationComparator;
import playlist.Song;
import moto.*;
import university.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("AA", "AA", 10),
                new Song("AA", "AA", 12),
                new Song("Ba", "AA", 10),
                new Song("Ba", "Za", 10),
                new Song("AA", "DSADA", 15)
        };

        List<Song> songsList = Arrays.asList(songs);
        System.out.println(songsList);
        songsList.sort(new ArtistTitleComparator());
        songsList.sort(new DurationComparator());
        for(Song song: songsList) {
            System.out.println(song.getArtist() + " " + song.getTitle() + " " + song.getDuration());
        }

        // Zadanie 3
        Vehicle[] arrV = {
                new Vehicle("Model", 10),
                new Vehicle("Model1", 15),
                new Vehicle("ASDA", 1),
                new Vehicle("AAGA", 6),
                new Vehicle("DSADA", 20)
        };

        Vehicle result = VehicleTest.maxValue(arrV);
        System.out.println(result.speed + " " + result.model);

        // Zadanie 4
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nazwa", 10));
        students.add(new Student("Nazwa", 10));
        students.add(new Student("Nazwa", 15));

        Iterable<Student> iterable = students;
        int res = StudentTest.countElements(iterable, new Student("Nazwa", 10));
        System.out.println("Liczba wystąpień studenta ['Nazwa'] [10] to: " + res);

    }
}