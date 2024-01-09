package sports;

import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o2.nationality.equals(o1.nationality)) {
            return o2.name.compareTo(o1.name);
        }

        return o2.nationality.compareTo(o1.nationality);
    }
}
