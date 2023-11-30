import java.util.List;

public record Student(String imie, String nazwisko, List<Integer> list) {
    public double averageGrades() {
        int sum = 0;
        for(int num: list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}
