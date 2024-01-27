package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] tab = {
                new Athlete("AA", "BC", new double[] {1, 5, 2, 10}),
                new Athlete("BA", "BC", new double[] {10, 1, 10, 21}),
                new Athlete("AA", "AA", new double[] {51, 2}),
                new Athlete("BA", "DA", new double[] {1})
        };

        System.out.println("Before sorting:");
        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }
        System.out.println("After sorting:");
        Arrays.sort(tab, new RecordComparator().thenComparing(new NationalityNameComparator()));
        for (Athlete athlete : tab) {
            System.out.println(athlete);
        }


    }
}
