import java.util.ArrayList;

public class Athlete implements Cloneable {
    String name;
    ArrayList<Integer> lapTimes;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + lapTimes +
                '}';
    }

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }
}
