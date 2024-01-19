package ArrayListPorownanieCollectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarathonRunner {
    public static void main(String[] args) {
        ArrayList<MarathonRunner> list = new ArrayList<>();
        list.add(new MarathonRunner("Imie", 10));
        list.add(new MarathonRunner("Imie 1", 5));
        list.add(new MarathonRunner("Imie 2", 2));
        list.add(new MarathonRunner("Imie 3", 9));

        Collections.sort(list, new MarathonRunnerTimeCompare());

        for(var marathon: list) {
            System.out.println(marathon.name + " " + marathon.raceTime);
        }

    }
}
