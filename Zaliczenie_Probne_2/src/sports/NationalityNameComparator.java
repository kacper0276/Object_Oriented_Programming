package sports;

import java.util.Arrays;
import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        double r1 = Arrays.stream(o1.records).min().orElse(Double.MAX_VALUE);
        double r2 = Arrays.stream(o2.records).min().orElse(Double.MAX_VALUE);
        return Double.compare(r1, r2);
    }
}
