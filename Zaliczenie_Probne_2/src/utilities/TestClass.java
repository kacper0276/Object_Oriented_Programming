package utilities;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static <E> void appendFromEnd(List<? super E> destination, List<? extends E> source) {
        int destIndex = destination.size();
        for (int i = source.size() - 1; i >= 0; i--) {
            destination.add(destIndex, source.get(i));
        }
    }

    public static void main(String[] args) {
        List<Object> destinationList = new ArrayList<>();
        List<String> sourceList = new ArrayList<>();

        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("C");

        System.out.println("Przed użyciem metody:");
        System.out.println("Destination list: " + destinationList);
        System.out.println("Source list: " + sourceList);

        appendFromEnd(destinationList, sourceList);

        System.out.println("\nPo użyciu metody:");
        System.out.println("Destination list: " + destinationList);
        System.out.println("Source list: " + sourceList);
    }
}
