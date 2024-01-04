package zad3;

import java.util.ArrayList;
import java.util.List;

public class Counter <T>{
    ArrayList<T> obj = new ArrayList<>();
    public void add(T element) {
        this.obj.add(element);
    }

    public int getCount() {
        return obj.size();
    }
}
