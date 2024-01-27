package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemManager <T>{
    private ArrayList<T> list;

    {
        list = new ArrayList<>();
    }

    public void addItem(T item) {
        list.add(item);
    }

    public T getItem(int index) {
        return list.get(index);
    }

    public int getItemCount() {
        return list.size();
    }
}
