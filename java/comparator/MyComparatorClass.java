package comparator;

import java.util.Comparator;

public class MyComparatorClass implements Comparator<Integer> {


    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
