package restaurant;

import java.util.Comparator;

public class SkillLevelNameComparator implements Comparator<Chef> {
    @Override
    public int compare(Chef o1, Chef o2) {
        int firstCompare = Double.compare(o2.getSkillLevel(), o1.getSkillLevel());
        if(firstCompare != 0) return firstCompare;
        return o1.getName().compareTo(o2.getName());
    }
}
