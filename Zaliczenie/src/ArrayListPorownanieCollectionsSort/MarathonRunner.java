package ArrayListPorownanieCollectionsSort;

import java.util.Comparator;

public class MarathonRunner {
    String name;
    int raceTime;

    public MarathonRunner(String name, int raceTime) {
        this.name = name;
        this.raceTime = raceTime;
    }
}

class MarathonRunnerTimeCompare implements Comparator<MarathonRunner> {

    @Override
    public int compare(MarathonRunner o1, MarathonRunner o2) {
        return o1.raceTime - o2.raceTime;
    }
}