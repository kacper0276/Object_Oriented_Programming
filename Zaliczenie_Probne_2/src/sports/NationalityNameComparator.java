package sports;

import java.util.Arrays;
import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o2.getNationality().equals(o1.getNationality())) {
            return o2.getName().compareTo(o1.getName());
        }

        return o2.getNationality().compareTo(o1.getNationality());
    }
}
