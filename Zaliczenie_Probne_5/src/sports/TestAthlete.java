package sports;

import java.util.ArrayList;
import java.util.Collections;

public class TestAthlete {
    public static void main(String[] args) {
        ArrayList<Athlete> arr = new ArrayList<>();
        arr.add(new Athlete("Imie", "Sport", 1920));
        arr.add(new Athlete("Imie1", "Sport1", 1921));
        arr.add(new Athlete("Imie2", "Sport2", 2000));
        arr.add(new Athlete("Imie3", "Sport3", 1900));

        Collections.sort(arr);

        for(var athlete: arr) {
            System.out.println(athlete.name() + " " + athlete.yearOfAchievement());
        }
    }
}
