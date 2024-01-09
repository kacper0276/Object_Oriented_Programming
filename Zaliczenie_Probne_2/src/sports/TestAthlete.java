package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athArr = {
                new Athlete("AA", "BC", new double[] {1, 5, 2, 10}),
                new Athlete("BA", "BC", new double[] {10, 1, 10, 21}),
                new Athlete("AA", "AA", new double[] {51, 2}),
                new Athlete("BA", "DA", new double[] {1})
        };

        Arrays.sort(athArr, new RecordComparator());
        Arrays.sort(athArr, new NationalityNameComparator());
        for(Athlete a: athArr) {
            System.out.println(a.name + " - " + a.nationality + " - " + Arrays.stream(a.records).min());
        }


    }
}
