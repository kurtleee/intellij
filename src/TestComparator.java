package src;

import java.util.Comparator;

public class TestComparator implements Comparator<String> {
    @Override
    public int compare(String A, String B) {
        return A.compareTo(B);
    }

    public static void main(String[] args){

    }
}
