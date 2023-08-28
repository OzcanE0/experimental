package generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBound<T> {
    private List<? super T> items = new ArrayList<>();

    public void addItem(T newItem) {
        items.add(newItem);
        System.out.println("Added item: " + newItem);
    }

    public static void main(String[] args) {
        LowerBound<Number> numberLowerBound = new LowerBound<>();
        numberLowerBound.addItem(5);
        numberLowerBound.addItem(3.14);
    }
}